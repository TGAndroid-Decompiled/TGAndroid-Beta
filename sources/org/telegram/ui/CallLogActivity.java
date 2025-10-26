package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.CallLogActivity;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.LocationCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AvatarsImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.ProgressButton;
import org.telegram.ui.Components.QRCodeBottomSheet;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;

public class CallLogActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private ArrayList activeGroupCalls;
    private EmptyTextProgressView emptyView;
    private boolean endReached;
    private boolean firstLoaded;
    private FlickerLoadingView flickerLoadingView;
    private ImageView floatingButton;
    private boolean floatingHidden;
    private FragmentContextView fragmentContextView;
    private Drawable greenDrawable;
    private Drawable greenDrawable2;
    private ImageSpan iconIn;
    private ImageSpan iconMissed;
    private ImageSpan iconOut;
    private TLRPC.Chat lastCallChat;
    private TLRPC.User lastCallUser;
    private LinearLayoutManager layoutManager;
    private RecyclerListView listView;
    private ListAdapter listViewAdapter;
    private boolean loading;
    private boolean openTransitionStarted;
    private ActionBarMenuItem otherItem;
    private int prevPosition;
    private int prevTop;
    private Drawable redDrawable;
    private boolean scrollUpdated;
    private NumberTextView selectedDialogsCountTextView;
    private Long waitingForCallChatId;
    private ArrayList actionModeViews = new ArrayList();
    private ArrayList calls = new ArrayList();
    private ArrayList selectedIds = new ArrayList();
    private final AccelerateDecelerateInterpolator floatingInterpolator = new AccelerateDecelerateInterpolator();

    public static boolean lambda$createActionMode$10(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean needDelayOpenAnimation() {
        return true;
    }

    public static class EmptyTextProgressView extends FrameLayout {
        private TextView emptyTextView1;
        private TextView emptyTextView2;
        private RLottieImageView imageView;
        private View progressView;

        public static boolean lambda$new$1(View view, MotionEvent motionEvent) {
            return true;
        }

        @Override
        public boolean hasOverlappingRendering() {
            return false;
        }

        public EmptyTextProgressView(Context context, View view) {
            super(context);
            addView(view, LayoutHelper.createFrame(-1, -1.0f));
            this.progressView = view;
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.imageView = rLottieImageView;
            rLottieImageView.setAnimation(R.raw.utyan_call, 120, 120);
            this.imageView.setAutoRepeat(false);
            addView(this.imageView, LayoutHelper.createFrame(140, 140.0f, 17, 52.0f, 4.0f, 52.0f, 60.0f));
            this.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    CallLogActivity.EmptyTextProgressView.this.lambda$new$0(view2);
                }
            });
            TextView textView = new TextView(context);
            this.emptyTextView1 = textView;
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
            this.emptyTextView1.setText(LocaleController.getString(R.string.NoRecentCalls));
            this.emptyTextView1.setTextSize(1, 20.0f);
            this.emptyTextView1.setTypeface(AndroidUtilities.bold());
            this.emptyTextView1.setGravity(17);
            addView(this.emptyTextView1, LayoutHelper.createFrame(-1, -2.0f, 17, 17.0f, 40.0f, 17.0f, 0.0f));
            this.emptyTextView2 = new TextView(context);
            String string = LocaleController.getString(R.string.NoRecentCallsInfo);
            if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                string = string.replace('\n', ' ');
            }
            this.emptyTextView2.setText(string);
            this.emptyTextView2.setTextColor(Theme.getColor(Theme.key_emptyListPlaceholder));
            this.emptyTextView2.setTextSize(1, 14.0f);
            this.emptyTextView2.setGravity(17);
            this.emptyTextView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.emptyTextView2, LayoutHelper.createFrame(-1, -2.0f, 17, 17.0f, 80.0f, 17.0f, 0.0f));
            view.setAlpha(0.0f);
            this.imageView.setAlpha(0.0f);
            this.emptyTextView1.setAlpha(0.0f);
            this.emptyTextView2.setAlpha(0.0f);
            setOnTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean lambda$new$1;
                    lambda$new$1 = CallLogActivity.EmptyTextProgressView.lambda$new$1(view2, motionEvent);
                    return lambda$new$1;
                }
            });
        }

        public void lambda$new$0(View view) {
            if (this.imageView.isPlaying()) {
                return;
            }
            this.imageView.setProgress(0.0f);
            this.imageView.playAnimation();
        }

        public void showProgress() {
            this.imageView.animate().alpha(0.0f).setDuration(150L).start();
            this.emptyTextView1.animate().alpha(0.0f).setDuration(150L).start();
            this.emptyTextView2.animate().alpha(0.0f).setDuration(150L).start();
            this.progressView.animate().alpha(1.0f).setDuration(150L).start();
        }

        public void showTextView() {
            this.imageView.animate().alpha(1.0f).setDuration(150L).start();
            this.emptyTextView1.animate().alpha(1.0f).setDuration(150L).start();
            this.emptyTextView2.animate().alpha(1.0f).setDuration(150L).start();
            this.progressView.animate().alpha(0.0f).setDuration(150L).start();
            this.imageView.playAnimation();
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        Long l;
        ListAdapter listAdapter;
        CallLogRow callLogRow;
        if (i == NotificationCenter.didReceiveNewMessages) {
            if (this.firstLoaded && !((Boolean) objArr[2]).booleanValue()) {
                Iterator it = ((ArrayList) objArr[1]).iterator();
                while (it.hasNext()) {
                    MessageObject messageObject = (MessageObject) it.next();
                    TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                    if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                        long fromChatId = messageObject.getFromChatId();
                        long j = fromChatId == getUserConfig().getClientUserId() ? messageObject.messageOwner.peer_id.user_id : fromChatId;
                        int i3 = fromChatId == getUserConfig().getClientUserId() ? 0 : 1;
                        TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = messageObject.messageOwner.action.reason;
                        if (i3 == 1 && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                            i3 = 2;
                        }
                        if (this.calls.size() > 0) {
                            CallLogRow callLogRow2 = (CallLogRow) this.calls.get(0);
                            if (eq(j, callLogRow2.users) && callLogRow2.type == i3) {
                                callLogRow2.calls.add(0, messageObject.messageOwner);
                                ListAdapter listAdapter2 = this.listViewAdapter;
                                listAdapter2.notifyItemChanged(listAdapter2.callsStartRow);
                            }
                        }
                        CallLogRow callLogRow3 = new CallLogRow();
                        callLogRow3.calls.clear();
                        callLogRow3.calls.add(messageObject.messageOwner);
                        callLogRow3.users.clear();
                        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j));
                        if (user != null) {
                            callLogRow3.users.add(user);
                        }
                        callLogRow3.type = i3;
                        callLogRow3.video = messageObject.isVideoCall();
                        this.calls.add(0, callLogRow3);
                        this.listViewAdapter.updateRows();
                        ListAdapter listAdapter3 = this.listViewAdapter;
                        listAdapter3.notifyItemInserted(listAdapter3.callsStartRow);
                    } else if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        long fromChatId2 = messageObject.getFromChatId();
                        Set<Long> set = (Set) Collection.EL.stream(tL_messageActionConferenceCall.other_participants).map(new Function() {
                            public Function andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override
                            public final Object apply(Object obj) {
                                Long lambda$didReceivedNotification$0;
                                lambda$didReceivedNotification$0 = CallLogActivity.lambda$didReceivedNotification$0((TLRPC.Peer) obj);
                                return lambda$didReceivedNotification$0;
                            }

                            public Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toSet());
                        set.add(Long.valueOf(fromChatId2 == getUserConfig().getClientUserId() ? messageObject.messageOwner.peer_id.user_id : fromChatId2));
                        int i4 = fromChatId2 == getUserConfig().getClientUserId() ? 0 : 1;
                        if (i4 == 1 && tL_messageActionConferenceCall.missed) {
                            i4 = 2;
                        }
                        if (this.calls.size() > 0) {
                            int i5 = 0;
                            while (true) {
                                if (i5 >= this.calls.size()) {
                                    i5 = -1;
                                    callLogRow = null;
                                    break;
                                } else {
                                    callLogRow = (CallLogRow) this.calls.get(i5);
                                    if (callLogRow.call_id == tL_messageActionConferenceCall.call_id) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                            if (callLogRow != null) {
                                callLogRow.calls.add(0, messageObject.messageOwner);
                                for (Long l2 : set) {
                                    long longValue = l2.longValue();
                                    Iterator it2 = callLogRow.users.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (longValue == ((TLRPC.User) it2.next()).id) {
                                                break;
                                            }
                                        } else {
                                            TLRPC.User user2 = getMessagesController().getUser(l2);
                                            if (user2 != null) {
                                                callLogRow.users.add(user2);
                                            }
                                        }
                                    }
                                }
                                ListAdapter listAdapter4 = this.listViewAdapter;
                                listAdapter4.notifyItemChanged(listAdapter4.callsStartRow + i5);
                            }
                        }
                        CallLogRow callLogRow4 = new CallLogRow();
                        callLogRow4.call_id = tL_messageActionConferenceCall.call_id;
                        callLogRow4.calls.clear();
                        callLogRow4.calls.add(messageObject.messageOwner);
                        callLogRow4.users.clear();
                        for (Long l3 : set) {
                            l3.longValue();
                            TLRPC.User user3 = getMessagesController().getUser(l3);
                            if (user3 != null) {
                                callLogRow4.users.add(user3);
                            }
                        }
                        callLogRow4.type = i4;
                        callLogRow4.video = messageObject.isVideoCall();
                        this.calls.add(0, callLogRow4);
                        ListAdapter listAdapter5 = this.listViewAdapter;
                        listAdapter5.notifyItemInserted(listAdapter5.callsStartRow);
                    }
                }
                ActionBarMenuItem actionBarMenuItem = this.otherItem;
                if (actionBarMenuItem != null) {
                    actionBarMenuItem.setVisibility(this.calls.isEmpty() ? 8 : 0);
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.messagesDeleted) {
            if (this.firstLoaded && !((Boolean) objArr[2]).booleanValue()) {
                ArrayList arrayList = (ArrayList) objArr[0];
                Iterator it3 = this.calls.iterator();
                while (it3.hasNext()) {
                    CallLogRow callLogRow5 = (CallLogRow) it3.next();
                    Iterator it4 = callLogRow5.calls.iterator();
                    while (it4.hasNext()) {
                        if (arrayList.contains(Integer.valueOf(((TLRPC.Message) it4.next()).id))) {
                            it4.remove();
                            r4 = 1;
                        }
                    }
                    if (callLogRow5.calls.size() == 0) {
                        it3.remove();
                    }
                }
                if (r4 == 0 || (listAdapter = this.listViewAdapter) == null) {
                    return;
                }
                listAdapter.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (i == NotificationCenter.activeGroupCallsUpdated) {
            this.activeGroupCalls = getMessagesController().getActiveGroupCalls();
            ListAdapter listAdapter6 = this.listViewAdapter;
            if (listAdapter6 != null) {
                listAdapter6.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (i == NotificationCenter.chatInfoDidLoad) {
            Long l4 = this.waitingForCallChatId;
            if (l4 == null || ((TLRPC.ChatFull) objArr[0]).id != l4.longValue() || getMessagesController().getGroupCall(this.waitingForCallChatId.longValue(), true) == null) {
                return;
            }
            VoIPHelper.startCall(this.lastCallChat, null, null, false, getParentActivity(), this, getAccountInstance());
            this.waitingForCallChatId = null;
            return;
        }
        if (i == NotificationCenter.groupCallUpdated && (l = this.waitingForCallChatId) != null && l.equals((Long) objArr[0])) {
            VoIPHelper.startCall(this.lastCallChat, null, null, false, getParentActivity(), this, getAccountInstance());
            this.waitingForCallChatId = null;
        }
    }

    public static Long lambda$didReceivedNotification$0(TLRPC.Peer peer) {
        return Long.valueOf(DialogObject.getPeerDialogId(peer));
    }

    private static boolean eq(long j, ArrayList arrayList) {
        return arrayList.size() == 1 && ((TLRPC.User) arrayList.get(0)).id == j;
    }

    private static boolean eq(Set set, ArrayList arrayList) {
        if (set.size() != arrayList.size()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!set.contains(Long.valueOf(((TLRPC.User) it.next()).id))) {
                return false;
            }
        }
        return true;
    }

    public class CallCell extends FrameLayout {
        private final AvatarsImageView avatarsImageView;
        private final CheckBox2 checkBox;
        private final ImageView imageView;
        private final ProfileSearchCell profileSearchCell;

        public CallCell(Context context) {
            super(context);
            int i = Theme.key_windowBackgroundWhite;
            setBackgroundColor(Theme.getColor(i));
            ProfileSearchCell profileSearchCell = new ProfileSearchCell(context);
            this.profileSearchCell = profileSearchCell;
            profileSearchCell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(32.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(32.0f), 0);
            profileSearchCell.setSublabelOffset(AndroidUtilities.dp(LocaleController.isRTL ? 2.0f : -2.0f), -AndroidUtilities.dp(4.0f));
            addView(profileSearchCell, LayoutHelper.createFrame(-1, -1.0f));
            AvatarsImageView avatarsImageView = new AvatarsImageView(context, false);
            this.avatarsImageView = avatarsImageView;
            avatarsImageView.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            avatarsImageView.setStepFactor(0.4f);
            avatarsImageView.setSize(AndroidUtilities.dp(30.0f));
            avatarsImageView.setCentered(true);
            avatarsImageView.setVisibility(8);
            addView(avatarsImageView, LayoutHelper.createFrame(72, -1.0f, LocaleController.isRTL ? 5 : 3, -2.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setAlpha(214);
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_featuredStickers_addButton), PorterDuff.Mode.MULTIPLY));
            imageView.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector), 1));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    CallLogActivity.CallCell.this.lambda$new$3(view);
                }
            });
            imageView.setContentDescription(LocaleController.getString(R.string.Call));
            addView(imageView, LayoutHelper.createFrame(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
            CheckBox2 checkBox2 = new CheckBox2(context, 21);
            this.checkBox = checkBox2;
            checkBox2.setColor(-1, i, Theme.key_checkboxCheck);
            checkBox2.setDrawUnchecked(false);
            checkBox2.setDrawBackgroundAsArc(3);
            addView(checkBox2, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
        }

        public void lambda$new$3(View view) {
            CallLogRow callLogRow = (CallLogRow) view.getTag();
            if (callLogRow.users.size() == 1) {
                TLRPC.User user = (TLRPC.User) callLogRow.users.get(0);
                TLRPC.UserFull userFull = CallLogActivity.this.getMessagesController().getUserFull(user.id);
                TLRPC.User user2 = CallLogActivity.this.lastCallUser = user;
                boolean z = callLogRow.video;
                VoIPHelper.startCall(user2, z, z || (userFull != null && userFull.video_calls_available), CallLogActivity.this.getParentActivity(), null, CallLogActivity.this.getAccountInstance());
                return;
            }
            final boolean z2 = callLogRow.video;
            final HashSet hashSet = new HashSet();
            Iterator it = callLogRow.users.iterator();
            while (it.hasNext()) {
                hashSet.add(Long.valueOf(((TLRPC.User) it.next()).id));
            }
            final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
            tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) callLogRow.calls.get(0)).id;
            final AlertDialog alertDialog = new AlertDialog(getContext(), 3);
            TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
            getgroupcall.call = tL_inputGroupCallInviteMessage;
            getgroupcall.limit = CallLogActivity.this.getMessagesController().conferenceCallSizeLimit;
            final int sendRequest = CallLogActivity.this.getConnectionsManager().sendRequest(getgroupcall, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    CallLogActivity.CallCell.this.lambda$new$1(alertDialog, hashSet, tL_inputGroupCallInviteMessage, z2, tLObject, tL_error);
                }
            });
            alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    CallLogActivity.CallCell.this.lambda$new$2(sendRequest, dialogInterface);
                }
            });
            alertDialog.showDelayed(600L);
        }

        public void lambda$new$1(final AlertDialog alertDialog, final HashSet hashSet, final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, final boolean z, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    CallLogActivity.CallCell.this.lambda$new$0(alertDialog, tLObject, hashSet, tL_inputGroupCallInviteMessage, z, tL_error);
                }
            });
        }

        public void lambda$new$0(AlertDialog alertDialog, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, TLRPC.TL_error tL_error) {
            alertDialog.dismiss();
            if (tLObject instanceof TL_phone.groupCall) {
                TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                CallLogActivity.this.getMessagesController().putUsers(groupcall.users, false);
                CallLogActivity.this.getMessagesController().putChats(groupcall.chats, false);
                if (!groupcall.participants.isEmpty()) {
                    VoIPHelper.joinConference(CallLogActivity.this.getParentActivity(), ((BaseFragment) CallLogActivity.this).currentAccount, tL_inputGroupCallInviteMessage, z, groupcall.call);
                    return;
                } else {
                    CallLogActivity.this.showDialog(new CreateGroupCallSheet(getContext(), hashSet));
                    return;
                }
            }
            if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                CallLogActivity.this.showDialog(new CreateGroupCallSheet(getContext(), hashSet));
            } else if (tL_error != null) {
                BulletinFactory.of(CallLogActivity.this).showForError(tL_error);
            }
        }

        public void lambda$new$2(int i, DialogInterface dialogInterface) {
            CallLogActivity.this.getConnectionsManager().cancelRequest(i, true);
        }

        public void setChecked(boolean z, boolean z2) {
            CheckBox2 checkBox2 = this.checkBox;
            if (checkBox2 == null) {
                return;
            }
            checkBox2.setChecked(z, z2);
        }
    }

    public class GroupCallCell extends FrameLayout {
        private ProgressButton button;
        private TLRPC.Chat currentChat;
        private ProfileSearchCell profileSearchCell;

        public GroupCallCell(Context context) {
            super(context);
            setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            String string = LocaleController.getString(R.string.VoipChatJoin);
            this.button = new ProgressButton(context);
            int ceil = (int) Math.ceil(r0.getPaint().measureText(string));
            ProfileSearchCell profileSearchCell = new ProfileSearchCell(context);
            this.profileSearchCell = profileSearchCell;
            profileSearchCell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(44.0f) + ceil : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(44.0f) + ceil, 0);
            this.profileSearchCell.setSublabelOffset(0, -AndroidUtilities.dp(1.0f));
            addView(this.profileSearchCell, LayoutHelper.createFrame(-1, -1.0f));
            this.button.setText(string);
            this.button.setTextSize(1, 14.0f);
            this.button.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText));
            this.button.setProgressColor(Theme.getColor(Theme.key_featuredStickers_buttonProgress));
            this.button.setBackgroundRoundRect(Theme.getColor(Theme.key_featuredStickers_addButton), Theme.getColor(Theme.key_featuredStickers_addButtonPressed), 16.0f);
            this.button.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
            addView(this.button, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
            this.button.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    CallLogActivity.GroupCallCell.this.lambda$new$0(view);
                }
            });
        }

        public void lambda$new$0(View view) {
            Long l = (Long) view.getTag();
            ChatObject.Call groupCall = CallLogActivity.this.getMessagesController().getGroupCall(l.longValue(), false);
            CallLogActivity callLogActivity = CallLogActivity.this;
            callLogActivity.lastCallChat = callLogActivity.getMessagesController().getChat(l);
            if (groupCall != null) {
                TLRPC.Chat chat = CallLogActivity.this.lastCallChat;
                Activity parentActivity = CallLogActivity.this.getParentActivity();
                CallLogActivity callLogActivity2 = CallLogActivity.this;
                VoIPHelper.startCall(chat, null, null, false, parentActivity, callLogActivity2, callLogActivity2.getAccountInstance());
                return;
            }
            CallLogActivity.this.waitingForCallChatId = l;
            CallLogActivity.this.getMessagesController().loadFullChat(l.longValue(), 0, true);
        }

        public void setChat(TLRPC.Chat chat) {
            this.currentChat = chat;
        }
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        getCalls(0, 50);
        this.activeGroupCalls = getMessagesController().getActiveGroupCalls();
        getNotificationCenter().addObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.activeGroupCallsUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.groupCallUpdated);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().removeObserver(this, NotificationCenter.messagesDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.activeGroupCallsUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
    }

    @Override
    public View createView(Context context) {
        Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.ic_call_made_green_18dp).mutate();
        this.greenDrawable = mutate;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), this.greenDrawable.getIntrinsicHeight());
        Drawable drawable = this.greenDrawable;
        int i = Theme.key_calls_callReceivedGreenIcon;
        int color = Theme.getColor(i);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(color, mode));
        this.iconOut = new ImageSpan(this.greenDrawable, 0);
        Resources resources = getParentActivity().getResources();
        int i2 = R.drawable.ic_call_received_green_18dp;
        Drawable mutate2 = resources.getDrawable(i2).mutate();
        this.greenDrawable2 = mutate2;
        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), this.greenDrawable2.getIntrinsicHeight());
        this.greenDrawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i), mode));
        this.iconIn = new ImageSpan(this.greenDrawable2, 0);
        Drawable mutate3 = getParentActivity().getResources().getDrawable(i2).mutate();
        this.redDrawable = mutate3;
        mutate3.setBounds(0, 0, mutate3.getIntrinsicWidth(), this.redDrawable.getIntrinsicHeight());
        this.redDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_fill_RedNormal), mode));
        this.iconMissed = new ImageSpan(this.redDrawable, 0);
        this.actionBar.setBackButtonDrawable(new BackDrawable(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calls));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i3) {
                if (i3 == -1) {
                    if (((BaseFragment) CallLogActivity.this).actionBar.isActionModeShowed()) {
                        CallLogActivity.this.hideActionMode(true);
                        return;
                    } else {
                        CallLogActivity.this.lambda$onBackPressed$341();
                        return;
                    }
                }
                if (i3 == 1) {
                    CallLogActivity.this.showDeleteAlert(true);
                } else if (i3 == 2) {
                    CallLogActivity.this.showDeleteAlert(false);
                }
            }
        });
        ActionBarMenuItem addItem = this.actionBar.createMenu().addItem(10, R.drawable.ic_ab_other);
        this.otherItem = addItem;
        addItem.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.otherItem.addSubItem(1, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAllCalls));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        this.flickerLoadingView = flickerLoadingView;
        flickerLoadingView.setViewType(8);
        this.flickerLoadingView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        this.flickerLoadingView.showDate(false);
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, this.flickerLoadingView);
        this.emptyView = emptyTextProgressView;
        frameLayout2.addView(emptyTextProgressView, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setEmptyView(this.emptyView);
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        RecyclerListView recyclerListView3 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listViewAdapter = listAdapter;
        recyclerListView3.setAdapter(listAdapter);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i3) {
                CallLogActivity.this.lambda$createView$4(view, i3);
            }
        });
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i3) {
                boolean lambda$createView$5;
                lambda$createView$5 = CallLogActivity.this.lambda$createView$5(view, i3);
                return lambda$createView$5;
            }
        });
        this.listView.setOnScrollListener(new AnonymousClass2());
        if (this.loading) {
            this.emptyView.showProgress();
        } else {
            this.emptyView.showTextView();
        }
        ImageView imageView = new ImageView(context);
        this.floatingButton = imageView;
        imageView.setVisibility(0);
        this.floatingButton.setScaleType(ImageView.ScaleType.CENTER);
        this.floatingButton.setBackgroundDrawable(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(56.0f), Theme.getColor(Theme.key_chats_actionBackground), Theme.getColor(Theme.key_chats_actionPressedBackground)));
        this.floatingButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chats_actionIcon), mode));
        this.floatingButton.setImageResource(R.drawable.filled_calls_plus);
        this.floatingButton.setContentDescription(LocaleController.getString(R.string.Call));
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[]{16842919}, ObjectAnimator.ofFloat(this.floatingButton, "translationZ", AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f)).setDuration(200L));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this.floatingButton, "translationZ", AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f)).setDuration(200L));
        this.floatingButton.setStateListAnimator(stateListAnimator);
        this.floatingButton.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setOval(0, 0, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
            }
        });
        ImageView imageView2 = this.floatingButton;
        boolean z = LocaleController.isRTL;
        frameLayout2.addView(imageView2, LayoutHelper.createFrame(56, 56.0f, (z ? 3 : 5) | 80, z ? 14.0f : 0.0f, 0.0f, z ? 0.0f : 14.0f, 14.0f));
        this.floatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CallLogActivity.this.lambda$createView$6(view);
            }
        });
        FragmentContextView fragmentContextView = new FragmentContextView(context, this, false);
        this.fragmentContextView = fragmentContextView;
        fragmentContextView.setLayoutParams(LayoutHelper.createFrame(-1, 38.0f, 51, 0.0f, -36.0f, 0.0f, 0.0f));
        frameLayout2.addView(this.fragmentContextView);
        return this.fragmentView;
    }

    public void lambda$createView$4(View view, int i) {
        if (i == this.listViewAdapter.createCallRow) {
            openCreateCall();
            return;
        }
        if (!(view instanceof CallCell)) {
            if (view instanceof GroupCallCell) {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", ((GroupCallCell) view).currentChat.id);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                presentFragment(new ChatActivity(bundle), true);
                return;
            }
            return;
        }
        CallLogRow callLogRow = (CallLogRow) this.calls.get(i - this.listViewAdapter.callsStartRow);
        if (this.actionBar.isActionModeShowed()) {
            addOrRemoveSelectedDialog(callLogRow.calls, (CallCell) view);
            return;
        }
        if (callLogRow.call_id != 0 && !callLogRow.calls.isEmpty()) {
            final boolean z = callLogRow.video;
            final HashSet hashSet = new HashSet();
            Iterator it = callLogRow.users.iterator();
            while (it.hasNext()) {
                hashSet.add(Long.valueOf(((TLRPC.User) it.next()).id));
            }
            final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
            tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) callLogRow.calls.get(0)).id;
            final AlertDialog alertDialog = new AlertDialog(getContext(), 3);
            TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
            getgroupcall.call = tL_inputGroupCallInviteMessage;
            getgroupcall.limit = getMessagesController().conferenceCallSizeLimit;
            final int sendRequest = getConnectionsManager().sendRequest(getgroupcall, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    CallLogActivity.this.lambda$createView$2(alertDialog, hashSet, tL_inputGroupCallInviteMessage, z, tLObject, tL_error);
                }
            });
            alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    CallLogActivity.this.lambda$createView$3(sendRequest, dialogInterface);
                }
            });
            alertDialog.showDelayed(600L);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("user_id", MessageObject.getDialogId((TLRPC.Message) callLogRow.calls.get(0)));
        bundle2.putInt("message_id", ((TLRPC.Message) callLogRow.calls.get(0)).id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        presentFragment(new ChatActivity(bundle2), true);
    }

    public void lambda$createView$2(final AlertDialog alertDialog, final HashSet hashSet, final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, final boolean z, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CallLogActivity.this.lambda$createView$1(alertDialog, tLObject, hashSet, tL_inputGroupCallInviteMessage, z, tL_error);
            }
        });
    }

    public void lambda$createView$1(AlertDialog alertDialog, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, TLRPC.TL_error tL_error) {
        alertDialog.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            getMessagesController().putUsers(groupcall.users, false);
            getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                showDialog(new CreateGroupCallSheet(getContext(), hashSet));
                return;
            } else {
                VoIPHelper.joinConference(getParentActivity(), this.currentAccount, tL_inputGroupCallInviteMessage, z, groupcall.call);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            showDialog(new CreateGroupCallSheet(getContext(), hashSet));
        } else if (tL_error != null) {
            BulletinFactory.of(this).showForError(tL_error);
        }
    }

    public void lambda$createView$3(int i, DialogInterface dialogInterface) {
        getConnectionsManager().cancelRequest(i, true);
    }

    public boolean lambda$createView$5(View view, int i) {
        if (!(view instanceof CallCell)) {
            return false;
        }
        addOrRemoveSelectedDialog(((CallLogRow) this.calls.get(i - this.listViewAdapter.callsStartRow)).calls, (CallCell) view);
        return true;
    }

    public class AnonymousClass2 extends RecyclerView.OnScrollListener {
        AnonymousClass2() {
        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            boolean z;
            int findFirstVisibleItemPosition = CallLogActivity.this.layoutManager.findFirstVisibleItemPosition();
            boolean z2 = false;
            int abs = findFirstVisibleItemPosition == -1 ? 0 : Math.abs(CallLogActivity.this.layoutManager.findLastVisibleItemPosition() - findFirstVisibleItemPosition) + 1;
            if (abs > 0) {
                int itemCount = CallLogActivity.this.listViewAdapter.getItemCount();
                if (!CallLogActivity.this.endReached && !CallLogActivity.this.loading && !CallLogActivity.this.calls.isEmpty() && abs + findFirstVisibleItemPosition >= itemCount - 5) {
                    final CallLogRow callLogRow = (CallLogRow) CallLogActivity.this.calls.get(CallLogActivity.this.calls.size() - 1);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            CallLogActivity.AnonymousClass2.this.lambda$onScrolled$0(callLogRow);
                        }
                    });
                }
            }
            if (CallLogActivity.this.floatingButton.getVisibility() != 8) {
                View childAt = recyclerView.getChildAt(0);
                int top = childAt != null ? childAt.getTop() : 0;
                if (CallLogActivity.this.prevPosition == findFirstVisibleItemPosition) {
                    int i3 = CallLogActivity.this.prevTop - top;
                    z = top < CallLogActivity.this.prevTop;
                    if (Math.abs(i3) > 1) {
                        z2 = true;
                    }
                } else {
                    z2 = true;
                    z = findFirstVisibleItemPosition > CallLogActivity.this.prevPosition;
                }
                if (z2 && CallLogActivity.this.scrollUpdated) {
                    CallLogActivity.this.hideFloatingButton(z);
                }
                CallLogActivity.this.prevPosition = findFirstVisibleItemPosition;
                CallLogActivity.this.prevTop = top;
                CallLogActivity.this.scrollUpdated = true;
            }
        }

        public void lambda$onScrolled$0(CallLogRow callLogRow) {
            CallLogActivity.this.getCalls(((TLRPC.Message) callLogRow.calls.get(r3.size() - 1)).id, 100);
        }
    }

    public void lambda$createView$6(View view) {
        openCreateCall();
    }

    public void showDeleteAlert(final boolean z) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        if (z) {
            builder.setTitle(LocaleController.getString(R.string.DeleteAllCalls));
            builder.setMessage(LocaleController.getString(R.string.DeleteAllCallsText));
        } else {
            builder.setTitle(LocaleController.getString(R.string.DeleteCalls));
            builder.setMessage(LocaleController.getString(R.string.DeleteSelectedCallsText));
        }
        final boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        CheckBoxCell checkBoxCell = new CheckBoxCell(getParentActivity(), 1);
        checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
        checkBoxCell.setText(LocaleController.getString(R.string.DeleteCallsForEveryone), "", false, false);
        checkBoxCell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(8.0f), 0);
        frameLayout.addView(checkBoxCell, LayoutHelper.createFrame(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        checkBoxCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CallLogActivity.lambda$showDeleteAlert$7(zArr, view);
            }
        });
        builder.setView(frameLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                CallLogActivity.this.lambda$showDeleteAlert$8(z, zArr, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog create = builder.create();
        showDialog(create);
        TextView textView = (TextView) create.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }
    }

    public static void lambda$showDeleteAlert$7(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public void lambda$showDeleteAlert$8(boolean z, boolean[] zArr, AlertDialog alertDialog, int i) {
        if (z) {
            deleteAllMessages(zArr[0]);
            this.calls.clear();
            this.loading = false;
            this.endReached = true;
            this.otherItem.setVisibility(8);
            this.listViewAdapter.notifyDataSetChanged();
        } else {
            getMessagesController().deleteMessages(new ArrayList<>(this.selectedIds), null, null, 0L, 0, zArr[0], 0);
        }
        hideActionMode(false);
    }

    private void deleteAllMessages(final boolean z) {
        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
        tL_messages_deletePhoneCallHistory.revoke = z;
        getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                CallLogActivity.this.lambda$deleteAllMessages$9(z, tLObject, tL_error);
            }
        });
    }

    public void lambda$deleteAllMessages$9(boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
            TLRPC.TL_updateDeleteMessages tL_updateDeleteMessages = new TLRPC.TL_updateDeleteMessages();
            tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
            tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
            tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
            TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
            tL_updates.updates.add(tL_updateDeleteMessages);
            getMessagesController().processUpdates(tL_updates, false);
            if (tL_messages_affectedFoundMessages.offset != 0) {
                deleteAllMessages(z);
            }
        }
    }

    public void hideActionMode(boolean z) {
        this.actionBar.hideActionMode();
        this.selectedIds.clear();
        int childCount = this.listView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt instanceof CallCell) {
                ((CallCell) childAt).setChecked(false, z);
            }
        }
    }

    public boolean isSelected(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (this.selectedIds.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i)).id))) {
                return true;
            }
        }
        return false;
    }

    private void createActionMode() {
        if (this.actionBar.actionModeIsExist(null)) {
            return;
        }
        ActionBarMenu createActionMode = this.actionBar.createActionMode();
        NumberTextView numberTextView = new NumberTextView(createActionMode.getContext());
        this.selectedDialogsCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedDialogsCountTextView.setTypeface(AndroidUtilities.bold());
        this.selectedDialogsCountTextView.setTextColor(Theme.getColor(Theme.key_actionBarActionModeDefaultIcon));
        createActionMode.addView(this.selectedDialogsCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, 72, 0, 0, 0));
        this.selectedDialogsCountTextView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$createActionMode$10;
                lambda$createActionMode$10 = CallLogActivity.lambda$createActionMode$10(view, motionEvent);
                return lambda$createActionMode$10;
            }
        });
        this.actionModeViews.add(createActionMode.addItemWithWidth(2, R.drawable.msg_delete, AndroidUtilities.dp(54.0f), LocaleController.getString(R.string.Delete)));
    }

    private boolean addOrRemoveSelectedDialog(ArrayList arrayList, CallCell callCell) {
        if (arrayList.isEmpty()) {
            return false;
        }
        if (isSelected(arrayList)) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.selectedIds.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i)).id));
            }
            callCell.setChecked(false, true);
            showOrUpdateActionMode();
            return false;
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Integer valueOf = Integer.valueOf(((TLRPC.Message) arrayList.get(i2)).id);
            if (!this.selectedIds.contains(valueOf)) {
                this.selectedIds.add(valueOf);
            }
        }
        callCell.setChecked(true, true);
        showOrUpdateActionMode();
        return true;
    }

    private void showOrUpdateActionMode() {
        boolean z = true;
        if (this.actionBar.isActionModeShowed()) {
            if (this.selectedIds.isEmpty()) {
                hideActionMode(true);
                return;
            }
        } else {
            createActionMode();
            this.actionBar.showActionMode();
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.actionModeViews.size(); i++) {
                View view = (View) this.actionModeViews.get(i);
                view.setPivotY(ActionBar.getCurrentActionBarHeight() / 2);
                AndroidUtilities.clearDrawableAnimation(view);
                arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.start();
            z = false;
        }
        this.selectedDialogsCountTextView.setNumber(this.selectedIds.size(), z);
    }

    public void hideFloatingButton(boolean z) {
        if (this.floatingHidden == z) {
            return;
        }
        this.floatingHidden = z;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.floatingButton, "translationY", z ? AndroidUtilities.dp(100.0f) : 0.0f).setDuration(300L);
        duration.setInterpolator(this.floatingInterpolator);
        this.floatingButton.setClickable(!z);
        duration.start();
    }

    public void getCalls(int i, int i2) {
        if (this.loading) {
            return;
        }
        this.loading = true;
        EmptyTextProgressView emptyTextProgressView = this.emptyView;
        if (emptyTextProgressView != null && !this.firstLoaded) {
            emptyTextProgressView.showProgress();
        }
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i2;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.q = "";
        tL_messages_search.offset_id = i;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                CallLogActivity.this.lambda$getCalls$15(tLObject, tL_error);
            }
        }, 2), this.classGuid);
    }

    public void lambda$getCalls$15(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CallLogActivity.this.lambda$getCalls$14(tL_error, tLObject);
            }
        });
    }

    public void lambda$getCalls$14(org.telegram.tgnet.TLRPC.TL_error r21, org.telegram.tgnet.TLObject r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.CallLogActivity.lambda$getCalls$14(org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static Long lambda$getCalls$11(TLRPC.Peer peer) {
        return Long.valueOf(DialogObject.getPeerDialogId(peer));
    }

    public static boolean lambda$getCalls$12(long j, TLRPC.User user) {
        return user.id == j;
    }

    public static boolean lambda$getCalls$13(long j, TLRPC.User user) {
        return user.id == j;
    }

    @Override
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        boolean z;
        if (i == 101 || i == 102 || i == 103) {
            int i2 = 0;
            while (true) {
                if (i2 >= iArr.length) {
                    z = true;
                    break;
                } else {
                    if (iArr[i2] != 0) {
                        z = false;
                        break;
                    }
                    i2++;
                }
            }
            if (iArr.length <= 0 || !z) {
                VoIPHelper.permissionDenied(getParentActivity(), null, i);
            } else if (i == 103) {
                VoIPHelper.startCall(this.lastCallChat, null, null, false, getParentActivity(), this, getAccountInstance());
            } else {
                TLRPC.UserFull userFull = this.lastCallUser != null ? getMessagesController().getUserFull(this.lastCallUser.id) : null;
                VoIPHelper.startCall(this.lastCallUser, i == 102, i == 102 || (userFull != null && userFull.video_calls_available), getParentActivity(), null, getAccountInstance());
            }
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private int activeEndRow;
        private int activeHeaderRow;
        private int activeStartRow;
        private int callsEndRow;
        private int callsHeaderRow;
        private int callsStartRow;
        private int createCallInfoRow;
        private int createCallRow;
        private int loadingCallsRow;
        private Context mContext;
        private int rowsCount;
        private int sectionRow;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        public void updateRows() {
            this.activeHeaderRow = -1;
            this.callsHeaderRow = -1;
            this.activeStartRow = -1;
            this.activeEndRow = -1;
            this.callsStartRow = -1;
            this.callsEndRow = -1;
            this.loadingCallsRow = -1;
            this.sectionRow = -1;
            this.createCallRow = 0;
            this.rowsCount = 2;
            this.createCallInfoRow = 1;
            if (!CallLogActivity.this.activeGroupCalls.isEmpty()) {
                int i = this.rowsCount;
                int i2 = i + 1;
                this.rowsCount = i2;
                this.activeHeaderRow = i;
                this.activeStartRow = i2;
                int size = i2 + CallLogActivity.this.activeGroupCalls.size();
                this.rowsCount = size;
                this.activeEndRow = size;
            }
            if (CallLogActivity.this.calls.isEmpty()) {
                return;
            }
            if (this.activeHeaderRow != -1) {
                int i3 = this.rowsCount;
                this.sectionRow = i3;
                this.rowsCount = i3 + 2;
                this.callsHeaderRow = i3 + 1;
            }
            int i4 = this.rowsCount;
            this.callsStartRow = i4;
            int size2 = i4 + CallLogActivity.this.calls.size();
            this.rowsCount = size2;
            this.callsEndRow = size2;
            if (CallLogActivity.this.endReached) {
                return;
            }
            int i5 = this.rowsCount;
            this.rowsCount = i5 + 1;
            this.loadingCallsRow = i5;
        }

        @Override
        public void notifyDataSetChanged() {
            updateRows();
            super.notifyDataSetChanged();
        }

        @Override
        public void notifyItemChanged(int i) {
            updateRows();
            super.notifyItemChanged(i);
        }

        @Override
        public void notifyItemRangeChanged(int i, int i2) {
            updateRows();
            super.notifyItemRangeChanged(i, i2);
        }

        @Override
        public void notifyItemRangeChanged(int i, int i2, Object obj) {
            updateRows();
            super.notifyItemRangeChanged(i, i2, obj);
        }

        @Override
        public void notifyItemInserted(int i) {
            updateRows();
            super.notifyItemInserted(i);
        }

        @Override
        public void notifyItemMoved(int i, int i2) {
            updateRows();
            super.notifyItemMoved(i, i2);
        }

        @Override
        public void notifyItemRangeInserted(int i, int i2) {
            updateRows();
            super.notifyItemRangeInserted(i, i2);
        }

        @Override
        public void notifyItemRangeRemoved(int i, int i2) {
            updateRows();
            super.notifyItemRangeRemoved(i, i2);
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 0 || itemViewType == 4 || itemViewType == 6;
        }

        @Override
        public int getItemCount() {
            return this.rowsCount;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            FrameLayout frameLayout;
            if (i == 0) {
                frameLayout = new CallCell(this.mContext);
            } else if (i == 1) {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext);
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.setViewType(8);
                flickerLoadingView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                flickerLoadingView.showDate(false);
                frameLayout = flickerLoadingView;
            } else if (i == 2) {
                FrameLayout textInfoPrivacyCell = new TextInfoPrivacyCell(this.mContext);
                textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                frameLayout = textInfoPrivacyCell;
            } else if (i == 3) {
                FrameLayout headerCell = new HeaderCell(this.mContext, Theme.key_windowBackgroundWhiteBlueHeader, 21, 15, 2, false, CallLogActivity.this.getResourceProvider());
                headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                frameLayout = headerCell;
            } else if (i == 4) {
                frameLayout = new GroupCallCell(this.mContext);
            } else if (i == 6) {
                FrameLayout textCell = new TextCell(this.mContext);
                textCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                frameLayout = textCell;
            } else {
                TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(this.mContext);
                textInfoPrivacyCell2.setFixedSize(12);
                frameLayout = textInfoPrivacyCell2;
            }
            return new RecyclerListView.Holder(frameLayout);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.itemView instanceof CallCell) {
                ((CallCell) viewHolder.itemView).setChecked(CallLogActivity.this.isSelected(((CallLogRow) CallLogActivity.this.calls.get(viewHolder.getAdapterPosition() - this.callsStartRow)).calls), false);
            }
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            SpannableString spannableString;
            String lowerCase;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType != 0) {
                if (itemViewType == 3) {
                    HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                    if (i == this.activeHeaderRow) {
                        headerCell.setText(LocaleController.getString(R.string.VoipChatActiveChats));
                        return;
                    } else {
                        if (i == this.callsHeaderRow) {
                            headerCell.setText(LocaleController.getString(R.string.VoipChatRecentCalls));
                            return;
                        }
                        return;
                    }
                }
                if (itemViewType != 4) {
                    if (itemViewType != 5) {
                        if (itemViewType != 6) {
                            return;
                        }
                        TextCell textCell = (TextCell) viewHolder.itemView;
                        textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.GroupCallCreate), R.drawable.menu_call_create, false);
                        int i2 = Theme.key_windowBackgroundWhiteBlueText4;
                        textCell.setColors(i2, i2);
                        return;
                    }
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                    if (i == this.createCallInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.formatPluralStringComma("GroupCallCreateInfo", CallLogActivity.this.getMessagesController().conferenceCallSizeLimit));
                        textInfoPrivacyCell.setFixedSize(0);
                        return;
                    } else {
                        textInfoPrivacyCell.setText(null);
                        textInfoPrivacyCell.setFixedSize(12);
                        return;
                    }
                }
                int i3 = i - this.activeStartRow;
                TLRPC.Chat chat = CallLogActivity.this.getMessagesController().getChat((Long) CallLogActivity.this.activeGroupCalls.get(i3));
                GroupCallCell groupCallCell = (GroupCallCell) viewHolder.itemView;
                groupCallCell.setChat(chat);
                groupCallCell.button.setTag(Long.valueOf(chat.id));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    if (!ChatObject.isPublic(chat)) {
                        lowerCase = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                    } else {
                        lowerCase = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                    }
                } else if (chat.has_geo) {
                    lowerCase = LocaleController.getString(R.string.MegaLocation);
                } else if (!ChatObject.isPublic(chat)) {
                    lowerCase = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                } else {
                    lowerCase = LocaleController.getString(R.string.MegaPublic).toLowerCase();
                }
                String str = lowerCase;
                groupCallCell.profileSearchCell.useSeparator = (i3 == CallLogActivity.this.activeGroupCalls.size() - 1 || CallLogActivity.this.endReached) ? false : true;
                groupCallCell.profileSearchCell.setData(chat, null, null, str, false, false);
                return;
            }
            int i4 = i - this.callsStartRow;
            CallLogRow callLogRow = (CallLogRow) CallLogActivity.this.calls.get(i4);
            CallCell callCell = (CallCell) viewHolder.itemView;
            callCell.imageView.setImageResource(callLogRow.video ? R.drawable.profile_video : R.drawable.profile_phone);
            TLRPC.Message message = (TLRPC.Message) callLogRow.calls.get(0);
            String str2 = LocaleController.isRTL ? "\u202b" : "";
            if (callLogRow.calls.size() == 1) {
                spannableString = new SpannableString(str2 + "  " + LocaleController.formatDateCallLog(message.date));
            } else {
                spannableString = new SpannableString(String.format(str2 + "  (%d) %s", Integer.valueOf(callLogRow.calls.size()), LocaleController.formatDateCallLog(message.date)));
            }
            int i5 = callLogRow.type;
            if (i5 == 0) {
                spannableString.setSpan(CallLogActivity.this.iconOut, str2.length(), str2.length() + 1, 0);
            } else if (i5 == 1) {
                spannableString.setSpan(CallLogActivity.this.iconIn, str2.length(), str2.length() + 1, 0);
            } else if (i5 == 2) {
                spannableString.setSpan(CallLogActivity.this.iconMissed, str2.length(), str2.length() + 1, 0);
            }
            if (callLogRow.call_id == 0) {
                callCell.profileSearchCell.setAllowEmojiStatus(true);
                callCell.profileSearchCell.setData(callLogRow.users.isEmpty() ? null : callLogRow.users.get(0), null, null, spannableString, false, false);
                callCell.avatarsImageView.setVisibility(8);
                callCell.profileSearchCell.dontDrawAvatar = false;
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i6 = 0; i6 < Math.min(3, callLogRow.users.size()); i6++) {
                    if (i6 > 0) {
                        sb.append(", ");
                    }
                    sb.append(DialogObject.getShortName((TLObject) callLogRow.users.get(i6)));
                }
                if (callLogRow.users.size() > 3) {
                    sb.append(" ");
                    sb.append(LocaleController.formatPluralString("AndOther", callLogRow.users.size() - 3, new Object[0]));
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(callLogRow.users);
                arrayList.add(CallLogActivity.this.getUserConfig().getCurrentUser());
                callCell.profileSearchCell.setAllowEmojiStatus(false);
                callCell.profileSearchCell.setData(callLogRow.users.isEmpty() ? null : callLogRow.users.get(0), null, sb.toString(), spannableString, false, false);
                callCell.avatarsImageView.setVisibility(0);
                callCell.profileSearchCell.avatarImage.clearImage();
                callCell.profileSearchCell.dontDrawAvatar = true;
                int min = Math.min(3, arrayList.size());
                for (int i7 = 0; i7 < min; i7++) {
                    callCell.avatarsImageView.setObject(i7, ((BaseFragment) CallLogActivity.this).currentAccount, (TLObject) arrayList.get(i7));
                }
                callCell.avatarsImageView.commitTransition(false);
            }
            ProfileSearchCell profileSearchCell = callCell.profileSearchCell;
            if (i4 == CallLogActivity.this.calls.size() - 1 && CallLogActivity.this.endReached) {
                r7 = false;
            }
            profileSearchCell.useSeparator = r7;
            callCell.imageView.setTag(callLogRow);
        }

        @Override
        public int getItemViewType(int i) {
            if (i == this.activeHeaderRow || i == this.callsHeaderRow) {
                return 3;
            }
            if (i >= this.callsStartRow && i < this.callsEndRow) {
                return 0;
            }
            if (i >= this.activeStartRow && i < this.activeEndRow) {
                return 4;
            }
            if (i == this.loadingCallsRow) {
                return 1;
            }
            if (i == this.sectionRow || i == this.createCallInfoRow) {
                return 5;
            }
            return i == this.createCallRow ? 6 : 2;
        }
    }

    public static class CallLogRow {
        public long call_id;
        public final ArrayList calls;
        public int type;
        public final ArrayList users;
        public boolean video;

        private CallLogRow() {
            this.users = new ArrayList();
            this.calls = new ArrayList();
        }
    }

    @Override
    public void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        if (z) {
            this.openTransitionStarted = true;
        }
    }

    private void showItemsAnimated(final int i) {
        if (this.isPaused || !this.openTransitionStarted) {
            return;
        }
        final View view = null;
        for (int i2 = 0; i2 < this.listView.getChildCount(); i2++) {
            View childAt = this.listView.getChildAt(i2);
            if (childAt instanceof FlickerLoadingView) {
                view = childAt;
            }
        }
        if (view != null) {
            this.listView.removeView(view);
        }
        this.listView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            @Override
            public boolean onPreDraw() {
                CallLogActivity.this.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = CallLogActivity.this.listView.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt2 = CallLogActivity.this.listView.getChildAt(i3);
                    RecyclerView.ViewHolder childViewHolder = CallLogActivity.this.listView.getChildViewHolder(childAt2);
                    if (childAt2 != view && CallLogActivity.this.listView.getChildAdapterPosition(childAt2) >= i && !(childAt2 instanceof GroupCallCell) && (!(childAt2 instanceof HeaderCell) || childViewHolder.getAdapterPosition() != CallLogActivity.this.listViewAdapter.activeHeaderRow)) {
                        childAt2.setAlpha(0.0f);
                        int min = (int) ((Math.min(CallLogActivity.this.listView.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / CallLogActivity.this.listView.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                View view2 = view;
                if (view2 != null && view2.getParent() == null) {
                    CallLogActivity.this.listView.addView(view);
                    final RecyclerView.LayoutManager layoutManager = CallLogActivity.this.listView.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.ignoreView(view);
                        View view3 = view;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.ALPHA, view3.getAlpha(), 0.0f);
                        ofFloat2.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                view.setAlpha(1.0f);
                                layoutManager.stopIgnoringView(view);
                                CallLogActivity.this.listView.removeView(view);
                            }
                        });
                        ofFloat2.start();
                    }
                }
                animatorSet.start();
                return true;
            }
        });
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                CallLogActivity.this.lambda$getThemeDescriptions$16();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{LocationCell.class, CallCell.class, HeaderCell.class, GroupCallCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        ActionBar actionBar = this.actionBar;
        int i2 = ThemeDescription.FLAG_BACKGROUND;
        int i3 = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, i2, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{EmptyTextProgressView.class}, new String[]{"emptyTextView1"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{EmptyTextProgressView.class}, new String[]{"emptyTextView2"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_emptyListPlaceholder));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LoadingCell.class}, new String[]{"progressBar"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_progressCircle));
        int i4 = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.floatingButton, ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, Theme.key_chats_actionIcon));
        arrayList.add(new ThemeDescription(this.floatingButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_chats_actionBackground));
        arrayList.add(new ThemeDescription(this.floatingButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, Theme.key_chats_actionPressedBackground));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CallCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_featuredStickers_addButton));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CallCell.class}, null, new Drawable[]{Theme.dialogs_verifiedCheckDrawable}, null, Theme.key_chats_verifiedCheck));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CallCell.class}, null, new Drawable[]{Theme.dialogs_verifiedDrawable}, null, Theme.key_chats_verifiedBackground));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CallCell.class}, Theme.dialogs_offlinePaint, null, null, Theme.key_windowBackgroundWhiteGrayText3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CallCell.class}, Theme.dialogs_onlinePaint, null, null, Theme.key_windowBackgroundWhiteBlueText3));
        TextPaint[] textPaintArr = Theme.dialogs_namePaint;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CallCell.class}, (String[]) null, new Paint[]{textPaintArr[0], textPaintArr[1], Theme.dialogs_searchNamePaint}, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chats_name));
        TextPaint[] textPaintArr2 = Theme.dialogs_nameEncryptedPaint;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CallCell.class}, (String[]) null, new Paint[]{textPaintArr2[0], textPaintArr2[1], Theme.dialogs_searchNameEncryptedPaint}, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chats_secretName));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CallCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, null, new Drawable[]{this.greenDrawable, this.greenDrawable2, Theme.calllog_msgCallUpRedDrawable, Theme.calllog_msgCallDownRedDrawable}, null, Theme.key_calls_callReceivedGreenIcon));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, null, new Drawable[]{this.redDrawable, Theme.calllog_msgCallUpGreenDrawable, Theme.calllog_msgCallDownGreenDrawable}, null, Theme.key_fill_RedNormal));
        arrayList.add(new ThemeDescription(this.flickerLoadingView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueHeader));
        return arrayList;
    }

    public void lambda$getThemeDescriptions$16() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt instanceof CallCell) {
                    ((CallCell) childAt).profileSearchCell.update(0);
                }
            }
        }
    }

    public static void showCallLinkSheet(final Context context, final int i, final TLRPC.InputGroupCall inputGroupCall, final String str, final Theme.ResourcesProvider resourcesProvider, boolean z, final boolean z2) {
        BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider, Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        final String[] strArr = {str};
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, LayoutHelper.createFrame(-1, -1, 17));
        frameLayout2.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)));
        frameLayout.addView(frameLayout2, LayoutHelper.createFrame(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        final ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        int i2 = R.drawable.ic_ab_other;
        imageView2.setImageResource(i2);
        int color = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(color, mode));
        int i3 = Theme.key_listSelector;
        imageView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(i3, resourcesProvider)));
        if (z2) {
            frameLayout.addView(imageView2, LayoutHelper.createFrame(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        LinkSpanDrawable.LinksTextView makeLinkTextView = TextHelper.makeLinkTextView(context, 20.0f, i4, true, resourcesProvider);
        makeLinkTextView.setText(LocaleController.getString(R.string.GroupCallCreatedLinkTitle));
        makeLinkTextView.setGravity(17);
        linearLayout.addView(makeLinkTextView, LayoutHelper.createLinear(-1, -2, 17, 32, 16, 32, 8));
        LinkSpanDrawable.LinksTextView makeLinkTextView2 = TextHelper.makeLinkTextView(context, 14.0f, i4, false, resourcesProvider);
        makeLinkTextView2.setText(LocaleController.getString(R.string.GroupCallCreatedLinkText));
        makeLinkTextView2.setGravity(17);
        makeLinkTextView2.setMaxWidth(HintView2.cutInFancyHalf(makeLinkTextView2.getText(), makeLinkTextView2.getPaint()));
        linearLayout.addView(makeLinkTextView2, LayoutHelper.createLinear(-1, -2, 17, 32, 0, 32, 18));
        String substring = str.startsWith("https://") ? str.substring(8) : str;
        final FrameLayout frameLayout3 = new FrameLayout(context);
        ScaleStateListAnimator.apply(frameLayout3, 0.01f, 1.2f);
        int i5 = Theme.key_windowBackgroundGray;
        frameLayout3.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(i5, resourcesProvider), Theme.blendOver(Theme.getColor(i5, resourcesProvider), Theme.getColor(i3, resourcesProvider)), 12, 12));
        linearLayout.addView(frameLayout3, LayoutHelper.createLinear(-1, -2, 7, 16, 0, 16, 0));
        final LinkSpanDrawable.LinksTextView makeLinkTextView3 = TextHelper.makeLinkTextView(context, 13.0f, i4, false, resourcesProvider);
        makeLinkTextView3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
        makeLinkTextView3.setText(substring);
        frameLayout3.addView(makeLinkTextView3, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(ContextCompat.getDrawable(context, i2));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogTextGray3, resourcesProvider), mode));
        frameLayout3.addView(imageView3, LayoutHelper.createFrame(40, 48, 21));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 16.0f, 12.0f, 16.0f, 0.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkCopy));
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_copy_filled), 0, 1, 33);
        buttonWithCounterView.setText(spannableStringBuilder, false);
        linearLayout2.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, resourcesProvider);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkShare));
        spannableStringBuilder2.setSpan(new ColoredImageSpan(R.drawable.msg_share_filled), 0, 1, 33);
        buttonWithCounterView2.setText(spannableStringBuilder2, false);
        linearLayout2.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        final BottomSheet[] bottomSheetArr = new BottomSheet[1];
        if (z) {
            TextView textView = new TextView(context) {
                private final Paint paint = new Paint(1);

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    this.paint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider), 0.8f));
                    this.paint.setStyle(Paint.Style.STROKE);
                    this.paint.setStrokeWidth(1.0f);
                    float height = getHeight() / 2.0f;
                    Layout layout = getLayout();
                    int i6 = 0;
                    for (int i7 = 0; i7 < layout.getLineCount(); i7++) {
                        i6 = Math.max(i6, (int) layout.getLineWidth(i7));
                    }
                    float f = i6 / 2.0f;
                    canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f) - AndroidUtilities.dp(8.0f), height, this.paint);
                    canvas.drawLine((getWidth() / 2.0f) + f + AndroidUtilities.dp(8.0f), height, getWidth(), height, this.paint);
                    super.dispatchDraw(canvas);
                }
            };
            textView.setGravity(17);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            textView.setText(" " + LocaleController.getString(R.string.GroupCallCreatedLinkJoinOr) + " ");
            textView.setTextSize(14.0f);
            linearLayout.addView(textView, LayoutHelper.createLinear(190, -2, 1, 28, 12, 28, 8));
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    CallLogActivity.lambda$showCallLinkSheet$17(str, i, bottomSheetArr);
                }
            };
            LinkSpanDrawable.LinksTextView makeLinkTextView4 = TextHelper.makeLinkTextView(context, 14.0f, i4, false, resourcesProvider);
            makeLinkTextView4.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GroupCallCreatedLinkJoinText), runnable), true));
            makeLinkTextView4.setGravity(17);
            makeLinkTextView4.setMaxWidth(HintView2.cutInFancyHalf(makeLinkTextView4.getText(), makeLinkTextView4.getPaint()));
            linearLayout.addView(makeLinkTextView4, LayoutHelper.createLinear(-1, -2, 17, 32, 8, 32, 12));
            ScaleStateListAnimator.apply(makeLinkTextView4, 0.05f, 1.2f);
            makeLinkTextView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    runnable.run();
                }
            });
        }
        builder.setCustomView(linearLayout);
        final BottomSheet show = builder.show();
        bottomSheetArr[0] = show;
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CallLogActivity.lambda$showCallLinkSheet$19(strArr, show, resourcesProvider, view);
            }
        });
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CallLogActivity.lambda$showCallLinkSheet$20(strArr, show, resourcesProvider, view);
            }
        });
        final Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                CallLogActivity.lambda$showCallLinkSheet$25(TLRPC.InputGroupCall.this, i, strArr, frameLayout3, makeLinkTextView3, show, resourcesProvider);
            }
        };
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CallLogActivity.lambda$showCallLinkSheet$28(BottomSheet.this, resourcesProvider, frameLayout3, strArr, context, z2, runnable2, view);
            }
        });
        buttonWithCounterView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CallLogActivity.lambda$showCallLinkSheet$29(context, str, strArr, resourcesProvider, show, view);
            }
        });
        if (z2) {
            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    CallLogActivity.lambda$showCallLinkSheet$30(BottomSheet.this, resourcesProvider, imageView2, runnable2, view);
                }
            });
        }
    }

    public static void lambda$showCallLinkSheet$17(String str, int i, BottomSheet[] bottomSheetArr) {
        TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
        tL_inputGroupCallSlug.slug = Uri.parse(str).getPathSegments().get(r3.getPathSegments().size() - 1);
        VoIPHelper.joinConference(LaunchActivity.instance, i, tL_inputGroupCallSlug, false, null);
        bottomSheetArr[0].lambda$new$0();
    }

    public static void lambda$showCallLinkSheet$19(String[] strArr, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider, View view) {
        AndroidUtilities.addToClipboard(strArr[0]);
        BulletinFactory.of(bottomSheet.topBulletinContainer, resourcesProvider).createCopyBulletin(LocaleController.getString(R.string.LinkCopied)).show();
    }

    public static void lambda$showCallLinkSheet$20(String[] strArr, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider, View view) {
        AndroidUtilities.addToClipboard(strArr[0]);
        BulletinFactory.of(bottomSheet.topBulletinContainer, resourcesProvider).createCopyBulletin(LocaleController.getString(R.string.LinkCopied)).show();
    }

    public static void lambda$showCallLinkSheet$25(final TLRPC.InputGroupCall inputGroupCall, final int i, final String[] strArr, final FrameLayout frameLayout, final LinkSpanDrawable.LinksTextView linksTextView, final BottomSheet bottomSheet, final Theme.ResourcesProvider resourcesProvider) {
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = inputGroupCall;
        togglegroupcallsettings.reset_invite_hash = true;
        ConnectionsManager.getInstance(i).sendRequest(togglegroupcallsettings, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                CallLogActivity.lambda$showCallLinkSheet$24(i, inputGroupCall, strArr, frameLayout, linksTextView, bottomSheet, resourcesProvider, tLObject, tL_error);
            }
        });
    }

    public static void lambda$showCallLinkSheet$24(int i, TLRPC.InputGroupCall inputGroupCall, final String[] strArr, final FrameLayout frameLayout, final LinkSpanDrawable.LinksTextView linksTextView, final BottomSheet bottomSheet, final Theme.ResourcesProvider resourcesProvider, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(i).processUpdates((TLRPC.Updates) tLObject, false);
        }
        TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
        exportgroupcallinvite.call = inputGroupCall;
        ConnectionsManager.getInstance(i).sendRequest(exportgroupcallinvite, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                CallLogActivity.lambda$showCallLinkSheet$23(strArr, frameLayout, linksTextView, bottomSheet, resourcesProvider, tLObject2, tL_error2);
            }
        });
    }

    public static void lambda$showCallLinkSheet$23(final String[] strArr, final FrameLayout frameLayout, final LinkSpanDrawable.LinksTextView linksTextView, final BottomSheet bottomSheet, final Theme.ResourcesProvider resourcesProvider, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CallLogActivity.lambda$showCallLinkSheet$22(TLObject.this, strArr, frameLayout, linksTextView, bottomSheet, resourcesProvider);
            }
        });
    }

    public static void lambda$showCallLinkSheet$22(TLObject tLObject, String[] strArr, final FrameLayout frameLayout, final LinkSpanDrawable.LinksTextView linksTextView, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider) {
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            final String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
            strArr[0] = str;
            if (str.startsWith("https://")) {
                str = str.substring(8);
            }
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(220L);
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CallLogActivity.lambda$showCallLinkSheet$21(frameLayout, atomicBoolean, linksTextView, str, valueAnimator);
                }
            });
            duration.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    atomicBoolean.set(true);
                    linksTextView.setText(str);
                }
            });
            duration.start();
            BulletinFactory.of(bottomSheet.topBulletinContainer, resourcesProvider).createSimpleBulletin(R.raw.linkbroken, LocaleController.getString(R.string.GroupCallCreatedLinkRevokedTitle), LocaleController.getString(R.string.GroupCallCreatedLinkRevokedText)).show();
        }
    }

    public static void lambda$showCallLinkSheet$21(FrameLayout frameLayout, AtomicBoolean atomicBoolean, LinkSpanDrawable.LinksTextView linksTextView, String str, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float abs = (Math.abs(floatValue - 0.5f) / 5.0f) + 0.9f;
        frameLayout.setScaleX(abs);
        frameLayout.setScaleY(abs);
        if (floatValue < 0.5f || atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        linksTextView.setText(str);
    }

    public static void lambda$showCallLinkSheet$28(final BottomSheet bottomSheet, final Theme.ResourcesProvider resourcesProvider, FrameLayout frameLayout, final String[] strArr, final Context context, boolean z, Runnable runnable, View view) {
        ItemOptions.makeOptions(bottomSheet.container, resourcesProvider, frameLayout).add(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                CallLogActivity.lambda$showCallLinkSheet$26(strArr, bottomSheet, resourcesProvider);
            }
        }).add(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new Runnable() {
            @Override
            public final void run() {
                CallLogActivity.lambda$showCallLinkSheet$27(context, strArr);
            }
        }).addIf(z, R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.RevokeLink), true, runnable).show();
    }

    public static void lambda$showCallLinkSheet$26(String[] strArr, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider) {
        AndroidUtilities.addToClipboard(strArr[0]);
        BulletinFactory.of(bottomSheet.topBulletinContainer, resourcesProvider).createCopyBulletin(LocaleController.getString(R.string.LinkCopied)).show();
    }

    public static void lambda$showCallLinkSheet$27(Context context, String[] strArr) {
        QRCodeBottomSheet qRCodeBottomSheet = new QRCodeBottomSheet(context, LocaleController.getString(R.string.InviteByQRCode), strArr[0], LocaleController.getString(R.string.QRCodeLinkGroupCall), false);
        qRCodeBottomSheet.setCenterAnimation(R.raw.qr_code_logo);
        qRCodeBottomSheet.show();
    }

    public static void lambda$showCallLinkSheet$29(Context context, String str, String[] strArr, Theme.ResourcesProvider resourcesProvider, final BottomSheet bottomSheet, View view) {
        ArrayList arrayList = null;
        new ShareAlert(context, arrayList, str, false, strArr[0], false, resourcesProvider) {
            @Override
            public void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
                String formatString;
                if (z) {
                    if (longSparseArray != null && longSparseArray.size() == 1) {
                        long j = ((TLRPC.Dialog) longSparseArray.valueAt(0)).id;
                        if (j == 0 || j == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                            formatString = LocaleController.getString(R.string.InvLinkToSavedMessages);
                        } else {
                            formatString = LocaleController.formatString(R.string.InvLinkToUser, MessagesController.getInstance(this.currentAccount).getPeerName(j, true));
                        }
                    } else {
                        formatString = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", longSparseArray == null ? 1 : longSparseArray.size(), new Object[0]));
                    }
                    Bulletin createSimpleBulletin = BulletinFactory.of(bottomSheet.topBulletinContainer, this.resourcesProvider).createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(formatString));
                    createSimpleBulletin.hideAfterBottomSheet = false;
                    createSimpleBulletin.show();
                }
            }
        }.show();
    }

    public static void lambda$showCallLinkSheet$30(BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider, ImageView imageView, Runnable runnable, View view) {
        ItemOptions.makeOptions(bottomSheet.getContainer(), resourcesProvider, imageView).add(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), runnable).setOnTopOfScrim().translate(0.0f, -AndroidUtilities.dp(6.0f)).setDimAlpha(0).show();
    }

    private void openCreateCall() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isCall", true);
        presentFragment(new AnonymousClass8(bundle));
    }

    public class AnonymousClass8 extends GroupCreateActivity {
        AnonymousClass8(Bundle bundle) {
            super(bundle);
        }

        @Override
        protected void onCallUsersSelected(final HashSet hashSet, final boolean z) {
            if (hashSet.size() == 1) {
                final TLRPC.User user = getMessagesController().getUser((Long) hashSet.iterator().next());
                TLRPC.UserFull userFull = getMessagesController().getUserFull(user.id);
                if (userFull != null) {
                    VoIPHelper.startCall(CallLogActivity.this.lastCallUser = user, z, userFull.video_calls_available, getParentActivity(), userFull, getAccountInstance());
                } else {
                    TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                    tL_users_getFullUser.id = getMessagesController().getInputUser(user.id);
                    getConnectionsManager().sendRequest(tL_users_getFullUser, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            CallLogActivity.AnonymousClass8.this.lambda$onCallUsersSelected$1(user, z, tLObject, tL_error);
                        }
                    });
                    return;
                }
            } else {
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        CallLogActivity.AnonymousClass8.this.lambda$onCallUsersSelected$3(z, hashSet, tLObject, tL_error);
                    }
                });
            }
            lambda$onBackPressed$341();
        }

        public void lambda$onCallUsersSelected$1(final TLRPC.User user, final boolean z, final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    CallLogActivity.AnonymousClass8.this.lambda$onCallUsersSelected$0(tLObject, user, z);
                }
            });
        }

        public void lambda$onCallUsersSelected$0(TLObject tLObject, TLRPC.User user, boolean z) {
            TLRPC.UserFull userFull;
            if (tLObject instanceof TLRPC.TL_users_userFull) {
                TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
                MessagesController.getInstance(CallLogActivity.this.currentAccount).putUsers(tL_users_userFull.users, false);
                MessagesController.getInstance(CallLogActivity.this.currentAccount).putChats(tL_users_userFull.chats, false);
                userFull = tL_users_userFull.full_user;
            } else {
                userFull = null;
            }
            TLRPC.UserFull userFull2 = userFull;
            VoIPHelper.startCall(CallLogActivity.this.lastCallUser = user, z, userFull2 != null && userFull2.video_calls_available, getParentActivity(), userFull2, getAccountInstance());
        }

        public void lambda$onCallUsersSelected$3(final boolean z, final HashSet hashSet, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    CallLogActivity.AnonymousClass8.this.lambda$onCallUsersSelected$2(tLObject, z, hashSet, tL_error);
                }
            });
        }

        public void lambda$onCallUsersSelected$2(TLObject tLObject, boolean z, HashSet hashSet, TLRPC.TL_error tL_error) {
            if (tLObject instanceof TLRPC.Updates) {
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                MessagesController.getInstance(this.currentAccount).putUsers(updates.users, false);
                MessagesController.getInstance(this.currentAccount).putChats(updates.chats, false);
                Iterator it = MessagesController.findUpdatesAndRemove(updates, TLRPC.TL_updateGroupCall.class).iterator();
                TLRPC.GroupCall groupCall = null;
                while (it.hasNext()) {
                    groupCall = ((TLRPC.TL_updateGroupCall) it.next()).call;
                }
                if (LaunchActivity.instance == null || groupCall == null) {
                    return;
                }
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.id = groupCall.id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                VoIPHelper.joinConference(LaunchActivity.instance, this.currentAccount, tL_inputGroupCall, z, groupCall, hashSet);
                return;
            }
            if (!(tLObject instanceof TL_phone.groupCall)) {
                if (tL_error != null) {
                    BulletinFactory.of(CallLogActivity.this).showForError(tL_error);
                    return;
                }
                return;
            }
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(groupcall.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(groupcall.chats, false);
            if (LaunchActivity.instance == null) {
                return;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall2 = groupcall.call;
            tL_inputGroupCall2.id = groupCall2.id;
            tL_inputGroupCall2.access_hash = groupCall2.access_hash;
            VoIPHelper.joinConference(LaunchActivity.instance, this.currentAccount, tL_inputGroupCall2, z, groupCall2, hashSet);
        }
    }

    public static void createCallLink(final Context context, final int i, final Theme.ResourcesProvider resourcesProvider, final Runnable runnable) {
        final AlertDialog alertDialog = new AlertDialog(context, 3);
        alertDialog.showDelayed(500L);
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.random.nextInt();
        ConnectionsManager.getInstance(i).sendRequest(createconferencecall, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                CallLogActivity.lambda$createCallLink$34(i, alertDialog, context, resourcesProvider, runnable, tLObject, tL_error);
            }
        });
    }

    public static void lambda$createCallLink$34(final int i, final AlertDialog alertDialog, final Context context, final Theme.ResourcesProvider resourcesProvider, final Runnable runnable, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CallLogActivity.lambda$createCallLink$33(TLObject.this, i, alertDialog, context, resourcesProvider, runnable);
            }
        });
    }

    public static void lambda$createCallLink$33(TLObject tLObject, final int i, final AlertDialog alertDialog, final Context context, final Theme.ResourcesProvider resourcesProvider, final Runnable runnable) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(i).putUsers(updates.users, false);
            MessagesController.getInstance(i).putChats(updates.chats, false);
            Iterator it = MessagesController.findUpdatesAndRemove(updates, TLRPC.TL_updateGroupCall.class).iterator();
            TLRPC.GroupCall groupCall = null;
            while (it.hasNext()) {
                groupCall = ((TLRPC.TL_updateGroupCall) it.next()).call;
            }
            alertDialog.dismiss();
            if (groupCall != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.id = groupCall.id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                showCallLinkSheet(context, i, tL_inputGroupCall, groupCall.invite_link, resourcesProvider, true, true);
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
            return;
        }
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(i).putUsers(groupcall.users, false);
            MessagesController.getInstance(i).putChats(groupcall.chats, false);
            final TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall2;
            TLRPC.GroupCall groupCall2 = groupcall.call;
            tL_inputGroupCall2.id = groupCall2.id;
            tL_inputGroupCall2.access_hash = groupCall2.access_hash;
            ConnectionsManager.getInstance(i).sendRequest(exportgroupcallinvite, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    CallLogActivity.lambda$createCallLink$32(AlertDialog.this, context, i, exportgroupcallinvite, resourcesProvider, runnable, tLObject2, tL_error);
                }
            });
            return;
        }
        alertDialog.dismiss();
        AndroidUtilities.runOnUIThread(runnable);
    }

    public static void lambda$createCallLink$32(final AlertDialog alertDialog, final Context context, final int i, final TL_phone.exportGroupCallInvite exportgroupcallinvite, final Theme.ResourcesProvider resourcesProvider, final Runnable runnable, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CallLogActivity.lambda$createCallLink$31(TLObject.this, alertDialog, context, i, exportgroupcallinvite, resourcesProvider, runnable);
            }
        });
    }

    public static void lambda$createCallLink$31(TLObject tLObject, AlertDialog alertDialog, Context context, int i, TL_phone.exportGroupCallInvite exportgroupcallinvite, Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            alertDialog.dismiss();
            showCallLinkSheet(context, i, exportgroupcallinvite.call, ((TL_phone.exportedGroupCallInvite) tLObject).link, resourcesProvider, true, true);
        } else {
            alertDialog.dismiss();
        }
        AndroidUtilities.runOnUIThread(runnable);
    }
}
