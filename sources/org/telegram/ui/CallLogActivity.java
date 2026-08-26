package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
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
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkn;
import com.google.android.gms.internal.mlkit_vision_common.zzkt;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import me.vkryl.android.animator.BoolAnimator;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Business.AwayMessagesActivity;
import org.telegram.ui.Business.BusinessIntroActivity;
import org.telegram.ui.Business.ChatbotsActivity;
import org.telegram.ui.Business.GreetMessagesActivity;
import org.telegram.ui.Business.OpeningHoursActivity;
import org.telegram.ui.Business.OpeningHoursDayActivity;
import org.telegram.ui.Business.TimezoneSelector;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AudioPlayerAlert;
import org.telegram.ui.Components.AvatarsDrawable;
import org.telegram.ui.Components.AvatarsImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.DialogsActivityTopPanelLayout;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.ProgressButton;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.Storage.CacheModel;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda2;

public final class CallLogActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, MainTabsActivity.TabFragmentDelegate {
    public final int ADDITIONAL_LIST_HEIGHT_DP;
    public ImageView actionModeCloseView;
    public final ArrayList actionModeViews;
    public ArrayList activeGroupCalls;
    public int additionFloatingButtonOffset;
    public int additionNavigationBarHeight;
    public float additionalFloatingTranslation;
    public final ArrayList calls;
    public LoginActivity.AnonymousClass2 contentView;
    public EmptyTextProgressView emptyView;
    public boolean endReached;
    public boolean firstLoaded;
    public FlickerLoadingView flickerLoadingView;
    public FragmentFloatingButton floatingButton;
    public AnonymousClass4 fragmentContextView;
    public FrameLayout fragmentContextViewWrapper;
    public boolean hasMainTabs;
    public ChatActivity.AnonymousClass27 headerShadowView;
    public HintView2 hideCallTabsHintView;
    public boolean hideCallTabsHintWasShown;
    public ViewGroupPartRenderer iBlur3Capture;
    public final BlurredBackgroundDrawableViewFactory iBlur3FactoryLiquidGlass;
    public final RectF iBlur3PositionActionBar;
    public final RectF iBlur3PositionMainTabs;
    public final ArrayList iBlur3Positions;
    public final BlurredBackgroundSourceRenderNode iBlur3SourceGlass;
    public final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    public TLRPC.Chat lastCallChat;
    public TLRPC.User lastCallUser;
    public LinearLayoutManager layoutManager;
    public UniversalRecyclerView listView;
    public boolean loading;
    public int navigationBarHeight;
    public boolean needFinishFragment;
    public ActionBarMenuItem otherItem;
    public RecyclerAnimationScrollHelper scrollHelper;
    public final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    public NumberTextView selectedDialogsCountTextView;
    public final ArrayList selectedIds;
    public final Rect tmpClipRect;
    public DialogsActivityTopPanelLayout topPanelLayout;
    public Long waitingForCallChatId;

    public final class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final void onItemClick(int i) {
            Object obj = this.this$0;
            switch (this.$r8$classId) {
                case 0:
                    CallLogActivity callLogActivity = (CallLogActivity) obj;
                    if (i != -1) {
                        if (i == 2) {
                            callLogActivity.showDeleteAlert(false);
                        }
                    } else if (!((BaseFragment) callLogActivity).actionBar.isActionModeShowed()) {
                        callLogActivity.finishFragment();
                    } else {
                        callLogActivity.hideActionMode(true);
                    }
                    break;
                case 1:
                    if (i == -1) {
                        ((ActionIntroActivity) obj).finishFragment();
                    }
                    break;
                case 2:
                    if (i == -1) {
                        ((ArchiveSettingsActivity) obj).finishFragment();
                    }
                    break;
                case 3:
                    if (i == -1) {
                        ((ArchivedStickersActivity) obj).finishFragment();
                    }
                    break;
                case 4:
                    if (i == -1) {
                        ((AutoDeleteMessagesActivity) obj).finishFragment();
                    }
                    break;
                case 5:
                    AwayMessagesActivity awayMessagesActivity = (AwayMessagesActivity) obj;
                    if (i != -1) {
                        if (i == 1) {
                            awayMessagesActivity.processDone();
                        }
                    } else if (awayMessagesActivity.onBackPressed(true)) {
                        awayMessagesActivity.finishFragment();
                    }
                    break;
                case 6:
                    BusinessIntroActivity businessIntroActivity = (BusinessIntroActivity) obj;
                    if (i != -1) {
                        if (i == 1) {
                            businessIntroActivity.processDone$1();
                        }
                    } else if (businessIntroActivity.onBackPressed(true)) {
                        businessIntroActivity.finishFragment();
                    }
                    break;
                case 7:
                    ChatbotsActivity chatbotsActivity = (ChatbotsActivity) obj;
                    if (i != -1) {
                        if (i == 1) {
                            chatbotsActivity.processDone$14();
                        }
                    } else if (chatbotsActivity.onBackPressed(true)) {
                        chatbotsActivity.finishFragment();
                    }
                    break;
                case 8:
                    GreetMessagesActivity greetMessagesActivity = (GreetMessagesActivity) obj;
                    if (i != -1) {
                        if (i == 1) {
                            greetMessagesActivity.processDone$2();
                        }
                    } else if (greetMessagesActivity.onBackPressed(true)) {
                        greetMessagesActivity.finishFragment();
                    }
                    break;
                case 9:
                    org.telegram.ui.Business.LocationActivity locationActivity = (org.telegram.ui.Business.LocationActivity) obj;
                    if (i != -1) {
                        if (i == 1) {
                            locationActivity.processDone$3();
                        }
                    } else if (locationActivity.onBackPressed(true)) {
                        locationActivity.finishFragment();
                    }
                    break;
                case 10:
                    OpeningHoursActivity openingHoursActivity = (OpeningHoursActivity) obj;
                    if (i != -1) {
                        if (i == 1) {
                            openingHoursActivity.processDone$4();
                        }
                    } else if (openingHoursActivity.onBackPressed(true)) {
                        openingHoursActivity.finishFragment();
                    }
                    break;
                case 11:
                    if (i == -1) {
                        ((OpeningHoursDayActivity) obj).finishFragment();
                    }
                    break;
                case 12:
                    if (i == -1) {
                        ((TimezoneSelector) obj).finishFragment();
                    }
                    break;
                case 13:
                    if (i == -1) {
                        ((CacheChatsExceptionsFragment) obj).finishFragment();
                    }
                    break;
                case 14:
                    CacheControlActivity cacheControlActivity = (CacheControlActivity) obj;
                    if (i != -1) {
                        if (i == 1) {
                            cacheControlActivity.clearSelectedFiles();
                        } else if (i == 3) {
                            cacheControlActivity.clearDatabase(false);
                        } else if (i == 4) {
                            cacheControlActivity.clearDatabase(true);
                        }
                    } else if (!((BaseFragment) cacheControlActivity).actionBar.isActionModeShowed()) {
                        cacheControlActivity.finishFragment();
                    } else {
                        CacheModel cacheModel = cacheControlActivity.cacheModel;
                        if (cacheModel != null) {
                            cacheModel.selectedSize = 0L;
                            cacheModel.selectedFiles.clear();
                            cacheModel.selectedDialogs.clear();
                        }
                        DialogCacheBottomSheet.AnonymousClass3 anonymousClass3 = cacheControlActivity.cachedMediaLayout;
                        if (anonymousClass3 != null) {
                            anonymousClass3.showActionMode(false);
                            cacheControlActivity.cachedMediaLayout.updateVisibleRows();
                        }
                    }
                    break;
                case 15:
                    if (i == -1) {
                        CalendarActivity calendarActivity = (CalendarActivity) obj;
                        if (calendarActivity.dateSelectedStart == 0 && calendarActivity.dateSelectedEnd == 0 && !calendarActivity.inSelectionMode) {
                            calendarActivity.finishFragment();
                        } else {
                            calendarActivity.inSelectionMode = false;
                            calendarActivity.dateSelectedStart = 0;
                            calendarActivity.dateSelectedEnd = 0;
                            calendarActivity.updateTitle();
                            calendarActivity.animateSelection();
                        }
                    }
                    break;
                case 16:
                    if (i == -1) {
                        ((CameraScanActivity) obj).finishFragment();
                    }
                    break;
                case 17:
                    ChangeNameActivity changeNameActivity = (ChangeNameActivity) obj;
                    if (i == -1) {
                        changeNameActivity.finishFragment();
                        break;
                    } else if (i == 1 && changeNameActivity.firstNameField.getText().length() != 0) {
                        changeNameActivity.saveName();
                        changeNameActivity.finishFragment();
                        break;
                    }
                    break;
                case 18:
                    ChangeUsernameActivity changeUsernameActivity = (ChangeUsernameActivity) obj;
                    if (i == -1) {
                        changeUsernameActivity.finishFragment();
                    } else if (i == 1) {
                        changeUsernameActivity.sendReorder$3();
                        changeUsernameActivity.saveName$1();
                    }
                    break;
                case 19:
                    if (i == -1) {
                        ((ChannelAdminLogActivity) obj).finishFragment();
                    }
                    break;
                case 20:
                    ChannelColorActivity channelColorActivity = (ChannelColorActivity) obj;
                    if (i != -1) {
                        if (i == 1) {
                            FrameLayout frameLayout = (FrameLayout) channelColorActivity.getParentActivity().getWindow().getDecorView();
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                            channelColorActivity.dayNightItem.setAlpha(0.0f);
                            frameLayout.draw(canvas);
                            channelColorActivity.dayNightItem.setAlpha(1.0f);
                            Paint paint = new Paint(1);
                            paint.setColor(-16777216);
                            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                            Paint paint2 = new Paint(1);
                            paint2.setFilterBitmap(true);
                            int[] iArr = new int[2];
                            channelColorActivity.dayNightItem.getLocationInWindow(iArr);
                            float f = iArr[0];
                            float f2 = iArr[1];
                            float measuredWidth = (channelColorActivity.dayNightItem.getMeasuredWidth() / 2.0f) + f;
                            float measuredHeight = (channelColorActivity.dayNightItem.getMeasuredHeight() / 2.0f) + f2;
                            float fMax = Math.max(bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            paint2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
                            PeerColorActivity.AnonymousClass7 anonymousClass7 = new PeerColorActivity.AnonymousClass7(channelColorActivity, channelColorActivity.getParentActivity(), canvas, measuredWidth, measuredHeight, fMax, paint, bitmapCreateBitmap, paint2, f, f2, 1);
                            channelColorActivity.changeDayNightView = anonymousClass7;
                            anonymousClass7.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
                            channelColorActivity.changeDayNightViewProgress = 0.0f;
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            channelColorActivity.changeDayNightViewAnimator = valueAnimatorOfFloat;
                            valueAnimatorOfFloat.addUpdateListener(new PeerColorActivity.AnonymousClass8(channelColorActivity, 1));
                            channelColorActivity.changeDayNightViewAnimator.addListener(new ArticleViewer.AnonymousClass25(channelColorActivity, 23));
                            channelColorActivity.changeDayNightViewAnimator.setDuration(400L);
                            channelColorActivity.changeDayNightViewAnimator.setInterpolator(Easings.easeInOutQuad);
                            channelColorActivity.changeDayNightViewAnimator.start();
                            frameLayout.addView(channelColorActivity.changeDayNightView, new ViewGroup.LayoutParams(-1, -1));
                            AndroidUtilities.runOnUIThread(new ChannelColorActivity$$ExternalSyntheticLambda14(channelColorActivity, 0));
                        }
                    } else if (channelColorActivity.currentLevel >= channelColorActivity.minLevelRequired() && channelColorActivity.hasUnsavedChanged()) {
                        channelColorActivity.showUnsavedAlert();
                    } else {
                        channelColorActivity.finishFragment();
                    }
                    break;
                case 21:
                    ChatEditActivity chatEditActivity = (ChatEditActivity) obj;
                    if (i != -1) {
                        if (i == 1) {
                            chatEditActivity.processDone$5();
                        }
                    } else if (chatEditActivity.checkDiscard(true)) {
                        chatEditActivity.finishFragment();
                    }
                    break;
                case 22:
                    ChatEditTypeActivity chatEditTypeActivity = (ChatEditTypeActivity) obj;
                    if (i == -1) {
                        chatEditTypeActivity.finishFragment();
                    } else if (i == 1) {
                        CrossfadeDrawable crossfadeDrawable = chatEditTypeActivity.doneButtonDrawable;
                        if (crossfadeDrawable == null || crossfadeDrawable.progress <= 0.0f) {
                            chatEditTypeActivity.processDone$6();
                        }
                    }
                    break;
                case 23:
                    if (i == -1) {
                        ((ChatLinkActivity) obj).finishFragment();
                    }
                    break;
                case 24:
                    if (i == -1) {
                        ((ChatReactionsEditActivity) obj).finishFragment();
                    }
                    break;
                case 25:
                    ChatRightsEditActivity chatRightsEditActivity = (ChatRightsEditActivity) obj;
                    if (i != -1) {
                        if (i == 1) {
                            chatRightsEditActivity.onDonePressed(true);
                        }
                    } else if (chatRightsEditActivity.checkDiscard$1(true)) {
                        chatRightsEditActivity.finishFragment();
                    }
                    break;
                case 26:
                    ChatUsersActivity chatUsersActivity = (ChatUsersActivity) obj;
                    if (i != -1) {
                        if (i == 1) {
                            chatUsersActivity.processDone$7();
                        }
                    } else if (chatUsersActivity.checkDiscard$2(true)) {
                        chatUsersActivity.finishFragment();
                    }
                    break;
                case 27:
                    AudioPlayerAlert audioPlayerAlert = (AudioPlayerAlert) obj;
                    if (i != -1) {
                        audioPlayerAlert.onSubItemClick(i);
                    } else {
                        audioPlayerAlert.lambda$showGiftOfferSheet$15();
                    }
                    break;
                case 28:
                    if (i == -1) {
                        ((BottomSheetWithRecyclerListView) obj).lambda$showGiftOfferSheet$15();
                    }
                    break;
                default:
                    ChatAttachAlert chatAttachAlert = (ChatAttachAlert) obj;
                    if (i != -1) {
                        chatAttachAlert.currentAttachLayout.onMenuItemClick(i);
                        break;
                    } else if (!chatAttachAlert.currentAttachLayout.onBackPressed()) {
                        chatAttachAlert.lambda$showGiftOfferSheet$15();
                        break;
                    }
                    break;
            }
        }
    }

