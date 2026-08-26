package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.Insets;
import androidx.core.util.AtomicFile;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.AudioBecomingNoisyManager$AudioBecomingNoisyReceiver;
import com.google.android.exoplayer2.ExoPlayerImpl;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.MediaCodecInfo;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wearable.zzy;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform;
import com.google.gson.internal.ObjectConstructor;
import com.google.mlkit.common.sdkinternal.Cleaner;
import com.google.mlkit.common.sdkinternal.zzd;
import com.google.zxing.BinaryBitmap;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import org.commonmark.internal.InlineParserImpl;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.InlineParserFactory;
import org.commonmark.parser.Parser;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.video.remix.AudioRemixer;
import org.telegram.messenger.video.resample.AudioResampler;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MentionsContainerView;
import org.telegram.ui.Components.MessagePreviewView;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.Icon3D;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.ScrimOptions;
import org.telegram.ui.Components.SeekBar;
import org.telegram.ui.Components.SeekBarView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Components.VideoPlayerSeekBar;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.blur3.Blur3HashImpl;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.RenderNodeWithHash;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.glass.GlassTabView;
import org.telegram.ui.ReportBottomSheet.Page;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.recorder.CaptionContainerView;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.community.CommunitySheet;
import org.telegram.ui.iv.BlockRow;
import org.telegram.ui.iv.RichAudioCell;
import org.telegram.ui.iv.RichCaptionController;
import org.telegram.ui.iv.RichEditText;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichEditorHistory;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichMapCell;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.MHTML;

public final class PollItemMenu extends Dialog {
    public Bitmap blurBitmap;
    public Paint blurBitmapPaint;
    public BitmapShader blurBitmapShader;
    public Matrix blurMatrix;
    public ChatMessageCell cell;
    public float clipBottom;
    public float clipTop;
    public final AnonymousClass1 containerView;
    public final Activity context;
    public ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda8 dismissListener;
    public boolean dismissing;
    public boolean dismissingWithAlpha;
    public float dty1;
    public float dty2;
    public boolean hasDestTranslation;
    public boolean hasTranslation;
    public final TextView hintTextView;
    public final BlurredBackgroundDrawableViewFactory iBlur3Factory;
    public final BlurredBackgroundSourceBitmap iBlur3SourceBitmap;
    public Insets insets;
    public boolean isOut;
    public final AnonymousClass1 menuContainer;
    public MessageObject messageObject;
    public ViewGroup messageOptionsView;
    public float messageOptionsViewMaxWidth;
    public AnonymousClass9 myCell;
    public AnonymousClass7 myTaskCell;
    public ValueAnimator open2Animator;
    public ValueAnimator openAnimator;
    public float openProgress;
    public float openProgress2;
    public boolean pollVoted;
    public ReactionsContainerLayout reactionsView;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean setTaskInvisible;
    public final MessagePreviewView.TabsView tabsView;
    public byte[] taskId;
    public ViewGroup taskOptionsView;
    public float taskOptionsViewMaxWidth;
    public float tx;
    public float ty;
    public final AnonymousClass3 viewPager;
    public final AnonymousClass1 windowView;

    public final class AnonymousClass3 extends ViewPagerFixed {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass3(Object obj, Context context, int i) {
            super(context, null);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public boolean canScroll(MotionEvent motionEvent) {
            int i;
            int childAdapterPosition;
            switch (this.$r8$classId) {
                case 1:
                    ChatActivity.AnonymousClass38 anonymousClass38 = ((ChatActivity) this.this$0).hashtagSearchTabs;
                    return anonymousClass38 != null && anonymousClass38.shownT > 0.5f;
                case 6:
                    StoryPrivacyBottomSheet storyPrivacyBottomSheet = (StoryPrivacyBottomSheet) this.this$0;
                    View currentView = storyPrivacyBottomSheet.viewPager.getCurrentView();
                    if (!(currentView instanceof StoryPrivacyBottomSheet.Page)) {
                        return true;
                    }
                    if (getCurrentPosition() > 0) {
                        storyPrivacyBottomSheet.closeKeyboard();
                        return true;
                    }
                    StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) currentView;
                    if (page.pageType != 0 || motionEvent == null) {
                        i = -1;
                    } else {
                        View viewFindChildViewUnder = page.listView.findChildViewUnder(motionEvent.getX(), motionEvent.getY() - page.contentView.getPaddingTop());
                        if (viewFindChildViewUnder != null && (childAdapterPosition = RecyclerView.getChildAdapterPosition(viewFindChildViewUnder)) >= 0) {
                            ArrayList arrayList = page.items;
                            if (childAdapterPosition >= arrayList.size()) {
                                i = -1;
                            } else {
                                StoryPrivacyBottomSheet.ItemInner itemInner = (StoryPrivacyBottomSheet.ItemInner) arrayList.get(childAdapterPosition);
                                if (itemInner.viewType != 3 || itemInner.sendAs) {
                                    i = -1;
                                } else {
                                    boolean z = LocaleController.isRTL;
                                    float x = motionEvent.getX();
                                    if (!z ? x > AndroidUtilities.dp(100.0f) : x < page.getWidth() - AndroidUtilities.dp(100.0f)) {
                                        i = -1;
                                    } else {
                                        i = itemInner.type;
                                    }
                                }
                            }
                        } else {
                            i = -1;
                        }
                    }
                    if (i != -1) {
                        storyPrivacyBottomSheet.activePage = i;
                        if (i == 3) {
                            if (!storyPrivacyBottomSheet.selectedContacts.isEmpty() && !storyPrivacyBottomSheet.selectedContactsByGroup.isEmpty()) {
                                storyPrivacyBottomSheet.selectedType = i;
                            }
                        } else if (i != 4) {
                            storyPrivacyBottomSheet.selectedType = i;
                        } else if (!storyPrivacyBottomSheet.excludedEveryone.isEmpty() && !storyPrivacyBottomSheet.excludedEveryoneByGroup.isEmpty()) {
                            storyPrivacyBottomSheet.selectedType = i;
                        }
                        page.updateCheckboxes$1(true);
                        page.updateButton(true);
                    }
                    if (i != -1) {
                        storyPrivacyBottomSheet.closeKeyboard();
                    }
                    return i != -1;
                default:
                    return super.canScroll(motionEvent);
            }
        }

        @Override
        public boolean canScrollBackward(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 8:
                    return getCurrentPosition() != 2;
                default:
                    return super.canScrollBackward(motionEvent);
            }
        }

