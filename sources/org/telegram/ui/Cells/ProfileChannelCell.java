package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.ToIntFunction;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.ClickableAnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;

public abstract class ProfileChannelCell extends FrameLayout implements Theme.Colorable {
    public final DialogCell dialogCell;
    private final TextView headerView;
    private boolean loading;
    private AnimatedFloat loadingAlpha;
    private final LoadingDrawable loadingDrawable;
    private final Theme.ResourcesProvider resourcesProvider;
    private boolean set;
    private final AnimatedTextView subscribersView;

    public int[] getColorKeys() {
        return Theme.Colorable.CC.$default$getColorKeys(this);
    }

    public abstract int processColor(int i);

    public ProfileChannelCell(final BaseFragment baseFragment) {
        super(baseFragment.getContext());
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.loadingAlpha = new AnimatedFloat(320L, cubicBezierInterpolator);
        this.set = false;
        final Context context = baseFragment.getContext();
        Theme.ResourcesProvider resourceProvider = baseFragment.getResourceProvider();
        this.resourcesProvider = resourceProvider;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.headerView = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.ProfileChannel));
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 51));
        ClickableAnimatedTextView clickableAnimatedTextView = new ClickableAnimatedTextView(context);
        this.subscribersView = clickableAnimatedTextView;
        clickableAnimatedTextView.getDrawable().setHacks(true, true, true);
        clickableAnimatedTextView.setAnimationProperties(0.3f, 0L, 165L, cubicBezierInterpolator);
        clickableAnimatedTextView.setTypeface(AndroidUtilities.bold());
        clickableAnimatedTextView.setTextSize(AndroidUtilities.dp(11.0f));
        clickableAnimatedTextView.setPadding(AndroidUtilities.dp(4.33f), 0, AndroidUtilities.dp(4.33f), 0);
        clickableAnimatedTextView.setGravity(3);
        linearLayout.addView(clickableAnimatedTextView, LayoutHelper.createLinear(-1, 17, 51, 4, 1, 4, 0));
        DialogCell dialogCell = new DialogCell(null, context, false, true, UserConfig.selectedAccount, resourceProvider);
        this.dialogCell = dialogCell;
        dialogCell.setBackgroundColor(0);
        dialogCell.setDialogCellDelegate(new DialogCell.DialogCellDelegate() {
            @Override
            public boolean canClickButtonInside() {
                return true;
            }

            @Override
            public void onButtonClicked(DialogCell dialogCell2) {
            }

            @Override
            public void onButtonLongPress(DialogCell dialogCell2) {
            }

            @Override
            public void showChatPreview(DialogCell dialogCell2) {
            }

            @Override
            public void openStory(DialogCell dialogCell2, Runnable runnable) {
                if (baseFragment.getMessagesController().getStoriesController().hasStories(dialogCell2.getDialogId())) {
                    baseFragment.getOrCreateStoryViewer().doOnAnimationReady(runnable);
                    baseFragment.getOrCreateStoryViewer().open(baseFragment.getContext(), dialogCell2.getDialogId(), StoriesListPlaceProvider.of(ProfileChannelCell.this));
                }
            }

            @Override
            public void openHiddenStories() {
                StoriesController storiesController = baseFragment.getMessagesController().getStoriesController();
                if (storiesController.getHiddenList().isEmpty()) {
                    return;
                }
                boolean z = storiesController.getUnreadState(DialogObject.getPeerDialogId(((TL_stories.PeerStories) storiesController.getHiddenList().get(0)).peer)) != 0;
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < storiesController.getHiddenList().size(); i++) {
                    long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) storiesController.getHiddenList().get(i)).peer);
                    if (!z || storiesController.getUnreadState(peerDialogId) != 0) {
                        arrayList.add(Long.valueOf(peerDialogId));
                    }
                }
                baseFragment.getOrCreateStoryViewer().open(context, null, arrayList, 0, null, null, StoriesListPlaceProvider.of(ProfileChannelCell.this), false);
            }
        });
        dialogCell.avatarStart = 15;
        dialogCell.messagePaddingStart = 83;
        addView(dialogCell, LayoutHelper.createFrame(-1, -2, 87));
        updateColors();
        setWillNotDraw(false);
        LoadingDrawable loadingDrawable = new LoadingDrawable();
        this.loadingDrawable = loadingDrawable;
        int i = Theme.key_listSelector;
        loadingDrawable.setColors(Theme.multAlpha(Theme.getColor(i, resourceProvider), 1.25f), Theme.multAlpha(Theme.getColor(i, resourceProvider), 0.8f));
        loadingDrawable.setRadiiDp(8.0f);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f = this.loadingAlpha.set(this.loading);
        if (f > 0.0f) {
            this.loadingDrawable.setAlpha((int) (f * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.dialogCell.getX() + AndroidUtilities.dp(this.dialogCell.messagePaddingStart + 6), this.dialogCell.getY() + AndroidUtilities.dp(38.0f), this.dialogCell.getX() + AndroidUtilities.dp(this.dialogCell.messagePaddingStart + 6) + (getWidth() * 0.5f), this.dialogCell.getY() + AndroidUtilities.dp(46.33f));
            this.loadingDrawable.setBounds(rectF);
            this.loadingDrawable.draw(canvas);
            rectF.set(this.dialogCell.getX() + AndroidUtilities.dp(this.dialogCell.messagePaddingStart + 6), this.dialogCell.getY() + AndroidUtilities.dp(56.0f), this.dialogCell.getX() + AndroidUtilities.dp(this.dialogCell.messagePaddingStart + 6) + (getWidth() * 0.36f), this.dialogCell.getY() + AndroidUtilities.dp(64.33f));
            this.loadingDrawable.setBounds(rectF);
            this.loadingDrawable.draw(canvas);
            rectF.set(((this.dialogCell.getX() + this.dialogCell.getWidth()) - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(43.0f), this.dialogCell.getY() + AndroidUtilities.dp(12.0f), (this.dialogCell.getX() + this.dialogCell.getWidth()) - AndroidUtilities.dp(16.0f), this.dialogCell.getY() + AndroidUtilities.dp(20.33f));
            this.loadingDrawable.setBounds(rectF);
            this.loadingDrawable.draw(canvas);
            invalidate();
        }
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return this.loadingDrawable == drawable || super.verifyDrawable(drawable);
    }

    public void set(TLRPC.Chat chat, ArrayList arrayList) {
        String shortNumber;
        boolean z = this.set;
        boolean z2 = chat == null || chat.participants_count > 0;
        this.subscribersView.cancelAnimation();
        this.subscribersView.setPivotX(0.0f);
        if (z) {
            this.subscribersView.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.8f).scaleY(z2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
        } else {
            this.subscribersView.setAlpha(z2 ? 1.0f : 0.0f);
            this.subscribersView.setScaleX(z2 ? 1.0f : 0.0f);
            this.subscribersView.setScaleY(z2 ? 1.0f : 0.0f);
        }
        if (chat != null) {
            int[] iArr = new int[1];
            if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                int i = chat.participants_count;
                iArr[0] = i;
                shortNumber = String.valueOf(i);
            } else {
                shortNumber = LocaleController.formatShortNumber(chat.participants_count, iArr);
            }
            this.subscribersView.setText(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), shortNumber), true);
            boolean z3 = arrayList == null || arrayList.isEmpty();
            this.loading = z3;
            if (z3) {
                this.dialogCell.setDialog(-chat.id, null, 0, false, z);
            } else {
                MessageObject messageObject = (MessageObject) arrayList.get(arrayList.size() - 1);
                this.dialogCell.setDialog(-chat.id, messageObject, arrayList, messageObject.messageOwner.date, false, z);
            }
        }
        if (!z) {
            z = z;
            this.loadingAlpha.set(this.loading, true);
        }
        z = z;
        invalidate();
        this.set = true;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    public static class ChannelMessageFetcher {
        public long channel_id;
        public final int currentAccount;
        public boolean error;
        public boolean loaded;
        public boolean loading;
        public int message_id;
        private int searchId;
        public ArrayList messageObjects = new ArrayList();
        private ArrayList callbacks = new ArrayList();

        public ChannelMessageFetcher(int i) {
            this.currentAccount = i;
        }

        public void fetch(TLRPC.UserFull userFull) {
            if (userFull == null || (userFull.flags2 & 64) == 0) {
                this.searchId++;
                this.loaded = true;
                this.messageObjects.clear();
                done(false);
                return;
            }
            fetch(userFull.personal_channel_id, userFull.personal_channel_message);
        }

        public void fetch(final long j, final int i) {
            if (this.loaded || this.loading) {
                if (this.channel_id == j && this.message_id == i) {
                    return;
                }
                this.loaded = false;
                this.messageObjects.clear();
            }
            final int i2 = this.searchId + 1;
            this.searchId = i2;
            this.loading = true;
            this.channel_id = j;
            this.message_id = i;
            final long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            messagesStorage.getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    ProfileChannelCell.ChannelMessageFetcher.$r8$lambda$rXKSW7QTzI4_zXTgytjDxPu1NJ4(this.f$0, i, messagesStorage, j, clientUserId, i2);
                }
            });
        }

        public static void $r8$lambda$rXKSW7QTzI4_zXTgytjDxPu1NJ4(final ChannelMessageFetcher channelMessageFetcher, final int i, final MessagesStorage messagesStorage, final long j, long j2, final int i2) throws Throwable {
            SQLiteCursor sQLiteCursorQueryFinalized;
            boolean z = false;
            int i3 = 1;
            channelMessageFetcher.getClass();
            final ArrayList arrayList = new ArrayList();
            ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
            ArrayList<TLRPC.Chat> arrayList3 = new ArrayList<>();
            SQLiteCursor sQLiteCursor = null;
            sQLiteCursor = null;
            try {
                try {
                    if (i <= 0) {
                        sQLiteCursorQueryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? ORDER BY mid DESC LIMIT 10", Long.valueOf(-j));
                    } else {
                        sQLiteCursorQueryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? AND mid <= ? ORDER BY mid DESC LIMIT 10", Long.valueOf(-j), Integer.valueOf(i));
                    }
                    try {
                        ArrayList<Long> arrayList4 = new ArrayList<>();
                        ArrayList arrayList5 = new ArrayList();
                        while (sQLiteCursorQueryFinalized.next()) {
                            NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(z ? 1 : 0);
                            if (nativeByteBufferByteBufferValue != null) {
                                TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(z), z);
                                messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue, j2);
                                nativeByteBufferByteBufferValue.reuse();
                                messageTLdeserialize.id = sQLiteCursorQueryFinalized.intValue(i3);
                                messageTLdeserialize.dialog_id = -j;
                                MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize, arrayList4, arrayList5, null);
                                arrayList.add(messageTLdeserialize);
                                z = false;
                                i3 = 1;
                            }
                        }
                        sQLiteCursorQueryFinalized.dispose();
                        if (!arrayList.isEmpty()) {
                            if (!arrayList4.isEmpty()) {
                                messagesStorage.getUsersInternal(arrayList4, arrayList2);
                            }
                            if (!arrayList5.isEmpty()) {
                                messagesStorage.getChatsInternal(TextUtils.join(",", arrayList5), arrayList3);
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        sQLiteCursor = sQLiteCursorQueryFinalized;
                        FileLog.e(e);
                        if (sQLiteCursor != null) {
                            sQLiteCursorQueryFinalized = sQLiteCursor;
                        }
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                ProfileChannelCell.ChannelMessageFetcher.$r8$lambda$fc_Nyqlljl_Uw1Lp0w8_VtSyrqU(this.f$0, i2, arrayList, j, i, messagesStorage);
                            }
                        });
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor = sQLiteCursorQueryFinalized;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
                sQLiteCursorQueryFinalized.dispose();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ProfileChannelCell.ChannelMessageFetcher.$r8$lambda$fc_Nyqlljl_Uw1Lp0w8_VtSyrqU(this.f$0, i2, arrayList, j, i, messagesStorage);
                    }
                });
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public static void $r8$lambda$fc_Nyqlljl_Uw1Lp0w8_VtSyrqU(final ChannelMessageFetcher channelMessageFetcher, final int i, final ArrayList arrayList, final long j, int i2, final MessagesStorage messagesStorage) {
            if (i != channelMessageFetcher.searchId) {
                return;
            }
            if (!arrayList.isEmpty()) {
                channelMessageFetcher.messageObjects.clear();
                Collections.sort(arrayList, Comparator$CC.comparingInt(new ToIntFunction() {
                    @Override
                    public final int applyAsInt(Object obj) {
                        return ((TLRPC.Message) obj).id;
                    }
                }));
                TLRPC.Message message = (TLRPC.Message) arrayList.get(arrayList.size() - 1);
                long j2 = message.grouped_id;
                if (j2 != 0) {
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        TLRPC.Message message2 = (TLRPC.Message) obj;
                        if (message2.grouped_id == j2) {
                            channelMessageFetcher.messageObjects.add(new MessageObject(channelMessageFetcher.currentAccount, message2, false, true));
                        }
                    }
                } else {
                    channelMessageFetcher.messageObjects.add(new MessageObject(channelMessageFetcher.currentAccount, message, false, true));
                }
                if (!channelMessageFetcher.messageObjects.isEmpty()) {
                    channelMessageFetcher.done(false);
                    return;
                }
            }
            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
            tL_channels_getMessages.channel = MessagesController.getInstance(channelMessageFetcher.currentAccount).getInputChannel(j);
            for (int i4 = 10; i4 >= 0; i4--) {
                int i5 = i2 - i4;
                if (i5 >= 0) {
                    tL_channels_getMessages.id.add(Integer.valueOf(i5));
                }
            }
            ConnectionsManager.getInstance(channelMessageFetcher.currentAccount).sendRequest(tL_channels_getMessages, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ProfileChannelCell.ChannelMessageFetcher.m1496$r8$lambda$y6kbaezH8lc59pPc6OUHkfb5iY(this.f$0, messagesStorage, j, i, arrayList, tLObject, tL_error);
                }
            });
        }

        public static void m1496$r8$lambda$y6kbaezH8lc59pPc6OUHkfb5iY(final ChannelMessageFetcher channelMessageFetcher, final MessagesStorage messagesStorage, final long j, final int i, final ArrayList arrayList, final TLObject tLObject, TLRPC.TL_error tL_error) {
            channelMessageFetcher.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ProfileChannelCell.ChannelMessageFetcher.$r8$lambda$CE0It025FDdHulM9Rwkn80lbBgk(this.f$0, tLObject, messagesStorage, j, i, arrayList);
                }
            });
        }

        public static void $r8$lambda$CE0It025FDdHulM9Rwkn80lbBgk(ChannelMessageFetcher channelMessageFetcher, TLObject tLObject, MessagesStorage messagesStorage, long j, int i, ArrayList arrayList) {
            channelMessageFetcher.getClass();
            if (tLObject instanceof TLRPC.messages_Messages) {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                MessagesController.getInstance(channelMessageFetcher.currentAccount).putUsers(messages_messages.users, false);
                MessagesController.getInstance(channelMessageFetcher.currentAccount).putChats(messages_messages.chats, false);
                messagesStorage.putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                messagesStorage.putMessages(messages_messages, -j, 3, 0, false, 0, 0L);
                if (i == channelMessageFetcher.searchId && !messages_messages.messages.isEmpty()) {
                    channelMessageFetcher.messageObjects.clear();
                    Collections.sort(arrayList, Comparator$CC.comparingInt(new ToIntFunction() {
                        @Override
                        public final int applyAsInt(Object obj) {
                            return ((TLRPC.Message) obj).id;
                        }
                    }));
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                    TLRPC.Message message = arrayList2.get(arrayList2.size() - 1);
                    long j2 = message.grouped_id;
                    if (j2 != 0) {
                        ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                        int size = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size) {
                            TLRPC.Message message2 = arrayList3.get(i2);
                            i2++;
                            TLRPC.Message message3 = message2;
                            if (message3.grouped_id == j2) {
                                channelMessageFetcher.messageObjects.add(new MessageObject(channelMessageFetcher.currentAccount, message3, false, true));
                            }
                        }
                    } else {
                        channelMessageFetcher.messageObjects.add(new MessageObject(channelMessageFetcher.currentAccount, message, false, true));
                    }
                    if (channelMessageFetcher.messageObjects.isEmpty()) {
                        return;
                    }
                    channelMessageFetcher.done(false);
                    return;
                }
                return;
            }
            if (i != channelMessageFetcher.searchId) {
                return;
            }
            channelMessageFetcher.done(true);
        }

        public void subscribe(Runnable runnable) {
            if (this.loaded) {
                runnable.run();
            } else {
                this.callbacks.add(runnable);
            }
        }

        private void done(boolean z) {
            int i = 0;
            this.loading = false;
            this.loaded = true;
            this.error = z;
            ArrayList arrayList = this.callbacks;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
            this.callbacks.clear();
        }
    }

    @Override
    public void updateColors() {
        int iProcessColor = processColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader, this.resourcesProvider));
        this.subscribersView.setTextColor(iProcessColor);
        this.subscribersView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), Theme.multAlpha(iProcessColor, 0.1f)));
        this.headerView.setTextColor(iProcessColor);
    }
}
