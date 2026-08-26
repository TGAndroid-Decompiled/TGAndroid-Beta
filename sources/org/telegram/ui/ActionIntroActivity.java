package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.location.Location;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import java.util.ArrayList;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PipVideoOverlay;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.Stories.LiveStoryPipOverlay;

public final class ActionIntroActivity extends BaseFragment implements LocationController.LocationFetchCallback {
    public IntroActivity.AnonymousClass4 buttonTextView;
    public int[] colors;
    public final int currentType;
    public LinearLayout descriptionLayout;
    public final TextView[] descriptionLines;
    public TextView descriptionText;
    public TextView descriptionText2;
    public boolean flickerButton;
    public RLottieImageView imageView;
    public LinkManager$$ExternalSyntheticLambda7 openedSettings;
    public DialogsActivity$$ExternalSyntheticLambda89 qrLoginDelegate;
    public GradientDrawable startMessagingButtonBackground;
    public TextView subtitleTextView;
    public TextView titleTextView;

    public final class AnonymousClass2 extends ViewGroup {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass2(Object obj, Context context, int i) {
            super(context);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public void draw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 1:
                    PipVideoOverlay pipVideoOverlay = (PipVideoOverlay) this.this$0;
                    if (!pipVideoOverlay.windowViewSkipRender) {
                        canvas.save();
                        canvas.scale(pipVideoOverlay.pipWidth / pipVideoOverlay.contentFrameLayout.getWidth(), pipVideoOverlay.pipHeight / pipVideoOverlay.contentFrameLayout.getHeight());
                        super.draw(canvas);
                        canvas.restore();
                        break;
                    }
                    break;
                case 2:
                    if (!((RTMPStreamPipOverlay) this.this$0).windowViewSkipRender) {
                        super.draw(canvas);
                        break;
                    }
                    break;
                case 3:
                    if (!((LiveStoryPipOverlay) this.this$0).windowViewSkipRender) {
                        super.draw(canvas);
                        break;
                    }
                    break;
                default:
                    super.draw(canvas);
                    break;
            }
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            switch (this.$r8$classId) {
                case 5:
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.this$0;
                    if (view == usersSelectActivity.listView || view == usersSelectActivity.emptyView) {
                        INavigationLayout iNavigationLayout = ((BaseFragment) usersSelectActivity).parentLayout;
                        int measuredHeight = usersSelectActivity.scrollView.getMeasuredHeight();
                        iNavigationLayout.getClass();
                        ((ActionBarLayout) iNavigationLayout).drawHeaderShadow(canvas, 255, measuredHeight);
                    }
                    return zDrawChild;
                default:
                    return super.drawChild(canvas, view, j);
            }
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            float f;
            float f2;
            switch (this.$r8$classId) {
                case 0:
                    ActionIntroActivity actionIntroActivity = (ActionIntroActivity) this.this$0;
                    if (((BaseFragment) actionIntroActivity).actionBar != null) {
                        ((BaseFragment) actionIntroActivity).actionBar.layout(0, 0, i3, ((BaseFragment) actionIntroActivity).actionBar.getMeasuredHeight());
                    }
                    int i5 = i3 - i;
                    int i6 = i4 - i2;
                    int i7 = actionIntroActivity.currentType;
                    if (i7 == 0) {
                        if (i3 <= i4) {
                            float f3 = i6;
                            int i8 = (int) (0.188f * f3);
                            RLottieImageView rLottieImageView = actionIntroActivity.imageView;
                            rLottieImageView.layout(0, i8, rLottieImageView.getMeasuredWidth(), actionIntroActivity.imageView.getMeasuredHeight() + i8);
                            int i9 = (int) (0.651f * f3);
                            TextView textView = actionIntroActivity.titleTextView;
                            textView.layout(0, i9, textView.getMeasuredWidth(), actionIntroActivity.titleTextView.getMeasuredHeight() + i9);
                            int i10 = (int) (0.731f * f3);
                            TextView textView2 = actionIntroActivity.descriptionText;
                            textView2.layout(0, i10, textView2.getMeasuredWidth(), actionIntroActivity.descriptionText.getMeasuredHeight() + i10);
                            int measuredWidth = (i5 - actionIntroActivity.buttonTextView.getMeasuredWidth()) / 2;
                            int i11 = (int) (f3 * 0.853f);
                            IntroActivity.AnonymousClass4 anonymousClass4 = actionIntroActivity.buttonTextView;
                            anonymousClass4.layout(measuredWidth, i11, anonymousClass4.getMeasuredWidth() + measuredWidth, actionIntroActivity.buttonTextView.getMeasuredHeight() + i11);
                        } else {
                            int measuredHeight = (i6 - actionIntroActivity.imageView.getMeasuredHeight()) / 2;
                            RLottieImageView rLottieImageView2 = actionIntroActivity.imageView;
                            rLottieImageView2.layout(0, measuredHeight, rLottieImageView2.getMeasuredWidth(), actionIntroActivity.imageView.getMeasuredHeight() + measuredHeight);
                            float f4 = i5;
                            float f5 = 0.4f * f4;
                            int i12 = (int) f5;
                            float f6 = i6;
                            int i13 = (int) (0.22f * f6);
                            TextView textView3 = actionIntroActivity.titleTextView;
                            textView3.layout(i12, i13, textView3.getMeasuredWidth() + i12, actionIntroActivity.titleTextView.getMeasuredHeight() + i13);
                            int i14 = (int) (0.39f * f6);
                            TextView textView4 = actionIntroActivity.descriptionText;
                            textView4.layout(i12, i14, textView4.getMeasuredWidth() + i12, actionIntroActivity.descriptionText.getMeasuredHeight() + i14);
                            int iM = (int) ImageReceiver$$ExternalSyntheticOutline0.m(f4 * 0.6f, actionIntroActivity.buttonTextView.getMeasuredWidth(), 2.0f, f5);
                            int i15 = (int) (f6 * 0.69f);
                            IntroActivity.AnonymousClass4 anonymousClass5 = actionIntroActivity.buttonTextView;
                            anonymousClass5.layout(iM, i15, anonymousClass5.getMeasuredWidth() + iM, actionIntroActivity.buttonTextView.getMeasuredHeight() + i15);
                        }
                        break;
                    } else if (i7 == 3) {
                        if (i3 <= i4) {
                            int i16 = (int) (i6 * 0.3f);
                            int measuredWidth2 = (i5 - actionIntroActivity.imageView.getMeasuredWidth()) / 2;
                            RLottieImageView rLottieImageView3 = actionIntroActivity.imageView;
                            rLottieImageView3.layout(measuredWidth2, i16, rLottieImageView3.getMeasuredWidth() + measuredWidth2, actionIntroActivity.imageView.getMeasuredHeight() + i16);
                            int iM2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(actionIntroActivity.imageView.getMeasuredHeight(), 24.0f, i16);
                            TextView textView5 = actionIntroActivity.titleTextView;
                            textView5.layout(0, iM2, textView5.getMeasuredWidth(), actionIntroActivity.titleTextView.getMeasuredHeight() + iM2);
                            int textSize = (int) (actionIntroActivity.titleTextView.getTextSize() + AndroidUtilities.dp(16.0f) + iM2);
                            TextView textView6 = actionIntroActivity.descriptionText;
                            textView6.layout(0, textSize, textView6.getMeasuredWidth(), actionIntroActivity.descriptionText.getMeasuredHeight() + textSize);
                            int measuredWidth3 = (i5 - actionIntroActivity.buttonTextView.getMeasuredWidth()) / 2;
                            int measuredHeight2 = (i6 - actionIntroActivity.buttonTextView.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                            IntroActivity.AnonymousClass4 anonymousClass6 = actionIntroActivity.buttonTextView;
                            anonymousClass6.layout(measuredWidth3, measuredHeight2, anonymousClass6.getMeasuredWidth() + measuredWidth3, actionIntroActivity.buttonTextView.getMeasuredHeight() + measuredHeight2);
                            int measuredWidth4 = (i5 - actionIntroActivity.subtitleTextView.getMeasuredWidth()) / 2;
                            int iM$1 = OKLCH.m$1(32.0f, actionIntroActivity.subtitleTextView.getMeasuredHeight(), measuredHeight2);
                            TextView textView7 = actionIntroActivity.subtitleTextView;
                            textView7.layout(measuredWidth4, iM$1, textView7.getMeasuredWidth() + measuredWidth4, actionIntroActivity.subtitleTextView.getMeasuredHeight() + iM$1);
                        } else {
                            float f7 = i6;
                            int measuredHeight3 = ((int) ((0.95f * f7) - actionIntroActivity.imageView.getMeasuredHeight())) / 2;
                            int width = (int) ((getWidth() * 0.35f) - actionIntroActivity.imageView.getMeasuredWidth());
                            RLottieImageView rLottieImageView4 = actionIntroActivity.imageView;
                            rLottieImageView4.layout(width, measuredHeight3, rLottieImageView4.getMeasuredWidth() + width, actionIntroActivity.imageView.getMeasuredHeight() + measuredHeight3);
                            float f8 = i5;
                            float f9 = 0.4f * f8;
                            int i17 = (int) f9;
                            int i18 = (int) (0.12f * f7);
                            TextView textView8 = actionIntroActivity.titleTextView;
                            textView8.layout(i17, i18, textView8.getMeasuredWidth() + i17, actionIntroActivity.titleTextView.getMeasuredHeight() + i18);
                            int i19 = (int) (0.24f * f7);
                            TextView textView9 = actionIntroActivity.descriptionText;
                            textView9.layout(i17, i19, textView9.getMeasuredWidth() + i17, actionIntroActivity.descriptionText.getMeasuredHeight() + i19);
                            float f10 = f8 * 0.6f;
                            int iM3 = (int) ImageReceiver$$ExternalSyntheticOutline0.m(f10, actionIntroActivity.buttonTextView.getMeasuredWidth(), 2.0f, f9);
                            int i20 = (int) (f7 * 0.8f);
                            IntroActivity.AnonymousClass4 anonymousClass7 = actionIntroActivity.buttonTextView;
                            anonymousClass7.layout(iM3, i20, anonymousClass7.getMeasuredWidth() + iM3, actionIntroActivity.buttonTextView.getMeasuredHeight() + i20);
                            int iM4 = (int) ImageReceiver$$ExternalSyntheticOutline0.m(f10, actionIntroActivity.subtitleTextView.getMeasuredWidth(), 2.0f, f9);
                            int iM$2 = OKLCH.m$1(16.0f, actionIntroActivity.subtitleTextView.getMeasuredHeight(), i20);
                            TextView textView10 = actionIntroActivity.subtitleTextView;
                            textView10.layout(iM4, iM$2, textView10.getMeasuredWidth() + iM4, actionIntroActivity.subtitleTextView.getMeasuredHeight() + iM$2);
                        }
                        break;
                    } else if (i7 == 5) {
                        if (i3 <= i4) {
                            if (AndroidUtilities.displaySize.y < 1800) {
                                f = i6;
                                int i21 = (int) (0.06f * f);
                                RLottieImageView rLottieImageView5 = actionIntroActivity.imageView;
                                rLottieImageView5.layout(0, i21, rLottieImageView5.getMeasuredWidth(), actionIntroActivity.imageView.getMeasuredHeight() + i21);
                                int i22 = (int) (0.463f * f);
                                TextView textView11 = actionIntroActivity.titleTextView;
                                textView11.layout(0, i22, textView11.getMeasuredWidth(), actionIntroActivity.titleTextView.getMeasuredHeight() + i22);
                                f2 = 0.543f;
                            } else {
                                f = i6;
                                int i23 = (int) (0.148f * f);
                                RLottieImageView rLottieImageView6 = actionIntroActivity.imageView;
                                rLottieImageView6.layout(0, i23, rLottieImageView6.getMeasuredWidth(), actionIntroActivity.imageView.getMeasuredHeight() + i23);
                                int i24 = (int) (0.551f * f);
                                TextView textView12 = actionIntroActivity.titleTextView;
                                textView12.layout(0, i24, textView12.getMeasuredWidth(), actionIntroActivity.titleTextView.getMeasuredHeight() + i24);
                                f2 = 0.631f;
                            }
                            int i25 = (int) (f * f2);
                            int measuredWidth5 = (getMeasuredWidth() - actionIntroActivity.descriptionLayout.getMeasuredWidth()) / 2;
                            LinearLayout linearLayout = actionIntroActivity.descriptionLayout;
                            linearLayout.layout(measuredWidth5, i25, linearLayout.getMeasuredWidth() + measuredWidth5, actionIntroActivity.descriptionLayout.getMeasuredHeight() + i25);
                            int measuredWidth6 = (i5 - actionIntroActivity.buttonTextView.getMeasuredWidth()) / 2;
                            int i26 = (int) (i6 * 0.853f);
                            IntroActivity.AnonymousClass4 anonymousClass8 = actionIntroActivity.buttonTextView;
                            anonymousClass8.layout(measuredWidth6, i26, anonymousClass8.getMeasuredWidth() + measuredWidth6, actionIntroActivity.buttonTextView.getMeasuredHeight() + i26);
                        } else {
                            int measuredHeight4 = (i6 - actionIntroActivity.imageView.getMeasuredHeight()) / 2;
                            RLottieImageView rLottieImageView7 = actionIntroActivity.imageView;
                            rLottieImageView7.layout(0, measuredHeight4, rLottieImageView7.getMeasuredWidth(), actionIntroActivity.imageView.getMeasuredHeight() + measuredHeight4);
                            float f11 = i5;
                            float f12 = 0.4f * f11;
                            int i27 = (int) f12;
                            float f13 = i6;
                            int i28 = (int) (0.08f * f13);
                            TextView textView13 = actionIntroActivity.titleTextView;
                            textView13.layout(i27, i28, textView13.getMeasuredWidth() + i27, actionIntroActivity.titleTextView.getMeasuredHeight() + i28);
                            float f14 = f11 * 0.6f;
                            int iM5 = (int) ImageReceiver$$ExternalSyntheticOutline0.m(f14, actionIntroActivity.descriptionLayout.getMeasuredWidth(), 2.0f, f12);
                            int i29 = (int) (0.25f * f13);
                            LinearLayout linearLayout2 = actionIntroActivity.descriptionLayout;
                            linearLayout2.layout(iM5, i29, linearLayout2.getMeasuredWidth() + iM5, actionIntroActivity.descriptionLayout.getMeasuredHeight() + i29);
                            int iM6 = (int) ImageReceiver$$ExternalSyntheticOutline0.m(f14, actionIntroActivity.buttonTextView.getMeasuredWidth(), 2.0f, f12);
                            int i30 = (int) (f13 * 0.78f);
                            IntroActivity.AnonymousClass4 anonymousClass9 = actionIntroActivity.buttonTextView;
                            anonymousClass9.layout(iM6, i30, anonymousClass9.getMeasuredWidth() + iM6, actionIntroActivity.buttonTextView.getMeasuredHeight() + i30);
                        }
                        break;
                    } else if (i7 == 6) {
                        if (i3 <= i4) {
                            int i31 = (int) (i6 * 0.3f);
                            int measuredWidth7 = (i5 - actionIntroActivity.imageView.getMeasuredWidth()) / 2;
                            RLottieImageView rLottieImageView8 = actionIntroActivity.imageView;
                            rLottieImageView8.layout(measuredWidth7, i31, rLottieImageView8.getMeasuredWidth() + measuredWidth7, actionIntroActivity.imageView.getMeasuredHeight() + i31);
                            int iM7 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(actionIntroActivity.imageView.getMeasuredHeight(), 24.0f, i31);
                            TextView textView14 = actionIntroActivity.titleTextView;
                            textView14.layout(0, iM7, textView14.getMeasuredWidth(), actionIntroActivity.titleTextView.getMeasuredHeight() + iM7);
                            int textSize2 = (int) (actionIntroActivity.titleTextView.getTextSize() + AndroidUtilities.dp(16.0f) + iM7);
                            TextView textView15 = actionIntroActivity.descriptionText;
                            textView15.layout(0, textSize2, textView15.getMeasuredWidth(), actionIntroActivity.descriptionText.getMeasuredHeight() + textSize2);
                            int measuredWidth8 = (i5 - actionIntroActivity.buttonTextView.getMeasuredWidth()) / 2;
                            int measuredHeight5 = (i6 - actionIntroActivity.buttonTextView.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                            IntroActivity.AnonymousClass4 anonymousClass10 = actionIntroActivity.buttonTextView;
                            anonymousClass10.layout(measuredWidth8, measuredHeight5, anonymousClass10.getMeasuredWidth() + measuredWidth8, actionIntroActivity.buttonTextView.getMeasuredHeight() + measuredHeight5);
                        } else {
                            int measuredHeight6 = (i6 - actionIntroActivity.imageView.getMeasuredHeight()) / 2;
                            float f15 = i5;
                            int measuredWidth9 = ((int) ((0.5f * f15) - actionIntroActivity.imageView.getMeasuredWidth())) / 2;
                            RLottieImageView rLottieImageView9 = actionIntroActivity.imageView;
                            rLottieImageView9.layout(measuredWidth9, measuredHeight6, rLottieImageView9.getMeasuredWidth() + measuredWidth9, actionIntroActivity.imageView.getMeasuredHeight() + measuredHeight6);
                            float f16 = 0.4f * f15;
                            int i32 = (int) f16;
                            float f17 = i6;
                            int i33 = (int) (0.14f * f17);
                            TextView textView16 = actionIntroActivity.titleTextView;
                            textView16.layout(i32, i33, textView16.getMeasuredWidth() + i32, actionIntroActivity.titleTextView.getMeasuredHeight() + i33);
                            int i34 = (int) (0.31f * f17);
                            TextView textView17 = actionIntroActivity.descriptionText;
                            textView17.layout(i32, i34, textView17.getMeasuredWidth() + i32, actionIntroActivity.descriptionText.getMeasuredHeight() + i34);
                            int iM8 = (int) ImageReceiver$$ExternalSyntheticOutline0.m(f15 * 0.6f, actionIntroActivity.buttonTextView.getMeasuredWidth(), 2.0f, f16);
                            int i35 = (int) (f17 * 0.78f);
                            IntroActivity.AnonymousClass4 anonymousClass11 = actionIntroActivity.buttonTextView;
                            anonymousClass11.layout(iM8, i35, anonymousClass11.getMeasuredWidth() + iM8, actionIntroActivity.buttonTextView.getMeasuredHeight() + i35);
                        }
                        break;
                    }
                    break;
                case 1:
                    PipVideoOverlay pipVideoOverlay = (PipVideoOverlay) this.this$0;
                    pipVideoOverlay.contentFrameLayout.layout(0, 0, pipVideoOverlay.pipWidth, pipVideoOverlay.pipHeight);
                    break;
                case 2:
                    RTMPStreamPipOverlay rTMPStreamPipOverlay = (RTMPStreamPipOverlay) this.this$0;
                    if (rTMPStreamPipOverlay.contentFrameLayout.getParent() == this) {
                        rTMPStreamPipOverlay.contentFrameLayout.layout(0, 0, rTMPStreamPipOverlay.pipWidth, rTMPStreamPipOverlay.pipHeight);
                    }
                    break;
                case 3:
                    LiveStoryPipOverlay liveStoryPipOverlay = (LiveStoryPipOverlay) this.this$0;
                    if (liveStoryPipOverlay.contentFrameLayout.getParent() == this) {
                        liveStoryPipOverlay.contentFrameLayout.layout(0, 0, liveStoryPipOverlay.pipWidth, liveStoryPipOverlay.pipHeight);
                    }
                    break;
                case 4:
                    TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = (TwoStepVerificationSetupActivity) this.this$0;
                    ((BaseFragment) twoStepVerificationSetupActivity).actionBar.layout(0, 0, i3, ((BaseFragment) twoStepVerificationSetupActivity).actionBar.getMeasuredHeight());
                    int i36 = i3 - i;
                    int i37 = i4 - i2;
                    if (i3 <= i4) {
                        int i38 = (int) (i37 * 0.3f);
                        int measuredWidth10 = (i36 - twoStepVerificationSetupActivity.imageView.getMeasuredWidth()) / 2;
                        RLottieImageView rLottieImageView10 = twoStepVerificationSetupActivity.imageView;
                        rLottieImageView10.layout(measuredWidth10, i38, rLottieImageView10.getMeasuredWidth() + measuredWidth10, twoStepVerificationSetupActivity.imageView.getMeasuredHeight() + i38);
                        int iM9 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(twoStepVerificationSetupActivity.imageView.getMeasuredHeight(), 16.0f, i38);
                        TextView textView18 = twoStepVerificationSetupActivity.titleTextView;
                        textView18.layout(0, iM9, textView18.getMeasuredWidth(), twoStepVerificationSetupActivity.titleTextView.getMeasuredHeight() + iM9);
                        int iM10 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(twoStepVerificationSetupActivity.titleTextView.getMeasuredHeight(), 12.0f, iM9);
                        SpoilersTextView spoilersTextView = twoStepVerificationSetupActivity.descriptionText;
                        spoilersTextView.layout(0, iM10, spoilersTextView.getMeasuredWidth(), twoStepVerificationSetupActivity.descriptionText.getMeasuredHeight() + iM10);
                        int measuredWidth11 = (i36 - twoStepVerificationSetupActivity.buttonTextView.getMeasuredWidth()) / 2;
                        int measuredHeight7 = (i37 - twoStepVerificationSetupActivity.buttonTextView.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                        TextView textView19 = twoStepVerificationSetupActivity.buttonTextView;
                        textView19.layout(measuredWidth11, measuredHeight7, textView19.getMeasuredWidth() + measuredWidth11, twoStepVerificationSetupActivity.buttonTextView.getMeasuredHeight() + measuredHeight7);
                    } else {
                        int measuredHeight8 = (i37 - twoStepVerificationSetupActivity.imageView.getMeasuredHeight()) / 2;
                        RLottieImageView rLottieImageView11 = twoStepVerificationSetupActivity.imageView;
                        rLottieImageView11.layout(0, measuredHeight8, rLottieImageView11.getMeasuredWidth(), twoStepVerificationSetupActivity.imageView.getMeasuredHeight() + measuredHeight8);
                        float f18 = i36;
                        float f19 = 0.4f * f18;
                        int i39 = (int) f19;
                        float f20 = i37;
                        int i40 = (int) (0.22f * f20);
                        TextView textView20 = twoStepVerificationSetupActivity.titleTextView;
                        textView20.layout(i39, i40, textView20.getMeasuredWidth() + i39, twoStepVerificationSetupActivity.titleTextView.getMeasuredHeight() + i40);
                        int i41 = (int) (0.39f * f20);
                        SpoilersTextView spoilersTextView2 = twoStepVerificationSetupActivity.descriptionText;
                        spoilersTextView2.layout(i39, i41, spoilersTextView2.getMeasuredWidth() + i39, twoStepVerificationSetupActivity.descriptionText.getMeasuredHeight() + i41);
                        int iM11 = (int) ImageReceiver$$ExternalSyntheticOutline0.m(f18 * 0.6f, twoStepVerificationSetupActivity.buttonTextView.getMeasuredWidth(), 2.0f, f19);
                        int i42 = (int) (f20 * 0.64f);
                        TextView textView21 = twoStepVerificationSetupActivity.buttonTextView;
                        textView21.layout(iM11, i42, textView21.getMeasuredWidth() + iM11, twoStepVerificationSetupActivity.buttonTextView.getMeasuredHeight() + i42);
                    }
                    break;
                default:
                    UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.this$0;
                    LoginActivity.AnonymousClass3 anonymousClass3 = usersSelectActivity.scrollView;
                    anonymousClass3.layout(0, 0, anonymousClass3.getMeasuredWidth(), usersSelectActivity.scrollView.getMeasuredHeight());
                    usersSelectActivity.listView.layout(0, usersSelectActivity.scrollView.getMeasuredHeight(), usersSelectActivity.listView.getMeasuredWidth(), usersSelectActivity.listView.getMeasuredHeight() + usersSelectActivity.scrollView.getMeasuredHeight());
                    usersSelectActivity.emptyView.layout(0, usersSelectActivity.scrollView.getMeasuredHeight(), usersSelectActivity.emptyView.getMeasuredWidth(), usersSelectActivity.emptyView.getMeasuredHeight() + usersSelectActivity.scrollView.getMeasuredHeight());
                    usersSelectActivity.progressView.layout(0, usersSelectActivity.scrollView.getMeasuredHeight(), usersSelectActivity.emptyView.getMeasuredWidth(), usersSelectActivity.progressView.getMeasuredHeight() + usersSelectActivity.scrollView.getMeasuredHeight());
                    FragmentFloatingButton fragmentFloatingButton = usersSelectActivity.floatingButton;
                    if (fragmentFloatingButton != null) {
                        int measuredWidth12 = LocaleController.isRTL ? usersSelectActivity.floatingButtonLp.leftMargin : ((i3 - i) - usersSelectActivity.floatingButtonLp.rightMargin) - fragmentFloatingButton.getMeasuredWidth();
                        int measuredHeight9 = ((i4 - i2) - usersSelectActivity.floatingButtonLp.bottomMargin) - usersSelectActivity.floatingButton.getMeasuredHeight();
                        FragmentFloatingButton fragmentFloatingButton2 = usersSelectActivity.floatingButton;
                        fragmentFloatingButton2.layout(measuredWidth12, measuredHeight9, fragmentFloatingButton2.getMeasuredWidth() + measuredWidth12, usersSelectActivity.floatingButton.getMeasuredHeight() + measuredHeight9);
                    }
                    break;
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    int size = View.MeasureSpec.getSize(i);
                    int size2 = View.MeasureSpec.getSize(i2);
                    ActionIntroActivity actionIntroActivity = (ActionIntroActivity) this.this$0;
                    if (((BaseFragment) actionIntroActivity).actionBar != null) {
                        ((BaseFragment) actionIntroActivity).actionBar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
                    }
                    int i3 = actionIntroActivity.currentType;
                    if (i3 != 0) {
                        if (i3 == 3) {
                            actionIntroActivity.imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), 1073741824));
                            if (size > size2) {
                                float f = size;
                                actionIntroActivity.subtitleTextView.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                int i4 = (int) (f * 0.6f);
                                actionIntroActivity.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                actionIntroActivity.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                actionIntroActivity.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                            } else {
                                actionIntroActivity.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                actionIntroActivity.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                actionIntroActivity.subtitleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                actionIntroActivity.buttonTextView.measure(OKLCH.m(size, 48.0f, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                            }
                        } else if (i3 != 5) {
                            if (i3 == 6) {
                                if (i3 == 6) {
                                    actionIntroActivity.imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), 1073741824));
                                } else {
                                    actionIntroActivity.imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                                }
                                if (size > size2) {
                                    int i5 = (int) (size * 0.6f);
                                    actionIntroActivity.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    actionIntroActivity.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    actionIntroActivity.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                                } else {
                                    actionIntroActivity.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    actionIntroActivity.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    if (i3 == 6) {
                                        actionIntroActivity.buttonTextView.measure(OKLCH.m(size, 48.0f, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                                    } else {
                                        actionIntroActivity.buttonTextView.measure(OKLCH.m(size, 72.0f, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                                    }
                                }
                            }
                        } else if (size > size2) {
                            float f2 = size;
                            actionIntroActivity.imageView.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f2), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                            int i6 = (int) (f2 * 0.6f);
                            actionIntroActivity.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            actionIntroActivity.descriptionLayout.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            actionIntroActivity.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        } else {
                            actionIntroActivity.imageView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                            actionIntroActivity.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            actionIntroActivity.descriptionLayout.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            actionIntroActivity.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        }
                    } else if (size > size2) {
                        float f3 = size;
                        actionIntroActivity.imageView.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f3), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                        int i7 = (int) (f3 * 0.6f);
                        actionIntroActivity.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        actionIntroActivity.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        actionIntroActivity.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                    } else {
                        actionIntroActivity.imageView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                        actionIntroActivity.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        actionIntroActivity.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        actionIntroActivity.buttonTextView.measure(OKLCH.m(size, 72.0f, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                    }
                    setMeasuredDimension(size, size2);
                    break;
                case 1:
                    setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                    PipVideoOverlay pipVideoOverlay = (PipVideoOverlay) this.this$0;
                    pipVideoOverlay.contentFrameLayout.measure(View.MeasureSpec.makeMeasureSpec(pipVideoOverlay.pipWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(pipVideoOverlay.pipHeight, 1073741824));
                    break;
                case 2:
                    setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                    RTMPStreamPipOverlay rTMPStreamPipOverlay = (RTMPStreamPipOverlay) this.this$0;
                    if (rTMPStreamPipOverlay.contentFrameLayout.getParent() == this) {
                        rTMPStreamPipOverlay.contentFrameLayout.measure(View.MeasureSpec.makeMeasureSpec(rTMPStreamPipOverlay.pipWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(rTMPStreamPipOverlay.pipHeight, 1073741824));
                    }
                    break;
                case 3:
                    setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                    LiveStoryPipOverlay liveStoryPipOverlay = (LiveStoryPipOverlay) this.this$0;
                    if (liveStoryPipOverlay.contentFrameLayout.getParent() == this) {
                        liveStoryPipOverlay.contentFrameLayout.measure(View.MeasureSpec.makeMeasureSpec(liveStoryPipOverlay.pipWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(liveStoryPipOverlay.pipHeight, 1073741824));
                    }
                    break;
                case 4:
                    int size3 = View.MeasureSpec.getSize(i);
                    int size4 = View.MeasureSpec.getSize(i2);
                    TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = (TwoStepVerificationSetupActivity) this.this$0;
                    ((BaseFragment) twoStepVerificationSetupActivity).actionBar.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i2);
                    if (size3 > size4) {
                        float f4 = size3;
                        twoStepVerificationSetupActivity.imageView.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f4), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), 1073741824));
                        int i8 = (int) (f4 * 0.6f);
                        twoStepVerificationSetupActivity.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                        twoStepVerificationSetupActivity.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                        twoStepVerificationSetupActivity.descriptionText2.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                        twoStepVerificationSetupActivity.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
                    } else {
                        float f5 = twoStepVerificationSetupActivity.currentType == 7 ? 160 : 140;
                        twoStepVerificationSetupActivity.imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f5), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f5), 1073741824));
                        twoStepVerificationSetupActivity.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                        twoStepVerificationSetupActivity.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                        twoStepVerificationSetupActivity.descriptionText2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                        twoStepVerificationSetupActivity.buttonTextView.measure(OKLCH.m(size3, 48.0f, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                    }
                    setMeasuredDimension(size3, size4);
                    break;
                default:
                    int size5 = View.MeasureSpec.getSize(i);
                    int size6 = View.MeasureSpec.getSize(i2);
                    setMeasuredDimension(size5, size6);
                    int iDp = (AndroidUtilities.isTablet() || size6 > size5) ? AndroidUtilities.dp(144.0f) : AndroidUtilities.dp(56.0f);
                    UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.this$0;
                    usersSelectActivity.scrollView.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
                    usersSelectActivity.listView.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.scrollView.getMeasuredHeight(), 1073741824));
                    usersSelectActivity.emptyView.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.scrollView.getMeasuredHeight(), 1073741824));
                    usersSelectActivity.progressView.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.scrollView.getMeasuredHeight(), 1073741824));
                    FragmentFloatingButton fragmentFloatingButton = usersSelectActivity.floatingButton;
                    if (fragmentFloatingButton != null) {
                        int i9 = usersSelectActivity.floatingButtonLp.width;
                        fragmentFloatingButton.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
                    }
                    break;
            }
        }
    }

    public ActionIntroActivity(int i) {
        super(null);
        this.descriptionLines = new TextView[6];
        this.currentType = i;
    }

    @Override
    public final View createView(Context context) {
        float f;
        float f2;
        int i = 3;
        int i2 = 2;
        final int i3 = 1;
        ActionBar actionBar = this.actionBar;
        final int i4 = 0;
        if (actionBar != null) {
            actionBar.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setItemsColor(Theme.getColor(null, Theme.key_actionBarDefaultIcon, false), false);
            this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_actionBarDefaultSelector, false), false);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, i3));
        }
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this, context, i4);
        this.fragmentView = anonymousClass2;
        anonymousClass2.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        viewGroup.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
        ActionBar actionBar2 = this.actionBar;
        if (actionBar2 != null) {
            viewGroup.addView(actionBar2);
        }
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        viewGroup.addView(rLottieImageView);
        TextView textView = new TextView(context);
        this.titleTextView = textView;
        int i5 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(null, i5, false));
        this.titleTextView.setGravity(1);
        this.titleTextView.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.titleTextView.setTextSize(1, 24.0f);
        viewGroup.addView(this.titleTextView);
        TextView textView2 = new TextView(context);
        this.subtitleTextView = textView2;
        int i6 = this.currentType;
        if (i6 == 3) {
            i5 = Theme.key_featuredStickers_addButton;
        }
        textView2.setTextColor(Theme.getColor(null, i5, false));
        this.subtitleTextView.setGravity(1);
        float f3 = 15.0f;
        this.subtitleTextView.setTextSize(1, 15.0f);
        this.subtitleTextView.setSingleLine(true);
        this.subtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.subtitleTextView.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.subtitleTextView.setVisibility(8);
        viewGroup.addView(this.subtitleTextView);
        TextView textView3 = new TextView(context);
        this.descriptionText = textView3;
        textView3.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText6, false));
        this.descriptionText.setGravity(1);
        this.descriptionText.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.descriptionText.setTextSize(1, 15.0f);
        if (i6 == 6 || i6 == 3) {
            f = 24.0f;
            f2 = 2.0f;
            this.descriptionText.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        } else {
            f = 24.0f;
            f2 = 2.0f;
            this.descriptionText.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        }
        viewGroup.addView(this.descriptionText);
        if (i6 == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.descriptionLayout = linearLayout;
            linearLayout.setOrientation(1);
            this.descriptionLayout.setPadding(AndroidUtilities.dp(f), 0, AndroidUtilities.dp(f), 0);
            this.descriptionLayout.setGravity(LocaleController.isRTL ? 5 : 3);
            viewGroup.addView(this.descriptionLayout);
            int i7 = 0;
            while (i7 < i) {
                LinearLayout linearLayoutM = zzkf.m(context, 0);
                this.descriptionLayout.addView(linearLayoutM, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, i7 != i2 ? 7.0f : 0.0f, -2, -2));
                int i8 = i7 * 2;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.descriptionLines;
                textViewArr[i8] = textView4;
                int i9 = Theme.key_windowBackgroundWhiteBlackText;
                textView4.setTextColor(Theme.getColor(null, i9, false));
                textViewArr[i8].setGravity(LocaleController.isRTL ? 5 : 3);
                textViewArr[i8].setTextSize(1, f3);
                int i10 = i7 + 1;
                textViewArr[i8].setText(String.format(LocaleController.isRTL ? ".%d" : "%d.", Integer.valueOf(i10)));
                textViewArr[i8].setTypeface(AndroidUtilities.bold());
                int i11 = i8 + 1;
                TextView textView5 = new TextView(context);
                textViewArr[i11] = textView5;
                textView5.setTextColor(Theme.getColor(null, i9, false));
                textViewArr[i11].setGravity(LocaleController.isRTL ? 5 : 3);
                textViewArr[i11].setTextSize(1, f3);
                if (i7 == 0) {
                    textViewArr[i11].setLinkTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkText, false));
                    textViewArr[i11].setHighlightColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkSelection, false));
                    String string = LocaleController.getString(R.string.AuthAnotherClientInfo1);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    int iIndexOf = string.indexOf(42);
                    int iLastIndexOf = string.lastIndexOf(42);
                    if (iIndexOf != -1 && iLastIndexOf != -1 && iIndexOf != iLastIndexOf) {
                        textViewArr[i11].setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(iLastIndexOf, iLastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(iIndexOf, iIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new URLSpanNoUnderline(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), null), iIndexOf, iLastIndexOf - 1, 33);
                    }
                    textViewArr[i11].setText(spannableStringBuilder);
                } else if (i7 == 1) {
                    textViewArr[i11].setText(LocaleController.getString(R.string.AuthAnotherClientInfo2));
                } else {
                    textViewArr[i11].setText(LocaleController.getString(R.string.AuthAnotherClientInfo3));
                }
                if (LocaleController.isRTL) {
                    linearLayoutM.setGravity(5);
                    linearLayoutM.addView(textViewArr[i11], LayoutHelper.createLinear(1.0f, 0, -2));
                    linearLayoutM.addView(textViewArr[i8], LayoutHelper.createLinear(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    linearLayoutM.addView(textViewArr[i8], LayoutHelper.createLinear(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    linearLayoutM.addView(textViewArr[i11], LayoutHelper.createLinear(-2, -2));
                }
                i7 = i10;
                i = 3;
                i2 = 2;
                f3 = 15.0f;
            }
            this.descriptionText.setVisibility(8);
        }
        TextView textView6 = new TextView(context);
        this.descriptionText2 = textView6;
        textView6.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText6, false));
        this.descriptionText2.setGravity(1);
        this.descriptionText2.setLineSpacing(AndroidUtilities.dp(f2), 1.0f);
        this.descriptionText2.setTextSize(1, 13.0f);
        this.descriptionText2.setVisibility(8);
        this.descriptionText2.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        viewGroup.addView(this.descriptionText2);
        this.startMessagingButtonBackground = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        IntroActivity.AnonymousClass4 anonymousClass4 = new IntroActivity.AnonymousClass4(this, context);
        this.buttonTextView = anonymousClass4;
        ScaleStateListAnimator.apply(anonymousClass4, 0.02f, 1.2f);
        this.buttonTextView.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.buttonTextView.setGravity(17);
        this.buttonTextView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
        this.buttonTextView.setTextSize(1, 14.0f);
        this.buttonTextView.setTypeface(AndroidUtilities.bold());
        IntroActivity.AnonymousClass4 anonymousClass5 = this.buttonTextView;
        int iDp = AndroidUtilities.dp(f);
        int color = Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
        anonymousClass5.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, color, color));
        viewGroup.addView(this.buttonTextView);
        this.buttonTextView.setOnClickListener(new View.OnClickListener(this) {
            public final ActionIntroActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        ActionIntroActivity actionIntroActivity = this.f$0;
                        if (actionIntroActivity.getParentActivity() != null) {
                            int i12 = actionIntroActivity.currentType;
                            if (i12 == 0) {
                                actionIntroActivity.presentFragment(new ChannelCreateActivity(NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(0, "step")), true);
                                break;
                            } else if (i12 == 3) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(actionIntroActivity.getParentActivity(), 0, null);
                                String string2 = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                AlertDialog alertDialog = builder.alertDialog;
                                alertDialog.title = string2;
                                alertDialog.message = LocaleController.getString(R.string.PhoneNumberAlert);
                                builder.setPositiveButton(LocaleController.getString(R.string.Change), new ActionIntroActivity$$ExternalSyntheticLambda2(actionIntroActivity, 1));
                                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                actionIntroActivity.showDialog(alertDialog);
                                break;
                            } else if (i12 == 5) {
                                if (actionIntroActivity.getParentActivity() != null) {
                                    if (Build.VERSION.SDK_INT >= 23 && actionIntroActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                        actionIntroActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                    } else {
                                        CameraScanActivity.showAsSheet(actionIntroActivity.getParentActivity(), 1, new ChatActivity.AnonymousClass1(actionIntroActivity, 16));
                                    }
                                    break;
                                }
                            } else if (i12 == 6) {
                                actionIntroActivity.presentFragment(new PasscodeActivity(1), true);
                                LinkManager$$ExternalSyntheticLambda7 linkManager$$ExternalSyntheticLambda7 = actionIntroActivity.openedSettings;
                                if (linkManager$$ExternalSyntheticLambda7 != null) {
                                    AndroidUtilities.runOnUIThread(linkManager$$ExternalSyntheticLambda7);
                                    actionIntroActivity.openedSettings = null;
                                }
                                break;
                            }
                        }
                        break;
                    case 1:
                        ActionIntroActivity actionIntroActivity2 = this.f$0;
                        if (!actionIntroActivity2.imageView.getAnimatedDrawable().isRunning) {
                            actionIntroActivity2.imageView.getAnimatedDrawable().setCurrentFrame(0, false, false);
                            actionIntroActivity2.imageView.playAnimation();
                        }
                        break;
                    case 2:
                        ActionIntroActivity actionIntroActivity3 = this.f$0;
                        if (!actionIntroActivity3.imageView.getAnimatedDrawable().isRunning) {
                            actionIntroActivity3.imageView.getAnimatedDrawable().setCurrentFrame(0, false, false);
                            actionIntroActivity3.imageView.playAnimation();
                        }
                        break;
                    default:
                        ((ActionBarLayout) this.f$0.getParentLayout()).closeLastFragment(true, false);
                        break;
                }
            }
        });
        if (i6 == 0) {
            this.imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.imageView.setAnimation(R.raw.channel_create, 200, 200, null);
            this.titleTextView.setText(LocaleController.getString(R.string.ChannelAlertTitle));
            this.descriptionText.setText(LocaleController.getString(R.string.ChannelAlertText));
            this.buttonTextView.setText(LocaleController.getString(R.string.ChannelAlertCreate2));
            this.imageView.playAnimation();
            this.flickerButton = true;
        } else if (i6 == 3) {
            this.subtitleTextView.setVisibility(0);
            this.imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.imageView.setAnimation(R.raw.utyan_change_number, 200, 200, null);
            final int i12 = 2;
            this.imageView.setOnClickListener(new View.OnClickListener(this) {
                public final ActionIntroActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            ActionIntroActivity actionIntroActivity = this.f$0;
                            if (actionIntroActivity.getParentActivity() != null) {
                                int i13 = actionIntroActivity.currentType;
                                if (i13 == 0) {
                                    actionIntroActivity.presentFragment(new ChannelCreateActivity(NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(0, "step")), true);
                                    break;
                                } else if (i13 == 3) {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(actionIntroActivity.getParentActivity(), 0, null);
                                    String string2 = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                    AlertDialog alertDialog = builder.alertDialog;
                                    alertDialog.title = string2;
                                    alertDialog.message = LocaleController.getString(R.string.PhoneNumberAlert);
                                    builder.setPositiveButton(LocaleController.getString(R.string.Change), new ActionIntroActivity$$ExternalSyntheticLambda2(actionIntroActivity, 1));
                                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                    actionIntroActivity.showDialog(alertDialog);
                                    break;
                                } else if (i13 == 5) {
                                    if (actionIntroActivity.getParentActivity() != null) {
                                        if (Build.VERSION.SDK_INT >= 23 && actionIntroActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                            actionIntroActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                        } else {
                                            CameraScanActivity.showAsSheet(actionIntroActivity.getParentActivity(), 1, new ChatActivity.AnonymousClass1(actionIntroActivity, 16));
                                        }
                                        break;
                                    }
                                } else if (i13 == 6) {
                                    actionIntroActivity.presentFragment(new PasscodeActivity(1), true);
                                    LinkManager$$ExternalSyntheticLambda7 linkManager$$ExternalSyntheticLambda7 = actionIntroActivity.openedSettings;
                                    if (linkManager$$ExternalSyntheticLambda7 != null) {
                                        AndroidUtilities.runOnUIThread(linkManager$$ExternalSyntheticLambda7);
                                        actionIntroActivity.openedSettings = null;
                                    }
                                    break;
                                }
                            }
                            break;
                        case 1:
                            ActionIntroActivity actionIntroActivity2 = this.f$0;
                            if (!actionIntroActivity2.imageView.getAnimatedDrawable().isRunning) {
                                actionIntroActivity2.imageView.getAnimatedDrawable().setCurrentFrame(0, false, false);
                                actionIntroActivity2.imageView.playAnimation();
                            }
                            break;
                        case 2:
                            ActionIntroActivity actionIntroActivity3 = this.f$0;
                            if (!actionIntroActivity3.imageView.getAnimatedDrawable().isRunning) {
                                actionIntroActivity3.imageView.getAnimatedDrawable().setCurrentFrame(0, false, false);
                                actionIntroActivity3.imageView.playAnimation();
                            }
                            break;
                        default:
                            ((ActionBarLayout) this.f$0.getParentLayout()).closeLastFragment(true, false);
                            break;
                    }
                }
            });
            UserConfig userConfig = getUserConfig();
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
            if (user == null) {
                user = userConfig.getCurrentUser();
            }
            if (user != null) {
                this.subtitleTextView.setText(LocaleController.formatString("PhoneNumberKeepButton", R.string.PhoneNumberKeepButton, UserObject$$ExternalSyntheticOutline0.m(new StringBuilder("+"), user.phone, PhoneFormat.getInstance())));
            }
            final int i13 = 3;
            this.subtitleTextView.setOnClickListener(new View.OnClickListener(this) {
                public final ActionIntroActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            ActionIntroActivity actionIntroActivity = this.f$0;
                            if (actionIntroActivity.getParentActivity() != null) {
                                int i14 = actionIntroActivity.currentType;
                                if (i14 == 0) {
                                    actionIntroActivity.presentFragment(new ChannelCreateActivity(NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(0, "step")), true);
                                    break;
                                } else if (i14 == 3) {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(actionIntroActivity.getParentActivity(), 0, null);
                                    String string2 = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                    AlertDialog alertDialog = builder.alertDialog;
                                    alertDialog.title = string2;
                                    alertDialog.message = LocaleController.getString(R.string.PhoneNumberAlert);
                                    builder.setPositiveButton(LocaleController.getString(R.string.Change), new ActionIntroActivity$$ExternalSyntheticLambda2(actionIntroActivity, 1));
                                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                    actionIntroActivity.showDialog(alertDialog);
                                    break;
                                } else if (i14 == 5) {
                                    if (actionIntroActivity.getParentActivity() != null) {
                                        if (Build.VERSION.SDK_INT >= 23 && actionIntroActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                            actionIntroActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                        } else {
                                            CameraScanActivity.showAsSheet(actionIntroActivity.getParentActivity(), 1, new ChatActivity.AnonymousClass1(actionIntroActivity, 16));
                                        }
                                        break;
                                    }
                                } else if (i14 == 6) {
                                    actionIntroActivity.presentFragment(new PasscodeActivity(1), true);
                                    LinkManager$$ExternalSyntheticLambda7 linkManager$$ExternalSyntheticLambda7 = actionIntroActivity.openedSettings;
                                    if (linkManager$$ExternalSyntheticLambda7 != null) {
                                        AndroidUtilities.runOnUIThread(linkManager$$ExternalSyntheticLambda7);
                                        actionIntroActivity.openedSettings = null;
                                    }
                                    break;
                                }
                            }
                            break;
                        case 1:
                            ActionIntroActivity actionIntroActivity2 = this.f$0;
                            if (!actionIntroActivity2.imageView.getAnimatedDrawable().isRunning) {
                                actionIntroActivity2.imageView.getAnimatedDrawable().setCurrentFrame(0, false, false);
                                actionIntroActivity2.imageView.playAnimation();
                            }
                            break;
                        case 2:
                            ActionIntroActivity actionIntroActivity3 = this.f$0;
                            if (!actionIntroActivity3.imageView.getAnimatedDrawable().isRunning) {
                                actionIntroActivity3.imageView.getAnimatedDrawable().setCurrentFrame(0, false, false);
                                actionIntroActivity3.imageView.playAnimation();
                            }
                            break;
                        default:
                            ((ActionBarLayout) this.f$0.getParentLayout()).closeLastFragment(true, false);
                            break;
                    }
                }
            });
            TextView textView7 = this.titleTextView;
            int i14 = R.string.PhoneNumberChange2;
            textView7.setText(LocaleController.getString(i14));
            FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(R.string.PhoneNumberHelp, this.descriptionText);
            this.buttonTextView.setText(LocaleController.getString(i14));
            this.imageView.playAnimation();
            this.flickerButton = true;
        } else if (i6 == 5) {
            int[] iArr = new int[8];
            this.colors = iArr;
            this.imageView.setAnimation(R.raw.qr_login, 334, 334, iArr);
            this.imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.titleTextView.setText(LocaleController.getString(R.string.AuthAnotherClient));
            this.buttonTextView.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
            this.imageView.playAnimation();
        } else if (i6 == 6) {
            this.imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.imageView.setAnimation(R.raw.utyan_passcode, 200, 200, null);
            this.imageView.setFocusable(false);
            this.imageView.setOnClickListener(new View.OnClickListener(this) {
                public final ActionIntroActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            ActionIntroActivity actionIntroActivity = this.f$0;
                            if (actionIntroActivity.getParentActivity() != null) {
                                int i15 = actionIntroActivity.currentType;
                                if (i15 == 0) {
                                    actionIntroActivity.presentFragment(new ChannelCreateActivity(NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(0, "step")), true);
                                    break;
                                } else if (i15 == 3) {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(actionIntroActivity.getParentActivity(), 0, null);
                                    String string2 = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                    AlertDialog alertDialog = builder.alertDialog;
                                    alertDialog.title = string2;
                                    alertDialog.message = LocaleController.getString(R.string.PhoneNumberAlert);
                                    builder.setPositiveButton(LocaleController.getString(R.string.Change), new ActionIntroActivity$$ExternalSyntheticLambda2(actionIntroActivity, 1));
                                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                    actionIntroActivity.showDialog(alertDialog);
                                    break;
                                } else if (i15 == 5) {
                                    if (actionIntroActivity.getParentActivity() != null) {
                                        if (Build.VERSION.SDK_INT >= 23 && actionIntroActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                            actionIntroActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                        } else {
                                            CameraScanActivity.showAsSheet(actionIntroActivity.getParentActivity(), 1, new ChatActivity.AnonymousClass1(actionIntroActivity, 16));
                                        }
                                        break;
                                    }
                                } else if (i15 == 6) {
                                    actionIntroActivity.presentFragment(new PasscodeActivity(1), true);
                                    LinkManager$$ExternalSyntheticLambda7 linkManager$$ExternalSyntheticLambda7 = actionIntroActivity.openedSettings;
                                    if (linkManager$$ExternalSyntheticLambda7 != null) {
                                        AndroidUtilities.runOnUIThread(linkManager$$ExternalSyntheticLambda7);
                                        actionIntroActivity.openedSettings = null;
                                    }
                                    break;
                                }
                            }
                            break;
                        case 1:
                            ActionIntroActivity actionIntroActivity2 = this.f$0;
                            if (!actionIntroActivity2.imageView.getAnimatedDrawable().isRunning) {
                                actionIntroActivity2.imageView.getAnimatedDrawable().setCurrentFrame(0, false, false);
                                actionIntroActivity2.imageView.playAnimation();
                            }
                            break;
                        case 2:
                            ActionIntroActivity actionIntroActivity3 = this.f$0;
                            if (!actionIntroActivity3.imageView.getAnimatedDrawable().isRunning) {
                                actionIntroActivity3.imageView.getAnimatedDrawable().setCurrentFrame(0, false, false);
                                actionIntroActivity3.imageView.playAnimation();
                            }
                            break;
                        default:
                            ((ActionBarLayout) this.f$0.getParentLayout()).closeLastFragment(true, false);
                            break;
                    }
                }
            });
            this.titleTextView.setText(LocaleController.getString(R.string.Passcode));
            this.descriptionText.setText(LocaleController.getString(R.string.ChangePasscodeInfoShort));
            this.buttonTextView.setText(LocaleController.getString(R.string.EnablePasscode));
            this.imageView.playAnimation();
            this.flickerButton = true;
        }
        if (this.flickerButton) {
            this.buttonTextView.setPadding(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f));
            this.buttonTextView.setTextSize(1, 15.0f);
        }
        updateColors$12();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ChatActivity$$ExternalSyntheticLambda94 chatActivity$$ExternalSyntheticLambda94 = new ChatActivity$$ExternalSyntheticLambda94(this, 1);
        View view = this.fragmentView;
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(view, 1, null, null, null, chatActivity$$ExternalSyntheticLambda94, i));
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            arrayList.add(new ThemeDescription(actionBar, 1, null, null, null, null, i));
            arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
            arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        }
        TextView textView = this.titleTextView;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(textView, 4, null, null, null, chatActivity$$ExternalSyntheticLambda94, i2));
        arrayList.add(new ThemeDescription(this.subtitleTextView, 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.descriptionText, 4, null, null, null, null, Theme.key_windowBackgroundWhiteGrayText6));
        TextView[] textViewArr = this.descriptionLines;
        arrayList.add(new ThemeDescription(textViewArr[0], 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(textViewArr[1], 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(textViewArr[1], 2, null, null, null, null, Theme.key_windowBackgroundWhiteLinkText));
        arrayList.add(new ThemeDescription(textViewArr[2], 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(textViewArr[3], 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(textViewArr[4], 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(textViewArr[5], 4, null, null, null, null, i2));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(null, Theme.key_windowBackgroundWhite, true)) > 0.699999988079071d;
    }

    @Override
    public final void onLocationAddressAvailable(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        TextView textView = this.subtitleTextView;
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                CameraScanActivity.showAsSheet(getParentActivity(), 1, new ChatActivity.AnonymousClass1(this, 16));
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder.alertDialog.message = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            builder.setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new ActionIntroActivity$$ExternalSyntheticLambda2(this, 0));
            builder.setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            builder.setTopAnimation(R.raw.permission_request_camera, 72, Theme.getColor(null, Theme.key_dialogTopBackground, false), null);
            builder.show();
        }
    }

    public final void setOnOpenedSettings(LinkManager$$ExternalSyntheticLambda7 linkManager$$ExternalSyntheticLambda7) {
        this.openedSettings = linkManager$$ExternalSyntheticLambda7;
    }

    public final void setQrLoginDelegate(DialogsActivity$$ExternalSyntheticLambda89 dialogsActivity$$ExternalSyntheticLambda89) {
        this.qrLoginDelegate = dialogsActivity$$ExternalSyntheticLambda89;
    }

    public final void updateColors$12() {
        GradientDrawable gradientDrawable = this.startMessagingButtonBackground;
        int i = Theme.key_featuredStickers_addButton;
        gradientDrawable.setColors(new int[]{getThemedColor(i), getThemedColor(Theme.key_featuredStickers_addButton2)});
        this.buttonTextView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
        IntroActivity.AnonymousClass4 anonymousClass4 = this.buttonTextView;
        int iDp = AndroidUtilities.dp(24.0f);
        int color = Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
        anonymousClass4.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, color, color));
        int[] iArr = this.colors;
        if (iArr == null || this.imageView == null) {
            return;
        }
        iArr[0] = 3355443;
        iArr[1] = Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false);
        int[] iArr2 = this.colors;
        iArr2[2] = 16777215;
        int i2 = Theme.key_windowBackgroundWhite;
        iArr2[3] = Theme.getColor(null, i2, false);
        int[] iArr3 = this.colors;
        iArr3[4] = 5285866;
        iArr3[5] = Theme.getColor(null, i, false);
        int[] iArr4 = this.colors;
        iArr4[6] = 2170912;
        iArr4[7] = Theme.getColor(null, i2, false);
        RLottieImageView rLottieImageView = this.imageView;
        int[] iArr5 = this.colors;
        RLottieDrawable rLottieDrawable = rLottieImageView.drawable;
        if (rLottieDrawable != null) {
            rLottieDrawable.newReplaceColors = iArr5;
            rLottieDrawable.requestRedrawColors();
        }
    }
}
