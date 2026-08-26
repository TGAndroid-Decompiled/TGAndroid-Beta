package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzin;
import com.google.android.gms.internal.mlkit_vision_common.zzki;
import j$.util.Objects;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AvatarsImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.DialogsActivityTopPanelLayout;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.ProgressButton;
import org.telegram.ui.Components.QRCodeBottomSheet;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;

public class CallLogActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, MainTabsActivity.TabFragmentDelegate {
    private static final int TYPE_IN = 1;
    private static final int TYPE_MISSED_IN = 2;
    private static final int TYPE_MISSED_OUT = 3;
    private static final int TYPE_OUT = 0;
    private static final int delete = 2;
    private final int ADDITIONAL_LIST_HEIGHT_DP;
    private final int ID_CREATE_CALL;
    private final int ID_SHOW_IN_MAIN_TABS;
    private ImageView actionModeCloseView;
    private final ArrayList<View> actionModeViews;
    private ArrayList<Long> activeGroupCalls;
    private int additionFloatingButtonOffset;
    private int additionNavigationBarHeight;
    private float additionalFloatingTranslation;
    private final ArrayList<CallLogRow> calls;
    private SizeNotifierFrameLayout contentView;
    private EmptyTextProgressView emptyView;
    private boolean endReached;
    private boolean firstLoaded;
    private FlickerLoadingView flickerLoadingView;
    private FragmentFloatingButton floatingButton;
    private FragmentContextView fragmentContextView;
    private FrameLayout fragmentContextViewWrapper;
    private ImageSpan getIconMissedOut;
    private Drawable greenDrawable;
    private Drawable greenDrawable2;
    private boolean hasMainTabs;
    private HeaderShadowView headerShadowView;
    private HintView2 hideCallTabsHintView;
    private boolean hideCallTabsHintWasShown;
    private IBlur3Capture iBlur3Capture;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryLiquidGlass;
    private boolean iBlur3Invalidated;
    private final RectF iBlur3PositionActionBar;
    private final RectF iBlur3PositionMainTabs;
    private final ArrayList<RectF> iBlur3Positions;
    private final BlurredBackgroundSourceColor iBlur3SourceColor;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlass;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    private ImageSpan iconIn;
    private ImageSpan iconMissedIn;
    private ImageSpan iconOut;
    private TLRPC.Chat lastCallChat;
    private TLRPC.User lastCallUser;
    private LinearLayoutManager layoutManager;
    private UniversalRecyclerView listView;
    private boolean loading;
    private int navigationBarHeight;
    private boolean needFinishFragment;
    private boolean openTransitionStarted;
    private ActionBarMenuItem otherItem;
    private Drawable redDrawable;
    private Drawable redDrawable2;
    private RecyclerAnimationScrollHelper scrollHelper;
    private final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    private NumberTextView selectedDialogsCountTextView;
    private final ArrayList<Integer> selectedIds;
    private final Rect tmpClipRect;
    private DialogsActivityTopPanelLayout topPanelLayout;
    private Long waitingForCallChatId;

    public class AnonymousClass3 extends RecyclerView.OnScrollListener {
        private boolean scrollUpdated;

        public AnonymousClass3() {
        }

        public void lambda$onScrolled$0(CallLogRow callLogRow) {
            CallLogActivity.this.getCalls(((TLRPC.Message) zzin.m(1, callLogRow.calls)).id, 100);
        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int iFindFirstVisibleItemPosition = CallLogActivity.this.layoutManager.findFirstVisibleItemPosition();
            int iAbs = iFindFirstVisibleItemPosition == -1 ? 0 : Math.abs(CallLogActivity.this.layoutManager.findLastVisibleItemPosition() - iFindFirstVisibleItemPosition) + 1;
            if (iAbs > 0) {
                int itemCount = CallLogActivity.this.listView.adapter.getItemCount();
                if (!CallLogActivity.this.endReached && !CallLogActivity.this.loading && !CallLogActivity.this.calls.isEmpty() && iAbs + iFindFirstVisibleItemPosition >= itemCount - 5) {
                    AndroidUtilities.runOnUIThread(new PhotoViewer$44$$ExternalSyntheticLambda0(2, this, (CallLogRow) CallLogActivity.this.calls.get(CallLogActivity.this.calls.size() - 1)));
                }
            }
            View childAt = recyclerView.getChildAt(0);
            int top = childAt != null ? childAt.getTop() : 0;
            if (i2 != 0 && this.scrollUpdated) {
                CallLogActivity.this.floatingButton.setButtonVisible(i2 < 0, true);
            }
            this.scrollUpdated = true;
            CallLogActivity.this.headerShadowView.setShadowVisible(iFindFirstVisibleItemPosition != 0 || top < CallLogActivity.this.listView.getPaddingTop(), true);
            if (Build.VERSION.SDK_INT < 31 || CallLogActivity.this.scrollableViewNoiseSuppressor == null) {
                return;
            }
            CallLogActivity.this.scrollableViewNoiseSuppressor.onScrolled(i, i2);
            CallLogActivity.this.blur3_InvalidateBlur();
        }
    }

    public class AnonymousClass9 extends GroupCreateActivity {
        final int val$account;
        final BaseFragment val$parent;

        public AnonymousClass9(Bundle bundle, int i, BaseFragment baseFragment) {
            super(bundle);
            this.val$account = i;
            this.val$parent = baseFragment;
        }

        public void lambda$onCallUsersSelected$0(TLObject tLObject, int i, TLRPC.User user, boolean z) {
            TLRPC.UserFull userFull;
            if (tLObject instanceof TLRPC.TL_users_userFull) {
                TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
                MessagesController.getInstance(i).putUsers(tL_users_userFull.users, false);
                MessagesController.getInstance(i).putChats(tL_users_userFull.chats, false);
                userFull = tL_users_userFull.full_user;
            } else {
                userFull = null;
            }
            TLRPC.UserFull userFull2 = userFull;
            VoIPHelper.startCall(user, z, userFull2 != null && userFull2.video_calls_available, getParentActivity(), userFull2, AccountInstance.getInstance(i));
        }

        public void lambda$onCallUsersSelected$1(int i, TLRPC.User user, boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda4(this, tLObject, i, user, z));
        }

        public static void lambda$onCallUsersSelected$2(TLObject tLObject, int i, boolean z, HashSet hashSet, TLRPC.TL_error tL_error, BaseFragment baseFragment) {
            int i2 = 0;
            if (!(tLObject instanceof TLRPC.Updates)) {
                if (!(tLObject instanceof TL_phone.groupCall)) {
                    if (tL_error != null) {
                        BulletinFactory.of(baseFragment).showForError(tL_error);
                        return;
                    }
                    return;
                }
                TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                MessagesController.getInstance(i).putUsers(groupcall.users, false);
                MessagesController.getInstance(i).putChats(groupcall.chats, false);
                if (LaunchActivity.instance == null) {
                    return;
                }
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                TLRPC.GroupCall groupCall = groupcall.call;
                tL_inputGroupCall.id = groupCall.id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                VoIPHelper.joinConference(LaunchActivity.instance, i, tL_inputGroupCall, z, groupCall, hashSet);
                return;
            }
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(i).putUsers(updates.users, false);
            MessagesController.getInstance(i).putChats(updates.chats, false);
            ArrayList arrayListFindUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
            int size = arrayListFindUpdatesAndRemove.size();
            TLRPC.GroupCall groupCall2 = null;
            while (i2 < size) {
                Object obj = arrayListFindUpdatesAndRemove.get(i2);
                i2++;
                groupCall2 = ((TL_update.TL_updateGroupCall) obj).call;
            }
            if (LaunchActivity.instance == null || groupCall2 == null) {
                return;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
            tL_inputGroupCall2.id = groupCall2.id;
            tL_inputGroupCall2.access_hash = groupCall2.access_hash;
            VoIPHelper.joinConference(LaunchActivity.instance, i, tL_inputGroupCall2, z, groupCall2, hashSet);
        }

        public static void lambda$onCallUsersSelected$3(int i, boolean z, HashSet hashSet, BaseFragment baseFragment, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new CallLogActivity$9$$ExternalSyntheticLambda3(i, z, hashSet, baseFragment, tLObject, tL_error));
        }