    public final class AnonymousClass3 extends RecyclerView.OnScrollListener {
        public boolean scrollUpdated;

        public AnonymousClass3() {
        }

        @Override
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
            CallLogActivity callLogActivity = CallLogActivity.this;
            int iFindFirstVisibleItemPosition = callLogActivity.layoutManager.findFirstVisibleItemPosition();
            int iAbs = iFindFirstVisibleItemPosition == -1 ? 0 : Math.abs(callLogActivity.layoutManager.findLastVisibleItemPosition() - iFindFirstVisibleItemPosition) + 1;
            if (iAbs > 0) {
                int size = callLogActivity.listView.adapter.items.size();
                if (!callLogActivity.endReached && !callLogActivity.loading) {
                    ArrayList arrayList = callLogActivity.calls;
                    if (!arrayList.isEmpty() && iAbs + iFindFirstVisibleItemPosition >= size - 5) {
                        AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda8(21, this, (CallLogRow) zziq.m(1, arrayList)));
                    }
                }
            }
            View childAt = recyclerView.getChildAt(0);
            int top = childAt != null ? childAt.getTop() : 0;
            if (i2 != 0 && this.scrollUpdated) {
                callLogActivity.floatingButton.animatorButtonVisible.setValue(i2 < 0, true);
            }
            this.scrollUpdated = true;
            ((BoolAnimator) callLogActivity.headerShadowView.this$0).setValue(iFindFirstVisibleItemPosition != 0 || top < callLogActivity.listView.getPaddingTop(), true);
            if (Build.VERSION.SDK_INT < 31 || (downscaleScrollableNoiseSuppressor = callLogActivity.scrollableViewNoiseSuppressor) == null) {
                return;
            }
            downscaleScrollableNoiseSuppressor.onScrolled(i, i2);
            callLogActivity.blur3_InvalidateBlur();
        }
    }

    public final class AnonymousClass9 extends GroupCreateActivity {
        public final int val$account;
        public final BaseFragment val$parent;

        public AnonymousClass9(Bundle bundle, int i, BaseFragment baseFragment) {
            super(bundle);
            this.val$account = i;
            this.val$parent = baseFragment;
        }

        @Override
        public final void onCallUsersSelected(HashSet hashSet) {
            int size = hashSet.size();
            int i = this.val$account;
            if (size == 1) {
                TLRPC.User user = MessagesController.getInstance(i).getUser((Long) hashSet.iterator().next());
                TLRPC.UserFull userFull = MessagesController.getInstance(i).getUserFull(user.id);
                if (userFull == null) {
                    TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                    tL_users_getFullUser.id = MessagesController.getInstance(i).getInputUser(user.id);
                    ConnectionsManager.getInstance(i).sendRequest(tL_users_getFullUser, new ProfileActivity$$ExternalSyntheticLambda75(this, i, user, 4));
                    return;
                }
                VoIPHelper.startCall(user, false, userFull.video_calls_available, getParentActivity(), userFull, AccountInstance.getInstance(i));
            } else {
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                ConnectionsManager.getInstance(i).sendRequest(createconferencecall, new ProfileActivity$$ExternalSyntheticLambda75(i, hashSet, this.val$parent));
            }
            finishFragment();
        }
    }

    public final class CallCell extends FrameLayout {
        public final AvatarsImageView avatarsImageView;
        public final CheckBox2 checkBox;
        public final int currentAccount;
        public final ImageView imageView;
        public final ProfileSearchCell profileSearchCell;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                SpannableString spannableString;
                AvatarsDrawable avatarsDrawable;
                CallLogRow callLogRow = (CallLogRow) uItem.object;
                CallCell callCell = (CallCell) view;
                View.OnClickListener onClickListener = uItem.clickCallback;
                ImageView imageView = callCell.imageView;
                imageView.setImageResource(callLogRow.video ? R.drawable.menu_videocall : R.drawable.menu_call_create_2_24);
                ArrayList arrayList = callLogRow.calls;
                TLRPC.Message message = (TLRPC.Message) arrayList.get(0);
                String str = LocaleController.isRTL ? "\u202b" : "";
                if (arrayList.size() == 1) {
                    StringBuilder sbM = Log.m(str, "  ");
                    sbM.append(LocaleController.formatDateCallLog(message.date));
                    spannableString = new SpannableString(sbM.toString());
                } else {
                    spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), LocaleController.formatDateCallLog(message.date)));
                }
                int i = callLogRow.type;
                if (i == 0) {
                    Drawable drawableMutate = callCell.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
                    drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText3, false), PorterDuff.Mode.MULTIPLY));
                    spannableString.setSpan(new ImageSpan(drawableMutate, 0), str.length(), str.length() + 1, 33);
                } else if (i == 1) {
                    Drawable drawableMutate2 = callCell.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                    drawableMutate2.setBounds(0, 0, drawableMutate2.getIntrinsicWidth(), drawableMutate2.getIntrinsicHeight());
                    drawableMutate2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText3, false), PorterDuff.Mode.MULTIPLY));
                    spannableString.setSpan(new ImageSpan(drawableMutate2, 0), str.length(), str.length() + 1, 33);
                } else if (i == 2) {
                    Drawable drawableMutate3 = callCell.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                    drawableMutate3.setBounds(0, 0, drawableMutate3.getIntrinsicWidth(), drawableMutate3.getIntrinsicHeight());
                    drawableMutate3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_fill_RedNormal, false), PorterDuff.Mode.MULTIPLY));
                    spannableString.setSpan(new ImageSpan(drawableMutate3, 0), str.length(), str.length() + 1, 33);
                } else if (i == 3) {
                    Drawable drawableMutate4 = callCell.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
                    drawableMutate4.setBounds(0, 0, drawableMutate4.getIntrinsicWidth(), drawableMutate4.getIntrinsicHeight());
                    drawableMutate4.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_fill_RedNormal, false), PorterDuff.Mode.MULTIPLY));
                    spannableString.setSpan(new ImageSpan(drawableMutate4, 0), str.length(), str.length() + 1, 33);
                }
                long j = callLogRow.call_id;
                AvatarsImageView avatarsImageView = callCell.avatarsImageView;
                ArrayList arrayList2 = callLogRow.users;
                ProfileSearchCell profileSearchCell = callCell.profileSearchCell;
                if (j != 0) {
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < Math.min(3, arrayList2.size()); i2++) {
                        if (i2 > 0) {
                            sb.append(", ");
                        }
                        sb.append(DialogObject.getShortName((TLObject) arrayList2.get(i2)));
                    }
                    if (arrayList2.size() > 3) {
                        sb.append(" ");
                        sb.append(LocaleController.formatPluralString("AndOther", arrayList2.size() - 3, new Object[0]));
                    }
                    ArrayList arrayList3 = new ArrayList(arrayList2);
                    int i3 = callCell.currentAccount;
                    arrayList3.add(UserConfig.getInstance(i3).getCurrentUser());
                    profileSearchCell.setAllowEmojiStatus(false);
                    callCell.profileSearchCell.setData(arrayList2.isEmpty() ? null : arrayList2.get(0), null, sb.toString(), spannableString, false, false);
                    avatarsImageView.setVisibility(0);
                    profileSearchCell.avatarImage.clearImage();
                    profileSearchCell.dontDrawAvatar = true;
                    int iMin = Math.min(3, arrayList3.size());
                    int i4 = 0;
                    while (true) {
                        avatarsDrawable = avatarsImageView.avatarsDrawable;
                        if (i4 >= iMin) {
                            break;
                        }
                        avatarsDrawable.setObject(i4, (TLObject) arrayList3.get(i4), i3);
                        i4++;
                    }
                    avatarsDrawable.commitTransition(false, true);
                } else {
                    SpannableString spannableString2 = spannableString;
                    profileSearchCell.setAllowEmojiStatus(true);
                    callCell.profileSearchCell.setData(arrayList2.isEmpty() ? null : arrayList2.get(0), null, null, spannableString2, false, false);
                    avatarsImageView.setVisibility(8);
                    profileSearchCell.dontDrawAvatar = false;
                }
                imageView.setTag(callLogRow);
                imageView.setOnClickListener(onClickListener);
                boolean z2 = uItem.checked;
                CheckBox2 checkBox2 = callCell.checkBox;
                if (checkBox2 == null) {
                    return;
                }
                checkBox2.checkBoxBase.setChecked(-1, z2, false);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
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
            addView(profileSearchCell, LayoutHelper.createFrame(-1.0f, -1));
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
            CheckBoxBase checkBoxBase = checkBox2.getCheckBoxBase();
            int color = Theme.getColor(null, Theme.key_telegram_color, false);
            if (checkBoxBase.backgroundColor != color) {
                checkBoxBase.backgroundColor = color;
                checkBoxBase.invalidate();
            }
            checkBox2.checkBoxBase.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
            checkBox2.setDrawUnchecked(false);
            checkBox2.setDrawBackgroundAsArc(3);
            addView(checkBox2, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
        }
    }

    public final class CallLogRow {
        public long call_id;
        public int type;
        public boolean video;
        public final ArrayList users = new ArrayList();
        public final ArrayList calls = new ArrayList();
    }

    public final class EmptyTextProgressView extends FrameLayout {
        public static final int $r8$clinit = 0;
        public final TextView emptyTextView1;
        public final TextView emptyTextView2;
        public final RLottieImageView imageView;
        public final FlickerLoadingView progressView;

        public EmptyTextProgressView(CallLogActivity callLogActivity, Context context, FlickerLoadingView flickerLoadingView) {
            super(context);
            addView(flickerLoadingView, LayoutHelper.createFrame(-1.0f, -1));
            this.progressView = flickerLoadingView;
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.imageView = rLottieImageView;
            rLottieImageView.setAnimation(R.raw.utyan_call, 110, 110, null);
            rLottieImageView.setAutoRepeat(false);
            addView(rLottieImageView, LayoutHelper.createFrame(110, 110.0f, 17, 52.0f, 17.0f, 52.0f, 60.0f));
            rLottieImageView.setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda38(this, 16));
            TextView textView = new TextView(context);
            this.emptyTextView1 = textView;
            textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            textView.setText(LocaleController.getString(R.string.MakeYourFirstCall));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 17, 17.0f, 40.0f, 17.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.emptyTextView2 = textView2;
            String string = LocaleController.formatString(R.string.MakeYourFirstCallHint, Integer.valueOf(callLogActivity.getMessagesController().conferenceCallSizeLimit));
            if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                string = string.replace('\n', ' ');
            }
            textView2.setText(string);
            textView2.setTextColor(Theme.getColor(null, Theme.key_emptyListPlaceholder, false));
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 17, 17.0f, 80.0f, 17.0f, 0.0f));
            flickerLoadingView.setAlpha(0.0f);
            rLottieImageView.setAlpha(0.0f);
            textView.setAlpha(0.0f);
            textView2.setAlpha(0.0f);
            setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(3));
        }

        @Override
        public final boolean hasOverlappingRendering() {
            return false;
        }

        public final void showProgress() {
            this.imageView.animate().alpha(0.0f).setDuration(150L).start();
            this.emptyTextView1.animate().alpha(0.0f).setDuration(150L).start();
            this.emptyTextView2.animate().alpha(0.0f).setDuration(150L).start();
            this.progressView.animate().alpha(1.0f).setDuration(150L).start();
        }

        public final void showTextView() {
            RLottieImageView rLottieImageView = this.imageView;
            rLottieImageView.animate().alpha(1.0f).setDuration(150L).start();
            this.emptyTextView1.animate().alpha(1.0f).setDuration(150L).start();
            this.emptyTextView2.animate().alpha(1.0f).setDuration(150L).start();
            this.progressView.animate().alpha(0.0f).setDuration(150L).start();
            rLottieImageView.playAnimation();
        }
    }

    public final class GroupCallCell extends FrameLayout {
        public final ProgressButton button;
        public TLRPC.Chat currentChat;
        public final ProfileSearchCell profileSearchCell;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                String lowerCase;
                GroupCallCell groupCallCell = (GroupCallCell) view;
                TLRPC.Chat chat = (TLRPC.Chat) uItem.object;
                View.OnClickListener onClickListener = uItem.clickCallback;
                groupCallCell.currentChat = chat;
                Long lValueOf = Long.valueOf(chat.id);
                ProgressButton progressButton = groupCallCell.button;
                progressButton.setTag(lValueOf);
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    lowerCase = !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                } else if (chat.has_geo) {
                    lowerCase = LocaleController.getString(R.string.MegaLocation);
                } else {
                    lowerCase = !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase();
                }
                groupCallCell.profileSearchCell.setData(chat, null, null, lowerCase, false, false);
                progressButton.setOnClickListener(onClickListener);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
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
            addView(profileSearchCell, LayoutHelper.createFrame(-1.0f, -1));
            progressButton.setText(string);
            progressButton.setTextSize(1, 14.0f);
            progressButton.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
            progressButton.setProgressColor(Theme.getColor(null, Theme.key_featuredStickers_buttonProgress, false));
            int color = Theme.getColor(null, Theme.key_telegram_color, false);
            Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
            progressButton.setBackgroundRoundRect(16.0f, color);
            progressButton.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
            addView(progressButton, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
        }
    }

    public CallLogActivity() {
        this(null);
    }

    public static void showCallLinkSheet(final Context context, int i, TLRPC.InputGroupCall inputGroupCall, String str, final Theme.ResourcesProvider resourcesProvider, boolean z, final boolean z2) {
        int i2;
        int color = Theme.getColor(Theme.key_dialogBackground, resourcesProvider);
        final BottomSheet bottomSheet = new BottomSheet(context, resourcesProvider, false, false);
        bottomSheet.setBackgroundColor(color);
        bottomSheet.fixNavigationBar(color);
        final String[] strArr = {str};
        LinearLayout linearLayoutM = zzkf.m(context, 1);
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
        LinearLayout linearLayoutM2 = zzkf.m(context, 0);
        linearLayoutM.addView(linearLayoutM2, LayoutHelper.createLinear(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkCopy));
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_copy_filled), 0, 1, 33);
        buttonWithCounterView.setText(spannableStringBuilder, false, true);
        linearLayoutM2.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, resourcesProvider, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkShare));
        spannableStringBuilder2.setSpan(new ColoredImageSpan(R.drawable.msg_share_filled), 0, 1, 33);
        buttonWithCounterView2.setText(spannableStringBuilder2, false, true);
        linearLayoutM2.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        BottomSheet[] bottomSheetArr = new BottomSheet[1];
        if (z) {
            TextView textView = new TextView(context) {
                public final Paint paint = new Paint(1);

                @Override
                public final void dispatchDraw(Canvas canvas) {
                    Paint paint = this.paint;
                    paint.setColor(Theme.multAlpha(0.8f, Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider)));
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(1.0f);
                    float height = getHeight() / 2.0f;
                    Layout layout = getLayout();
                    int iMax = 0;
                    for (int i7 = 0; i7 < layout.getLineCount(); i7++) {
                        iMax = Math.max(iMax, (int) layout.getLineWidth(i7));
                    }
                    float f = iMax / 2.0f;
                    canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f) - AndroidUtilities.dp(8.0f), height, paint);
                    canvas.drawLine(AndroidUtilities.dp(8.0f) + (getWidth() / 2.0f) + f, height, getWidth(), height, paint);
                    super.dispatchDraw(canvas);
                }
            };
            textView.setGravity(17);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            textView.setText(" " + LocaleController.getString(R.string.GroupCallCreatedLinkJoinOr) + " ");
            textView.setTextSize(14.0f);
            linearLayoutM.addView(textView, LayoutHelper.createLinear(190, -2, 1, 28, 12, 28, 8));
            i2 = i;
            ChatActivity$$ExternalSyntheticLambda17 chatActivity$$ExternalSyntheticLambda17 = new ChatActivity$$ExternalSyntheticLambda17(str, i2, bottomSheetArr, 13);
            LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView4 = TextHelper.makeLinkTextView(context, 14.0f, i5, false, resourcesProvider);
            linksTextViewMakeLinkTextView4.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GroupCallCreatedLinkJoinText), chatActivity$$ExternalSyntheticLambda17), true));
            linksTextViewMakeLinkTextView4.setGravity(17);
            linksTextViewMakeLinkTextView4.setMaxWidth(HintView2.cutInFancyHalf(linksTextViewMakeLinkTextView4.getText(), linksTextViewMakeLinkTextView4.getPaint()));
            linearLayoutM.addView(linksTextViewMakeLinkTextView4, LayoutHelper.createLinear(-1, -2, 17, 32, 8, 32, 12));
            ScaleStateListAnimator.apply(linksTextViewMakeLinkTextView4, 0.05f, 1.2f);
            linksTextViewMakeLinkTextView4.setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda38(chatActivity$$ExternalSyntheticLambda17, 0));
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
                        AndroidUtilities.addToClipboard(strArr[0]);
                        zzkn.m(R.string.LinkCopied, new BulletinFactory(bottomSheet.topBulletinContainer, resourcesProvider));
                        break;
                    default:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        zzkn.m(R.string.LinkCopied, new BulletinFactory(bottomSheet.topBulletinContainer, resourcesProvider));
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
                        AndroidUtilities.addToClipboard(strArr[0]);
                        zzkn.m(R.string.LinkCopied, new BulletinFactory(bottomSheet.topBulletinContainer, resourcesProvider));
                        break;
                    default:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        zzkn.m(R.string.LinkCopied, new BulletinFactory(bottomSheet.topBulletinContainer, resourcesProvider));
                        break;
                }
            }
        });
        final ArticleViewer$$ExternalSyntheticLambda70 articleViewer$$ExternalSyntheticLambda70 = new ArticleViewer$$ExternalSyntheticLambda70(inputGroupCall, i2, strArr, frameLayout3, linksTextViewMakeLinkTextView3, bottomSheet, resourcesProvider, 4);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                BottomSheet bottomSheet2 = bottomSheet;
                BottomSheet.ContainerView containerView = bottomSheet2.container;
                FrameLayout frameLayout4 = frameLayout3;
                Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(containerView, resourcesProvider2, frameLayout4);
                int i9 = R.drawable.msg_copy;
                String string = LocaleController.getString(R.string.Copy);
                String[] strArr2 = strArr;
                itemOptionsMakeOptions.add(i9, string, new ChatActivity$$ExternalSyntheticLambda102(strArr2, bottomSheet2, resourcesProvider2, 4), false);
                itemOptionsMakeOptions.add(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new ArticleViewer$$ExternalSyntheticLambda8(20, context, strArr2), false);
                int i10 = R.drawable.msg_delete;
                String string2 = LocaleController.getString(R.string.RevokeLink);
                if (z2) {
                    itemOptionsMakeOptions.add(i10, string2, articleViewer$$ExternalSyntheticLambda70, true);
                }
                itemOptionsMakeOptions.show();
            }
        });
        buttonWithCounterView2.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda6((Object) context, (Object) str, (Object) strArr, (Object) resourcesProvider, bottomSheet, 2));
        if (z2) {
            imageView2.setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(bottomSheet, resourcesProvider, imageView2, articleViewer$$ExternalSyntheticLambda70, 2));
        }
    }

    public final void addOrRemoveSelectedDialog(ArrayList arrayList, CallCell callCell) {
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.selectedIds;
            if (i >= size) {
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Integer numValueOf = Integer.valueOf(((TLRPC.Message) arrayList.get(i2)).id);
                    if (!arrayList2.contains(numValueOf)) {
                        arrayList2.add(numValueOf);
                    }
                }
                CheckBox2 checkBox2 = callCell.checkBox;
                if (checkBox2 != null) {
                    checkBox2.checkBoxBase.setChecked(-1, true, true);
                }
                showOrUpdateActionMode();
                return;
            }
            if (arrayList2.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i)).id))) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i3)).id));
                }
                CheckBox2 checkBox3 = callCell.checkBox;
                if (checkBox3 != null) {
                    checkBox3.checkBoxBase.setChecked(-1, false, true);
                }
                showOrUpdateActionMode();
                return;
            }
            i++;
        }
    }

    public final void blur3_InvalidateBlur() {
        DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
        if (Build.VERSION.SDK_INT < 31 || (downscaleScrollableNoiseSuppressor = this.scrollableViewNoiseSuppressor) == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(48.0f) + ((int) this.topPanelLayout.getAnimatedHeightWithPadding(AndroidUtilities.dp(7.0f)));
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.navigationBarHeight) - AndroidUtilities.dp(8.0f);
        int iDp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.iBlur3PositionActionBar.set(0.0f, -iDp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + iDp);
        RectF rectF = this.iBlur3PositionMainTabs;
        rectF.set(0.0f, iDp2, this.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        downscaleScrollableNoiseSuppressor.setupRenderNodes(this.hasMainTabs ? 2 : 1, this.iBlur3Positions);
        downscaleScrollableNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    @Override
    public final boolean canParentTabsSlide(MotionEvent motionEvent, boolean z) {
        return true;
    }

    public final void checkUi_listClip() {
        if (this.listView.hasActiveEdgeEffects()) {
            this.listView.setClipBounds(null);
            return;
        }
        int i = this.ADDITIONAL_LIST_HEIGHT_DP;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i);
        int measuredWidth = this.listView.getMeasuredWidth();
        int measuredHeight2 = this.listView.getMeasuredHeight() - AndroidUtilities.dp(i);
        Rect rect = this.tmpClipRect;
        rect.set(0, measuredHeight, measuredWidth, measuredHeight2);
        this.listView.setClipBounds(rect);
    }

    public final void checkUi_listViewPadding() {
        UniversalRecyclerView universalRecyclerView = this.listView;
        int i = this.ADDITIONAL_LIST_HEIGHT_DP;
        universalRecyclerView.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i) + ((int) this.topPanelLayout.getAnimatedHeightWithPadding(AndroidUtilities.dp(14.0f))), 0, AndroidUtilities.dp(i) + this.navigationBarHeight + this.additionNavigationBarHeight);
        this.emptyView.setPadding(0, 0, 0, this.navigationBarHeight + this.additionNavigationBarHeight);
    }

    @Override
    public final ActionBar createActionBar(Context context) {
        ActionBar actionBarCreateActionBar = super.createActionBar(context);
        actionBarCreateActionBar.useContainerForTitles = true;
        if (actionBarCreateActionBar.titlesContainer == null) {
            PhotoViewer.AnonymousClass19 anonymousClass19 = new PhotoViewer.AnonymousClass19(actionBarCreateActionBar.getContext(), 1);
            actionBarCreateActionBar.titlesContainer = anonymousClass19;
            actionBarCreateActionBar.addView(anonymousClass19);
        }
        if (actionBarCreateActionBar.additionalSubTitleOverlayContainer == null) {
            ActionBar.AnonymousClass9 anonymousClass9 = new ActionBar.AnonymousClass9(actionBarCreateActionBar, actionBarCreateActionBar.getContext(), actionBarCreateActionBar.resourcesProvider, actionBarCreateActionBar.ellipsizeSpanAnimator);
            actionBarCreateActionBar.additionalSubTitleOverlayContainer = anonymousClass9;
            anonymousClass9.setClipChildren(false);
            actionBarCreateActionBar.addView(actionBarCreateActionBar.additionalSubTitleOverlayContainer);
        }
        actionBarCreateActionBar.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        actionBarCreateActionBar.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(2.0f));
        actionBarCreateActionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        actionBarCreateActionBar.setAddToContainer(false);
        return actionBarCreateActionBar;
    }

    @Override
    public final View createView(Context context) {
        int i = 0;
        int i2 = 1;
        if (!this.hasMainTabs) {
            zzkt.m(this.actionBar);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calls));
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass1(this, i));
        ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(10, R.drawable.ic_ab_other);
        this.otherItem = actionBarMenuItemAddItem;
        actionBarMenuItemAddItem.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.otherItem.setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda2(this, i));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(getParentActivity(), getCurrentAccount(), getClassGuid(), new CallLogActivity$$ExternalSyntheticLambda3(this, i), new CallLogActivity$$ExternalSyntheticLambda4(this), new CallLogActivity$$ExternalSyntheticLambda4(this), getResourceProvider());
        this.listView = universalRecyclerView;
        int i3 = Theme.key_windowBackgroundGray;
        universalRecyclerView.setBackgroundColor(Theme.getColor(i3, this.resourceProvider));
        this.listView.setSections();
        this.listView.adapter.applyBackground = false;
        this.contentView = new LoginActivity.AnonymousClass2(this, context, i2);
        ViewPositionWatcher viewPositionWatcher = new ViewPositionWatcher(this.contentView);
        LoginActivity.AnonymousClass2 anonymousClass2 = this.contentView;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = this.iBlur3FactoryLiquidGlass;
        blurredBackgroundDrawableViewFactory.viewPositionWatcher = viewPositionWatcher;
        blurredBackgroundDrawableViewFactory.parent = anonymousClass2;
        UniversalRecyclerView universalRecyclerView2 = this.listView;
        Objects.requireNonNull(universalRecyclerView2);
        this.iBlur3Capture = new ViewGroupPartRenderer(universalRecyclerView2, anonymousClass2, new TopicsFragment$$ExternalSyntheticLambda7(universalRecyclerView2, 1));
        this.listView.addEdgeEffectListener(new CallLogActivity$$ExternalSyntheticLambda7(this, i));
        LoginActivity.AnonymousClass2 anonymousClass3 = this.contentView;
        this.fragmentView = anonymousClass3;
        anonymousClass3.setBackgroundColor(Theme.getColor(null, i3, false));
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
        this.flickerLoadingView = flickerLoadingView;
        flickerLoadingView.setViewType(8);
        this.flickerLoadingView.setBackgroundColor(Theme.getColor(null, i3, false));
        this.flickerLoadingView.showDate = false;
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(this, context, this.flickerLoadingView);
        this.emptyView = emptyTextProgressView;
        this.contentView.addView(emptyTextProgressView, LayoutHelper.createFrame(-1.0f, -1));
        this.listView.setClipToPadding(false);
        this.listView.setEmptyView(this.emptyView);
        UniversalRecyclerView universalRecyclerView3 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        universalRecyclerView3.setLayoutManager(linearLayoutManager);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = new RecyclerAnimationScrollHelper(this.listView, this.layoutManager);
        this.scrollHelper = recyclerAnimationScrollHelper;
        recyclerAnimationScrollHelper.scrollListener = new CallLogActivity$$ExternalSyntheticLambda4(this);
        LoginActivity.AnonymousClass2 anonymousClass4 = this.contentView;
        UniversalRecyclerView universalRecyclerView4 = this.listView;
        float f = -this.ADDITIONAL_LIST_HEIGHT_DP;
        anonymousClass4.addView(universalRecyclerView4, LayoutHelper.createFrame(-1, -1.0f, 3, 0.0f, f, 0.0f, f));
        this.listView.setOnScrollListener(new AnonymousClass3());
        if (this.loading) {
            this.emptyView.showProgress();
        } else {
            this.emptyView.showTextView();
        }
        FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider, false);
        this.floatingButton = fragmentFloatingButton;
        fragmentFloatingButton.imageView.setImageResource(R.drawable.filled_calls_plus);
        this.floatingButton.setContentDescription(LocaleController.getString(R.string.Call));
        this.floatingButton.setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda2(this, 3));
        this.contentView.addView(this.floatingButton, FragmentFloatingButton.createDefaultLayoutParams());
        DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout = new DialogsActivityTopPanelLayout(context);
        this.topPanelLayout = dialogsActivityTopPanelLayout;
        dialogsActivityTopPanelLayout.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        this.topPanelLayout.setOnAnimatedHeightChangedListener(new CallLogActivity$$ExternalSyntheticLambda7(this, i2));
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(this.topPanelLayout, BlurredBackgroundProviderImpl.topPanel(this.resourceProvider), false);
        blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(24.0f));
        blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(7.0f));
        this.topPanelLayout.setBlurredBackground(blurredBackgroundDrawableCreate);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentContextViewWrapper = frameLayout;
        this.topPanelLayout.addView(frameLayout);
        this.topPanelLayout.setViewVisible(this.fragmentContextViewWrapper, true, false);
        ?? r0 = new FragmentContextView(context, this, this.contentView, this.resourceProvider) {
            @Override
            public final void setVisibility(int i4) {
                CallLogActivity callLogActivity = CallLogActivity.this;
                callLogActivity.topPanelLayout.setViewVisible(callLogActivity.fragmentContextViewWrapper, i4 == 0, true);
            }
        };
        this.fragmentContextView = r0;
        this.fragmentContextViewWrapper.addView(r0);
        this.topPanelLayout.setCallFragmentContextView(this.fragmentContextView);
        this.contentView.addView(this.topPanelLayout, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        this.contentView.addView(this.actionBar);
        ChatActivity.AnonymousClass27 anonymousClass27 = new ChatActivity.AnonymousClass27(context, this.parentLayout);
        this.headerShadowView = anonymousClass27;
        ((BoolAnimator) anonymousClass27.this$0).setValue(false, false);
        this.contentView.addView(this.headerShadowView, LayoutHelper.createFrame(-1, 5, 48));
        this.actionBar.setDrawBlurBackground(this.contentView);
        this.actionBar.setAdaptiveBackground(this.listView);
        setBulletinDelegate(new ChatActivity.AnonymousClass103(this, i2));
        if (this.hasMainTabs) {
            View view = this.fragmentView;
            CallLogActivity$$ExternalSyntheticLambda4 callLogActivity$$ExternalSyntheticLambda4 = new CallLogActivity$$ExternalSyntheticLambda4(this);
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(view, callLogActivity$$ExternalSyntheticLambda4);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Long l;
        UniversalRecyclerView universalRecyclerView;
        int i3;
        ArrayList arrayList;
        TLRPC.User user;
        CallLogRow callLogRow;
        Object obj;
        ArrayList arrayList2;
        TLRPC.User user2;
        int i4 = NotificationCenter.didReceiveNewMessages;
        ArrayList arrayList3 = this.calls;
        int i5 = 0;
        boolean z = true;
        if (i != i4) {
            if (i == NotificationCenter.messagesDeleted) {
                if (this.firstLoaded && !((Boolean) objArr[2]).booleanValue()) {
                    ArrayList arrayList4 = (ArrayList) objArr[0];
                    Iterator it = arrayList3.iterator();
                    boolean z2 = false;
                    while (it.hasNext()) {
                        CallLogRow callLogRow2 = (CallLogRow) it.next();
                        Iterator it2 = callLogRow2.calls.iterator();
                        while (it2.hasNext()) {
                            if (arrayList4.contains(Integer.valueOf(((TLRPC.Message) it2.next()).id))) {
                                it2.remove();
                                z2 = true;
                            }
                        }
                        if (callLogRow2.calls.isEmpty()) {
                            it.remove();
                        }
                    }
                    if (!z2 || (universalRecyclerView = this.listView) == null) {
                        return;
                    }
                    universalRecyclerView.adapter.update(true);
                    return;
                }
                return;
            }
            if (i == NotificationCenter.activeGroupCallsUpdated) {
                this.activeGroupCalls = getMessagesController().getActiveGroupCalls();
                UniversalRecyclerView universalRecyclerView2 = this.listView;
                if (universalRecyclerView2 != null) {
                    universalRecyclerView2.adapter.update(true);
                    return;
                }
                return;
            }
            if (i != NotificationCenter.chatInfoDidLoad) {
                if (i == NotificationCenter.groupCallUpdated && (l = this.waitingForCallChatId) != null && l.equals((Long) objArr[0])) {
                    VoIPHelper.startCall(this.lastCallChat, null, false, null, getParentActivity(), this, getAccountInstance());
                    this.waitingForCallChatId = null;
                    return;
                }
                return;
            }
            Long l2 = this.waitingForCallChatId;
            if (l2 == null || ((TLRPC.ChatFull) objArr[0]).id != l2.longValue() || getMessagesController().getGroupCall(this.waitingForCallChatId.longValue(), true) == null) {
                return;
            }
            VoIPHelper.startCall(this.lastCallChat, null, false, null, getParentActivity(), this, getAccountInstance());
            this.waitingForCallChatId = null;
            return;
        }
        if (this.firstLoaded && !((Boolean) objArr[2]).booleanValue()) {
            ArrayList arrayList5 = (ArrayList) objArr[1];
            int size = arrayList5.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj2 = arrayList5.get(i6);
                int i7 = i6 + 1;
                MessageObject messageObject = (MessageObject) obj2;
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                int i8 = 3;
                if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                    long fromChatId = messageObject.getFromChatId();
                    long j = fromChatId == getUserConfig().getClientUserId() ? messageObject.messageOwner.peer_id.user_id : fromChatId;
                    int i9 = fromChatId == getUserConfig().getClientUserId() ? 0 : 1;
                    TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = messageObject.messageOwner.action.reason;
                    if (i9 == z && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                        i9 = 2;
                    }
                    if (i9 != 0 || (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                        i8 = i9;
                    }
                    if (arrayList3.isEmpty()) {
                        i3 = i7;
                        CallLogRow callLogRow3 = new CallLogRow();
                        ArrayList arrayList6 = callLogRow3.calls;
                        arrayList6.clear();
                        arrayList6.add(messageObject.messageOwner);
                        arrayList2 = callLogRow3.users;
                        arrayList2.clear();
                        user2 = getMessagesController().getUser(Long.valueOf(j));
                        if (user2 != null) {
                            arrayList2.add(user2);
                        }
                        callLogRow3.type = i8;
                        callLogRow3.video = messageObject.isVideoCall();
                        arrayList3.add(i5, callLogRow3);
                        this.listView.adapter.update(z);
                    } else {
                        CallLogRow callLogRow4 = (CallLogRow) arrayList3.get(i5);
                        ArrayList arrayList7 = callLogRow4.users;
                        if (arrayList7.size() == z) {
                            i3 = i7;
                            if (((TLRPC.User) arrayList7.get(i5)).id == j && callLogRow4.type == i8) {
                                callLogRow4.calls.add(i5, messageObject.messageOwner);
                            }
                        } else {
                            i3 = i7;
                        }
                        CallLogRow callLogRow5 = new CallLogRow();
                        ArrayList arrayList8 = callLogRow5.calls;
                        arrayList8.clear();
                        arrayList8.add(messageObject.messageOwner);
                        arrayList2 = callLogRow5.users;
                        arrayList2.clear();
                        user2 = getMessagesController().getUser(Long.valueOf(j));
                        if (user2 != null) {
                            arrayList2.add(user2);
                        }
                        callLogRow5.type = i8;
                        callLogRow5.video = messageObject.isVideoCall();
                        arrayList3.add(i5, callLogRow5);
                        this.listView.adapter.update(z);
                    }
                } else {
                    i3 = i7;
                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        long fromChatId2 = messageObject.getFromChatId();
                        Set<Long> set = (Set) Collection.EL.stream(tL_messageActionConferenceCall.other_participants).map(new GroupCallSheet$$ExternalSyntheticLambda3(1)).collect(Collectors.toSet());
                        set.add(Long.valueOf(fromChatId2 == getUserConfig().getClientUserId() ? messageObject.messageOwner.peer_id.user_id : fromChatId2));
                        int i10 = fromChatId2 == getUserConfig().getClientUserId() ? 0 : 1;
                        if (i10 == z && tL_messageActionConferenceCall.missed) {
                            i10 = 2;
                        }
                        i8 = (i10 == 0 && tL_messageActionConferenceCall.missed) ? 3 : i10;
                        if (arrayList3.isEmpty()) {
                            CallLogRow callLogRow6 = new CallLogRow();
                            callLogRow6.call_id = tL_messageActionConferenceCall.call_id;
                            ArrayList arrayList9 = callLogRow6.calls;
                            arrayList9.clear();
                            arrayList9.add(messageObject.messageOwner);
                            arrayList = callLogRow6.users;
                            arrayList.clear();
                            for (Long l3 : set) {
                                l3.getClass();
                                user = getMessagesController().getUser(l3);
                                if (user != null) {
                                    arrayList.add(user);
                                }
                            }
                            callLogRow6.type = i8;
                            callLogRow6.video = messageObject.isVideoCall();
                            arrayList3.add(0, callLogRow6);
                            this.listView.adapter.update(true);
                        } else {
                            int i11 = 0;
                            while (true) {
                                if (i11 >= arrayList3.size()) {
                                    callLogRow = null;
                                    break;
                                }
                                callLogRow = (CallLogRow) arrayList3.get(i11);
                                int i12 = i11;
                                if (callLogRow.call_id == tL_messageActionConferenceCall.call_id) {
                                    break;
                                } else {
                                    i11 = i12 + 1;
                                }
                            }
                            if (callLogRow != null) {
                                callLogRow.calls.add(i5, messageObject.messageOwner);
                                for (Long l4 : set) {
                                    long jLongValue = l4.longValue();
                                    ArrayList arrayList10 = callLogRow.users;
                                    int size2 = arrayList10.size();
                                    int i13 = 0;
                                    do {
                                        if (i13 >= size2) {
                                            TLRPC.User user3 = getMessagesController().getUser(l4);
                                            if (user3 == null) {
                                                break;
                                            }
                                            arrayList10.add(user3);
                                            break;
                                        }
                                        obj = arrayList10.get(i13);
                                        i13++;
                                    } while (jLongValue != ((TLRPC.User) obj).id);
                                }
                                this.listView.adapter.update(true);
                            } else {
                                CallLogRow callLogRow7 = new CallLogRow();
                                callLogRow7.call_id = tL_messageActionConferenceCall.call_id;
                                ArrayList arrayList11 = callLogRow7.calls;
                                arrayList11.clear();
                                arrayList11.add(messageObject.messageOwner);
                                arrayList = callLogRow7.users;
                                arrayList.clear();
                                while (r6.hasNext()) {
                                    l3.getClass();
                                    user = getMessagesController().getUser(l3);
                                    if (user != null) {
                                        arrayList.add(user);
                                    }
                                }
                                callLogRow7.type = i8;
                                callLogRow7.video = messageObject.isVideoCall();
                                arrayList3.add(0, callLogRow7);
                                this.listView.adapter.update(true);
                            }
                        }
                    }
                    i6 = i3;
                    i5 = 0;
                    z = true;
                }
                i6 = i3;
                i5 = 0;
                z = true;
            }
            ActionBarMenuItem actionBarMenuItem = this.otherItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(arrayList3.isEmpty() ? 8 : 0);
            }
        }
    }

    public final void getCalls(int i, int i2) {
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
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new CallLogActivity$$ExternalSyntheticLambda1(this, 0), 2), this.classGuid);
    }

    @Override
    public final BlurredBackgroundSourceRenderNode getGlassSource() {
        return this.iBlur3SourceGlass;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ChatActivity$$ExternalSyntheticLambda94 chatActivity$$ExternalSyntheticLambda94 = new ChatActivity$$ExternalSyntheticLambda94(this, 4);
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
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, null, new Drawable[]{null, null, Theme.calllog_msgCallUpRedDrawable, Theme.calllog_msgCallDownRedDrawable}, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, null, new Drawable[]{null, null, Theme.calllog_msgCallUpGreenDrawable, Theme.calllog_msgCallDownGreenDrawable}, null, Theme.key_fill_RedNormal));
        arrayList.add(new ThemeDescription(this.flickerLoadingView, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{ShadowSectionCell.class}, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        return arrayList;
    }

    public final void hideActionMode(boolean z) {
        CheckBox2 checkBox2;
        this.actionBar.hideActionMode$1();
        this.selectedIds.clear();
        int childCount = this.listView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.listView.getChildAt(i);
            if ((childAt instanceof CallCell) && (checkBox2 = ((CallCell) childAt).checkBox) != null) {
                checkBox2.checkBoxBase.setChecked(-1, false, z);
            }
        }
        this.listView.adapter.update(true);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$getCalls$20(TLObject tLObject, TLRPC.TL_error tL_error) {
        boolean z;
        boolean z2;
        TLRPC.messages_Messages messages_messages;
        int i;
        TLRPC.MessageAction messageAction;
        boolean z3;
        ArrayList arrayList;
        TLRPC.User user;
        CallLogRow callLogRow;
        CallLogRow callLogRow2;
        TLRPC.MessageAction messageAction2;
        boolean z4;
        ArrayList arrayList2;
        TLRPC.User user2;
        long jLongValue;
        ArrayList arrayList3;
        int size;
        int i2;
        TLRPC.User user3;
        Object obj;
        ArrayList arrayList4 = this.calls;
        int i3 = 1;
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(messages_messages2.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(messages_messages2.chats, false);
            this.endReached = messages_messages2.messages.isEmpty();
            CallLogRow callLogRow3 = !arrayList4.isEmpty() ? (CallLogRow) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList4) : null;
            int i4 = 0;
            while (i4 < messages_messages2.messages.size()) {
                TLRPC.Message message = messages_messages2.messages.get(i4);
                TLRPC.MessageAction messageAction3 = message.action;
                if (messageAction3 == null || (messageAction3 instanceof TLRPC.TL_messageActionHistoryClear)) {
                    messages_messages = messages_messages2;
                    i = i4;
                } else {
                    long fromChatId = MessageObject.getFromChatId(message);
                    if (fromChatId == getUserConfig().getClientUserId()) {
                        fromChatId = message.peer_id.user_id;
                    }
                    HashSet<Long> hashSet = new HashSet();
                    int i5 = MessageObject.getFromChatId(message) == getUserConfig().getClientUserId() ? 0 : 1;
                    TLRPC.MessageAction messageAction4 = message.action;
                    if (messageAction4 instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction4;
                        hashSet.add(Long.valueOf(fromChatId));
                        hashSet.addAll((java.util.Collection) Collection.EL.stream(tL_messageActionConferenceCall.other_participants).map(new GroupCallSheet$$ExternalSyntheticLambda3(1)).collect(Collectors.toSet()));
                        if (i5 == i3 && tL_messageActionConferenceCall.missed) {
                            i5 = 2;
                        }
                        int i6 = (i5 == 0 && tL_messageActionConferenceCall.missed) ? 3 : i5;
                        messages_messages = messages_messages2;
                        if (callLogRow3 != null) {
                            i = i4;
                            if (callLogRow3.call_id == tL_messageActionConferenceCall.call_id) {
                                callLogRow = callLogRow3;
                            }
                            if (callLogRow != null) {
                                callLogRow.calls.add(0, message);
                                for (Long l : hashSet) {
                                    jLongValue = l.longValue();
                                    arrayList3 = callLogRow.users;
                                    size = arrayList3.size();
                                    i2 = 0;
                                    do {
                                        if (i2 >= size) {
                                            user3 = getMessagesController().getUser(l);
                                            if (user3 == null) {
                                                break;
                                            }
                                            arrayList3.add(user3);
                                            break;
                                        }
                                        obj = arrayList3.get(i2);
                                        i2++;
                                    } while (jLongValue != ((TLRPC.User) obj).id);
                                }
                            } else {
                                if (callLogRow3 != null && !arrayList4.contains(callLogRow3)) {
                                    arrayList4.add(callLogRow3);
                                }
                                callLogRow2 = new CallLogRow();
                                callLogRow2.call_id = tL_messageActionConferenceCall.call_id;
                                ArrayList arrayList5 = callLogRow2.calls;
                                arrayList5.clear();
                                arrayList5.add(message);
                                for (Long l2 : hashSet) {
                                    l2.getClass();
                                    arrayList2 = callLogRow2.users;
                                    if (!Collection.EL.stream(arrayList2).noneMatch(new CallLogActivity$$ExternalSyntheticLambda27(fromChatId, 0)) && (user2 = getMessagesController().getUser(l2)) != null) {
                                        arrayList2.add(user2);
                                    }
                                }
                                callLogRow2.type = i6;
                                messageAction2 = message.action;
                                if (messageAction2 == null && messageAction2.video) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                callLogRow2.video = z4;
                                callLogRow3 = callLogRow2;
                            }
                        } else {
                            i = i4;
                        }
                        int i7 = 0;
                        while (true) {
                            if (i7 >= arrayList4.size()) {
                                callLogRow = null;
                                break;
                            }
                            callLogRow = (CallLogRow) arrayList4.get(i7);
                            int i8 = i7;
                            if (callLogRow.call_id == tL_messageActionConferenceCall.call_id) {
                                break;
                            } else {
                                i7 = i8 + 1;
                            }
                        }
                        if (callLogRow != null) {
                            callLogRow.calls.add(0, message);
                            while (r2.hasNext()) {
                                jLongValue = l.longValue();
                                arrayList3 = callLogRow.users;
                                size = arrayList3.size();
                                i2 = 0;
                                do {
                                    if (i2 >= size) {
                                        user3 = getMessagesController().getUser(l);
                                        if (user3 == null) {
                                            arrayList3.add(user3);
                                            break;
                                            break;
                                        } else {
                                            break;
                                            break;
                                        }
                                    }
                                    obj = arrayList3.get(i2);
                                    i2++;
                                } while (jLongValue != ((TLRPC.User) obj).id);
                            }
                        } else {
                            if (callLogRow3 != null) {
                                arrayList4.add(callLogRow3);
                            }
                            callLogRow2 = new CallLogRow();
                            callLogRow2.call_id = tL_messageActionConferenceCall.call_id;
                            ArrayList arrayList6 = callLogRow2.calls;
                            arrayList6.clear();
                            arrayList6.add(message);
                            while (r3.hasNext()) {
                                l2.getClass();
                                arrayList2 = callLogRow2.users;
                                if (!Collection.EL.stream(arrayList2).noneMatch(new CallLogActivity$$ExternalSyntheticLambda27(fromChatId, 0))) {
                                }
                            }
                            callLogRow2.type = i6;
                            messageAction2 = message.action;
                            if (messageAction2 == null) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            callLogRow2.video = z4;
                            callLogRow3 = callLogRow2;
                        }
                    } else {
                        messages_messages = messages_messages2;
                        i = i4;
                        hashSet.add(Long.valueOf(fromChatId));
                        TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = message.action.reason;
                        if (i5 == 1 && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                            i5 = 2;
                        }
                        int i9 = (i5 == 0 && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) ? 3 : i5;
                        if (callLogRow3 != null) {
                            ArrayList arrayList7 = callLogRow3.users;
                            if (hashSet.size() != arrayList7.size()) {
                                if (callLogRow3 != null && !arrayList4.contains(callLogRow3)) {
                                    arrayList4.add(callLogRow3);
                                }
                                callLogRow3 = new CallLogRow();
                                callLogRow3.calls.clear();
                                for (Long l3 : hashSet) {
                                    l3.getClass();
                                    arrayList = callLogRow3.users;
                                    if (!Collection.EL.stream(arrayList).noneMatch(new CallLogActivity$$ExternalSyntheticLambda27(fromChatId, 1)) && (user = getMessagesController().getUser(l3)) != null) {
                                        arrayList.add(user);
                                    }
                                }
                                callLogRow3.type = i9;
                                messageAction = message.action;
                                if (messageAction == null && messageAction.video) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                callLogRow3.video = z3;
                            } else {
                                int size2 = arrayList7.size();
                                int i10 = 0;
                                while (true) {
                                    if (i10 < size2) {
                                        Object obj2 = arrayList7.get(i10);
                                        i10++;
                                        if (!hashSet.contains(Long.valueOf(((TLRPC.User) obj2).id))) {
                                        }
                                    } else if (callLogRow3.type != i9) {
                                    }
                                    if (callLogRow3 != null) {
                                        arrayList4.add(callLogRow3);
                                    }
                                    callLogRow3 = new CallLogRow();
                                    callLogRow3.calls.clear();
                                    while (r2.hasNext()) {
                                        l3.getClass();
                                        arrayList = callLogRow3.users;
                                        if (!Collection.EL.stream(arrayList).noneMatch(new CallLogActivity$$ExternalSyntheticLambda27(fromChatId, 1))) {
                                        }
                                    }
                                    callLogRow3.type = i9;
                                    messageAction = message.action;
                                    if (messageAction == null) {
                                        z3 = false;
                                    } else {
                                        z3 = false;
                                    }
                                    callLogRow3.video = z3;
                                }
                            }
                        } else {
                            if (callLogRow3 != null) {
                                arrayList4.add(callLogRow3);
                            }
                            callLogRow3 = new CallLogRow();
                            callLogRow3.calls.clear();
                            while (r2.hasNext()) {
                                l3.getClass();
                                arrayList = callLogRow3.users;
                                if (!Collection.EL.stream(arrayList).noneMatch(new CallLogActivity$$ExternalSyntheticLambda27(fromChatId, 1))) {
                                }
                            }
                            callLogRow3.type = i9;
                            messageAction = message.action;
                            if (messageAction == null) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            callLogRow3.video = z3;
                        }
                        callLogRow3.calls.add(message);
                    }
                }
                i4 = i + 1;
                messages_messages2 = messages_messages;
                i3 = 1;
            }
            if (callLogRow3 != null && !callLogRow3.calls.isEmpty() && !arrayList4.contains(callLogRow3)) {
                arrayList4.add(callLogRow3);
            }
            z2 = false;
            z = true;
        } else {
            z = true;
            this.endReached = true;
            z2 = false;
        }
        this.loading = z2;
        if (!this.firstLoaded) {
            resumeDelayedFragmentAnimation();
        }
        this.firstLoaded = z;
        this.otherItem.setVisibility(arrayList4.isEmpty() ? 8 : 0);
        EmptyTextProgressView emptyTextProgressView = this.emptyView;
        if (emptyTextProgressView != null) {
            emptyTextProgressView.showTextView();
        }
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.adapter.update(true);
        }
    }

    public final void lambda$getThemeDescriptions$22() {
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
            actionBar.updateColors$1();
        }
    }

    public final void lambda$onCallClick$5(AlertDialog alertDialog, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, TLRPC.TL_error tL_error) {
        alertDialog.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            getMessagesController().putUsers(groupcall.users, false);
            getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                showDialog(new CreateGroupCallSheet(getParentActivity(), hashSet));
                return;
            } else {
                VoIPHelper.joinConference(getParentActivity(), this.currentAccount, tL_inputGroupCallInviteMessage, z, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            showDialog(new CreateGroupCallSheet(getParentActivity(), hashSet));
        } else if (tL_error != null) {
            BulletinFactory.of(this).showForError(false, tL_error);
        }
    }

    public final void lambda$onClick$10(AlertDialog alertDialog, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, TLRPC.TL_error tL_error) {
        alertDialog.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            getMessagesController().putUsers(groupcall.users, false);
            getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                showDialog(new CreateGroupCallSheet(getParentActivity(), hashSet));
                return;
            } else {
                VoIPHelper.joinConference(getParentActivity(), this.currentAccount, tL_inputGroupCallInviteMessage, z, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            showDialog(new CreateGroupCallSheet(getParentActivity(), hashSet));
        } else if (tL_error != null) {
            BulletinFactory.of(this).showForError(false, tL_error);
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
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
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.hideCallTabsHintWasShown || !getUserConfig().showCallsTab || MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) >= 2) {
            return;
        }
        HintView2 hintView2 = new HintView2(getParentActivity(), 1);
        this.hideCallTabsHintView = hintView2;
        hintView2.duration = 3000L;
        hintView2.setJoint(1.0f, -25.0f);
        this.hideCallTabsHintView.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        this.hideCallTabsHintView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.TapToHideCallsTab)));
        this.contentView.addView(this.hideCallTabsHintView, LayoutHelper.createFrame(-1, 80, 48));
        this.hideCallTabsHintView.setTranslationY((ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(16.0f));
        this.hideCallTabsHintView.show();
        this.hideCallTabsHintWasShown = true;
        MessagesController.getGlobalMainSettings().edit().putInt("hidecallshint", MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) + 1).apply();
    }

    public final void onClick$7(UItem uItem, View view) {
        int i = uItem.id;
        if (i == 2) {
            setCallsTabVisible(true);
            Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of(this).createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasShownTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new CallLogActivity$$ExternalSyntheticLambda7(this, 4));
            bulletinCreateSimpleBulletin.duration = 5000;
            bulletinCreateSimpleBulletin.show();
            return;
        }
        if (i == 1) {
            presentFragment(new AnonymousClass9(zzkw.m("isCall", true), getCurrentAccount(), this));
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
        long j = callLogRow.call_id;
        ArrayList arrayList = callLogRow.calls;
        if (j == 0 || arrayList.isEmpty()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", MessageObject.getDialogId((TLRPC.Message) arrayList.get(0)));
            bundle2.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).id);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            presentFragment(new ChatActivity(bundle2), this.needFinishFragment);
            return;
        }
        boolean z = callLogRow.video;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = callLogRow.users;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            hashSet.add(Long.valueOf(((TLRPC.User) obj2).id));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).id;
        AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3, null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = getMessagesController().conferenceCallSizeLimit;
        alertDialog.setOnCancelListener(new CallLogActivity$$ExternalSyntheticLambda19(this, getConnectionsManager().sendRequest(getgroupcall, new CallLogActivity$$ExternalSyntheticLambda18(this, alertDialog, hashSet, tL_inputGroupCallInviteMessage, z, 0)), 0));
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 600L);
    }

    @Override
    public final boolean onFragmentCreate() {
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
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().removeObserver(this, NotificationCenter.messagesDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.activeGroupCallsUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.navigationBarHeight = i4;
        checkUi_listViewPadding();
        this.floatingButton.setTranslationY(((-this.navigationBarHeight) - this.additionFloatingButtonOffset) - this.additionalFloatingTranslation);
    }

    @Override
    public final void onParentScrollToTop() {
        if (this.layoutManager.findFirstVisibleItemPosition() < 15) {
            this.listView.smoothScrollToPosition(0);
            return;
        }
        RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = this.scrollHelper;
        recyclerAnimationScrollHelper.scrollDirection = 1;
        recyclerAnimationScrollHelper.scrollToPosition(0, 0, false, false);
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
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
                VoIPHelper.permissionDenied(i, getParentActivity(), null);
            } else if (i == 103) {
                VoIPHelper.startCall(this.lastCallChat, null, false, null, getParentActivity(), this, getAccountInstance());
            } else {
                TLRPC.UserFull userFull = this.lastCallUser != null ? getMessagesController().getUserFull(this.lastCallUser.id) : null;
                VoIPHelper.startCall(this.lastCallUser, i == 102, i == 102 || (userFull != null && userFull.video_calls_available), getParentActivity(), null, getAccountInstance());
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.adapter.update(true);
        }
    }

    public final void setCallsTabVisible(boolean z) {
        if (z == getUserConfig().showCallsTab) {
            return;
        }
        getUserConfig().setShowCallsTab(z);
        this.listView.adapter.update(true);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    public final void showDeleteAlert(boolean z) {
        int i = 1;
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        AlertDialog alertDialog = builder.alertDialog;
        if (z) {
            alertDialog.title = LocaleController.getString(R.string.DeleteAllCalls);
            alertDialog.message = LocaleController.getString(R.string.DeleteAllCallsText);
        } else {
            alertDialog.title = LocaleController.getString(R.string.DeleteCalls);
            alertDialog.message = LocaleController.getString(R.string.DeleteSelectedCallsText);
        }
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        CheckBoxCell checkBoxCell = new CheckBoxCell(getParentActivity(), 1);
        checkBoxCell.setBackground(Theme.getSelectorDrawable(false));
        checkBoxCell.setText(LocaleController.getString(R.string.DeleteCallsForEveryone), "", false, false, false);
        checkBoxCell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(8.0f), 0);
        frameLayout.addView(checkBoxCell, LayoutHelper.createFrame(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        checkBoxCell.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda342(i, zArr));
        builder.setView(frameLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new LoginActivity$$ExternalSyntheticLambda31(this, z, zArr, 5));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog);
        TextView textView = (TextView) alertDialog.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public final void showOrUpdateActionMode() {
        int i = 2;
        boolean zIsActionModeShowed = this.actionBar.isActionModeShowed();
        ArrayList arrayList = this.selectedIds;
        boolean z = true;
        if (!zIsActionModeShowed) {
            boolean zActionModeIsExist = this.actionBar.actionModeIsExist(null);
            ArrayList arrayList2 = this.actionModeViews;
            if (!zActionModeIsExist) {
                ActionBar.AnonymousClass1 anonymousClass1CreateActionMode = this.actionBar.createActionMode(null);
                if (this.hasMainTabs) {
                    ImageView imageView = new ImageView(getParentActivity());
                    this.actionModeCloseView = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    this.actionModeCloseView.setImageDrawable(new BackDrawable(true));
                    this.actionModeCloseView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_actionBarActionModeDefaultIcon), PorterDuff.Mode.MULTIPLY));
                    this.actionModeCloseView.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), 1, -1));
                    this.actionModeCloseView.setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda2(this, i));
                    anonymousClass1CreateActionMode.addView(this.actionModeCloseView, LayoutHelper.createLinear(54, 54, 16));
                    arrayList2.add(this.actionModeCloseView);
                }
                NumberTextView numberTextView = new NumberTextView(anonymousClass1CreateActionMode.getContext());
                this.selectedDialogsCountTextView = numberTextView;
                numberTextView.setTextSize(18);
                this.selectedDialogsCountTextView.setTypeface(AndroidUtilities.bold());
                this.selectedDialogsCountTextView.setTextColor(Theme.getColor(null, Theme.key_actionBarActionModeDefaultIcon, false));
                anonymousClass1CreateActionMode.addView(this.selectedDialogsCountTextView, LayoutHelper.createLinear(1.0f, 0, -1, this.hasMainTabs ? 18 : 72, 0, 0));
                this.selectedDialogsCountTextView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
                arrayList2.add(anonymousClass1CreateActionMode.addItemWithWidth(2, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f)));
            }
            this.actionBar.showActionMode(null, null);
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList3 = new ArrayList();
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                View view = (View) arrayList2.get(i2);
                view.setPivotY(ActionBar.getCurrentActionBarHeight() / 2.0f);
                AndroidUtilities.clearDrawableAnimation(view);
                arrayList3.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
            }
            animatorSet.playTogether(arrayList3);
            animatorSet.setDuration(200L);
            animatorSet.start();
            z = false;
        } else if (arrayList.isEmpty()) {
            hideActionMode(true);
            return;
        }
        this.selectedDialogsCountTextView.setNumber(arrayList.size(), z);
    }

    public CallLogActivity(Bundle bundle) {
        super(bundle);
        int i = Build.VERSION.SDK_INT;
        this.ADDITIONAL_LIST_HEIGHT_DP = i >= 31 ? 48 : 0;
        this.needFinishFragment = true;
        this.actionModeViews = new ArrayList();
        this.calls = new ArrayList();
        this.selectedIds = new ArrayList();
        this.hideCallTabsHintWasShown = false;
        this.tmpClipRect = new Rect();
        ArrayList arrayList = new ArrayList();
        this.iBlur3Positions = arrayList;
        RectF rectF = new RectF();
        this.iBlur3PositionActionBar = rectF;
        RectF rectF2 = new RectF();
        this.iBlur3PositionMainTabs = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
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
}