        @Override
        public boolean canScrollForward(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 3:
                    return false;
                case 8:
                    return false;
                default:
                    return super.canScrollForward(motionEvent);
            }
        }

        @Override
        public void onItemSelected(View view, View view2, int i, int i2) {
            switch (this.$r8$classId) {
                case 6:
                    StoryPrivacyBottomSheet storyPrivacyBottomSheet = (StoryPrivacyBottomSheet) this.this$0;
                    if (((BottomSheet) storyPrivacyBottomSheet).keyboardVisible) {
                        storyPrivacyBottomSheet.closeKeyboard();
                    }
                    break;
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 4:
                    super.onLayout(z, i, i2, i3, i4);
                    StatisticActivity.access$300((StatisticActivity) this.this$0);
                    break;
                default:
                    super.onLayout(z, i, i2, i3, i4);
                    break;
            }
        }

        @Override
        public void onScrollEnd() {
            switch (this.$r8$classId) {
                case 4:
                    StatisticActivity statisticActivity = (StatisticActivity) this.this$0;
                    statisticActivity.selectTab(statisticActivity.viewPagerFixed.getCurrentPosition(), true);
                    for (int i = 0; i < statisticActivity.tabs.length; i++) {
                        float fMax = Math.max(0.0f, 1.0f - Math.abs(i - 0.0f));
                        GlassTabView glassTabView = statisticActivity.tabs[i];
                        glassTabView.gestureSelectedOverride = fMax;
                        glassTabView.hasGestureSelectedOverride = false;
                        glassTabView.invalidate();
                    }
                    statisticActivity.tabsView.invalidate();
                    StatisticActivity.access$200(statisticActivity);
                    break;
                case 8:
                    if (getCurrentPosition() == 1) {
                        ((CommunitySheet) this.this$0).communityPage.listView.adapter.update(false);
                    }
                    break;
            }
        }

        @Override
        public void onStartTracking() {
            ReportBottomSheet.Page.AnonymousClass2 anonymousClass2;
            switch (this.$r8$classId) {
                case 3:
                    if ((getCurrentView() instanceof ReportBottomSheet.Page) && (anonymousClass2 = ((ReportBottomSheet.Page) getCurrentView()).editTextCell) != null) {
                        AndroidUtilities.hideKeyboard(anonymousClass2);
                        break;
                    }
                    break;
            }
        }

        @Override
        public final void onTabAnimationUpdate(boolean z) {
            switch (this.$r8$classId) {
                case 0:
                    ((PollItemMenu) this.this$0).updateTranslation();
                    break;
                case 1:
                    ChatActivity chatActivity = (ChatActivity) this.this$0;
                    chatActivity.contentView.getClass();
                    chatActivity.contentView.getClass();
                    chatActivity.checkUi_backgroundViewVisible();
                    chatActivity.invalidateMergedVisibleBlurredPositionsAndSources$1(1);
                    break;
                case 2:
                    PeerColorActivity peerColorActivity = (PeerColorActivity) this.this$0;
                    peerColorActivity.tabsView.setSelected(peerColorActivity.viewPager.getPositionAnimated());
                    peerColorActivity.colorBar.setProgressToGradient(1.0f - peerColorActivity.viewPager.getPositionAnimated());
                    break;
                case 3:
                    ((BottomSheet) ((ReportBottomSheet) this.this$0)).containerView.invalidate();
                    break;
                case 4:
                    boolean z2 = !z;
                    StatisticActivity statisticActivity = (StatisticActivity) this.this$0;
                    float positionAnimated = statisticActivity.viewPagerFixed.getPositionAnimated();
                    for (int i = 0; i < statisticActivity.tabs.length; i++) {
                        float fMax = Math.max(0.0f, 1.0f - Math.abs(i - positionAnimated));
                        GlassTabView glassTabView = statisticActivity.tabs[i];
                        glassTabView.gestureSelectedOverride = fMax;
                        glassTabView.hasGestureSelectedOverride = z2;
                        glassTabView.invalidate();
                    }
                    statisticActivity.tabsView.invalidate();
                    if (!z) {
                        statisticActivity.selectTab(Math.round(positionAnimated), true);
                    }
                    StatisticActivity.access$200(statisticActivity);
                    StatisticActivity.access$300(statisticActivity);
                    break;
                case 5:
                    EmojiBottomSheet emojiBottomSheet = (EmojiBottomSheet) this.this$0;
                    AnonymousClass3 anonymousClass3 = emojiBottomSheet.viewPager;
                    EmojiBottomSheet.TabsView tabsView = emojiBottomSheet.tabsView;
                    if (tabsView != null) {
                        tabsView.type = anonymousClass3.getPositionAnimated();
                        tabsView.invalidate();
                    }
                    ((BottomSheet) emojiBottomSheet).containerView.invalidate();
                    invalidate();
                    EmojiBottomSheet.savedPosition = anonymousClass3.getCurrentPosition();
                    break;
                case 6:
                    ((BottomSheet) ((StoryPrivacyBottomSheet) this.this$0)).containerView.invalidate();
                    break;
                case 7:
                    ((TodoItemMenu) this.this$0).updateTranslation();
                    break;
                default:
                    ((BottomSheet) ((CommunitySheet) this.this$0)).containerView.invalidate();
                    break;
            }
        }

        @Override
        public void onTabScrollEnd(int i) {
            switch (this.$r8$classId) {
                case 1:
                    if (i == 0) {
                        ChatActivity chatActivity = (ChatActivity) this.this$0;
                        if (chatActivity.requestClearSearchPages) {
                            chatActivity.requestClearSearchPages = false;
                            chatActivity.searchViewPager.viewsByType.clear();
                        }
                    }
                    break;
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 1:
                    return false;
                default:
                    return super.onTouchEvent(motionEvent);
            }
        }

        public AnonymousClass3(Context context, Theme.ResourcesProvider resourcesProvider, ChatActivity chatActivity) {
            super(context, resourcesProvider);
            this.$r8$classId = 1;
            this.this$0 = chatActivity;
        }
    }

    public final class AnonymousClass4 extends ViewPagerFixed.Adapter {
        public final int $r8$classId;
        public final Object this$0;
        public final Object val$context;

        public AnonymousClass4(Object obj, Context context, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.val$context = context;
        }

        @Override
        public final void bindView(View view, int i, int i2) {
            StarGiftSheet.ContainerView containerView;
            BaseFragment baseFragment;
            Object obj = this.this$0;
            switch (this.$r8$classId) {
                case 0:
                case 1:
                    break;
                case 2:
                    ((ReportBottomSheet.Page) view).bind(i2);
                    break;
                case 3:
                    StarGiftSheet starGiftSheet = (StarGiftSheet) obj;
                    if (i2 == 0) {
                        StarGiftSheet.access$1200(starGiftSheet, false);
                        StarGiftSheet.AnonymousClass9 anonymousClass9 = starGiftSheet.left;
                        if (anonymousClass9 != null) {
                            containerView = ((StarGiftSheet) anonymousClass9).container;
                        }
                    } else if (i2 == 2) {
                        StarGiftSheet.access$1200(starGiftSheet, true);
                        StarGiftSheet.AnonymousClass9 anonymousClass10 = starGiftSheet.right;
                        if (anonymousClass10 != null) {
                            containerView = ((StarGiftSheet) anonymousClass10).container;
                        }
                    }
                    FrameLayout frameLayout = (FrameLayout) view;
                    frameLayout.removeAllViews();
                    AndroidUtilities.removeFromParent(containerView);
                    frameLayout.addView(containerView);
                    break;
                case 4:
                    break;
                default:
                    ViewPagerActivity viewPagerActivity = (ViewPagerActivity) obj;
                    SparseArray sparseArray = viewPagerActivity.fragmentsArr;
                    ViewPagerActivity.FragmentState fragmentState = (ViewPagerActivity.FragmentState) sparseArray.get(i);
                    if (fragmentState != null) {
                        baseFragment = fragmentState.fragment;
                    } else {
                        BaseFragment baseFragmentCreateBaseFragmentAt = viewPagerActivity.createBaseFragmentAt(i);
                        ViewPagerActivity.FragmentState fragmentState2 = new ViewPagerActivity.FragmentState(baseFragmentCreateBaseFragmentAt);
                        sparseArray.put(i, fragmentState2);
                        baseFragment = baseFragmentCreateBaseFragmentAt;
                        fragmentState = fragmentState2;
                    }
                    if (!fragmentState.onCreateCalled) {
                        baseFragment.onFragmentCreate();
                        fragmentState.onCreateCalled = true;
                    }
                    baseFragment.setParentLayout(viewPagerActivity.getParentLayout());
                    if (baseFragment.getFragmentView() == null) {
                        baseFragment.performCreateView((Context) this.val$context);
                        baseFragment.setTitleOverlayText(viewPagerActivity.titleOverlay, viewPagerActivity.titleOverlayId, viewPagerActivity.titleOverlayAction);
                    }
                    FrameLayout frameLayout2 = (FrameLayout) view;
                    frameLayout2.removeAllViews();
                    View fragmentView = baseFragment.getFragmentView();
                    AndroidUtilities.removeFromParent(fragmentView);
                    if (!baseFragment.hasOwnBackground() && fragmentView.getBackground() == null) {
                        fragmentView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    }
                    frameLayout2.addView(fragmentView, LayoutHelper.createFrame(-1.0f, -1));
                    if (baseFragment.getActionBar() != null && baseFragment.getActionBar().addToContainer) {
                        AndroidUtilities.removeFromParent(baseFragment.getActionBar());
                        frameLayout2.addView(baseFragment.getActionBar());
                    }
                    WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                    ViewCompat.Api20Impl.requestApplyInsets(frameLayout2);
                    viewPagerActivity.checkSystemBarColors();
                    viewPagerActivity.checkFragmentsVisibility();
                    break;
            }
        }

        @Override
        public final View createView(int i) {
            StarGiftSheet.ContainerView containerView;
            switch (this.$r8$classId) {
                case 0:
                    FrameLayout frameLayout = new FrameLayout((Activity) this.val$context);
                    frameLayout.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda4(this, 22));
                    return frameLayout;
                case 1:
                    return i == 0 ? ((BoostViaGiftsBottomSheet) this.val$context).getContainerView() : ((SelectorBottomSheet) this.this$0).getContainerView();
                case 2:
                    return ((ReportBottomSheet) this.this$0).new Page((Context) this.val$context);
                case 3:
                    StarGiftSheet starGiftSheet = (StarGiftSheet) this.this$0;
                    if (i == 0) {
                        StarGiftSheet.access$1200(starGiftSheet, false);
                        StarGiftSheet.AnonymousClass9 anonymousClass9 = starGiftSheet.left;
                        if (anonymousClass9 == null) {
                            return null;
                        }
                        containerView = ((StarGiftSheet) anonymousClass9).container;
                    } else if (i == 1) {
                        containerView = starGiftSheet.container;
                    } else {
                        if (i != 2) {
                            return null;
                        }
                        StarGiftSheet.access$1200(starGiftSheet, true);
                        StarGiftSheet.AnonymousClass9 anonymousClass10 = starGiftSheet.right;
                        if (anonymousClass10 == null) {
                            return null;
                        }
                        containerView = ((StarGiftSheet) anonymousClass10).container;
                    }
                    AndroidUtilities.removeFromParent(containerView);
                    FrameLayout frameLayout2 = new FrameLayout((Context) this.val$context);
                    frameLayout2.addView(containerView, LayoutHelper.createFrame(-1, -1, 119));
                    return frameLayout2;
                case 4:
                    FrameLayout frameLayout3 = new FrameLayout((Activity) this.val$context);
                    frameLayout3.setOnClickListener(new TodoItemMenu$$ExternalSyntheticLambda13(this, 29));
                    return frameLayout3;
                default:
                    return new TopicsFragment.AnonymousClass14((Context) this.val$context, 10);
            }
        }

        @Override
        public final int getItemCount() {
            switch (this.$r8$classId) {
                case 0:
                    return 2;
                case 1:
                    return 2;
                case 2:
                    return 5;
                case 3:
                    StarGiftSheet starGiftSheet = (StarGiftSheet) this.this$0;
                    return (starGiftSheet.hasNeighbour(true) ? 1 : 0) + (starGiftSheet.hasNeighbour(false) ? 1 : 0) + 1;
                case 4:
                    return 2;
                default:
                    ((ViewPagerActivity) this.this$0).getClass();
                    return 4;
            }
        }

        @Override
        public int getItemViewType(int i) {
            switch (this.$r8$classId) {
                case 1:
                    return i;
                case 2:
                    return i == 0 ? 0 : 1;
                case 3:
                    return (i - (((StarGiftSheet) this.this$0).hasNeighbour(false) ? 1 : 0)) + 1;
                default:
                    return super.getItemViewType(i);
            }
        }

        public AnonymousClass4(BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, SelectorBottomSheet selectorBottomSheet) {
            this.$r8$classId = 1;
            this.val$context = boostViaGiftsBottomSheet;
            this.this$0 = selectorBottomSheet;
        }

        private final void bindView$org$telegram$ui$Components$Premium$boosts$BoostPagerBottomSheet$2(View view, int i, int i2) {
        }

        private final void bindView$org$telegram$ui$PollItemMenu$4(View view, int i, int i2) {
        }

        private final void bindView$org$telegram$ui$TodoItemMenu$4(View view, int i, int i2) {
        }
    }

    public final class AnonymousClass6 implements SeekBarView.SeekBarViewDelegate, RenderNodeWithHash.Renderer, CountrySelectActivity.CountrySelectActivityDelegate, PhotoPickerActivity.PhotoPickerActivitySearchDelegate, OnApplyWindowInsetsListener, VideoPlayerSeekBar.SeekBarDelegate, ShareAlert.ShareAlertDelegate, MentionsContainerView.Delegate, VideoPlayer.VideoPlayerDelegate, SeekBar.SeekBarDelegate, AlertsCreator.ScheduleDatePickerDelegate, RichCaptionController.Host, CameraScanActivity.CameraScanActivityDelegate {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass6(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public void addEmojiToRecent(String str) {
        }

        @Override
        public TextSelectionHelper.ArticleSelectableView cell() {
            return (RichMapCell) this.this$0;
        }

        @Override
        public BlockRow currentRow() {
            return ((RichMapCell) this.this$0).currentRow;
        }

        @Override
        public void didCopy() {
            StickersActivity stickersActivity = (StickersActivity) this.this$0;
            stickersActivity.selectedSets.clear();
            stickersActivity.listView.adapter.update(true);
            stickersActivity.checkActionMode();
        }

        @Override
        public void didFindMrzInfo(MrzRecognizer.Result result) {
        }

        @Override
        public void didFindQr(String str) {
            BotWebViewContainer botWebViewContainer = (BotWebViewContainer) this.this$0;
            try {
                botWebViewContainer.lastClickMs = System.currentTimeMillis();
                botWebViewContainer.notifyEvent("qr_text_received", new JSONObject().put("data", str));
            } catch (JSONException e) {
                FileLog.e(e);
            }
        }

        @Override
        public void didSelectCountry(CountrySelectActivity.Country country) {
            NewContactBottomSheet newContactBottomSheet = (NewContactBottomSheet) this.this$0;
            newContactBottomSheet.ignoreOnTextChange = true;
            String str = country.code;
            newContactBottomSheet.codeField.setText(str);
            newContactBottomSheet.setCountryHint$1(str, country);
            newContactBottomSheet.ignoreOnTextChange = false;
            AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda6(this, 26), 300L);
            newContactBottomSheet.phoneField.requestFocus();
            NewContactBottomSheet.AnonymousClass3 anonymousClass3 = newContactBottomSheet.phoneField;
            anonymousClass3.setSelection(anonymousClass3.length());
        }

        @Override
        public void didSelectDate(int i, int i2, boolean z) {
            RichEditor richEditor = (RichEditor) this.this$0;
            richEditor.sendMessage(i, i2, z);
            MessageSendPreview messageSendPreview = richEditor.messageSendPreview;
            if (messageSendPreview != null) {
                messageSendPreview.dismissInstant();
                richEditor.messageSendPreview = null;
            }
        }

        @Override
        public void didShare() {
            StickersActivity stickersActivity = (StickersActivity) this.this$0;
            stickersActivity.selectedSets.clear();
            stickersActivity.listView.adapter.update(true);
            stickersActivity.checkActionMode();
        }

        @Override
        public CharSequence getContentDescription() {
            switch (this.$r8$classId) {
                case 1:
                    return null;
                default:
                    ThemeActivity.TextSizeCell textSizeCell = (ThemeActivity.TextSizeCell) this.this$0;
                    int i = textSizeCell.startFontSize;
                    return String.valueOf(Math.round((textSizeCell.sizeBar.getProgress() * (textSizeCell.endFontSize - i)) + i));
            }
        }

        @Override
        public Paint.FontMetricsInt getFontMetrics() {
            return ((CaptionContainerView) this.this$0).editText.getEditText().getPaint().getFontMetricsInt();
        }

        @Override
        public int getStepsCount() {
            switch (this.$r8$classId) {
                case 1:
                    return 0;
                default:
                    ThemeActivity.TextSizeCell textSizeCell = (ThemeActivity.TextSizeCell) this.this$0;
                    return textSizeCell.endFontSize - textSizeCell.startFontSize;
            }
        }

        @Override
        public String getSubtitleText() {
            return ((BotWebViewContainer) this.this$0).lastQrText;
        }

        @Override
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            switch (this.$r8$classId) {
                case 0:
                    Insets insetsIgnoringVisibility = windowInsetsCompat.mImpl.getInsetsIgnoringVisibility(519);
                    PollItemMenu pollItemMenu = (PollItemMenu) this.this$0;
                    pollItemMenu.insets = insetsIgnoringVisibility;
                    int i = insetsIgnoringVisibility.left;
                    int i2 = insetsIgnoringVisibility.bottom;
                    pollItemMenu.containerView.setPadding(i, insetsIgnoringVisibility.top, insetsIgnoringVisibility.right, i2);
                    pollItemMenu.windowView.requestLayout();
                    break;
                default:
                    Insets insetsIgnoringVisibility2 = windowInsetsCompat.mImpl.getInsetsIgnoringVisibility(519);
                    TodoItemMenu todoItemMenu = (TodoItemMenu) this.this$0;
                    todoItemMenu.insets = insetsIgnoringVisibility2;
                    int i3 = insetsIgnoringVisibility2.left;
                    int i4 = insetsIgnoringVisibility2.bottom;
                    todoItemMenu.containerView.setPadding(i3, insetsIgnoringVisibility2.top, insetsIgnoringVisibility2.right, i4);
                    todoItemMenu.windowView.requestLayout();
                    break;
            }
            return WindowInsetsCompat.CONSUMED;
        }

        @Override
        public void onCaptionChanged() {
            RichMapCell.Delegate delegate = ((RichMapCell) this.this$0).delegate;
            if (delegate != null) {
                RichEditorListView richEditorListView = RichEditorListView.this;
                RichEditorHistory richEditorHistory = richEditorListView.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onTyping();
                }
                richEditorListView.delegate.onContentChanged();
            }
        }

        @Override
        public void onCaptionEnter() {
            RichMapCell richMapCell = (RichMapCell) this.this$0;
            RichMapCell.Delegate delegate = richMapCell.delegate;
            if (delegate != null) {
                RichEditorListView.this.onCaptionEnter(richMapCell.currentRow);
            }
        }

        @Override
        public void onCaptionLockedInsert(CharSequence charSequence) {
            RichMapCell.Delegate delegate = ((RichMapCell) this.this$0).delegate;
            if (delegate != null) {
                RichEditorListView.AnonymousClass9 anonymousClass9 = (RichEditorListView.AnonymousClass9) delegate;
                if (charSequence == null || charSequence.length() <= 0) {
                    return;
                }
                RichEditorListView.this.replaceHelperSelectionWith(charSequence.toString());
            }
        }

        @Override
        public boolean onCaptionSelectAll() {
            RichMapCell.Delegate delegate = ((RichMapCell) this.this$0).delegate;
            return delegate != null && RichEditorListView.this.tryEscalateSelectAll();
        }

        @Override
        public void onCaptionSpansChanged() {
            RichMapCell.Delegate delegate = ((RichMapCell) this.this$0).delegate;
            if (delegate != null) {
                RichEditorListView.access$3700(RichEditorListView.this);
            }
        }

        @Override
        public void onCaptionWillChange(int i, int i2) {
            RichEditorHistory richEditorHistory;
            RichMapCell.Delegate delegate = ((RichMapCell) this.this$0).delegate;
            if (delegate == null || (richEditorHistory = RichEditorListView.this.history) == null) {
                return;
            }
            richEditorHistory.onBeforeChange(i, i2);
        }

        @Override
        public void onDismiss() {
            BotWebViewContainer botWebViewContainer = (BotWebViewContainer) this.this$0;
            botWebViewContainer.notifyEvent("scan_qr_popup_closed", null);
            botWebViewContainer.hasQRPending = false;
        }

        @Override
        public void onRenderedFirstFrame() {
        }

        @Override
        public void onRequestWindowFocusable(RichEditText richEditText) {
            RichMapCell.Delegate delegate = ((RichMapCell) this.this$0).delegate;
            if (delegate != null) {
                RichEditorListView richEditorListView = RichEditorListView.this;
                richEditorListView.prepareEditText(richEditText);
                richEditorListView.delegate.makeEditTextFocusable(richEditText);
            }
        }

        @Override
        public void onSeekBarContinuousDrag(float f) {
            switch (this.$r8$classId) {
                case 5:
                    SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.this$0;
                    SecretMediaViewer.AnonymousClass1 anonymousClass1 = secretMediaViewer.videoPlayer;
                    if (anonymousClass1 != null) {
                        anonymousClass1.pause();
                        long duration = secretMediaViewer.videoPlayer.getDuration();
                        if (duration != -9223372036854775807L) {
                            secretMediaViewer.videoPlayer.seekTo((long) (f * duration), false);
                        }
                    }
                    break;
                default:
                    MessageObject messageObject = ((RichAudioCell) this.this$0).messageObject;
                    if (messageObject != null) {
                        messageObject.audioProgress = f;
                        break;
                    }
                    break;
            }
        }

        @Override
        public void onSeekBarDrag(float f, boolean z) {
            switch (this.$r8$classId) {
                case 1:
                    Icon3D icon3D = ((GLIconRenderer) this.this$0).model;
                    if (icon3D != null) {
                        icon3D.diffuse = f;
                    }
                    break;
                default:
                    ThemeActivity.TextSizeCell textSizeCell = (ThemeActivity.TextSizeCell) this.this$0;
                    ThemeActivity themeActivity = ThemeActivity.this;
                    int i = textSizeCell.startFontSize;
                    ThemeActivity.access$500(themeActivity, Math.round(((textSizeCell.endFontSize - i) * f) + i));
                    break;
            }
        }

        @Override
        public void onSeekBarPressed() {
            int i = this.$r8$classId;
        }

        @Override
        public void onSeekFinished(AnalyticsListener.EventTime eventTime) {
        }

        @Override
        public void onSeekStarted(AnalyticsListener.EventTime eventTime) {
        }

        @Override
        public void onStateChanged(boolean z, int i) {
            PreviewView previewView = (PreviewView) this.this$0;
            AndroidUtilities.cancelRunOnUIThread(previewView.updateAudioProgressRunnable);
            VideoPlayer videoPlayer = previewView.audioPlayer;
            if (videoPlayer == null || !videoPlayer.isPlaying()) {
                return;
            }
            AndroidUtilities.runOnUIThread(previewView.updateAudioProgressRunnable);
        }

        @Override
        public void onStickerSelected(TLRPC.TL_document tL_document, String str, Object obj) {
        }

        @Override
        public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            ((PreviewView) this.this$0).invalidateTextureViewHolder();
        }

        @Override
        public boolean processQr(String str, CameraScanActivity$$ExternalSyntheticLambda0 cameraScanActivity$$ExternalSyntheticLambda0) {
            return false;
        }

        @Override
        public void renderNodeCalculateHash(Blur3HashImpl blur3HashImpl) {
            int i = Theme.key_windowBackgroundWhite;
            MainTabsActivity mainTabsActivity = (MainTabsActivity) this.this$0;
            blur3HashImpl.hash = MediaDataController.calcHash(blur3HashImpl.hash, mainTabsActivity.getThemedColor(i));
            blur3HashImpl.add(SharedConfig.chatBlurEnabled());
            SparseArray sparseArray = mainTabsActivity.fragmentsArr;
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                BaseFragment baseFragment = ((ViewPagerActivity.FragmentState) sparseArray.valueAt(i2)).fragment;
                View view = baseFragment.fragmentView;
                if (view != null) {
                    LoginActivity.AnonymousClass4 anonymousClass4 = mainTabsActivity.contentView;
                    RectF rectF = mainTabsActivity.fragmentPosition;
                    if (ViewPositionWatcher.computeRectInParent(view, anonymousClass4, rectF) && rectF.right > 0.0f && rectF.left < mainTabsActivity.fragmentView.getMeasuredWidth() && ((MainTabsActivity.TabFragmentDelegate) baseFragment).getGlassSource() != null) {
                        blur3HashImpl.addF(rectF.left);
                        blur3HashImpl.addF(rectF.top);
                        blur3HashImpl.hash = MediaDataController.calcHash(blur3HashImpl.hash, baseFragment.getClassGuid());
                    }
                }
            }
        }

        @Override
        public void renderNodeUpdateDisplayList(Canvas canvas) {
            BlurredBackgroundSourceRenderNode glassSource;
            MainTabsActivity mainTabsActivity = (MainTabsActivity) this.this$0;
            int measuredWidth = mainTabsActivity.fragmentView.getMeasuredWidth();
            int measuredHeight = mainTabsActivity.fragmentView.getMeasuredHeight();
            canvas.drawColor(mainTabsActivity.getThemedColor(Theme.key_windowBackgroundWhite));
            SparseArray sparseArray = mainTabsActivity.fragmentsArr;
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                BaseFragment baseFragment = ((ViewPagerActivity.FragmentState) sparseArray.valueAt(i)).fragment;
                View view = baseFragment.fragmentView;
                if (view != null) {
                    LoginActivity.AnonymousClass4 anonymousClass4 = mainTabsActivity.contentView;
                    RectF rectF = mainTabsActivity.fragmentPosition;
                    if (ViewPositionWatcher.computeRectInParent(view, anonymousClass4, rectF) && rectF.right > 0.0f && rectF.left < mainTabsActivity.fragmentView.getMeasuredWidth() && (glassSource = ((MainTabsActivity.TabFragmentDelegate) baseFragment).getGlassSource()) != null) {
                        canvas.save();
                        canvas.translate(rectF.left, rectF.top);
                        glassSource.draw(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                }
            }
        }

        @Override
        public void replaceText(int i, int i2, CharSequence charSequence, boolean z) {
            CaptionContainerView.AnonymousClass3 anonymousClass3 = ((CaptionContainerView) this.this$0).editText;
            if (anonymousClass3 == null) {
                return;
            }
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(anonymousClass3.getText());
                spannableStringBuilder.replace(i, i2 + i, charSequence);
                if (z) {
                    Emoji.replaceEmoji(spannableStringBuilder, anonymousClass3.getEditText().getPaint().getFontMetricsInt(), false);
                }
                anonymousClass3.setText(spannableStringBuilder);
                anonymousClass3.setSelection(i + charSequence.length());
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public TextSelectionHelper.ArticleTextSelectionHelper selectionHelper() {
            RichMapCell.Delegate delegate = ((RichMapCell) this.this$0).delegate;
            if (delegate != null) {
                return RichEditorListView.this.getTextSelectionHelper();
            }
            return null;
        }

        @Override
        public void sendBotInlineResult(TLRPC.BotInlineResult botInlineResult, boolean z, int i) {
        }

        @Override
        public void shouldClearRecentSearch() {
            PhotoPickerSearchActivity photoPickerSearchActivity = (PhotoPickerSearchActivity) this.this$0;
            photoPickerSearchActivity.imagesSearch.clearRecentSearch();
            photoPickerSearchActivity.gifsSearch.clearRecentSearch();
        }

        @Override
        public void shouldSearchText(String str) {
            PhotoPickerSearchActivity.access$3600((PhotoPickerSearchActivity) this.this$0, str);
        }

        @Override
        public void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime) {
        }

        @Override
        public void onSeekBarDrag(float f) {
            switch (this.$r8$classId) {
                case 5:
                    SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.this$0;
                    SecretMediaViewer.AnonymousClass1 anonymousClass1 = secretMediaViewer.videoPlayer;
                    if (anonymousClass1 != null) {
                        long duration = anonymousClass1.getDuration();
                        if (duration != -9223372036854775807L) {
                            secretMediaViewer.videoPlayer.seekTo((long) (f * duration), false);
                        }
                        secretMediaViewer.videoPlayer.play();
                    }
                    break;
                default:
                    RichAudioCell richAudioCell = (RichAudioCell) this.this$0;
                    MessageObject messageObject = richAudioCell.messageObject;
                    if (messageObject != null) {
                        messageObject.audioProgress = f;
                        MediaController.getInstance().seekToProgress(richAudioCell.messageObject, f);
                        break;
                    }
                    break;
            }
        }

        private final void onSeekBarPressed$org$telegram$ui$GLIconSettingsView$4() {
        }

        private final void onSeekBarPressed$org$telegram$ui$ThemeActivity$TextSizeCell$1() {
        }

        @Override
        public void onError(VideoPlayer videoPlayer, Exception exc) {
        }

        @Override
        public void onVideoSizeChanged(int i, int i2, int i3, float f) {
        }
    }

    public final class AnonymousClass8 implements ProfileInstaller$DiagnosticsCallback, ExtractorOutput, MediaCodecAdapter.Factory, DataSource.Factory, DynamiteModule.VersionPolicy.IVersions, Continuation, SettingsJsonTransform, ComponentRegistrarProcessor, ObjectConstructor, ComponentFactory, OnFailureListener, InlineParserFactory, AudioRemixer, AudioResampler, ChatMessageCell.ChatMessageCellDelegate {
        public static volatile AnonymousClass8 INSTANCE;
        public final int $r8$classId;

        public AnonymousClass8(int i) {
            this.$r8$classId = i;
        }

        public static MediaCodec createCodec(Parser parser) throws IOException {
            ((MediaCodecInfo) parser.blockParserFactories).getClass();
            String str = ((MediaCodecInfo) parser.blockParserFactories).name;
            Log.beginSection("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            Log.endSection();
            return mediaCodecCreateByCodecName;
        }

        public static Settings defaultSettings(RichEditor.AnonymousClass12 anonymousClass12) {
            return new Settings(System.currentTimeMillis() + ((long) 3600000), new CastSync.AnonymousClass1(8), new Settings.FeatureFlagData(true, false, false), 10.0d, 1.2d, 60);
        }

        private final void didLongPress$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell, float f, float f2) {
        }

        private final void didLongPress$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell, float f, float f2) {
        }

        private final void didLongPress$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell, float f, float f2) {
        }

        private final void didLongPressBotButton$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        }

        private final void didLongPressBotButton$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        }

        private final void didLongPressBotButton$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        }

        private final void didPressAboutRevenueSharingAds$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3() {
        }

        private final void didPressAboutRevenueSharingAds$org$telegram$ui$PollItemMenu$8() {
        }

        private final void didPressAboutRevenueSharingAds$org$telegram$ui$TodoItemMenu$10() {
        }

        private final void didPressAddPollOptionButton$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell) {
        }

        private final void didPressAddPollOptionButton$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell) {
        }

        private final void didPressAddPollOptionButton$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell) {
        }

        private final void didPressAdmin$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell) {
        }

        private final void didPressAdmin$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell) {
        }

        private final void didPressAdmin$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell) {
        }

        private final void didPressAppUpdateButton$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3() {
        }

        private final void didPressAppUpdateButton$org$telegram$ui$PollItemMenu$8() {
        }

        private final void didPressAppUpdateButton$org$telegram$ui$TodoItemMenu$10() {
        }

        private final void didPressBoostCounter$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell) {
        }

        private final void didPressBoostCounter$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell) {
        }

        private final void didPressBoostCounter$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell) {
        }

        private final void didPressBotButton$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        }

        private final void didPressBotButton$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        }

        private final void didPressBotButton$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        }

        private final void didPressCancelSendButton$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell) {
        }

        private final void didPressCancelSendButton$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell) {
        }

        private final void didPressCancelSendButton$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell) {
        }

        private final void didPressChannelAvatar$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
        }

        private final void didPressChannelAvatar$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
        }

        private final void didPressChannelAvatar$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
        }

        private final void didPressChannelRecommendation$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell, TLObject tLObject, boolean z) {
        }

        private final void didPressChannelRecommendation$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell, TLObject tLObject, boolean z) {
        }

        private final void didPressChannelRecommendation$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell, TLObject tLObject, boolean z) {
        }

        private final void didPressChannelRecommendationsClose$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell) {
        }

        private final void didPressChannelRecommendationsClose$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell) {
        }

        private final void didPressChannelRecommendationsClose$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell) {
        }

        private final void didPressCodeCopy$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(MessageObject.TextLayoutBlock textLayoutBlock) {
        }

        private final void didPressCodeCopy$org$telegram$ui$PollItemMenu$8(MessageObject.TextLayoutBlock textLayoutBlock) {
        }

        private final void didPressCodeCopy$org$telegram$ui$TodoItemMenu$10(MessageObject.TextLayoutBlock textLayoutBlock) {
        }

        private final void didPressCommentButton$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell) {
        }

        private final void didPressCommentButton$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell) {
        }

        private final void didPressCommentButton$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell) {
        }

        private final void didPressCustomBotButton$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
        }

        private final void didPressCustomBotButton$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
        }

        private final void didPressCustomBotButton$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
        }

        private final void didPressEffect$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell) {
        }

        private final void didPressEffect$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell) {
        }

        private final void didPressEffect$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell) {
        }

        private final void didPressExtendedMediaPreview$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        }

        private final void didPressExtendedMediaPreview$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        }

        private final void didPressExtendedMediaPreview$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        }

        private final void didPressFactCheck$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell) {
        }

        private final void didPressFactCheck$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell) {
        }

        private final void didPressFactCheck$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell) {
        }

        private final void didPressFactCheckWhat$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell, int i, int i2) {
        }

        private final void didPressFactCheckWhat$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell, int i, int i2) {
        }

        private final void didPressFactCheckWhat$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell, int i, int i2) {
        }

        private final void didPressGiveawayChatButton$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(int i, ChatMessageCell chatMessageCell) {
        }

        private final void didPressGiveawayChatButton$org$telegram$ui$PollItemMenu$8(int i, ChatMessageCell chatMessageCell) {
        }

        private final void didPressGiveawayChatButton$org$telegram$ui$TodoItemMenu$10(int i, ChatMessageCell chatMessageCell) {
        }

        private final void didPressGroupImage$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        }

        private final void didPressGroupImage$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        }

        private final void didPressGroupImage$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        }

        private final void didPressHiddenForward$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell) {
        }

        private final void didPressHiddenForward$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell) {
        }

        private final void didPressHiddenForward$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell) {
        }

        private final void didPressHint$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell) {
        }

        private final void didPressHint$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell) {
        }

        private final void didPressHint$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell) {
        }

        private final void didPressImage$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell, float f, float f2, boolean z) {
        }

        private final void didPressImage$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell, float f, float f2, boolean z) {
        }

        private final void didPressImage$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell, float f, float f2, boolean z) {
        }

        private final void didPressInstantButton$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(int i, ChatMessageCell chatMessageCell) {
        }

        private final void didPressInstantButton$org$telegram$ui$PollItemMenu$8(int i, ChatMessageCell chatMessageCell) {
        }

        private final void didPressInstantButton$org$telegram$ui$TodoItemMenu$10(int i, ChatMessageCell chatMessageCell) {
        }

        private final void didPressMoreChannelRecommendations$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3() {
        }

        private final void didPressMoreChannelRecommendations$org$telegram$ui$PollItemMenu$8() {
        }

        private final void didPressMoreChannelRecommendations$org$telegram$ui$TodoItemMenu$10() {
        }

        private final void didPressOther$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell, float f, float f2) {
        }

        private final void didPressOther$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell, float f, float f2) {
        }

        private final void didPressOther$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell, float f, float f2) {
        }

        private final void didPressPollMedia$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
        }

        private final void didPressPollMedia$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
        }

        private final void didPressPollMedia$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
        }

        private final void didPressReaction$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        }

        private final void didPressReaction$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        }

        private final void didPressReaction$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        }

        private final void didPressReplyMessage$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell, int i, float f, float f2, boolean z) {
        }

        private final void didPressReplyMessage$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell, int i, float f, float f2, boolean z) {
        }

        private final void didPressReplyMessage$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell, int i, float f, float f2, boolean z) {
        }

        private final void didPressRevealSensitiveContent$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell) {
        }

        private final void didPressRevealSensitiveContent$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell) {
        }

        private final void didPressRevealSensitiveContent$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell) {
        }

        private final void didPressRichDocumentOptions$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell, TLRPC.Document document) {
        }

        private final void didPressRichDocumentOptions$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell, TLRPC.Document document) {
        }

        private final void didPressRichDocumentOptions$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell, TLRPC.Document document) {
        }

        private final void didPressShowMore$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell) {
        }

        private final void didPressShowMore$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell) {
        }

        private final void didPressShowMore$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell) {
        }

        private final void didPressSideButton$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell) {
        }

        private final void didPressSideButton$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell) {
        }

        private final void didPressSideButton$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell) {
        }

        private final void didPressSponsoredClose$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell) {
        }

        private final void didPressSponsoredClose$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell) {
        }

        private final void didPressSponsoredClose$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell) {
        }

        private final void didPressSponsoredInfo$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell, float f, float f2) {
        }

        private final void didPressSponsoredInfo$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell, float f, float f2) {
        }

        private final void didPressSponsoredInfo$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell, float f, float f2) {
        }

        private final void didPressSummarize$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell) {
        }

        private final void didPressSummarize$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell) {
        }

        private final void didPressSummarize$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell) {
        }

        private final void didPressTime$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3() {
        }

        private final void didPressTime$org$telegram$ui$PollItemMenu$8() {
        }

        private final void didPressTime$org$telegram$ui$TodoItemMenu$10() {
        }

        private final void didPressUrl$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z) {
        }

        private final void didPressUrl$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z) {
        }

        private final void didPressUrl$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z) {
        }

        private final void didPressUserAvatar$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2) {
        }

        private final void didPressUserAvatar$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2) {
        }

        private final void didPressUserAvatar$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2) {
        }

        private final void didPressUserStatus$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell, TLRPC.User user, TLRPC.Document document, String str) {
        }

        private final void didPressUserStatus$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell, TLRPC.User user, TLRPC.Document document, String str) {
        }

        private final void didPressUserStatus$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell, TLRPC.User user, TLRPC.Document document, String str) {
        }

        private final void didPressViaBot$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(String str) {
        }

        private final void didPressViaBot$org$telegram$ui$PollItemMenu$8(String str) {
        }

        private final void didPressViaBot$org$telegram$ui$TodoItemMenu$10(String str) {
        }

        private final void didPressViaBotNotInline$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell, long j) {
        }

        private final void didPressViaBotNotInline$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell, long j) {
        }

        private final void didPressViaBotNotInline$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell, long j) {
        }

        private final void didPressVoteButtons$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell, ArrayList arrayList, int i, int i2, int i3) {
        }

        private final void didPressVoteButtons$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell, ArrayList arrayList, int i, int i2, int i3) {
        }

        private final void didPressVoteButtons$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell, ArrayList arrayList, int i, int i2, int i3) {
        }

        private final void didQuickShareEnd$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell) {
        }

        private final void didQuickShareEnd$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell) {
        }

        private final void didQuickShareEnd$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell) {
        }

        private final void didQuickShareMove$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell, float f, float f2) {
        }

        private final void didQuickShareMove$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell, float f, float f2) {
        }

        private final void didQuickShareMove$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell, float f, float f2) {
        }

        private final void didQuickShareStart$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell) {
        }

        private final void didQuickShareStart$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell) {
        }

        private final void didQuickShareStart$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell) {
        }

        private final void didStartVideoStream$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(MessageObject messageObject) {
        }

        private final void didStartVideoStream$org$telegram$ui$PollItemMenu$8(MessageObject messageObject) {
        }

        private final void didStartVideoStream$org$telegram$ui$TodoItemMenu$10(MessageObject messageObject) {
        }

        private final void didTogglePollPreview$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell) {
        }

        private final void didTogglePollPreview$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell) {
        }

        private final void didTogglePollPreview$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell) {
        }

        private final void didToggleRichMessageCheckbox$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell, FileLoader$$ExternalSyntheticLambda1 fileLoader$$ExternalSyntheticLambda1) {
        }

        private final void didToggleRichMessageCheckbox$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell, FileLoader$$ExternalSyntheticLambda1 fileLoader$$ExternalSyntheticLambda1) {
        }

        private final void didToggleRichMessageCheckbox$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell, FileLoader$$ExternalSyntheticLambda1 fileLoader$$ExternalSyntheticLambda1) {
        }

        private final void drawPollMode$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell) {
        }

        private final void drawPollMode$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell) {
        }

        private final void drawPollMode$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell) {
        }

        private final void forceUpdate$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell) {
        }

        private final void forceUpdate$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell) {
        }

        private final void forceUpdate$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell) {
        }

        private final void forceUpdateNoAnimation$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell) {
        }

        private final void forceUpdateNoAnimation$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell) {
        }

        private final void forceUpdateNoAnimation$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell) {
        }

        private final void invalidateBlur$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3() {
        }

        private final void invalidateBlur$org$telegram$ui$PollItemMenu$8() {
        }

        private final void invalidateBlur$org$telegram$ui$TodoItemMenu$10() {
        }

        private final void needOpenWebView$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(MessageObject messageObject, String str, String str2, String str3, String str4, int i, int i2) {
        }

        private final void needOpenWebView$org$telegram$ui$PollItemMenu$8(MessageObject messageObject, String str, String str2, String str3, String str4, int i, int i2) {
        }

        private final void needOpenWebView$org$telegram$ui$TodoItemMenu$10(MessageObject messageObject, String str, String str2, String str3, String str4, int i, int i2) {
        }

        private final void needReloadPolls$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3() {
        }

        private final void needReloadPolls$org$telegram$ui$PollItemMenu$8() {
        }

        private final void needReloadPolls$org$telegram$ui$TodoItemMenu$10() {
        }

        private final void needShowPremiumBulletin$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(int i) {
        }

        private final void needShowPremiumBulletin$org$telegram$ui$PollItemMenu$8(int i) {
        }

        private final void needShowPremiumBulletin$org$telegram$ui$TodoItemMenu$10(int i) {
        }

        private final void onDiceFinished$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3() {
        }

        private final void onDiceFinished$org$telegram$ui$PollItemMenu$8() {
        }

        private final void onDiceFinished$org$telegram$ui$TodoItemMenu$10() {
        }

        private final void openArticlePhoto$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell, TL_iv.PageBlock pageBlock) {
        }

        private final void openArticlePhoto$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell, TL_iv.PageBlock pageBlock) {
        }

        private final void openArticlePhoto$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell, TL_iv.PageBlock pageBlock) {
        }

        private final void setShouldNotRepeatSticker$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(MessageObject messageObject) {
        }

        private final void setShouldNotRepeatSticker$org$telegram$ui$PollItemMenu$8(MessageObject messageObject) {
        }

        private final void setShouldNotRepeatSticker$org$telegram$ui$TodoItemMenu$10(MessageObject messageObject) {
        }

        private final void videoTimerReached$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3() {
        }

        private final void videoTimerReached$org$telegram$ui$PollItemMenu$8() {
        }

        private final void videoTimerReached$org$telegram$ui$TodoItemMenu$10() {
        }

        @Override
        public boolean allowAddPollOptions() {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return false;
        }

        @Override
        public Settings buildFromJson(RichEditor.AnonymousClass12 anonymousClass12, JSONObject jSONObject) {
            return defaultSettings(anonymousClass12);
        }

        @Override
        public boolean canDrawOutboundsContent() {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return true;
        }

        @Override
        public boolean canPerformActions() {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return false;
        }

        @Override
        public boolean canPerformReply() {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return false;
        }

        @Override
        public boolean canSaveRichDocument(ChatMessageCell chatMessageCell) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return false;
        }

        @Override
        public boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return false;
        }

        @Override
        public Object construct() {
            return new ConcurrentSkipListMap();
        }

        @Override
        public Object create(MHTML mhtml) {
            Cleaner cleaner = new Cleaner();
            Theme.AnonymousClass1 anonymousClass1 = new Theme.AnonymousClass1(2);
            ReferenceQueue referenceQueue = cleaner.zza;
            Set set = cleaner.zzb;
            set.add(new zzd(cleaner, referenceQueue, set, anonymousClass1));
            Thread thread = new Thread(new zzy(referenceQueue, set, false, 3), "MlKitCleaner");
            thread.setDaemon(true);
            thread.start();
            return cleaner;
        }

        @Override
        public MediaCodecAdapter createAdapter(Parser parser) throws Throwable {
            MediaCodec mediaCodec = null;
            try {
                MediaCodec mediaCodecCreateCodec = createCodec(parser);
                try {
                    Log.beginSection("configureCodec");
                    mediaCodecCreateCodec.configure((MediaFormat) parser.delimiterProcessors, (Surface) parser.inlineParserFactory, (MediaCrypto) null, 0);
                    Log.endSection();
                    Log.beginSection("startCodec");
                    mediaCodecCreateCodec.start();
                    Log.endSection();
                    return new AtomicFile(mediaCodecCreateCodec);
                } catch (IOException | RuntimeException e) {
                    e = e;
                    mediaCodec = mediaCodecCreateCodec;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (RuntimeException e3) {
                e = e3;
            }
        }

        @Override
        public DataSource createDataSource() {
            return new FileDataSource(false);
        }

        @Override
        public void didLongPress(ChatMessageCell chatMessageCell, float f, float f2) {
            int i = this.$r8$classId;
        }

        @Override
        public void didLongPressBotButton(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
            int i = this.$r8$classId;
        }

        @Override
        public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return false;
        }

        @Override
        public boolean didLongPressPollOption(ChatMessageCell chatMessageCell, TLRPC.PollAnswer pollAnswer) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return false;
        }

        @Override
        public boolean didLongPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return false;
        }

        @Override
        public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return false;
        }

        @Override
        public void didPressAboutRevenueSharingAds() {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressAddPollOptionButton(ChatMessageCell chatMessageCell) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressAdmin(ChatMessageCell chatMessageCell) {
            int i = this.$r8$classId;
        }

        @Override
        public boolean didPressAnimatedEmoji(AnimatedEmojiSpan animatedEmojiSpan) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return false;
        }

        @Override
        public void didPressAppUpdateButton() {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressBoostCounter(ChatMessageCell chatMessageCell) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressBotButton(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressCancelSendButton(ChatMessageCell chatMessageCell) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
            int i2 = this.$r8$classId;
        }

        @Override
        public void didPressChannelRecommendation(ChatMessageCell chatMessageCell, TLObject tLObject, boolean z) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressCodeCopy(MessageObject.TextLayoutBlock textLayoutBlock) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressCommentButton(ChatMessageCell chatMessageCell) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressCustomBotButton(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressEffect(ChatMessageCell chatMessageCell) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressFactCheck(ChatMessageCell chatMessageCell) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressFactCheckWhat(ChatMessageCell chatMessageCell, int i, int i2) {
            int i3 = this.$r8$classId;
        }

        @Override
        public void didPressGiveawayChatButton(int i, ChatMessageCell chatMessageCell) {
            int i2 = this.$r8$classId;
        }

        @Override
        public void didPressGroupImage(ChatMessageCell chatMessageCell, TLRPC.MessageExtendedMedia messageExtendedMedia) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressHiddenForward(ChatMessageCell chatMessageCell) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressHint(ChatMessageCell chatMessageCell) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressImage(ChatMessageCell chatMessageCell, float f, float f2, boolean z) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressInstantButton(int i, ChatMessageCell chatMessageCell) {
            int i2 = this.$r8$classId;
        }

        @Override
        public void didPressMoreChannelRecommendations() {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressOther(ChatMessageCell chatMessageCell, float f, float f2) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressPollMedia(ChatMessageCell chatMessageCell, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
            int i2 = this.$r8$classId;
        }

        @Override
        public void didPressReaction(ChatMessageCell chatMessageCell, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressReplyMessage(ChatMessageCell chatMessageCell, int i, float f, float f2, boolean z) {
            int i2 = this.$r8$classId;
        }

        @Override
        public void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressRichDocumentOptions(ChatMessageCell chatMessageCell, TLRPC.Document document) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressShowMore(ChatMessageCell chatMessageCell) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressSideButton(ChatMessageCell chatMessageCell) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressSponsoredClose(ChatMessageCell chatMessageCell) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressSponsoredInfo(ChatMessageCell chatMessageCell, float f, float f2) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressSummarize(ChatMessageCell chatMessageCell) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressTime() {
            int i = this.$r8$classId;
        }

        @Override
        public boolean didPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem, boolean z) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return false;
        }

        @Override
        public void didPressUrl(ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressUserStatus(ChatMessageCell chatMessageCell, TLRPC.User user, TLRPC.Document document, String str) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressViaBot(String str) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressViaBotNotInline(ChatMessageCell chatMessageCell, long j) {
            int i = this.$r8$classId;
        }

        @Override
        public void didPressVoteButtons(ChatMessageCell chatMessageCell, ArrayList arrayList, int i, int i2, int i3) {
            int i4 = this.$r8$classId;
        }

        @Override
        public void didPressWebPage(ChatMessageCell chatMessageCell, TLRPC.WebPage webPage, String str, boolean z) {
            int i = this.$r8$classId;
            ArticleViewer.IBlock.CC.$default$didPressWebPage(chatMessageCell, str);
        }

        @Override
        public void didQuickShareEnd(ChatMessageCell chatMessageCell) {
            int i = this.$r8$classId;
        }

        @Override
        public void didQuickShareMove(ChatMessageCell chatMessageCell, float f, float f2) {
            int i = this.$r8$classId;
        }

        @Override
        public void didQuickShareStart(ChatMessageCell chatMessageCell) {
            int i = this.$r8$classId;
        }

        @Override
        public void didStartVideoStream(MessageObject messageObject) {
            int i = this.$r8$classId;
        }

        @Override
        public void didTogglePollPreview(ChatMessageCell chatMessageCell) {
            int i = this.$r8$classId;
        }

        @Override
        public void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell, FileLoader$$ExternalSyntheticLambda1 fileLoader$$ExternalSyntheticLambda1) {
            int i = this.$r8$classId;
        }

        @Override
        public boolean doNotShowLoadingReply(MessageObject messageObject) {
            int i = this.$r8$classId;
            return ArticleViewer.IBlock.CC.$default$doNotShowLoadingReply(messageObject);
        }

        @Override
        public void drawPollMode(ChatMessageCell chatMessageCell) {
            int i = this.$r8$classId;
        }

        @Override
        public void forceUpdate(ChatMessageCell chatMessageCell) {
            int i = this.$r8$classId;
        }

        @Override
        public void forceUpdateNoAnimation(ChatMessageCell chatMessageCell) {
            int i = this.$r8$classId;
        }

        @Override
        public int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return 0;
        }

        @Override
        public String getAdminRank(long j) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return null;
        }

        @Override
        public int getChatMode() {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return 0;
        }

        @Override
        public ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return null;
        }

        @Override
        public PinchToZoomHelper getPinchToZoomHelper() {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return null;
        }

        @Override
        public String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return null;
        }

        @Override
        public CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return null;
        }

        @Override
        public int getRemixedSize(int i, int i2, int i3) {
            AudioRemixer audioRemixer;
            if (i2 == 6) {
                audioRemixer = AudioRemixer.SURROUND;
            } else if (i2 > i3) {
                audioRemixer = AudioRemixer.DOWNMIX;
            } else {
                audioRemixer = i2 < i3 ? AudioRemixer.UPMIX : AudioRemixer.PASSTHROUGH;
            }
            return audioRemixer.getRemixedSize(i, i2, i3);
        }

        @Override
        public TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return null;
        }

        @Override
        public boolean hasSelectedMessages() {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return false;
        }

        @Override
        public void invalidateBlur() {
            int i = this.$r8$classId;
        }

        @Override
        public boolean isAdmin(long j) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return false;
        }

        @Override
        public boolean isLandscape() {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return false;
        }

        @Override
        public boolean isOwner(long j) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return false;
        }

        @Override
        public boolean isProgressLoading(int i, ChatMessageCell chatMessageCell) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return false;
        }

        @Override
        public boolean isReplyOrSelf() {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return false;
        }

        @Override
        public boolean keyboardIsOpened() {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return false;
        }

        @Override
        public void needOpenWebView(MessageObject messageObject, String str, String str2, String str3, String str4, int i, int i2) {
            int i3 = this.$r8$classId;
        }

        @Override
        public boolean needPlayMessage(ChatMessageCell chatMessageCell, MessageObject messageObject) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return false;
        }

        @Override
        public void needReloadPolls() {
            int i = this.$r8$classId;
        }

        @Override
        public void needShowPremiumBulletin(int i) {
            int i2 = this.$r8$classId;
        }

        @Override
        public boolean onAccessibilityAction(int i) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return false;
        }

        @Override
        public void onDiagnosticReceived() {
            android.util.Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
        }

        @Override
        public void onDiceFinished() {
            int i = this.$r8$classId;
        }

        @Override
        public void onFailure(Exception exc) {
            android.util.Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
        }

        @Override
        public void onResultReceived(int i, Serializable serializable) {
            String str;
            switch (i) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i == 6 || i == 7 || i == 8) {
                android.util.Log.e("ProfileInstaller", str, (Throwable) serializable);
            } else {
                android.util.Log.d("ProfileInstaller", str);
            }
        }

        @Override
        public void openArticlePhoto(ChatMessageCell chatMessageCell, TL_iv.PageBlock pageBlock) {
            int i = this.$r8$classId;
        }

        @Override
        public List processRegistrar(ComponentRegistrar componentRegistrar) {
            ArrayList arrayList = new ArrayList();
            for (Component component : componentRegistrar.getComponents()) {
                String str = component.name;
                if (str != null) {
                    ArticleViewer$$ExternalSyntheticLambda16 articleViewer$$ExternalSyntheticLambda16 = new ArticleViewer$$ExternalSyntheticLambda16(16, str, component);
                    component = new Component(str, component.providedInterfaces, component.dependencies, component.instantiation, component.type, articleViewer$$ExternalSyntheticLambda16, component.publishedEvents);
                }
                arrayList.add(component);
            }
            return arrayList;
        }

        @Override
        public void remix(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2) {
            AudioRemixer audioRemixer;
            if (i == 6) {
                audioRemixer = AudioRemixer.SURROUND;
            } else if (i > i2) {
                audioRemixer = AudioRemixer.DOWNMIX;
            } else {
                audioRemixer = i < i2 ? AudioRemixer.UPMIX : AudioRemixer.PASSTHROUGH;
            }
            audioRemixer.remix(shortBuffer, i, shortBuffer2, i2);
        }

        @Override
        public void resample(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2, int i3) {
            if (i < i2) {
                AudioResampler.UPSAMPLE.resample(shortBuffer, i, shortBuffer2, i2, i3);
            } else if (i > i2) {
                AudioResampler.DOWNSAMPLE.resample(shortBuffer, i, shortBuffer2, i2, i3);
            } else {
                if (i != i2) {
                    throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
                }
                shortBuffer2.put(shortBuffer);
            }
        }

        @Override
        public void setShouldNotRepeatSticker(MessageObject messageObject) {
            int i = this.$r8$classId;
        }

        @Override
        public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell, boolean z) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return false;
        }

        @Override
        public boolean shouldRepeatSticker(MessageObject messageObject) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 25:
                    break;
            }
            return true;
        }

        @Override
        public Object then(Task task) {
            return null;
        }

        @Override
        public TrackOutput track(int i, int i2) {
            return new DummyTrackOutput();
        }

        @Override
        public void videoTimerReached() {
            int i = this.$r8$classId;
        }

        @Override
        public int zza(Context context, String str) {
            return DynamiteModule.getLocalVersion(context, str);
        }

        @Override
        public int zzb(Context context, String str, boolean z) {
            return DynamiteModule.zza(context, str, z);
        }

        public AnonymousClass8(Context context, Handler handler, ExoPlayerImpl.ComponentListener componentListener) {
            this.$r8$classId = 7;
            context.getApplicationContext();
            new AudioBecomingNoisyManager$AudioBecomingNoisyReceiver(this, handler, componentListener);
        }

        private final void forceUpdate$org$telegram$ui$Components$MessagePreviewView$Page$Adapter$3(ChatMessageCell chatMessageCell, boolean z) {
        }

        private final void forceUpdate$org$telegram$ui$PollItemMenu$8(ChatMessageCell chatMessageCell, boolean z) {
        }

        private final void forceUpdate$org$telegram$ui$TodoItemMenu$10(ChatMessageCell chatMessageCell, boolean z) {
        }

        @Override
        public void forceUpdate(ChatMessageCell chatMessageCell, boolean z) {
            int i = this.$r8$classId;
        }

        @Override
        public InlineParser create(BinaryBitmap binaryBitmap) {
            return new InlineParserImpl(binaryBitmap);
        }

        @Override
        public void endTracks() {
        }

        @Override
        public void seekMap(SeekMap seekMap) {
        }
    }

    public PollItemMenu(Activity activity, Theme.ResourcesProvider resourcesProvider) {
        super(activity, R.style.TransparentDialog);
        this.insets = Insets.NONE;
        this.clipTop = 0.0f;
        this.clipBottom = 0.0f;
        this.taskOptionsViewMaxWidth = -1.0f;
        this.messageOptionsViewMaxWidth = -1.0f;
        final int i = 0;
        this.dismissing = false;
        this.context = activity;
        this.resourcesProvider = resourcesProvider;
        ?? r1 = new FrameLayout(this, activity) {
            public final PollItemMenu this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                ChatMessageCell chatMessageCell;
                switch (i) {
                    case 0:
                        PollItemMenu pollItemMenu = this.this$0;
                        if (pollItemMenu.openProgress <= 0.0f || pollItemMenu.blurBitmapPaint == null) {
                            canvas2 = canvas;
                        } else {
                            pollItemMenu.blurMatrix.reset();
                            float width = getWidth() / pollItemMenu.blurBitmap.getWidth();
                            pollItemMenu.blurMatrix.postScale(width, width);
                            pollItemMenu.blurBitmapShader.setLocalMatrix(pollItemMenu.blurMatrix);
                            pollItemMenu.blurBitmapPaint.setAlpha((int) (pollItemMenu.openProgress * 255.0f));
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), pollItemMenu.blurBitmapPaint);
                        }
                        if (pollItemMenu.setTaskInvisible && (chatMessageCell = pollItemMenu.cell) != null) {
                            chatMessageCell.doNotDrawPollId = pollItemMenu.taskId;
                            chatMessageCell.invalidate();
                            pollItemMenu.setTaskInvisible = false;
                        }
                        super.dispatchDraw(canvas2);
                        break;
                    default:
                        super.dispatchDraw(canvas);
                        break;
                }
            }

            @Override
            public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
                switch (i) {
                    case 0:
                        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                            return super.dispatchKeyEventPreIme(keyEvent);
                        }
                        this.this$0.dismiss(true);
                        return true;
                    default:
                        return super.dispatchKeyEventPreIme(keyEvent);
                }
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                switch (i) {
                    case 1:
                        PollItemMenu pollItemMenu = this.this$0;
                        if (view != pollItemMenu.myCell && view != pollItemMenu.myTaskCell) {
                            return super.drawChild(canvas, view, j);
                        }
                        canvas.save();
                        canvas.clipRect(0.0f, AndroidUtilities.lerp(pollItemMenu.clipTop, 0.0f, pollItemMenu.openProgress), getWidth(), AndroidUtilities.lerp(pollItemMenu.clipBottom, getHeight(), pollItemMenu.openProgress));
                        boolean zDrawChild = super.drawChild(canvas, view, j);
                        canvas.restore();
                        return zDrawChild;
                    default:
                        return super.drawChild(canvas, view, j);
                }
            }

            @Override
            public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                switch (i) {
                    case 0:
                        super.onLayout(z, i2, i3, i4, i5);
                        this.this$0.setupTranslation();
                        break;
                    default:
                        super.onLayout(z, i2, i3, i4, i5);
                        break;
                }
            }

            @Override
            public void onMeasure(int i2, int i3) {
                ViewGroup viewGroup;
                ReactionsContainerLayout reactionsContainerLayout;
                float f;
                switch (i) {
                    case 2:
                        int size = View.MeasureSpec.getSize(i2);
                        int size2 = View.MeasureSpec.getSize(i3);
                        PollItemMenu pollItemMenu = this.this$0;
                        pollItemMenu.updateTranslation();
                        for (int i4 = 0; i4 < getChildCount(); i4++) {
                            View childAt = getChildAt(i4);
                            ViewGroup viewGroup2 = pollItemMenu.messageOptionsView;
                            if (childAt == viewGroup2) {
                                float f2 = pollItemMenu.messageOptionsViewMaxWidth;
                                if (f2 > 0.0f) {
                                    viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                } else {
                                    viewGroup = pollItemMenu.taskOptionsView;
                                    if (childAt == viewGroup) {
                                        f = pollItemMenu.taskOptionsViewMaxWidth;
                                        if (f > 0.0f) {
                                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        } else {
                                            reactionsContainerLayout = pollItemMenu.reactionsView;
                                            if (childAt == reactionsContainerLayout) {
                                                childAt.measure(View.MeasureSpec.makeMeasureSpec(reactionsContainerLayout.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                            } else {
                                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                            }
                                        }
                                    } else {
                                        reactionsContainerLayout = pollItemMenu.reactionsView;
                                        if (childAt == reactionsContainerLayout) {
                                            childAt.measure(View.MeasureSpec.makeMeasureSpec(reactionsContainerLayout.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        } else {
                                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        }
                                    }
                                }
                            } else {
                                viewGroup = pollItemMenu.taskOptionsView;
                                if (childAt == viewGroup) {
                                    f = pollItemMenu.taskOptionsViewMaxWidth;
                                    if (f > 0.0f) {
                                        viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                    } else {
                                        reactionsContainerLayout = pollItemMenu.reactionsView;
                                        if (childAt == reactionsContainerLayout) {
                                            childAt.measure(View.MeasureSpec.makeMeasureSpec(reactionsContainerLayout.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        } else {
                                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        }
                                    }
                                } else {
                                    reactionsContainerLayout = pollItemMenu.reactionsView;
                                    if (childAt == reactionsContainerLayout) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(reactionsContainerLayout.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                    }
                                }
                            }
                        }
                        setMeasuredDimension(size, size2);
                        break;
                    default:
                        super.onMeasure(i2, i3);
                        break;
                }
            }

            @Override
            public void onSizeChanged(int i2, int i3, int i4, int i5) {
                switch (i) {
                    case 0:
                        super.onSizeChanged(i2, i3, i4, i5);
                        PollItemMenu pollItemMenu = this.this$0;
                        Blur3Utils.checkBitmapSourceMatrixScale(pollItemMenu.iBlur3SourceBitmap, pollItemMenu.windowView);
                        pollItemMenu.iBlur3Factory.invalidateAllLinkedViews();
                        break;
                    default:
                        super.onSizeChanged(i2, i3, i4, i5);
                        break;
                }
            }
        };
        this.windowView = r1;
        r1.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda4(this, 21));
        BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = new BlurredBackgroundSourceBitmap();
        this.iBlur3SourceBitmap = blurredBackgroundSourceBitmap;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceBitmap);
        this.iBlur3Factory = blurredBackgroundDrawableViewFactory;
        blurredBackgroundDrawableViewFactory.viewPositionWatcher = new ViewPositionWatcher(r1);
        blurredBackgroundDrawableViewFactory.parent = r1;
        final int i2 = 1;
        ?? r2 = new FrameLayout(this, activity) {
            public final PollItemMenu this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                ChatMessageCell chatMessageCell;
                switch (i2) {
                    case 0:
                        PollItemMenu pollItemMenu = this.this$0;
                        if (pollItemMenu.openProgress <= 0.0f || pollItemMenu.blurBitmapPaint == null) {
                            canvas2 = canvas;
                        } else {
                            pollItemMenu.blurMatrix.reset();
                            float width = getWidth() / pollItemMenu.blurBitmap.getWidth();
                            pollItemMenu.blurMatrix.postScale(width, width);
                            pollItemMenu.blurBitmapShader.setLocalMatrix(pollItemMenu.blurMatrix);
                            pollItemMenu.blurBitmapPaint.setAlpha((int) (pollItemMenu.openProgress * 255.0f));
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), pollItemMenu.blurBitmapPaint);
                        }
                        if (pollItemMenu.setTaskInvisible && (chatMessageCell = pollItemMenu.cell) != null) {
                            chatMessageCell.doNotDrawPollId = pollItemMenu.taskId;
                            chatMessageCell.invalidate();
                            pollItemMenu.setTaskInvisible = false;
                        }
                        super.dispatchDraw(canvas2);
                        break;
                    default:
                        super.dispatchDraw(canvas);
                        break;
                }
            }

            @Override
            public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
                switch (i2) {
                    case 0:
                        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                            return super.dispatchKeyEventPreIme(keyEvent);
                        }
                        this.this$0.dismiss(true);
                        return true;
                    default:
                        return super.dispatchKeyEventPreIme(keyEvent);
                }
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                switch (i2) {
                    case 1:
                        PollItemMenu pollItemMenu = this.this$0;
                        if (view != pollItemMenu.myCell && view != pollItemMenu.myTaskCell) {
                            return super.drawChild(canvas, view, j);
                        }
                        canvas.save();
                        canvas.clipRect(0.0f, AndroidUtilities.lerp(pollItemMenu.clipTop, 0.0f, pollItemMenu.openProgress), getWidth(), AndroidUtilities.lerp(pollItemMenu.clipBottom, getHeight(), pollItemMenu.openProgress));
                        boolean zDrawChild = super.drawChild(canvas, view, j);
                        canvas.restore();
                        return zDrawChild;
                    default:
                        return super.drawChild(canvas, view, j);
                }
            }

            @Override
            public void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                switch (i2) {
                    case 0:
                        super.onLayout(z, i3, i4, i5, i6);
                        this.this$0.setupTranslation();
                        break;
                    default:
                        super.onLayout(z, i3, i4, i5, i6);
                        break;
                }
            }

            @Override
            public void onMeasure(int i3, int i4) {
                ViewGroup viewGroup;
                ReactionsContainerLayout reactionsContainerLayout;
                float f;
                switch (i2) {
                    case 2:
                        int size = View.MeasureSpec.getSize(i3);
                        int size2 = View.MeasureSpec.getSize(i4);
                        PollItemMenu pollItemMenu = this.this$0;
                        pollItemMenu.updateTranslation();
                        for (int i5 = 0; i5 < getChildCount(); i5++) {
                            View childAt = getChildAt(i5);
                            ViewGroup viewGroup2 = pollItemMenu.messageOptionsView;
                            if (childAt == viewGroup2) {
                                float f2 = pollItemMenu.messageOptionsViewMaxWidth;
                                if (f2 > 0.0f) {
                                    viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                } else {
                                    viewGroup = pollItemMenu.taskOptionsView;
                                    if (childAt == viewGroup) {
                                        f = pollItemMenu.taskOptionsViewMaxWidth;
                                        if (f > 0.0f) {
                                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        } else {
                                            reactionsContainerLayout = pollItemMenu.reactionsView;
                                            if (childAt == reactionsContainerLayout) {
                                                childAt.measure(View.MeasureSpec.makeMeasureSpec(reactionsContainerLayout.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                            } else {
                                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                            }
                                        }
                                    } else {
                                        reactionsContainerLayout = pollItemMenu.reactionsView;
                                        if (childAt == reactionsContainerLayout) {
                                            childAt.measure(View.MeasureSpec.makeMeasureSpec(reactionsContainerLayout.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        } else {
                                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        }
                                    }
                                }
                            } else {
                                viewGroup = pollItemMenu.taskOptionsView;
                                if (childAt == viewGroup) {
                                    f = pollItemMenu.taskOptionsViewMaxWidth;
                                    if (f > 0.0f) {
                                        viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                    } else {
                                        reactionsContainerLayout = pollItemMenu.reactionsView;
                                        if (childAt == reactionsContainerLayout) {
                                            childAt.measure(View.MeasureSpec.makeMeasureSpec(reactionsContainerLayout.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        } else {
                                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        }
                                    }
                                } else {
                                    reactionsContainerLayout = pollItemMenu.reactionsView;
                                    if (childAt == reactionsContainerLayout) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(reactionsContainerLayout.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                    }
                                }
                            }
                        }
                        setMeasuredDimension(size, size2);
                        break;
                    default:
                        super.onMeasure(i3, i4);
                        break;
                }
            }

            @Override
            public void onSizeChanged(int i3, int i4, int i5, int i6) {
                switch (i2) {
                    case 0:
                        super.onSizeChanged(i3, i4, i5, i6);
                        PollItemMenu pollItemMenu = this.this$0;
                        Blur3Utils.checkBitmapSourceMatrixScale(pollItemMenu.iBlur3SourceBitmap, pollItemMenu.windowView);
                        pollItemMenu.iBlur3Factory.invalidateAllLinkedViews();
                        break;
                    default:
                        super.onSizeChanged(i3, i4, i5, i6);
                        break;
                }
            }
        };
        this.containerView = r2;
        r2.setClipToPadding(false);
        r1.addView(r2, LayoutHelper.createFrame(-1, -1, 119));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this, activity, i);
        this.viewPager = anonymousClass3;
        anonymousClass3.setAdapter(new AnonymousClass4(this, activity, i));
        r2.addView(anonymousClass3, LayoutHelper.createFrame(-1, -1, 119));
        final int i3 = 2;
        ?? r8 = new FrameLayout(this, activity) {
            public final PollItemMenu this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                ChatMessageCell chatMessageCell;
                switch (i3) {
                    case 0:
                        PollItemMenu pollItemMenu = this.this$0;
                        if (pollItemMenu.openProgress <= 0.0f || pollItemMenu.blurBitmapPaint == null) {
                            canvas2 = canvas;
                        } else {
                            pollItemMenu.blurMatrix.reset();
                            float width = getWidth() / pollItemMenu.blurBitmap.getWidth();
                            pollItemMenu.blurMatrix.postScale(width, width);
                            pollItemMenu.blurBitmapShader.setLocalMatrix(pollItemMenu.blurMatrix);
                            pollItemMenu.blurBitmapPaint.setAlpha((int) (pollItemMenu.openProgress * 255.0f));
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), pollItemMenu.blurBitmapPaint);
                        }
                        if (pollItemMenu.setTaskInvisible && (chatMessageCell = pollItemMenu.cell) != null) {
                            chatMessageCell.doNotDrawPollId = pollItemMenu.taskId;
                            chatMessageCell.invalidate();
                            pollItemMenu.setTaskInvisible = false;
                        }
                        super.dispatchDraw(canvas2);
                        break;
                    default:
                        super.dispatchDraw(canvas);
                        break;
                }
            }

            @Override
            public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
                switch (i3) {
                    case 0:
                        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                            return super.dispatchKeyEventPreIme(keyEvent);
                        }
                        this.this$0.dismiss(true);
                        return true;
                    default:
                        return super.dispatchKeyEventPreIme(keyEvent);
                }
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                switch (i3) {
                    case 1:
                        PollItemMenu pollItemMenu = this.this$0;
                        if (view != pollItemMenu.myCell && view != pollItemMenu.myTaskCell) {
                            return super.drawChild(canvas, view, j);
                        }
                        canvas.save();
                        canvas.clipRect(0.0f, AndroidUtilities.lerp(pollItemMenu.clipTop, 0.0f, pollItemMenu.openProgress), getWidth(), AndroidUtilities.lerp(pollItemMenu.clipBottom, getHeight(), pollItemMenu.openProgress));
                        boolean zDrawChild = super.drawChild(canvas, view, j);
                        canvas.restore();
                        return zDrawChild;
                    default:
                        return super.drawChild(canvas, view, j);
                }
            }

            @Override
            public void onLayout(boolean z, int i4, int i5, int i6, int i7) {
                switch (i3) {
                    case 0:
                        super.onLayout(z, i4, i5, i6, i7);
                        this.this$0.setupTranslation();
                        break;
                    default:
                        super.onLayout(z, i4, i5, i6, i7);
                        break;
                }
            }

            @Override
            public void onMeasure(int i4, int i5) {
                ViewGroup viewGroup;
                ReactionsContainerLayout reactionsContainerLayout;
                float f;
                switch (i3) {
                    case 2:
                        int size = View.MeasureSpec.getSize(i4);
                        int size2 = View.MeasureSpec.getSize(i5);
                        PollItemMenu pollItemMenu = this.this$0;
                        pollItemMenu.updateTranslation();
                        for (int i6 = 0; i6 < getChildCount(); i6++) {
                            View childAt = getChildAt(i6);
                            ViewGroup viewGroup2 = pollItemMenu.messageOptionsView;
                            if (childAt == viewGroup2) {
                                float f2 = pollItemMenu.messageOptionsViewMaxWidth;
                                if (f2 > 0.0f) {
                                    viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                } else {
                                    viewGroup = pollItemMenu.taskOptionsView;
                                    if (childAt == viewGroup) {
                                        f = pollItemMenu.taskOptionsViewMaxWidth;
                                        if (f > 0.0f) {
                                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        } else {
                                            reactionsContainerLayout = pollItemMenu.reactionsView;
                                            if (childAt == reactionsContainerLayout) {
                                                childAt.measure(View.MeasureSpec.makeMeasureSpec(reactionsContainerLayout.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                            } else {
                                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                            }
                                        }
                                    } else {
                                        reactionsContainerLayout = pollItemMenu.reactionsView;
                                        if (childAt == reactionsContainerLayout) {
                                            childAt.measure(View.MeasureSpec.makeMeasureSpec(reactionsContainerLayout.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        } else {
                                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        }
                                    }
                                }
                            } else {
                                viewGroup = pollItemMenu.taskOptionsView;
                                if (childAt == viewGroup) {
                                    f = pollItemMenu.taskOptionsViewMaxWidth;
                                    if (f > 0.0f) {
                                        viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                    } else {
                                        reactionsContainerLayout = pollItemMenu.reactionsView;
                                        if (childAt == reactionsContainerLayout) {
                                            childAt.measure(View.MeasureSpec.makeMeasureSpec(reactionsContainerLayout.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        } else {
                                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        }
                                    }
                                } else {
                                    reactionsContainerLayout = pollItemMenu.reactionsView;
                                    if (childAt == reactionsContainerLayout) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(reactionsContainerLayout.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                    }
                                }
                            }
                        }
                        setMeasuredDimension(size, size2);
                        break;
                    default:
                        super.onMeasure(i4, i5);
                        break;
                }
            }

            @Override
            public void onSizeChanged(int i4, int i5, int i6, int i7) {
                switch (i3) {
                    case 0:
                        super.onSizeChanged(i4, i5, i6, i7);
                        PollItemMenu pollItemMenu = this.this$0;
                        Blur3Utils.checkBitmapSourceMatrixScale(pollItemMenu.iBlur3SourceBitmap, pollItemMenu.windowView);
                        pollItemMenu.iBlur3Factory.invalidateAllLinkedViews();
                        break;
                    default:
                        super.onSizeChanged(i4, i5, i6, i7);
                        break;
                }
            }
        };
        this.menuContainer = r8;
        r2.addView(r8, LayoutHelper.createFrame(-1, -1, 119));
        MessagePreviewView.TabsView tabsView = new MessagePreviewView.TabsView(activity, resourcesProvider);
        this.tabsView = tabsView;
        String string = LocaleController.getString(R.string.PollMenuTabOption);
        ArrayList arrayList = tabsView.tabs;
        arrayList.add(new MessagePreviewView.TabsView.Tab(0, string));
        arrayList.add(new MessagePreviewView.TabsView.Tab(1, LocaleController.getString(R.string.PollMenuTabPoll)));
        r2.addView(tabsView, LayoutHelper.createFrame(-1, 66, 80));
        tabsView.setOnTabClick(new PollItemMenu$$ExternalSyntheticLambda14(anonymousClass3, i));
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(tabsView, null, false);
        blurredBackgroundDrawableCreate.setColorProvider(BlurredBackgroundProviderImpl.scrimMenuBackground(resourcesProvider));
        blurredBackgroundDrawableCreate.boundProps.hasPadding = true;
        blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(8.0f));
        blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(16.0f));
        tabsView.setBackground(blurredBackgroundDrawableCreate);
        TextView textView = new TextView(activity);
        this.hintTextView = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(tabsView.getColor());
        zzkg.m(R.string.PollMenuHint, textView, 17);
        r2.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(this, i);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(r1, anonymousClass6);
    }

    public final void animateOpenTo(PollItemMenu$$ExternalSyntheticLambda3 pollItemMenu$$ExternalSyntheticLambda3, boolean z) {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator valueAnimator = this.openAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.open2Animator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        setupTranslation();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.openProgress, z ? 1.0f : 0.0f);
        this.openAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final PollItemMenu f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i2) {
                    case 0:
                        PollItemMenu pollItemMenu = this.f$0;
                        pollItemMenu.getClass();
                        pollItemMenu.openProgress = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        pollItemMenu.windowView.invalidate();
                        pollItemMenu.containerView.invalidate();
                        PollItemMenu.AnonymousClass7 anonymousClass7 = pollItemMenu.myTaskCell;
                        if (anonymousClass7 != null) {
                            anonymousClass7.invalidate();
                        }
                        pollItemMenu.updateTranslation();
                        break;
                    default:
                        PollItemMenu pollItemMenu2 = this.f$0;
                        pollItemMenu2.getClass();
                        pollItemMenu2.openProgress2 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.openAnimator.addListener(new ChatActivity.AnonymousClass63(this, z, pollItemMenu$$ExternalSyntheticLambda3, 10));
        long j = !z ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.openAnimator;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        valueAnimator3.setInterpolator(cubicBezierInterpolator);
        this.openAnimator.setDuration(j);
        this.openAnimator.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.openProgress2, z ? 1.0f : 0.0f);
        this.open2Animator = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final PollItemMenu f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                switch (i) {
                    case 0:
                        PollItemMenu pollItemMenu = this.f$0;
                        pollItemMenu.getClass();
                        pollItemMenu.openProgress = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                        pollItemMenu.windowView.invalidate();
                        pollItemMenu.containerView.invalidate();
                        PollItemMenu.AnonymousClass7 anonymousClass7 = pollItemMenu.myTaskCell;
                        if (anonymousClass7 != null) {
                            anonymousClass7.invalidate();
                        }
                        pollItemMenu.updateTranslation();
                        break;
                    default:
                        PollItemMenu pollItemMenu2 = this.f$0;
                        pollItemMenu2.getClass();
                        pollItemMenu2.openProgress2 = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.open2Animator.addListener(new LoginActivity.AnonymousClass9(23, this, z));
        this.open2Animator.setDuration((long) (j * 1.5f));
        this.open2Animator.setInterpolator(cubicBezierInterpolator);
        this.open2Animator.start();
    }

    @Override
    public final void dismiss() {
        dismiss(true);
    }

    public final void lambda$dismiss$15() {
        super.dismiss();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        AnonymousClass1 anonymousClass1 = this.windowView;
        setContentView(anonymousClass1, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = i | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        anonymousClass1.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(anonymousClass1, !Theme.currentTheme.isDark());
    }

    public final void setupTranslation() {
        if (this.hasTranslation) {
            return;
        }
        AnonymousClass1 anonymousClass1 = this.windowView;
        if (anonymousClass1.getWidth() <= 0) {
            return;
        }
        ChatMessageCell chatMessageCell = this.cell;
        if (chatMessageCell != null) {
            int[] iArr = new int[2];
            chatMessageCell.getLocationOnScreen(iArr);
            int i = iArr[0];
            Insets insets = this.insets;
            this.tx = i - insets.left;
            float f = iArr[1] - insets.top;
            this.ty = f;
            if (!this.hasDestTranslation) {
                this.hasDestTranslation = true;
                this.dty1 = f;
                if (this.messageOptionsView != null) {
                    float height = f + this.cell.getHeight() + this.messageOptionsView.getHeight();
                    int height2 = anonymousClass1.getHeight();
                    Insets insets2 = this.insets;
                    if (height > ((height2 - insets2.top) - insets2.bottom) - AndroidUtilities.dp(66.0f)) {
                        int height3 = anonymousClass1.getHeight();
                        Insets insets3 = this.insets;
                        this.dty1 = ((((height3 - insets3.top) - insets3.bottom) - AndroidUtilities.dp(66.0f)) - this.cell.getHeight()) - this.messageOptionsView.getHeight();
                    }
                }
                int pollIndex = getPollIndex(this.taskId);
                getPollButtonTop(pollIndex);
                float pollButtonBottom = getPollButtonBottom(pollIndex);
                float f2 = this.ty;
                this.dty2 = f2;
                int i2 = (int) pollButtonBottom;
                float f3 = i2;
                float f4 = f2 + f3;
                int height4 = anonymousClass1.getHeight();
                Insets insets4 = this.insets;
                int iDp = ((height4 - insets4.top) - insets4.bottom) - AndroidUtilities.dp(78.0f);
                TextView textView = this.hintTextView;
                if (f4 > iDp - textView.getHeight()) {
                    int height5 = anonymousClass1.getHeight();
                    Insets insets5 = this.insets;
                    this.dty2 = ((((height5 - insets5.top) - insets5.bottom) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i2;
                }
                ViewGroup viewGroup = this.taskOptionsView;
                if (viewGroup != null) {
                    float height6 = this.dty2 + f3 + viewGroup.getHeight();
                    int height7 = anonymousClass1.getHeight();
                    Insets insets6 = this.insets;
                    if (height6 > (((height7 - insets6.top) - insets6.bottom) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                        int height8 = anonymousClass1.getHeight();
                        Insets insets7 = this.insets;
                        this.dty2 = (((((height8 - insets7.top) - insets7.bottom) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i2) - this.taskOptionsView.getHeight();
                    }
                }
            }
            updateTranslation();
        } else {
            this.ty = 0.0f;
            this.tx = 0.0f;
        }
        this.hasTranslation = true;
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            ScrimOptions.makeGlobalBlurBitmaps(new LinkManager$$ExternalSyntheticLambda1(this, 2));
            this.setTaskInvisible = true;
            animateOpenTo(null, true);
        }
    }

    public final void updateTranslation() {
        AnonymousClass3 anonymousClass3 = this.viewPager;
        float positionAnimated = anonymousClass3.getPositionAnimated();
        float fLerp = AndroidUtilities.lerp(0, -anonymousClass3.getWidth(), positionAnimated);
        float fLerp2 = AndroidUtilities.lerp(anonymousClass3.getWidth(), 0, positionAnimated);
        if (this.hasTranslation) {
            ViewGroup viewGroup = this.messageOptionsView;
            if (viewGroup instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) viewGroup;
                float f = this.ty;
                this.dty1 = f;
                if (viewGroup != null) {
                    float height = f + this.cell.getHeight() + actionBarPopupWindowLayout.getVisibleHeight();
                    AnonymousClass1 anonymousClass1 = this.windowView;
                    int height2 = anonymousClass1.getHeight();
                    Insets insets = this.insets;
                    if (height > ((height2 - insets.top) - insets.bottom) - AndroidUtilities.dp(66.0f)) {
                        int height3 = anonymousClass1.getHeight();
                        Insets insets2 = this.insets;
                        this.dty1 = ((((height3 - insets2.top) - insets2.bottom) - AndroidUtilities.dp(66.0f)) - this.cell.getHeight()) - actionBarPopupWindowLayout.getVisibleHeight();
                    }
                }
            }
        }
        setTranslationX(AndroidUtilities.lerp(this.tx, 0.0f, this.dismissingWithAlpha ? 1.0f : this.openProgress) + fLerp2);
        setTranslationY(AndroidUtilities.lerp(this.ty, this.dty1, this.dismissingWithAlpha ? 1.0f : this.openProgress));
        ViewGroup viewGroup2 = this.messageOptionsView;
        AnonymousClass1 anonymousClass2 = this.menuContainer;
        if (viewGroup2 != null) {
            if (this.isOut) {
                viewGroup2.setTranslationX(((getPollButtonsLeft() + ((fLerp2 + 0.0f) + getLeft())) - AndroidUtilities.dp(8.0f)) - this.messageOptionsView.getLeft());
            } else {
                viewGroup2.setTranslationX((((fLerp2 + 0.0f) + (needDrawAvatar() ? AndroidUtilities.dp(48.0f) : 0)) + getLeft()) - this.messageOptionsView.getLeft());
            }
            this.messageOptionsViewMaxWidth = anonymousClass2.getMeasuredWidth() - (this.messageOptionsView.getX() - fLerp2);
            this.messageOptionsView.setTranslationY(((getY() + getHeight()) - this.messageOptionsView.getTop()) - anonymousClass2.getTop());
            this.messageOptionsView.setAlpha(this.openProgress);
            float fLerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.openProgress);
            this.messageOptionsView.setScaleX(fLerp3);
            this.messageOptionsView.setScaleY(fLerp3);
        }
        setTranslationX(AndroidUtilities.lerp(this.tx, 0.0f, this.dismissingWithAlpha ? 1.0f : this.openProgress) + fLerp);
        setTranslationY(AndroidUtilities.lerp(this.ty, this.dty2, this.dismissingWithAlpha ? 1.0f : this.openProgress));
        if (this.taskOptionsView != null) {
            int pollIndex = getPollIndex(this.taskId);
            getPollButtonTop(pollIndex);
            float pollButtonBottom = getPollButtonBottom(pollIndex);
            if (this.isOut) {
                this.taskOptionsView.setTranslationX(((getPollButtonsLeft() + ((fLerp + 0.0f) + getLeft())) - AndroidUtilities.dp(8.0f)) - this.taskOptionsView.getLeft());
            } else {
                this.taskOptionsView.setTranslationX((((fLerp + 0.0f) + (needDrawAvatar() ? AndroidUtilities.dp(48.0f) : 0)) + getLeft()) - this.taskOptionsView.getLeft());
            }
            this.taskOptionsViewMaxWidth = anonymousClass2.getMeasuredWidth() - (this.taskOptionsView.getX() - fLerp2);
            this.taskOptionsView.setTranslationY(((getY() + ((int) pollButtonBottom)) - this.taskOptionsView.getTop()) - anonymousClass2.getTop());
            this.taskOptionsView.setAlpha(this.openProgress);
            float fLerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.openProgress);
            this.taskOptionsView.setScaleX(fLerp4);
            this.taskOptionsView.setScaleY(fLerp4);
        }
        if (this.dismissingWithAlpha) {
            setAlpha(this.openProgress);
            setAlpha(this.openProgress);
        }
        if (this.reactionsView != null) {
            float fMax = fLerp2 + Math.max(0.0f, ((getBoundsLeft() + getBoundsRight()) / 2.0f) - (this.reactionsView.getWidth() * 0.8f));
            this.reactionsView.setTranslationX(fMax);
            this.reactionsView.setTranslationY(Math.max(0.0f, ((getY() - this.reactionsView.getHeight()) + AndroidUtilities.dp(22.0f)) - anonymousClass2.getTop()));
            this.reactionsView.setAlpha(this.openProgress);
            View windowView = this.reactionsView.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(fMax);
                windowView.setAlpha(this.openProgress);
            }
        }
        TextView textView = this.hintTextView;
        textView.setTranslationX(fLerp);
        textView.setAlpha(this.openProgress);
        MessagePreviewView.TabsView tabsView = this.tabsView;
        tabsView.setSelectedTab(positionAnimated);
        tabsView.setAlpha(this.openProgress);
    }

    public final void dismiss(boolean z) {
        ChatMessageCell chatMessageCell;
        ReactionsContainerLayout reactionsContainerLayout;
        if (z && (reactionsContainerLayout = this.reactionsView) != null && reactionsContainerLayout.getReactionsWindow() != null && !this.reactionsView.getReactionsWindow().dismissed) {
            CustomEmojiReactionsWindow customEmojiReactionsWindow = this.reactionsView.reactionsWindow;
            if (customEmojiReactionsWindow != null) {
                customEmojiReactionsWindow.dismiss();
                return;
            }
            return;
        }
        if (this.dismissing) {
            return;
        }
        this.dismissing = true;
        this.hasTranslation = false;
        AnonymousClass3 anonymousClass3 = this.viewPager;
        anonymousClass3.cancelTouches();
        boolean z2 = anonymousClass3.getCurrentPosition() == 1;
        if (z && z2) {
            ChatMessageCell chatMessageCell2 = this.cell;
            if (chatMessageCell2 != null) {
                chatMessageCell2.setVisibility(4);
                this.cell.invalidate();
            }
        } else if (!z && (chatMessageCell = this.cell) != null) {
            chatMessageCell.setVisibility(0);
            ChatMessageCell chatMessageCell3 = this.cell;
            chatMessageCell3.doNotDrawPollId = null;
            chatMessageCell3.invalidate();
        }
        this.dismissingWithAlpha = !z;
        setupTranslation();
        animateOpenTo(new PollItemMenu$$ExternalSyntheticLambda3(this, z2), false);
        invalidate();
    }
}