        @Override
        public void onCallUsersSelected(HashSet<Long> hashSet, boolean z) {
            if (hashSet.size() == 1) {
                TLRPC.User user = MessagesController.getInstance(this.val$account).getUser(hashSet.iterator().next());
                TLRPC.UserFull userFull = MessagesController.getInstance(this.val$account).getUserFull(user.id);
                if (userFull == null) {
                    TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                    tL_users_getFullUser.id = MessagesController.getInstance(this.val$account).getInputUser(user.id);
                    ConnectionsManager.getInstance(this.val$account).sendRequest(tL_users_getFullUser, new CallLogActivity$9$$ExternalSyntheticLambda1(this, this.val$account, user, z));
                    return;
                }
                VoIPHelper.startCall(user, z, userFull.video_calls_available, getParentActivity(), userFull, AccountInstance.getInstance(this.val$account));
            } else {
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                ConnectionsManager.getInstance(this.val$account).sendRequest(createconferencecall, new CallLogActivity$9$$ExternalSyntheticLambda1(this.val$account, z, hashSet, this.val$parent));
            }
            finishFragment();
        }
    }

    public static class CallCell extends FrameLayout {
        private final AvatarsImageView avatarsImageView;
        private final CheckBox2 checkBox;
        private final int currentAccount;
        private final ImageView imageView;
        private final ProfileSearchCell profileSearchCell;

        public static final class Factory extends UItem.UItemFactory<CallCell> {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            public static UItem of(CallLogRow callLogRow, View.OnClickListener onClickListener) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.object = callLogRow;
                uItemOfFactory.clickCallback = onClickListener;
                return uItemOfFactory;
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                CallCell callCell = (CallCell) view;
                callCell.set((CallLogRow) uItem.object, uItem.clickCallback);
                callCell.setChecked(uItem.checked, false);
            }

            @Override
            public CallCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new CallCell(context, i);
            }
        }

        public CallCell(Context context, int i) {
            super(context);
            this.currentAccount = i;
            ProfileSearchCell profileSearchCell = new ProfileSearchCell(context, null);
            this.profileSearchCell = profileSearchCell;
            profileSearchCell.callCellStyle = true;
            profileSearchCell.customPaints = true;
            profileSearchCell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(32.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(32.0f), 0);
            int iDp = AndroidUtilities.dp(LocaleController.isRTL ? 2.0f : -2.0f);
            int i2 = -AndroidUtilities.dp(7.0f);
            profileSearchCell.sublabelOffsetX = iDp;
            profileSearchCell.sublabelOffsetY = i2;
            addView(profileSearchCell, LayoutHelper.createFrame(-1, -1.0f));
            AvatarsImageView avatarsImageView = new AvatarsImageView(context, false);
            this.avatarsImageView = avatarsImageView;
            avatarsImageView.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            avatarsImageView.setStepFactor(0.4f);
            avatarsImageView.setSize(AndroidUtilities.dp(29.0f));
            avatarsImageView.setCentered(true);
            avatarsImageView.setVisibility(8);
            addView(avatarsImageView, LayoutHelper.createFrame(72, -1.0f, LocaleController.isRTL ? 5 : 3, -2.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setColorFilter(Theme.getColor(null, Theme.key_telegram_color_text, false), PorterDuff.Mode.SRC_IN);
            imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 1, -1));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setContentDescription(LocaleController.getString(R.string.Call));
            addView(imageView, LayoutHelper.createFrame(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
            CheckBox2 checkBox2 = new CheckBox2(context, 21);
            this.checkBox = checkBox2;
            checkBox2.getCheckBoxBase().setBackgroundColor(Theme.getColor(null, Theme.key_telegram_color, false));
            checkBox2.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
            checkBox2.setDrawUnchecked(false);
            checkBox2.setDrawBackgroundAsArc(3);
            addView(checkBox2, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
        }

        private static ImageSpan iconIn(Context context) {
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
            drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText3, false), PorterDuff.Mode.MULTIPLY));
            return new ImageSpan(drawableMutate, 0);
        }

        private static ImageSpan iconMissedIn(Context context) {
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
            drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_fill_RedNormal, false), PorterDuff.Mode.MULTIPLY));
            return new ImageSpan(drawableMutate, 0);
        }

        private static ImageSpan iconMissedOut(Context context) {
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
            drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_fill_RedNormal, false), PorterDuff.Mode.MULTIPLY));
            return new ImageSpan(drawableMutate, 0);
        }

        private static ImageSpan iconOut(Context context) {
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
            drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText3, false), PorterDuff.Mode.MULTIPLY));
            return new ImageSpan(drawableMutate, 0);
        }

        public void set(CallLogRow callLogRow, View.OnClickListener onClickListener) {
            SpannableString spannableString;
            this.imageView.setImageResource(callLogRow.video ? R.drawable.menu_videocall : R.drawable.menu_call_create_2_24);
            TLRPC.Message message = callLogRow.calls.get(0);
            String str = LocaleController.isRTL ? "\u202b" : "";
            if (callLogRow.calls.size() == 1) {
                StringBuilder sbM = Log.m(str, "  ");
                sbM.append(LocaleController.formatDateCallLog(message.date));
                spannableString = new SpannableString(sbM.toString());
            } else {
                spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(callLogRow.calls.size()), LocaleController.formatDateCallLog(message.date)));
            }
            SpannableString spannableString2 = spannableString;
            int i = callLogRow.type;
            if (i == 0) {
                spannableString2.setSpan(iconOut(getContext()), str.length(), str.length() + 1, 33);
            } else if (i == 1) {
                spannableString2.setSpan(iconIn(getContext()), str.length(), str.length() + 1, 33);
            } else if (i == 2) {
                spannableString2.setSpan(iconMissedIn(getContext()), str.length(), str.length() + 1, 33);
            } else if (i == 3) {
                spannableString2.setSpan(iconMissedOut(getContext()), str.length(), str.length() + 1, 33);
            }
            if (callLogRow.call_id != 0) {
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < Math.min(3, callLogRow.users.size()); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(DialogObject.getShortName(callLogRow.users.get(i2)));
                }
                if (callLogRow.users.size() > 3) {
                    sb.append(" ");
                    sb.append(LocaleController.formatPluralString("AndOther", callLogRow.users.size() - 3, new Object[0]));
                }
                ArrayList arrayList = new ArrayList(callLogRow.users);
                arrayList.add(UserConfig.getInstance(this.currentAccount).getCurrentUser());
                this.profileSearchCell.setAllowEmojiStatus(false);
                this.profileSearchCell.setData(callLogRow.users.isEmpty() ? null : callLogRow.users.get(0), null, sb.toString(), spannableString2, false, false);
                this.avatarsImageView.setVisibility(0);
                this.profileSearchCell.avatarImage.clearImage();
                this.profileSearchCell.dontDrawAvatar = true;
                int iMin = Math.min(3, arrayList.size());
                for (int i3 = 0; i3 < iMin; i3++) {
                    this.avatarsImageView.setObject(i3, this.currentAccount, (TLObject) arrayList.get(i3));
                }
                this.avatarsImageView.commitTransition(false);
            } else {
                this.profileSearchCell.setAllowEmojiStatus(true);
                this.profileSearchCell.setData(callLogRow.users.isEmpty() ? null : callLogRow.users.get(0), null, null, spannableString2, false, false);
                this.avatarsImageView.setVisibility(8);
                this.profileSearchCell.dontDrawAvatar = false;
            }
            this.imageView.setTag(callLogRow);
            this.imageView.setOnClickListener(onClickListener);
        }

        public void setChecked(boolean z, boolean z2) {
            CheckBox2 checkBox2 = this.checkBox;
            if (checkBox2 == null) {
                return;
            }
            checkBox2.setChecked(z, z2);
        }
    }

    public static class CallLogRow {
        public long call_id;
        public final ArrayList<TLRPC.Message> calls;
        public int type;
        public final ArrayList<TLRPC.User> users;
        public boolean video;

        private CallLogRow() {
            this.users = new ArrayList<>();
            this.calls = new ArrayList<>();
        }
    }

    public class EmptyTextProgressView extends FrameLayout {
        private final TextView emptyTextView1;
        private final TextView emptyTextView2;
        private final RLottieImageView imageView;
        private final View progressView;

        public EmptyTextProgressView(CallLogActivity callLogActivity, Context context) {
            this(context, null);
        }

        public void lambda$new$0(View view) {
            if (this.imageView.isPlaying()) {
                return;
            }
            this.imageView.setProgress(0.0f);
            this.imageView.playAnimation();
        }

        public static boolean lambda$new$1(View view, MotionEvent motionEvent) {
            return true;
        }

        @Override
        public boolean hasOverlappingRendering() {
            return false;
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

        public EmptyTextProgressView(Context context, View view) {
            super(context);
            addView(view, LayoutHelper.createFrame(-1, -1.0f));
            this.progressView = view;
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.imageView = rLottieImageView;
            rLottieImageView.setAnimation(R.raw.utyan_call, 110, 110);
            rLottieImageView.setAutoRepeat(false);
            addView(rLottieImageView, LayoutHelper.createFrame(110, 110.0f, 17, 52.0f, 17.0f, 52.0f, 60.0f));
            rLottieImageView.setOnClickListener(new PollItemMenu$4$$ExternalSyntheticLambda0(this, 5));
            TextView textView = new TextView(context);
            this.emptyTextView1 = textView;
            textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            textView.setText(LocaleController.getString(R.string.MakeYourFirstCall));
            int i = 1;
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 17, 17.0f, 40.0f, 17.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.emptyTextView2 = textView2;
            String string = LocaleController.formatString(R.string.MakeYourFirstCallHint, Integer.valueOf(CallLogActivity.this.getMessagesController().conferenceCallSizeLimit));
            if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                string = string.replace('\n', ' ');
            }
            textView2.setText(string);
            textView2.setTextColor(Theme.getColor(null, Theme.key_emptyListPlaceholder, false));
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 17, 17.0f, 80.0f, 17.0f, 0.0f));
            view.setAlpha(0.0f);
            rLottieImageView.setAlpha(0.0f);
            textView.setAlpha(0.0f);
            textView2.setAlpha(0.0f);
            setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda59(i));
        }
    }

    public static class GroupCallCell extends FrameLayout {
        private final ProgressButton button;
        private TLRPC.Chat currentChat;
        private final ProfileSearchCell profileSearchCell;

        public static final class Factory extends UItem.UItemFactory<GroupCallCell> {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            public static UItem of(TLRPC.Chat chat, View.OnClickListener onClickListener) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.object = chat;
                uItemOfFactory.clickCallback = onClickListener;
                return uItemOfFactory;
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((GroupCallCell) view).setChat((TLRPC.Chat) uItem.object, uItem.clickCallback);
            }

            @Override
            public GroupCallCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new GroupCallCell(context);
            }
        }

        public GroupCallCell(Context context) {
            super(context);
            String string = LocaleController.getString(R.string.VoipChatJoin);
            ProgressButton progressButton = new ProgressButton(context);
            this.button = progressButton;
            int iCeil = (int) Math.ceil(progressButton.getPaint().measureText(string));
            ProfileSearchCell profileSearchCell = new ProfileSearchCell(context, null);
            this.profileSearchCell = profileSearchCell;
            profileSearchCell.callCellStyle = true;
            profileSearchCell.customPaints = true;
            profileSearchCell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(44.0f) + iCeil : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(44.0f) + iCeil, 0);
            int i = -AndroidUtilities.dp(4.0f);
            profileSearchCell.sublabelOffsetX = 0;
            profileSearchCell.sublabelOffsetY = i;
            addView(profileSearchCell, LayoutHelper.createFrame(-1, -1.0f));
            progressButton.setText(string);
            progressButton.setTextSize(1, 14.0f);
            progressButton.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
            progressButton.setProgressColor(Theme.getColor(null, Theme.key_featuredStickers_buttonProgress, false));
            progressButton.setBackgroundRoundRect(Theme.getColor(null, Theme.key_telegram_color, false), Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false), 16.0f);
            progressButton.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
            addView(progressButton, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
        }

        public void setChat(TLRPC.Chat chat, View.OnClickListener onClickListener) {
            String lowerCase;
            this.currentChat = chat;
            this.button.setTag(Long.valueOf(chat.id));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                lowerCase = !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase();
            } else if (chat.has_geo) {
                lowerCase = LocaleController.getString(R.string.MegaLocation);
            } else {
                lowerCase = !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase();
            }
            this.profileSearchCell.setData(chat, null, null, lowerCase, false, false);
            this.button.setOnClickListener(onClickListener);
        }
    }

    public CallLogActivity() {
        this(null);
    }

    private boolean addOrRemoveSelectedDialog(ArrayList<TLRPC.Message> arrayList, CallCell callCell) {
        if (arrayList.isEmpty()) {
            return false;
        }
        if (isSelected(arrayList)) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.selectedIds.remove(Integer.valueOf(arrayList.get(i).id));
            }
            callCell.setChecked(false, true);
            showOrUpdateActionMode();
            return false;
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Integer numValueOf = Integer.valueOf(arrayList.get(i2).id);
            if (!this.selectedIds.contains(numValueOf)) {
                this.selectedIds.add(numValueOf);
            }
        }
        callCell.setChecked(true, true);
        showOrUpdateActionMode();
        return true;
    }

    public void blur3_InvalidateBlur() {
        if (Build.VERSION.SDK_INT < 31 || this.scrollableViewNoiseSuppressor == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(48.0f) + ((int) this.topPanelLayout.getAnimatedHeightWithPadding(AndroidUtilities.dp(7.0f)));
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.navigationBarHeight) - AndroidUtilities.dp(8.0f);
        int iDp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.iBlur3PositionActionBar.set(0.0f, -iDp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + iDp);
        this.iBlur3PositionMainTabs.set(0.0f, iDp2, this.fragmentView.getMeasuredWidth(), measuredHeight);
        this.iBlur3PositionMainTabs.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        this.scrollableViewNoiseSuppressor.setupRenderNodes(this.hasMainTabs ? 2 : 1, this.iBlur3Positions);
        this.scrollableViewNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    public void checkUi_floatingButton() {
        this.floatingButton.setTranslationY(((-this.navigationBarHeight) - this.additionFloatingButtonOffset) - this.additionalFloatingTranslation);
    }

    public void checkUi_listClip() {
        if (this.listView.hasActiveEdgeEffects()) {
            this.listView.setClipBounds(null);
            return;
        }
        this.tmpClipRect.set(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.ADDITIONAL_LIST_HEIGHT_DP), this.listView.getMeasuredWidth(), this.listView.getMeasuredHeight() - AndroidUtilities.dp(this.ADDITIONAL_LIST_HEIGHT_DP));
        this.listView.setClipBounds(this.tmpClipRect);
    }

    public void checkUi_listViewPadding() {
        this.listView.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.ADDITIONAL_LIST_HEIGHT_DP) + ((int) this.topPanelLayout.getAnimatedHeightWithPadding(AndroidUtilities.dp(14.0f))), 0, AndroidUtilities.dp(this.ADDITIONAL_LIST_HEIGHT_DP) + this.navigationBarHeight + this.additionNavigationBarHeight);
        this.emptyView.setPadding(0, 0, 0, this.navigationBarHeight + this.additionNavigationBarHeight);
    }

    private void createActionMode() {
        if (this.actionBar.actionModeIsExist(null)) {
            return;
        }
        ActionBarMenu actionBarMenuCreateActionMode = this.actionBar.createActionMode();
        if (this.hasMainTabs) {
            ImageView imageView = new ImageView(getContext());
            this.actionModeCloseView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.actionModeCloseView.setImageDrawable(new BackDrawable(true));
            this.actionModeCloseView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_actionBarActionModeDefaultIcon), PorterDuff.Mode.MULTIPLY));
            this.actionModeCloseView.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), 1, -1));
            this.actionModeCloseView.setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda21(this, 3));
            actionBarMenuCreateActionMode.addView(this.actionModeCloseView, LayoutHelper.createLinear(54, 54, 16));
            this.actionModeViews.add(this.actionModeCloseView);
        }
        NumberTextView numberTextView = new NumberTextView(actionBarMenuCreateActionMode.getContext());
        this.selectedDialogsCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedDialogsCountTextView.setTypeface(AndroidUtilities.bold());
        this.selectedDialogsCountTextView.setTextColor(Theme.getColor(null, Theme.key_actionBarActionModeDefaultIcon, false));
        actionBarMenuCreateActionMode.addView(this.selectedDialogsCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, this.hasMainTabs ? 18 : 72, 0, 0, 0));
        this.selectedDialogsCountTextView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda59(3));
        this.actionModeViews.add(actionBarMenuCreateActionMode.addItemWithWidth(2, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f)));
    }

    public static void createCallLink(Context context, int i, Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
        AlertDialog alertDialog = new AlertDialog(context, 3, null);
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 500L);
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.random.nextInt();
        ConnectionsManager.getInstance(i).sendRequest(createconferencecall, new CallLogActivity$$ExternalSyntheticLambda20(i, alertDialog, context, resourcesProvider, runnable));
    }

    private void deleteAllMessages(boolean z) {
        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
        tL_messages_deletePhoneCallHistory.revoke = z;
        getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new CallLogActivity$$ExternalSyntheticLambda31(this, z, 0));
    }

    private static boolean eq(long j, ArrayList<TLRPC.User> arrayList) {
        return arrayList.size() == 1 && arrayList.get(0).id == j;
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        TLRPC.Chat chat;
        boolean zIsEmpty = this.activeGroupCalls.isEmpty();
        boolean zIsEmpty2 = this.calls.isEmpty();
        if (!zIsEmpty || !zIsEmpty2) {
            arrayList.add(UItem.asButton(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2)).accent());
            if (!getUserConfig().showCallsTab) {
                arrayList.add(UItem.asButton(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs)).accent());
            }
            arrayList.add(UItem.asShadow(null));
        }
        int i = 0;
        if (!zIsEmpty) {
            ArrayList<Long> arrayList2 = this.activeGroupCalls;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Long l = arrayList2.get(i2);
                i2++;
                Long l2 = l;
                if (l2 != null && (chat = getMessagesController().getChat(l2)) != null) {
                    arrayList.add(GroupCallCell.Factory.of(chat, new CallLogActivity$$ExternalSyntheticLambda21(this, 2)));
                }
            }
            arrayList.add(UItem.asShadow(null));
        }
        if (zIsEmpty2) {
            return;
        }
        ArrayList<CallLogRow> arrayList3 = this.calls;
        int size2 = arrayList3.size();
        while (i < size2) {
            CallLogRow callLogRow = arrayList3.get(i);
            i++;
            CallLogRow callLogRow2 = callLogRow;
            arrayList.add(CallCell.Factory.of(callLogRow2, onCallClick(callLogRow2)).setChecked(isSelected(callLogRow2.calls)));
        }
        if (this.endReached) {
            return;
        }
        arrayList.add(UItem.asFlicker(-1, 8));
        arrayList.add(UItem.asFlicker(-2, 8));
        arrayList.add(UItem.asFlicker(-3, 8));
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
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.adapter.update(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i2;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.q = "";
        tL_messages_search.offset_id = i;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new LinkManager$$ExternalSyntheticLambda10(this, 6), 2), this.classGuid);
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
        this.listView.adapter.update(true);
    }

    private boolean isSelected(ArrayList<TLRPC.Message> arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (this.selectedIds.contains(Integer.valueOf(arrayList.get(i).id))) {
                return true;
            }
        }
        return false;
    }

    public void lambda$createActionMode$16(View view) {
        hideActionMode(true);
    }

    public static boolean lambda$createActionMode$17(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$createCallLink$37(TLObject tLObject, AlertDialog alertDialog, Context context, int i, TL_phone.exportGroupCallInvite exportgroupcallinvite, Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            alertDialog.dismiss();
            showCallLinkSheet(context, i, exportgroupcallinvite.call, ((TL_phone.exportedGroupCallInvite) tLObject).link, resourcesProvider, true, true);
        } else {
            alertDialog.dismiss();
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public static void lambda$createCallLink$38(AlertDialog alertDialog, Context context, int i, TL_phone.exportGroupCallInvite exportgroupcallinvite, Theme.ResourcesProvider resourcesProvider, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda20(tLObject, alertDialog, context, i, exportgroupcallinvite, resourcesProvider, runnable));
    }

    public static void lambda$createCallLink$39(TLObject tLObject, int i, AlertDialog alertDialog, Context context, Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
        int i2 = 0;
        if (!(tLObject instanceof TLRPC.Updates)) {
            if (!(tLObject instanceof TL_phone.groupCall)) {
                alertDialog.dismiss();
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(i).putUsers(groupcall.users, false);
            MessagesController.getInstance(i).putChats(groupcall.chats, false);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = groupcall.call;
            tL_inputGroupCall.id = groupCall.id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(i).sendRequest(exportgroupcallinvite, new ArticleViewer$$ExternalSyntheticLambda33(alertDialog, context, i, exportgroupcallinvite, resourcesProvider, runnable));
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        MessagesController.getInstance(i).putUsers(updates.users, false);
        MessagesController.getInstance(i).putChats(updates.chats, false);
        ArrayList arrayListFindUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
        int size = arrayListFindUpdatesAndRemove.size();
        TLRPC.GroupCall groupCall2 = null;
        while (i2 < size) {
            Object obj = arrayListFindUpdatesAndRemove.get(i2);
            i2++;
            groupCall2 = ((TL_update.TL_updateGroupCall) obj).call;
        }
        alertDialog.dismiss();
        if (groupCall2 != null) {
            TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
            tL_inputGroupCall2.id = groupCall2.id;
            tL_inputGroupCall2.access_hash = groupCall2.access_hash;
            showCallLinkSheet(context, i, tL_inputGroupCall2, groupCall2.invite_link, resourcesProvider, true, true);
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public static void lambda$createCallLink$40(int i, AlertDialog alertDialog, Context context, Theme.ResourcesProvider resourcesProvider, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda16(tLObject, i, alertDialog, context, resourcesProvider, runnable, 6));
    }

    public void lambda$createView$0(View view) {
        showItemOptions();
    }

    public void lambda$createView$1() {
        checkUi_listClip();
        blur3_InvalidateBlur();
    }

    public void lambda$createView$2() {
        this.listView.postOnAnimation(new CallLogActivity$$ExternalSyntheticLambda4(this, 2));
    }

    public void lambda$createView$3(View view) {
        openCreateCall();
    }

    public void lambda$createView$4() {
        blur3_InvalidateBlur();
        checkUi_listViewPadding();
    }

    public void lambda$deleteAllMessages$15(boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
            TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
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

    public static boolean lambda$getCalls$18(long j, TLRPC.User user) {
        return user.id == j;
    }

    public static boolean lambda$getCalls$19(long j, TLRPC.User user) {
        return user.id == j;
    }

    public void lambda$getCalls$20(TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z;
        TLRPC.messages_Messages messages_messages;
        int i;
        TLRPC.User user;
        int i2;
        CallLogRow callLogRow;
        CallLogRow callLogRow2;
        TLRPC.MessageAction messageAction;
        boolean z2;
        TLRPC.User user2;
        long jLongValue;
        ArrayList<TLRPC.User> arrayList;
        int size;
        int i3;
        TLRPC.User user3;
        TLRPC.User user4;
        int i4 = 1;
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(messages_messages2.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(messages_messages2.chats, false);
            this.endReached = messages_messages2.messages.isEmpty();
            CallLogRow callLogRow3 = !this.calls.isEmpty() ? (CallLogRow) zzin.m(1, this.calls) : null;
            int i5 = 0;
            while (i5 < messages_messages2.messages.size()) {
                TLRPC.Message message = messages_messages2.messages.get(i5);
                TLRPC.MessageAction messageAction2 = message.action;
                if (messageAction2 == null || (messageAction2 instanceof TLRPC.TL_messageActionHistoryClear)) {
                    messages_messages = messages_messages2;
                    i = i5;
                } else {
                    long fromChatId = MessageObject.getFromChatId(message);
                    if (fromChatId == getUserConfig().getClientUserId()) {
                        fromChatId = message.peer_id.user_id;
                    }
                    HashSet<Long> hashSet = new HashSet();
                    int i6 = MessageObject.getFromChatId(message) == getUserConfig().getClientUserId() ? 0 : 1;
                    TLRPC.MessageAction messageAction3 = message.action;
                    if (messageAction3 instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction3;
                        hashSet.add(Long.valueOf(fromChatId));
                        hashSet.addAll((Collection) j$.util.Collection.EL.stream(tL_messageActionConferenceCall.other_participants).map(new GroupCallSheet$$ExternalSyntheticLambda0(1)).collect(Collectors.toSet()));
                        if (i6 == i4 && tL_messageActionConferenceCall.missed) {
                            i6 = 2;
                        }
                        int i7 = (i6 == 0 && tL_messageActionConferenceCall.missed) ? 3 : i6;
                        messages_messages = messages_messages2;
                        if (callLogRow3 != null) {
                            i2 = i7;
                            if (callLogRow3.call_id == tL_messageActionConferenceCall.call_id) {
                                callLogRow = callLogRow3;
                                i = i5;
                            }
                            if (callLogRow != null) {
                                callLogRow.calls.add(0, message);
                                for (Long l : hashSet) {
                                    jLongValue = l.longValue();
                                    arrayList = callLogRow.users;
                                    size = arrayList.size();
                                    i3 = 0;
                                    do {
                                        if (i3 >= size) {
                                            user3 = getMessagesController().getUser(l);
                                            if (user3 == null) {
                                                break;
                                            }
                                            callLogRow.users.add(user3);
                                            break;
                                        }
                                        user4 = arrayList.get(i3);
                                        i3++;
                                    } while (jLongValue != user4.id);
                                }
                            } else {
                                if (callLogRow3 != null && !this.calls.contains(callLogRow3)) {
                                    this.calls.add(callLogRow3);
                                }
                                callLogRow2 = new CallLogRow();
                                callLogRow2.call_id = tL_messageActionConferenceCall.call_id;
                                callLogRow2.calls.clear();
                                callLogRow2.calls.add(message);
                                for (Long l2 : hashSet) {
                                    l2.getClass();
                                    if (!j$.util.Collection.EL.stream(callLogRow2.users).noneMatch(new CallLogActivity$$ExternalSyntheticLambda13(fromChatId, 0)) && (user2 = getMessagesController().getUser(l2)) != null) {
                                        callLogRow2.users.add(user2);
                                    }
                                }
                                callLogRow2.type = i2;
                                messageAction = message.action;
                                if (messageAction == null && messageAction.video) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                callLogRow2.video = z2;
                                callLogRow3 = callLogRow2;
                            }
                        } else {
                            i2 = i7;
                        }
                        int i8 = 0;
                        while (true) {
                            if (i8 >= this.calls.size()) {
                                i = i5;
                                callLogRow = null;
                                break;
                            }
                            callLogRow = this.calls.get(i8);
                            i = i5;
                            if (callLogRow.call_id == tL_messageActionConferenceCall.call_id) {
                                break;
                            }
                            i8++;
                            i5 = i;
                        }
                        if (callLogRow != null) {
                            callLogRow.calls.add(0, message);
                            while (r2.hasNext()) {
                                jLongValue = l.longValue();
                                arrayList = callLogRow.users;
                                size = arrayList.size();
                                i3 = 0;
                                do {
                                    if (i3 >= size) {
                                        user3 = getMessagesController().getUser(l);
                                        if (user3 == null) {
                                            callLogRow.users.add(user3);
                                            break;
                                            break;
                                        } else {
                                            break;
                                            break;
                                        }
                                    }
                                    user4 = arrayList.get(i3);
                                    i3++;
                                } while (jLongValue != user4.id);
                            }
                        } else {
                            if (callLogRow3 != null) {
                                this.calls.add(callLogRow3);
                            }
                            callLogRow2 = new CallLogRow();
                            callLogRow2.call_id = tL_messageActionConferenceCall.call_id;
                            callLogRow2.calls.clear();
                            callLogRow2.calls.add(message);
                            while (r3.hasNext()) {
                                l2.getClass();
                                if (!j$.util.Collection.EL.stream(callLogRow2.users).noneMatch(new CallLogActivity$$ExternalSyntheticLambda13(fromChatId, 0))) {
                                }
                            }
                            callLogRow2.type = i2;
                            messageAction = message.action;
                            if (messageAction == null) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            callLogRow2.video = z2;
                            callLogRow3 = callLogRow2;
                        }
                    } else {
                        messages_messages = messages_messages2;
                        i = i5;
                        hashSet.add(Long.valueOf(fromChatId));
                        TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = message.action.reason;
                        if (i6 == 1 && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                            i6 = 2;
                        }
                        int i9 = (i6 == 0 && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) ? 3 : i6;
                        if (callLogRow3 == null || !eq(hashSet, callLogRow3.users) || callLogRow3.type != i9) {
                            if (callLogRow3 != null && !this.calls.contains(callLogRow3)) {
                                this.calls.add(callLogRow3);
                            }
                            callLogRow3 = new CallLogRow();
                            callLogRow3.calls.clear();
                            for (Long l3 : hashSet) {
                                l3.getClass();
                                if (j$.util.Collection.EL.stream(callLogRow3.users).noneMatch(new CallLogActivity$$ExternalSyntheticLambda13(fromChatId, 1)) && (user = getMessagesController().getUser(l3)) != null) {
                                    callLogRow3.users.add(user);
                                }
                            }
                            callLogRow3.type = i9;
                            TLRPC.MessageAction messageAction4 = message.action;
                            callLogRow3.video = messageAction4 != null && messageAction4.video;
                        }
                        callLogRow3.calls.add(message);
                    }
                    i5 = i + 1;
                    messages_messages2 = messages_messages;
                    i4 = 1;
                }
                i5 = i + 1;
                messages_messages2 = messages_messages;
                i4 = 1;
            }
            if (callLogRow3 != null && !callLogRow3.calls.isEmpty() && !this.calls.contains(callLogRow3)) {
                this.calls.add(callLogRow3);
            }
            z = true;
        } else {
            z = true;
            this.endReached = true;
        }
        this.loading = false;
        if (!this.firstLoaded) {
            resumeDelayedFragmentAnimation();
        }
        this.firstLoaded = z;
        this.otherItem.setVisibility(this.calls.isEmpty() ? 8 : 0);
        EmptyTextProgressView emptyTextProgressView = this.emptyView;
        if (emptyTextProgressView != null) {
            emptyTextProgressView.showTextView();
        }
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.adapter.update(true);
        }
    }

    public void lambda$getCalls$21(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new PhotoViewer$86$$ExternalSyntheticLambda0(this, tL_error, tLObject, 26));
    }

    public void lambda$getThemeDescriptions$22() {
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            int childCount = universalRecyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt instanceof CallCell) {
                    ((CallCell) childAt).profileSearchCell.update(0);
                }
            }
        }
        ImageView imageView = this.actionModeCloseView;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_actionBarActionModeDefaultIcon), PorterDuff.Mode.MULTIPLY));
            this.actionModeCloseView.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), 1, -1));
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.updateColors();
        }
    }

    public void lambda$onCallClick$5(AlertDialog alertDialog, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, TLRPC.TL_error tL_error) {
        alertDialog.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            getMessagesController().putUsers(groupcall.users, false);
            getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                showDialog(new CreateGroupCallSheet(getContext(), hashSet));
                return;
            } else {
                VoIPHelper.joinConference(getParentActivity(), this.currentAccount, tL_inputGroupCallInviteMessage, z, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            showDialog(new CreateGroupCallSheet(getContext(), hashSet));
        } else if (tL_error != null) {
            BulletinFactory.of(this).showForError(tL_error);
        }
    }

    public void lambda$onCallClick$6(AlertDialog alertDialog, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new CallLogActivity$$ExternalSyntheticLambda0(this, alertDialog, tLObject, hashSet, tL_inputGroupCallInviteMessage, z, tL_error, 0));
    }

    public void lambda$onCallClick$7(int i, DialogInterface dialogInterface) {
        getConnectionsManager().cancelRequest(i, true);
    }

    public void lambda$onCallClick$8(CallLogRow callLogRow, View view) {
        if (callLogRow.users.size() == 1) {
            TLRPC.User user = callLogRow.users.get(0);
            TLRPC.UserFull userFull = getMessagesController().getUserFull(user.id);
            this.lastCallUser = user;
            boolean z = callLogRow.video;
            VoIPHelper.startCall(user, z, z || (userFull != null && userFull.video_calls_available), getParentActivity(), null, getAccountInstance());
            return;
        }
        boolean z2 = callLogRow.video;
        HashSet hashSet = new HashSet();
        ArrayList<TLRPC.User> arrayList = callLogRow.users;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.User user2 = arrayList.get(i);
            i++;
            hashSet.add(Long.valueOf(user2.id));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = callLogRow.calls.get(0).id;
        AlertDialog alertDialog = new AlertDialog(getContext(), 3, null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = getMessagesController().conferenceCallSizeLimit;
        alertDialog.setOnCancelListener(new CallLogActivity$$ExternalSyntheticLambda10(this, getConnectionsManager().sendRequest(getgroupcall, new CallLogActivity$$ExternalSyntheticLambda9(this, alertDialog, hashSet, tL_inputGroupCallInviteMessage, z2, 0)), 0));
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 600L);
    }

    public void lambda$onClick$10(AlertDialog alertDialog, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, TLRPC.TL_error tL_error) {
        alertDialog.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            getMessagesController().putUsers(groupcall.users, false);
            getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                showDialog(new CreateGroupCallSheet(getContext(), hashSet));
                return;
            } else {
                VoIPHelper.joinConference(getParentActivity(), this.currentAccount, tL_inputGroupCallInviteMessage, z, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            showDialog(new CreateGroupCallSheet(getContext(), hashSet));
        } else if (tL_error != null) {
            BulletinFactory.of(this).showForError(tL_error);
        }
    }

    public void lambda$onClick$11(AlertDialog alertDialog, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new CallLogActivity$$ExternalSyntheticLambda0(this, alertDialog, tLObject, hashSet, tL_inputGroupCallInviteMessage, z, tL_error, 1));
    }

    public void lambda$onClick$12(int i, DialogInterface dialogInterface) {
        getConnectionsManager().cancelRequest(i, true);
    }

    public void lambda$onClick$9() {
        setCallsTabVisible(false);
    }

    public static void lambda$showCallLinkSheet$23(String str, int i, BottomSheet[] bottomSheetArr) {
        TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
        Uri uri = Uri.parse(str);
        tL_inputGroupCallSlug.slug = uri.getPathSegments().get(uri.getPathSegments().size() - 1);
        VoIPHelper.joinConference(LaunchActivity.instance, i, tL_inputGroupCallSlug, false, null, null);
        bottomSheetArr[0].lambda$showGiftOfferSheet$15();
    }

    public static void lambda$showCallLinkSheet$25(String[] strArr, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider, View view) {
        AndroidUtilities.addToClipboard(strArr[0]);
        ArticleViewer$21$$ExternalSyntheticOutline0.m(BulletinFactory.of(bottomSheet.topBulletinContainer, resourcesProvider), R.string.LinkCopied);
    }

    public static void lambda$showCallLinkSheet$26(String[] strArr, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider, View view) {
        AndroidUtilities.addToClipboard(strArr[0]);
        ArticleViewer$21$$ExternalSyntheticOutline0.m(BulletinFactory.of(bottomSheet.topBulletinContainer, resourcesProvider), R.string.LinkCopied);
    }

    public static void lambda$showCallLinkSheet$27(FrameLayout frameLayout, AtomicBoolean atomicBoolean, LinkSpanDrawable.LinksTextView linksTextView, String str, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float fAbs = (Math.abs(fFloatValue - 0.5f) / 5.0f) + 0.9f;
        frameLayout.setScaleX(fAbs);
        frameLayout.setScaleY(fAbs);
        if (fFloatValue < 0.5f || atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        linksTextView.setText(str);
    }

    public static void lambda$showCallLinkSheet$28(TLObject tLObject, String[] strArr, final FrameLayout frameLayout, final LinkSpanDrawable.LinksTextView linksTextView, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider) {
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            final String strSubstring = ((TL_phone.exportedGroupCallInvite) tLObject).link;
            strArr[0] = strSubstring;
            if (strSubstring.startsWith("https://")) {
                strSubstring = strSubstring.substring(8);
            }
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(220L);
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CallLogActivity.lambda$showCallLinkSheet$27(frameLayout, atomicBoolean, linksTextView, strSubstring, valueAnimator);
                }
            });
            duration.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    atomicBoolean.set(true);
                    linksTextView.setText(strSubstring);
                }
            });
            duration.start();
            BulletinFactory.of(bottomSheet.topBulletinContainer, resourcesProvider).createSimpleBulletin(R.raw.linkbroken, LocaleController.getString(R.string.GroupCallCreatedLinkRevokedTitle), LocaleController.getString(R.string.GroupCallCreatedLinkRevokedText)).show();
        }
    }

    public static void lambda$showCallLinkSheet$29(String[] strArr, FrameLayout frameLayout, LinkSpanDrawable.LinksTextView linksTextView, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda295(tLObject, (Object) strArr, (Object) frameLayout, (Object) linksTextView, (Object) bottomSheet, (Object) resourcesProvider, 2));
    }

    public static void lambda$showCallLinkSheet$30(int i, TLRPC.InputGroupCall inputGroupCall, String[] strArr, FrameLayout frameLayout, LinkSpanDrawable.LinksTextView linksTextView, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(i).processUpdates((TLRPC.Updates) tLObject, false);
        }
        TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
        exportgroupcallinvite.call = inputGroupCall;
        ConnectionsManager.getInstance(i).sendRequest(exportgroupcallinvite, new ChatActivity$$ExternalSyntheticLambda147(strArr, frameLayout, linksTextView, bottomSheet, resourcesProvider, 4));
    }

    public static void lambda$showCallLinkSheet$31(TLRPC.InputGroupCall inputGroupCall, int i, String[] strArr, FrameLayout frameLayout, LinkSpanDrawable.LinksTextView linksTextView, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider) {
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = inputGroupCall;
        togglegroupcallsettings.reset_invite_hash = true;
        ConnectionsManager.getInstance(i).sendRequest(togglegroupcallsettings, new CallLogActivity$$ExternalSyntheticLambda18(inputGroupCall, i, strArr, frameLayout, linksTextView, bottomSheet, resourcesProvider));
    }

    public static void lambda$showCallLinkSheet$32(String[] strArr, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider) {
        AndroidUtilities.addToClipboard(strArr[0]);
        ArticleViewer$21$$ExternalSyntheticOutline0.m(BulletinFactory.of(bottomSheet.topBulletinContainer, resourcesProvider), R.string.LinkCopied);
    }

    public static void lambda$showCallLinkSheet$33(Context context, String[] strArr) {
        QRCodeBottomSheet qRCodeBottomSheet = new QRCodeBottomSheet(context, LocaleController.getString(R.string.InviteByQRCode), strArr[0], LocaleController.getString(R.string.QRCodeLinkGroupCall), false);
        qRCodeBottomSheet.setCenterAnimation(R.raw.qr_code_logo);
        qRCodeBottomSheet.show();
    }

    public static void lambda$showCallLinkSheet$34(BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider, FrameLayout frameLayout, String[] strArr, Context context, boolean z, Runnable runnable, View view) {
        ItemOptions.makeOptions(bottomSheet.container, resourcesProvider, frameLayout).add(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new PhotoViewer$86$$ExternalSyntheticLambda0(strArr, bottomSheet, resourcesProvider, 27)).add(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new PhotoViewer$7$$ExternalSyntheticLambda0(21, context, strArr)).addIf(z, R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.RevokeLink), true, runnable).show();
    }

    public static void lambda$showCallLinkSheet$35(Context context, String str, String[] strArr, Theme.ResourcesProvider resourcesProvider, final BottomSheet bottomSheet, View view) {
        ArrayList arrayList = null;
        new ShareAlert(context, arrayList, str, false, strArr[0], false, resourcesProvider) {
            @Override
            public void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
                String string;
                if (z) {
                    if (longSparseArray == null || longSparseArray.size() != 1) {
                        string = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", longSparseArray == null ? 1 : longSparseArray.size(), new Object[0]));
                    } else {
                        long j = ((TLRPC.Dialog) longSparseArray.valueAt(0)).id;
                        string = (j == 0 || j == UserConfig.getInstance(this.currentAccount).getClientUserId()) ? LocaleController.getString(R.string.InvLinkToSavedMessages) : LocaleController.formatString(R.string.InvLinkToUser, MessagesController.getInstance(this.currentAccount).getPeerName(j, true));
                    }
                    Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of(bottomSheet.topBulletinContainer, this.resourcesProvider).createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(string));
                    bulletinCreateSimpleBulletin.hideAfterBottomSheet = false;
                    bulletinCreateSimpleBulletin.show();
                }
            }

            @Override
            public void setLastVisible(boolean z) {
            }
        }.show();
    }

    public static void lambda$showCallLinkSheet$36(BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider, ImageView imageView, Runnable runnable, View view) {
        ItemOptions.makeOptions(bottomSheet.getContainer(), resourcesProvider, imageView).add(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), runnable).setOnTopOfScrim().translate(0.0f, -AndroidUtilities.dp(6.0f)).setDimAlpha(0).show();
    }

    public static void lambda$showDeleteAlert$13(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public void lambda$showDeleteAlert$14(boolean z, boolean[] zArr, AlertDialog alertDialog, int i) {
        if (z) {
            deleteAllMessages(zArr[0]);
            this.calls.clear();
            this.loading = false;
            this.endReached = true;
            this.otherItem.setVisibility(8);
            this.listView.adapter.update(true);
        } else {
            getMessagesController().deleteMessages(new ArrayList<>(this.selectedIds), null, null, 0L, 0, zArr[0], 0);
        }
        hideActionMode(false);
    }

    public void lambda$showItemOptions$41() {
        setCallsTabVisible(true);
    }

    public void lambda$showItemOptions$42() {
        setCallsTabVisible(false);
        (this.hasMainTabs ? BulletinFactory.global() : BulletinFactory.of(this)).createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new CallLogActivity$$ExternalSyntheticLambda4(this, 1)).setDuration(5000).show();
    }

    public void lambda$showItemOptions$43() {
        showDeleteAlert(true);
    }

    private View.OnClickListener onCallClick(CallLogRow callLogRow) {
        return new ArticleViewer$$ExternalSyntheticLambda53(4, this, callLogRow);
    }

    public void onClick(UItem uItem, View view, int i, float f, float f2) {
        int i2 = uItem.id;
        if (i2 == 2) {
            setCallsTabVisible(true);
            BulletinFactory.of(this).createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasShownTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new CallLogActivity$$ExternalSyntheticLambda4(this, 5)).setDuration(5000).show();
            return;
        }
        if (i2 == 1) {
            openCreateCall();
            return;
        }
        Object obj = uItem.object;
        if (!(obj instanceof CallLogRow)) {
            if (view instanceof GroupCallCell) {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", ((GroupCallCell) view).currentChat.id);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                presentFragment(new ChatActivity(bundle), this.needFinishFragment);
                return;
            }
            return;
        }
        CallLogRow callLogRow = (CallLogRow) obj;
        if (this.actionBar.isActionModeShowed()) {
            addOrRemoveSelectedDialog(callLogRow.calls, (CallCell) view);
            return;
        }
        if (callLogRow.call_id == 0 || callLogRow.calls.isEmpty()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", MessageObject.getDialogId(callLogRow.calls.get(0)));
            bundle2.putInt("message_id", callLogRow.calls.get(0).id);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            presentFragment(new ChatActivity(bundle2), this.needFinishFragment);
            return;
        }
        boolean z = callLogRow.video;
        HashSet hashSet = new HashSet();
        ArrayList<TLRPC.User> arrayList = callLogRow.users;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            TLRPC.User user = arrayList.get(i3);
            i3++;
            hashSet.add(Long.valueOf(user.id));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = callLogRow.calls.get(0).id;
        AlertDialog alertDialog = new AlertDialog(getContext(), 3, null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = getMessagesController().conferenceCallSizeLimit;
        alertDialog.setOnCancelListener(new CallLogActivity$$ExternalSyntheticLambda10(this, getConnectionsManager().sendRequest(getgroupcall, new CallLogActivity$$ExternalSyntheticLambda9(this, alertDialog, hashSet, tL_inputGroupCallInviteMessage, z, 1)), 1));
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 600L);
    }

    public void onGroupCallClick(View view) {
        Long l = (Long) view.getTag();
        ChatObject.Call groupCall = getMessagesController().getGroupCall(l.longValue(), false);
        TLRPC.Chat chat = getMessagesController().getChat(l);
        this.lastCallChat = chat;
        if (groupCall != null) {
            VoIPHelper.startCall(chat, null, false, null, getParentActivity(), this, getAccountInstance());
        } else {
            this.waitingForCallChatId = l;
            getMessagesController().loadFullChat(l.longValue(), 0, true);
        }
    }

    public boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
        Object obj = uItem.object;
        if (!(obj instanceof CallLogRow)) {
            return false;
        }
        addOrRemoveSelectedDialog(((CallLogRow) obj).calls, (CallCell) view);
        return true;
    }

    public static void openCreateCall(BaseFragment baseFragment) {
        baseFragment.presentFragment(new AnonymousClass9(CallLogActivity$$ExternalSyntheticOutline0.m("isCall", true), baseFragment.getCurrentAccount(), baseFragment));
    }

    private void setCallsTabVisible(boolean z) {
        if (z == getUserConfig().showCallsTab) {
            return;
        }
        getUserConfig().setShowCallsTab(z);
        this.listView.adapter.update(true);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    public static void showCallLinkSheet(final Context context, int i, TLRPC.InputGroupCall inputGroupCall, String str, final Theme.ResourcesProvider resourcesProvider, boolean z, final boolean z2) {
        int i2;
        int color = Theme.getColor(Theme.key_dialogBackground, resourcesProvider);
        final BottomSheet bottomSheet = new BottomSheet(context, false, false, resourcesProvider);
        bottomSheet.setBackgroundColor(color);
        bottomSheet.fixNavigationBar(color);
        final String[] strArr = {str};
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        linearLayoutM.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        linearLayoutM.addView(frameLayout, LayoutHelper.createLinear(-1, 92, 17, 0, 0, 0, 0));
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
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        int i3 = R.drawable.ic_ab_other;
        imageView2.setImageResource(i3);
        int color2 = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(color2, mode));
        int i4 = Theme.key_listSelector;
        imageView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(i4, resourcesProvider), 1, -1));
        if (z2) {
            frameLayout.addView(imageView2, LayoutHelper.createFrame(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i5 = Theme.key_windowBackgroundWhiteBlackText;
        LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView = TextHelper.makeLinkTextView(context, 20.0f, i5, true, resourcesProvider);
        linksTextViewMakeLinkTextView.setText(LocaleController.getString(R.string.GroupCallCreatedLinkTitle));
        linksTextViewMakeLinkTextView.setGravity(17);
        linearLayoutM.addView(linksTextViewMakeLinkTextView, LayoutHelper.createLinear(-1, -2, 17, 32, 16, 32, 8));
        LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView2 = TextHelper.makeLinkTextView(context, 14.0f, i5, false, resourcesProvider);
        linksTextViewMakeLinkTextView2.setText(LocaleController.getString(R.string.GroupCallCreatedLinkText));
        linksTextViewMakeLinkTextView2.setGravity(17);
        linksTextViewMakeLinkTextView2.setMaxWidth(HintView2.cutInFancyHalf(linksTextViewMakeLinkTextView2.getText(), linksTextViewMakeLinkTextView2.getPaint()));
        linearLayoutM.addView(linksTextViewMakeLinkTextView2, LayoutHelper.createLinear(-1, -2, 17, 32, 0, 32, 18));
        String strSubstring = str.startsWith("https://") ? str.substring(8) : str;
        final FrameLayout frameLayout3 = new FrameLayout(context);
        ScaleStateListAnimator.apply(frameLayout3, 0.01f, 1.2f);
        int i6 = Theme.key_windowBackgroundGray;
        frameLayout3.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(i6, resourcesProvider), Theme.blendOver(Theme.getColor(i6, resourcesProvider), Theme.getColor(i4, resourcesProvider)), 12, 12));
        linearLayoutM.addView(frameLayout3, LayoutHelper.createLinear(-1, -2, 7, 16, 0, 16, 0));
        LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView3 = TextHelper.makeLinkTextView(context, 13.0f, i5, false, resourcesProvider);
        linksTextViewMakeLinkTextView3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
        linksTextViewMakeLinkTextView3.setText(strSubstring);
        frameLayout3.addView(linksTextViewMakeLinkTextView3, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(i3));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogTextGray3, resourcesProvider), mode));
        frameLayout3.addView(imageView3, LayoutHelper.createFrame(40, 48, 21));
        LinearLayout linearLayoutM2 = AccountFrozenAlert$$ExternalSyntheticOutline0.m(0, context);
        linearLayoutM.addView(linearLayoutM2, LayoutHelper.createLinear(-1, -2, 16.0f, 12.0f, 16.0f, 0.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, resourcesProvider);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkCopy));
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_copy_filled), 0, 1, 33);
        buttonWithCounterView.setText(spannableStringBuilder, false);
        linearLayoutM2.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, true, resourcesProvider);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkShare));
        spannableStringBuilder2.setSpan(new ColoredImageSpan(R.drawable.msg_share_filled), 0, 1, 33);
        buttonWithCounterView2.setText(spannableStringBuilder2, false);
        linearLayoutM2.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        BottomSheet[] bottomSheetArr = new BottomSheet[1];
        if (z) {
            TextView textView = new TextView(context) {
                private final Paint paint = new Paint(1);

                @Override
                public void dispatchDraw(Canvas canvas) {
                    this.paint.setColor(Theme.multAlpha(0.8f, Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider)));
                    this.paint.setStyle(Paint.Style.STROKE);
                    this.paint.setStrokeWidth(1.0f);
                    float height = getHeight() / 2.0f;
                    Layout layout = getLayout();
                    int iMax = 0;
                    for (int i7 = 0; i7 < layout.getLineCount(); i7++) {
                        iMax = Math.max(iMax, (int) layout.getLineWidth(i7));
                    }
                    float f = iMax / 2.0f;
                    canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f) - AndroidUtilities.dp(8.0f), height, this.paint);
                    canvas.drawLine((getWidth() / 2.0f) + f + AndroidUtilities.dp(8.0f), height, getWidth(), height, this.paint);
                    super.dispatchDraw(canvas);
                }
            };
            textView.setGravity(17);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            textView.setText(" " + LocaleController.getString(R.string.GroupCallCreatedLinkJoinOr) + " ");
            textView.setTextSize(14.0f);
            linearLayoutM.addView(textView, LayoutHelper.createLinear(190, -2, 1, 28, 12, 28, 8));
            i2 = i;
            TodoItemMenu$$ExternalSyntheticLambda2 todoItemMenu$$ExternalSyntheticLambda2 = new TodoItemMenu$$ExternalSyntheticLambda2(str, i2, bottomSheetArr, 15);
            LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView4 = TextHelper.makeLinkTextView(context, 14.0f, i5, false, resourcesProvider);
            linksTextViewMakeLinkTextView4.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GroupCallCreatedLinkJoinText), todoItemMenu$$ExternalSyntheticLambda2), true));
            linksTextViewMakeLinkTextView4.setGravity(17);
            linksTextViewMakeLinkTextView4.setMaxWidth(HintView2.cutInFancyHalf(linksTextViewMakeLinkTextView4.getText(), linksTextViewMakeLinkTextView4.getPaint()));
            linearLayoutM.addView(linksTextViewMakeLinkTextView4, LayoutHelper.createLinear(-1, -2, 17, 32, 8, 32, 12));
            ScaleStateListAnimator.apply(linksTextViewMakeLinkTextView4, 0.05f, 1.2f);
            linksTextViewMakeLinkTextView4.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda11(todoItemMenu$$ExternalSyntheticLambda2, 3));
        } else {
            i2 = i;
        }
        bottomSheet.customView = linearLayoutM;
        bottomSheet.show();
        bottomSheetArr[0] = bottomSheet;
        final int i7 = 0;
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        CallLogActivity.lambda$showCallLinkSheet$25(strArr, bottomSheet, resourcesProvider, view);
                        break;
                    default:
                        CallLogActivity.lambda$showCallLinkSheet$26(strArr, bottomSheet, resourcesProvider, view);
                        break;
                }
            }
        });
        final int i8 = 1;
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i8) {
                    case 0:
                        CallLogActivity.lambda$showCallLinkSheet$25(strArr, bottomSheet, resourcesProvider, view);
                        break;
                    default:
                        CallLogActivity.lambda$showCallLinkSheet$26(strArr, bottomSheet, resourcesProvider, view);
                        break;
                }
            }
        });
        final ArticleViewer$$ExternalSyntheticLambda20 articleViewer$$ExternalSyntheticLambda20 = new ArticleViewer$$ExternalSyntheticLambda20(inputGroupCall, i2, strArr, frameLayout3, linksTextViewMakeLinkTextView3, bottomSheet, resourcesProvider, 4);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ArticleViewer$$ExternalSyntheticLambda20 articleViewer$$ExternalSyntheticLambda21 = articleViewer$$ExternalSyntheticLambda20;
                CallLogActivity.lambda$showCallLinkSheet$34(bottomSheet, resourcesProvider, frameLayout3, strArr, context, z2, articleViewer$$ExternalSyntheticLambda21, view);
            }
        });
        buttonWithCounterView2.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda13(context, str, strArr, resourcesProvider, bottomSheet));
        if (z2) {
            imageView2.setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda46(bottomSheet, resourcesProvider, imageView2, articleViewer$$ExternalSyntheticLambda20, 0));
        }
    }

    public void showDeleteAlert(boolean z) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        if (z) {
            builder.setTitle(LocaleController.getString(R.string.DeleteAllCalls));
            builder.setMessage(LocaleController.getString(R.string.DeleteAllCallsText));
        } else {
            builder.setTitle(LocaleController.getString(R.string.DeleteCalls));
            builder.setMessage(LocaleController.getString(R.string.DeleteSelectedCallsText));
        }
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        CheckBoxCell checkBoxCell = new CheckBoxCell(getParentActivity(), 1);
        checkBoxCell.setBackground(Theme.getSelectorDrawable(false));
        checkBoxCell.setText(LocaleController.getString(R.string.DeleteCallsForEveryone), "", false, false, false);
        checkBoxCell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(8.0f), 0);
        frameLayout.addView(checkBoxCell, LayoutHelper.createFrame(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        checkBoxCell.setOnClickListener(new PhotoViewer$16$$ExternalSyntheticLambda5(zArr, 2));
        builder.setView(frameLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new LoginActivity$$ExternalSyntheticLambda26(this, z, zArr, 4));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        showDialog(alertDialogCreate);
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    private void showItemOptions() {
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this, this.otherItem);
        itemOptionsMakeOptions.setDimAlpha(8);
        if (getUserConfig().showCallsTab) {
            itemOptionsMakeOptions.add(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new CallLogActivity$$ExternalSyntheticLambda4(this, 0));
        }
        itemOptionsMakeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.DeleteAllCalls), true, (Runnable) new CallLogActivity$$ExternalSyntheticLambda4(this, 6));
        itemOptionsMakeOptions.show();
        itemOptionsMakeOptions.setTranslationY(-AndroidUtilities.dp(64.0f));
    }

    private void showOrUpdateActionMode() {
        boolean z = true;
        if (!this.actionBar.isActionModeShowed()) {
            createActionMode();
            this.actionBar.showActionMode();
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.actionModeViews.size(); i++) {
                View view = this.actionModeViews.get(i);
                view.setPivotY(ActionBar.getCurrentActionBarHeight() / 2.0f);
                AndroidUtilities.clearDrawableAnimation(view);
                arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.start();
            z = false;
        } else if (this.selectedIds.isEmpty()) {
            hideActionMode(true);
            return;
        }
        this.selectedDialogsCountTextView.setNumber(this.selectedIds.size(), z);
    }

    @Override
    public boolean canParentTabsSlide(MotionEvent motionEvent, boolean z) {
        return true;
    }

    @Override
    public ActionBar createActionBar(Context context) {
        ActionBar actionBarCreateActionBar = super.createActionBar(context);
        actionBarCreateActionBar.setUseContainerForTitles();
        actionBarCreateActionBar.createAdditionalSubTitleOverlayContainer();
        actionBarCreateActionBar.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        actionBarCreateActionBar.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(2.0f));
        actionBarCreateActionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        actionBarCreateActionBar.setAddToContainer(false);
        return actionBarCreateActionBar;
    }

    @Override
    public View createView(Context context) {
        int i = 4;
        int i2 = 0;
        int i3 = 1;
        if (!this.hasMainTabs) {
            zzki.m(this.actionBar);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calls));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i4) {
                if (i4 != -1) {
                    if (i4 == 2) {
                        CallLogActivity.this.showDeleteAlert(false);
                    }
                } else if (((BaseFragment) CallLogActivity.this).actionBar.isActionModeShowed()) {
                    CallLogActivity.this.hideActionMode(true);
                } else {
                    CallLogActivity.this.finishFragment();
                }
            }
        });
        ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(10, R.drawable.ic_ab_other);
        this.otherItem = actionBarMenuItemAddItem;
        actionBarMenuItemAddItem.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.otherItem.setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda21(this, i2));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new LinkManager$$ExternalSyntheticLambda6(this, 6), new CallLogActivity$$ExternalSyntheticLambda23(this), new CallLogActivity$$ExternalSyntheticLambda23(this));
        this.listView = universalRecyclerView;
        int i4 = Theme.key_windowBackgroundGray;
        universalRecyclerView.setBackgroundColor(Theme.getColor(i4, this.resourceProvider));
        this.listView.setSections();
        this.listView.adapter.setApplyBackground(false);
        this.contentView = new SizeNotifierFrameLayout(context) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                if (Build.VERSION.SDK_INT >= 31 && CallLogActivity.this.scrollableViewNoiseSuppressor != null) {
                    CallLogActivity.this.blur3_InvalidateBlur();
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (CallLogActivity.this.iBlur3SourceGlassFrosted != null && !CallLogActivity.this.iBlur3SourceGlassFrosted.inRecording) {
                        RecordingCanvas recordingCanvasBeginRecording = CallLogActivity.this.iBlur3SourceGlassFrosted.beginRecording(measuredWidth, measuredHeight);
                        recordingCanvasBeginRecording.drawColor(CallLogActivity.this.getThemedColor(Theme.key_windowBackgroundGray));
                        if (SharedConfig.chatBlurEnabled()) {
                            CallLogActivity.this.scrollableViewNoiseSuppressor.draw(recordingCanvasBeginRecording, -3);
                        }
                        CallLogActivity.this.iBlur3SourceGlassFrosted.endRecording();
                    }
                    if (CallLogActivity.this.iBlur3SourceGlass != null && !CallLogActivity.this.iBlur3SourceGlass.inRecording) {
                        RecordingCanvas recordingCanvasBeginRecording2 = CallLogActivity.this.iBlur3SourceGlass.beginRecording(measuredWidth, measuredHeight);
                        recordingCanvasBeginRecording2.drawColor(CallLogActivity.this.getThemedColor(Theme.key_windowBackgroundGray));
                        if (SharedConfig.chatBlurEnabled()) {
                            CallLogActivity.this.scrollableViewNoiseSuppressor.draw(recordingCanvasBeginRecording2, -2);
                        }
                        CallLogActivity.this.iBlur3SourceGlass.endRecording();
                    }
                    CallLogActivity.this.iBlur3Invalidated = false;
                }
                super.dispatchDraw(canvas);
            }

            @Override
            public void drawBlurRect(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
                if (Build.VERSION.SDK_INT < 29 || !SharedConfig.chatBlurEnabled() || CallLogActivity.this.iBlur3SourceGlassFrosted == null) {
                    canvas.drawRect(rect, paint);
                    return;
                }
                canvas.save();
                canvas.translate(0.0f, -f);
                CallLogActivity.this.iBlur3SourceGlassFrosted.draw(canvas, rect.left, rect.top + f, rect.right, rect.bottom + f);
                canvas.restore();
                int alpha = paint.getAlpha();
                paint.setAlpha(178);
                canvas.drawRect(rect, paint);
                paint.setAlpha(alpha);
            }

            @Override
            public void onLayout(boolean z, int i5, int i6, int i7, int i8) {
                super.onLayout(z, i5, i6, i7, i8);
                CallLogActivity.this.checkUi_floatingButton();
                CallLogActivity.this.checkUi_listClip();
            }

            @Override
            public void onMeasure(int i5, int i6) {
                measureChildWithMargins(((BaseFragment) CallLogActivity.this).actionBar, i5, 0, i6, 0);
                ((ViewGroup.MarginLayoutParams) CallLogActivity.this.topPanelLayout.getLayoutParams()).topMargin = ((BaseFragment) CallLogActivity.this).actionBar.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                ((ViewGroup.MarginLayoutParams) CallLogActivity.this.emptyView.getLayoutParams()).topMargin = ((BaseFragment) CallLogActivity.this).actionBar.getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) CallLogActivity.this.headerShadowView.getLayoutParams()).topMargin = ((BaseFragment) CallLogActivity.this).actionBar.getMeasuredHeight();
                CallLogActivity.this.checkUi_listViewPadding();
                super.onMeasure(i5, i6);
            }
        };
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = this.iBlur3FactoryLiquidGlass;
        ViewPositionWatcher viewPositionWatcher = new ViewPositionWatcher(this.contentView);
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.contentView;
        blurredBackgroundDrawableViewFactory.viewPositionWatcher = viewPositionWatcher;
        blurredBackgroundDrawableViewFactory.parent = sizeNotifierFrameLayout;
        UniversalRecyclerView universalRecyclerView2 = this.listView;
        Objects.requireNonNull(universalRecyclerView2);
        this.iBlur3Capture = new ViewGroupPartRenderer(universalRecyclerView2, sizeNotifierFrameLayout, new BoostsActivity$$ExternalSyntheticLambda4(universalRecyclerView2, i));
        this.listView.addEdgeEffectListener(new CallLogActivity$$ExternalSyntheticLambda4(this, 3));
        SizeNotifierFrameLayout sizeNotifierFrameLayout2 = this.contentView;
        this.fragmentView = sizeNotifierFrameLayout2;
        sizeNotifierFrameLayout2.setBackgroundColor(Theme.getColor(null, i4, false));
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        this.flickerLoadingView = flickerLoadingView;
        flickerLoadingView.setViewType(8);
        this.flickerLoadingView.setBackgroundColor(Theme.getColor(null, i4, false));
        this.flickerLoadingView.showDate(false);
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, this.flickerLoadingView);
        this.emptyView = emptyTextProgressView;
        this.contentView.addView(emptyTextProgressView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setClipToPadding(false);
        this.listView.setEmptyView(this.emptyView);
        UniversalRecyclerView universalRecyclerView3 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        universalRecyclerView3.setLayoutManager(linearLayoutManager);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = new RecyclerAnimationScrollHelper(this.listView, this.layoutManager);
        this.scrollHelper = recyclerAnimationScrollHelper;
        recyclerAnimationScrollHelper.setScrollListener(new CallLogActivity$$ExternalSyntheticLambda23(this));
        SizeNotifierFrameLayout sizeNotifierFrameLayout3 = this.contentView;
        UniversalRecyclerView universalRecyclerView4 = this.listView;
        float f = -this.ADDITIONAL_LIST_HEIGHT_DP;
        sizeNotifierFrameLayout3.addView(universalRecyclerView4, LayoutHelper.createFrame(-1, -1.0f, 3, 0.0f, f, 0.0f, f));
        this.listView.setOnScrollListener(new AnonymousClass3());
        if (this.loading) {
            this.emptyView.showProgress();
        } else {
            this.emptyView.showTextView();
        }
        FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider);
        this.floatingButton = fragmentFloatingButton;
        fragmentFloatingButton.imageView.setImageResource(R.drawable.filled_calls_plus);
        this.floatingButton.setContentDescription(LocaleController.getString(R.string.Call));
        this.floatingButton.setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda21(this, i3));
        this.contentView.addView(this.floatingButton, FragmentFloatingButton.createDefaultLayoutParams());
        DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout = new DialogsActivityTopPanelLayout(context);
        this.topPanelLayout = dialogsActivityTopPanelLayout;
        dialogsActivityTopPanelLayout.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        this.topPanelLayout.setOnAnimatedHeightChangedListener(new CallLogActivity$$ExternalSyntheticLambda4(this, i));
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = this.iBlur3FactoryLiquidGlass.create(this.topPanelLayout, BlurredBackgroundProviderImpl.topPanel(this.resourceProvider), false);
        Theme.ResourcesProvider.CC.m(blurredBackgroundDrawableCreate, AndroidUtilities.dp(24.0f), 7.0f);
        this.topPanelLayout.setBlurredBackground(blurredBackgroundDrawableCreate);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentContextViewWrapper = frameLayout;
        this.topPanelLayout.addView(frameLayout);
        this.topPanelLayout.setViewVisible(this.fragmentContextViewWrapper, true, false);
        FragmentContextView fragmentContextView = new FragmentContextView(context, this, this.contentView, false, this.resourceProvider) {
            @Override
            public void setVisibility(int i5) {
                CallLogActivity.this.topPanelLayout.setViewVisible(CallLogActivity.this.fragmentContextViewWrapper, i5 == 0);
            }
        };
        this.fragmentContextView = fragmentContextView;
        this.fragmentContextViewWrapper.addView(fragmentContextView);
        this.topPanelLayout.setCallFragmentContextView(this.fragmentContextView);
        this.contentView.addView(this.topPanelLayout, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        this.contentView.addView(this.actionBar);
        HeaderShadowView headerShadowView = new HeaderShadowView(context, this.parentLayout);
        this.headerShadowView = headerShadowView;
        headerShadowView.setShadowVisible(false, false);
        this.contentView.addView(this.headerShadowView, LayoutHelper.createFrame(-1, 5, 48));
        this.actionBar.setDrawBlurBackground(this.contentView);
        this.actionBar.setAdaptiveBackground(this.listView);
        Bulletin.addDelegate(this, new Bulletin.Delegate() {
            @Override
            public final boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public final boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public final boolean clipWithGradient(int i5) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i5);
            }

            @Override
            public int getBottomOffset(int i5) {
                return CallLogActivity.this.additionFloatingButtonOffset + CallLogActivity.this.navigationBarHeight;
            }

            @Override
            public final int getLeftPadding() {
                return Bulletin.Delegate.CC.$default$getLeftPadding(this);
            }

            @Override
            public final int getRightPadding() {
                return Bulletin.Delegate.CC.$default$getRightPadding(this);
            }

            @Override
            public final int getTopOffset(int i5) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i5);
            }

            @Override
            public void onBottomOffsetChange(float f2) {
                CallLogActivity callLogActivity = CallLogActivity.this;
                callLogActivity.additionalFloatingTranslation = Math.max(0.0f, (f2 - callLogActivity.navigationBarHeight) - CallLogActivity.this.additionFloatingButtonOffset);
                CallLogActivity.this.checkUi_floatingButton();
            }

            @Override
            public final void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public final void onShow(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onShow(this, bulletin);
            }
        });
        if (this.hasMainTabs) {
            View view = this.fragmentView;
            CallLogActivity$$ExternalSyntheticLambda23 callLogActivity$$ExternalSyntheticLambda23 = new CallLogActivity$$ExternalSyntheticLambda23(this);
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(view, callLogActivity$$ExternalSyntheticLambda23);
        }
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        Long l;
        UniversalRecyclerView universalRecyclerView;
        CallLogRow callLogRow;
        TLRPC.User user;
        CallLogRow callLogRow2;
        TLRPC.User user2;
        CallLogRow callLogRow3;
        TLRPC.User user3;
        CallLogActivity callLogActivity = this;
        int i3 = 0;
        boolean z = true;
        if (i != NotificationCenter.didReceiveNewMessages) {
            if (i == NotificationCenter.messagesDeleted) {
                if (callLogActivity.firstLoaded && !((Boolean) objArr[2]).booleanValue()) {
                    ArrayList arrayList = (ArrayList) objArr[0];
                    Iterator<CallLogRow> it = callLogActivity.calls.iterator();
                    while (it.hasNext()) {
                        CallLogRow next = it.next();
                        Iterator<TLRPC.Message> it2 = next.calls.iterator();
                        while (it2.hasNext()) {
                            if (arrayList.contains(Integer.valueOf(it2.next().id))) {
                                it2.remove();
                                i3 = 1;
                            }
                        }
                        if (next.calls.isEmpty()) {
                            it.remove();
                        }
                    }
                    if (i3 == 0 || (universalRecyclerView = callLogActivity.listView) == null) {
                        return;
                    }
                    universalRecyclerView.adapter.update(true);
                    return;
                }
                return;
            }
            if (i == NotificationCenter.activeGroupCallsUpdated) {
                callLogActivity.activeGroupCalls = callLogActivity.getMessagesController().getActiveGroupCalls();
                UniversalRecyclerView universalRecyclerView2 = callLogActivity.listView;
                if (universalRecyclerView2 != null) {
                    universalRecyclerView2.adapter.update(true);
                    return;
                }
                return;
            }
            if (i != NotificationCenter.chatInfoDidLoad) {
                if (i == NotificationCenter.groupCallUpdated && (l = callLogActivity.waitingForCallChatId) != null && l.equals((Long) objArr[0])) {
                    VoIPHelper.startCall(callLogActivity.lastCallChat, null, false, null, callLogActivity.getParentActivity(), callLogActivity, callLogActivity.getAccountInstance());
                    callLogActivity.waitingForCallChatId = null;
                    return;
                }
                return;
            }
            Long l2 = callLogActivity.waitingForCallChatId;
            if (l2 == null || ((TLRPC.ChatFull) objArr[0]).id != l2.longValue() || callLogActivity.getMessagesController().getGroupCall(callLogActivity.waitingForCallChatId.longValue(), true) == null) {
                return;
            }
            VoIPHelper.startCall(callLogActivity.lastCallChat, null, false, null, callLogActivity.getParentActivity(), callLogActivity, callLogActivity.getAccountInstance());
            callLogActivity.waitingForCallChatId = null;
            return;
        }
        if (callLogActivity.firstLoaded && !((Boolean) objArr[2]).booleanValue()) {
            ArrayList arrayList2 = (ArrayList) objArr[1];
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                MessageObject messageObject = (MessageObject) obj;
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                int i5 = 3;
                if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                    long fromChatId = messageObject.getFromChatId();
                    long j = fromChatId == callLogActivity.getUserConfig().getClientUserId() ? messageObject.messageOwner.peer_id.user_id : fromChatId;
                    int i6 = fromChatId == callLogActivity.getUserConfig().getClientUserId() ? 0 : 1;
                    TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = messageObject.messageOwner.action.reason;
                    if (i6 == z && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                        i6 = 2;
                    }
                    if (i6 != 0 || (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                        i5 = i6;
                    }
                    if (callLogActivity.calls.isEmpty()) {
                        callLogRow3 = new CallLogRow();
                        callLogRow3.calls.clear();
                        callLogRow3.calls.add(messageObject.messageOwner);
                        callLogRow3.users.clear();
                        user3 = callLogActivity.getMessagesController().getUser(Long.valueOf(j));
                        if (user3 != null) {
                            callLogRow3.users.add(user3);
                        }
                        callLogRow3.type = i5;
                        callLogRow3.video = messageObject.isVideoCall();
                        callLogActivity.calls.add(0, callLogRow3);
                        callLogActivity.listView.adapter.update(z);
                    } else {
                        CallLogRow callLogRow4 = callLogActivity.calls.get(0);
                        if (eq(j, callLogRow4.users) && callLogRow4.type == i5) {
                            callLogRow4.calls.add(0, messageObject.messageOwner);
                        } else {
                            callLogRow3 = new CallLogRow();
                            callLogRow3.calls.clear();
                            callLogRow3.calls.add(messageObject.messageOwner);
                            callLogRow3.users.clear();
                            user3 = callLogActivity.getMessagesController().getUser(Long.valueOf(j));
                            if (user3 != null) {
                                callLogRow3.users.add(user3);
                            }
                            callLogRow3.type = i5;
                            callLogRow3.video = messageObject.isVideoCall();
                            callLogActivity.calls.add(0, callLogRow3);
                            callLogActivity.listView.adapter.update(z);
                        }
                    }
                } else if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                    TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                    long fromChatId2 = messageObject.getFromChatId();
                    Set<Long> set = (Set) j$.util.Collection.EL.stream(tL_messageActionConferenceCall.other_participants).map(new GroupCallSheet$$ExternalSyntheticLambda0(1)).collect(Collectors.toSet());
                    set.add(Long.valueOf(fromChatId2 == callLogActivity.getUserConfig().getClientUserId() ? messageObject.messageOwner.peer_id.user_id : fromChatId2));
                    int i7 = fromChatId2 == callLogActivity.getUserConfig().getClientUserId() ? 0 : 1;
                    if (i7 == z && tL_messageActionConferenceCall.missed) {
                        i7 = 2;
                    }
                    i5 = (i7 == 0 && tL_messageActionConferenceCall.missed) ? 3 : i7;
                    if (callLogActivity.calls.isEmpty()) {
                        callLogRow = new CallLogRow();
                        callLogRow.call_id = tL_messageActionConferenceCall.call_id;
                        callLogRow.calls.clear();
                        callLogRow.calls.add(messageObject.messageOwner);
                        callLogRow.users.clear();
                        for (Long l3 : set) {
                            l3.getClass();
                            user = callLogActivity.getMessagesController().getUser(l3);
                            if (user != null) {
                                callLogRow.users.add(user);
                            }
                        }
                        callLogRow.type = i5;
                        callLogRow.video = messageObject.isVideoCall();
                        callLogActivity.calls.add(0, callLogRow);
                        callLogActivity.listView.adapter.update(true);
                    } else {
                        int i8 = 0;
                        while (true) {
                            if (i8 >= callLogActivity.calls.size()) {
                                callLogRow2 = null;
                                break;
                            }
                            callLogRow2 = callLogActivity.calls.get(i8);
                            if (callLogRow2.call_id == tL_messageActionConferenceCall.call_id) {
                                break;
                            }
                            i8++;
                            callLogActivity = this;
                        }
                        if (callLogRow2 != null) {
                            callLogRow2.calls.add(0, messageObject.messageOwner);
                            for (Long l4 : set) {
                                long jLongValue = l4.longValue();
                                ArrayList<TLRPC.User> arrayList3 = callLogRow2.users;
                                int size2 = arrayList3.size();
                                int i9 = 0;
                                do {
                                    if (i9 >= size2) {
                                        TLRPC.User user4 = getMessagesController().getUser(l4);
                                        if (user4 == null) {
                                            break;
                                        }
                                        callLogRow2.users.add(user4);
                                        break;
                                    }
                                    user2 = arrayList3.get(i9);
                                    i9++;
                                } while (jLongValue != user2.id);
                            }
                            callLogActivity = this;
                            callLogActivity.listView.adapter.update(true);
                        } else {
                            callLogActivity = this;
                            callLogRow = new CallLogRow();
                            callLogRow.call_id = tL_messageActionConferenceCall.call_id;
                            callLogRow.calls.clear();
                            callLogRow.calls.add(messageObject.messageOwner);
                            callLogRow.users.clear();
                            while (r9.hasNext()) {
                                l3.getClass();
                                user = callLogActivity.getMessagesController().getUser(l3);
                                if (user != null) {
                                    callLogRow.users.add(user);
                                }
                            }
                            callLogRow.type = i5;
                            callLogRow.video = messageObject.isVideoCall();
                            callLogActivity.calls.add(0, callLogRow);
                            callLogActivity.listView.adapter.update(true);
                        }
                    }
                }
                z = true;
            }
            ActionBarMenuItem actionBarMenuItem = callLogActivity.otherItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(callLogActivity.calls.isEmpty() ? 8 : 0);
            }
        }
    }

    @Override
    public BlurredBackgroundSourceRenderNode getGlassSource() {
        return this.iBlur3SourceGlass;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        IntroActivity$$ExternalSyntheticLambda0 introActivity$$ExternalSyntheticLambda0 = new IntroActivity$$ExternalSyntheticLambda0(this, 3);
        View view = this.fragmentView;
        int i = Theme.key_windowBackgroundGray;
        arrayList.add(new ThemeDescription(view, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.emptyView, 4, new Class[]{EmptyTextProgressView.class}, new String[]{"emptyTextView1"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.emptyView, 4, new Class[]{EmptyTextProgressView.class}, new String[]{"emptyTextView2"}, null, null, -1, null, Theme.key_emptyListPlaceholder));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LoadingCell.class}, new String[]{"progressBar"}, null, null, -1, null, Theme.key_progressCircle));
        int i2 = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        FragmentFloatingButton fragmentFloatingButton = this.floatingButton;
        if (fragmentFloatingButton != null) {
            arrayList.add(new ThemeDescription(fragmentFloatingButton.imageView, 8, null, null, null, null, Theme.key_chats_actionIcon));
            arrayList.add(new ThemeDescription(this.floatingButton.imageView, 32, null, null, null, null, Theme.key_chats_actionBackground));
            arrayList.add(new ThemeDescription(this.floatingButton.imageView, 65568, null, null, null, null, Theme.key_chats_actionPressedBackground));
        }
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CallCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_telegram_color_text));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CallCell.class}, null, new Drawable[]{Theme.dialogs_verifiedCheckDrawable}, null, Theme.key_chats_verifiedCheck));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CallCell.class}, null, new Drawable[]{Theme.dialogs_verifiedDrawable}, null, Theme.key_chats_verifiedBackground));
        TextPaint textPaint = Theme.dialogs_offlinePaint;
        int i3 = Theme.key_windowBackgroundWhiteGrayText3;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CallCell.class}, textPaint, null, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CallCell.class}, Theme.dialogs_onlinePaint, null, null, Theme.key_windowBackgroundWhiteBlueText3));
        TextPaint[] textPaintArr = Theme.dialogs_namePaint;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CallCell.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], Theme.dialogs_searchNamePaint}, null, -1, null, Theme.key_chats_name));
        TextPaint[] textPaintArr2 = Theme.dialogs_nameEncryptedPaint;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CallCell.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], Theme.dialogs_searchNameEncryptedPaint}, null, -1, null, Theme.key_chats_secretName));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CallCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, null, new Drawable[]{this.greenDrawable, this.greenDrawable2, Theme.calllog_msgCallUpRedDrawable, Theme.calllog_msgCallDownRedDrawable}, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, null, new Drawable[]{this.redDrawable, this.redDrawable2, Theme.calllog_msgCallUpGreenDrawable, Theme.calllog_msgCallDownGreenDrawable}, null, Theme.key_fill_RedNormal));
        arrayList.add(new ThemeDescription(this.flickerLoadingView, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{ShadowSectionCell.class}, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        return arrayList;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public boolean onBackPressed(boolean z) {
        if (!this.actionBar.isActionModeShowed()) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        hideActionMode(true);
        return false;
    }

    @Override
    public void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.hideCallTabsHintWasShown || !getUserConfig().showCallsTab || MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) >= 2) {
            return;
        }
        HintView2 hintView2 = new HintView2(getContext(), 1);
        this.hideCallTabsHintView = hintView2;
        hintView2.setDuration(3000L);
        this.hideCallTabsHintView.setJoint(1.0f, -25.0f);
        this.hideCallTabsHintView.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        this.hideCallTabsHintView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.TapToHideCallsTab)));
        this.contentView.addView(this.hideCallTabsHintView, LayoutHelper.createFrame(-1, 80, 48));
        this.hideCallTabsHintView.setTranslationY((ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(16.0f));
        this.hideCallTabsHintView.show();
        this.hideCallTabsHintWasShown = true;
        MessagesController.getGlobalMainSettings().edit().putInt("hidecallshint", MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) + 1).apply();
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
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.needFinishFragment = bundle.getBoolean("needFinishFragment", true);
            this.hasMainTabs = this.arguments.getBoolean("hasMainTabs", false);
        }
        this.additionNavigationBarHeight = this.hasMainTabs ? AndroidUtilities.dp(72.0f) : 0;
        this.additionFloatingButtonOffset = this.hasMainTabs ? AndroidUtilities.dp(64.0f) : 0;
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
    public void onInsets(int i, int i2, int i3, int i4) {
        this.navigationBarHeight = i4;
        checkUi_listViewPadding();
        checkUi_floatingButton();
    }

    @Override
    public void onParentScrollToTop() {
        if (this.layoutManager.findFirstVisibleItemPosition() < 15) {
            this.listView.smoothScrollToPosition(0);
        } else {
            this.scrollHelper.setScrollDirection(1);
            this.scrollHelper.scrollToPosition(0, 0, false, true);
        }
    }

    @Override
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        boolean z;
        if (i == 101 || i == 102 || i == 103) {
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
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
                VoIPHelper.permissionDenied(getParentActivity(), i, null);
            } else if (i == 103) {
                VoIPHelper.startCall(this.lastCallChat, null, false, null, getParentActivity(), this, getAccountInstance());
            } else {
                TLRPC.UserFull userFull = this.lastCallUser != null ? getMessagesController().getUserFull(this.lastCallUser.id) : null;
                VoIPHelper.startCall(this.lastCallUser, i == 102, i == 102 || (userFull != null && userFull.video_calls_available), getParentActivity(), null, getAccountInstance());
            }
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.adapter.update(true);
        }
    }

    @Override
    public void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        if (z) {
            this.openTransitionStarted = true;
        }
    }

    public CallLogActivity(Bundle bundle) {
        super(bundle);
        int i = Build.VERSION.SDK_INT;
        this.ADDITIONAL_LIST_HEIGHT_DP = i >= 31 ? 48 : 0;
        this.needFinishFragment = true;
        this.actionModeViews = new ArrayList<>();
        this.calls = new ArrayList<>();
        this.selectedIds = new ArrayList<>();
        this.ID_CREATE_CALL = 1;
        this.ID_SHOW_IN_MAIN_TABS = 2;
        this.hideCallTabsHintWasShown = false;
        this.tmpClipRect = new Rect();
        ArrayList<RectF> arrayList = new ArrayList<>();
        this.iBlur3Positions = arrayList;
        RectF rectF = new RectF();
        this.iBlur3PositionActionBar = rectF;
        RectF rectF2 = new RectF();
        this.iBlur3PositionMainTabs = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        this.iBlur3SourceColor = blurredBackgroundSourceColor;
        blurredBackgroundSourceColor.paint.setColor(getThemedColor(Theme.key_windowBackgroundGray));
        if (i < 31) {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3SourceGlassFrosted = null;
            this.iBlur3SourceGlass = null;
            this.iBlur3FactoryLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
            return;
        }
        this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor(false);
        this.iBlur3SourceGlassFrosted = new BlurredBackgroundSourceRenderNode(null);
        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
        this.iBlur3SourceGlass = blurredBackgroundSourceRenderNode;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
        this.iBlur3FactoryLiquidGlass = blurredBackgroundDrawableViewFactory;
        blurredBackgroundDrawableViewFactory.isLiquidGlassEffectAllowed = LiteMode.isEnabled(262144);
    }

    private static boolean eq(Set<Long> set, ArrayList<TLRPC.User> arrayList) {
        if (set.size() != arrayList.size()) {
            return false;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.User user = arrayList.get(i);
            i++;
            if (!set.contains(Long.valueOf(user.id))) {
                return false;
            }
        }
        return true;
    }

    private void openCreateCall() {
        openCreateCall(this);
    }
}
