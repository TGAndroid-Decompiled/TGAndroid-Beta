package org.telegram.ui.TON;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.AccountFrozenAlert;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FireworksOverlay;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Views.PhotoView;
import org.telegram.ui.Components.Paint.Views.StickerView;
import org.telegram.ui.Components.Paint.Views.StoryLinkPreviewDialog;
import org.telegram.ui.Components.Premium.FeaturesPageView;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.Size;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.chat.ChatInputViewsContainer;
import org.telegram.ui.Components.voip.PrivateVideoPreviewDialogNew;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda18;
import org.telegram.ui.GradientHeaderActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.LiveCommentsView;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.bots.BotDownloads$$ExternalSyntheticLambda0;
import org.telegram.ui.bots.BotSensors$1$$ExternalSyntheticLambda0;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;
import org.telegram.ui.iv.RichEditor;

public final class TONIntroActivity extends GradientHeaderActivity implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout aboveTitleView;
    public AnonymousClass5 adapter;
    public final boolean allowTopUp;
    public LinearLayout balanceLayout;
    public ButtonWithCounterView buyButton;
    public AnonymousClass1 emptyLayout;
    public boolean hadTransactions;
    public GLIconTextureView iconTextureView;
    public AnonymousClass2 oneButtonsLayout;
    public SpannableStringBuilder starBalanceIcon;
    public AnimatedTextView starBalanceTextView;
    public AnimatedTextView starBalanceTitleView;
    public ButtonWithCounterView topUpButton;
    public StarsIntroActivity.StarsTransactionsLayout transactionsLayout;
    public boolean twoButtons;
    public RichEditor.AnonymousClass6 twoButtonsLayout;
    public ButtonWithCounterView withdrawButton;

    public final class AnonymousClass2 extends FrameLayout {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass2(Object obj, Context context, int i) {
            super(context);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public void addView(View view, int i, int i2) {
            switch (this.$r8$classId) {
                case 8:
                    super.addView(view, i, i2);
                    ((ChatInputViewsContainer) this.this$0).checkViewsPositions();
                    break;
                default:
                    super.addView(view, i, i2);
                    break;
            }
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            Canvas canvas2;
            int x;
            switch (this.$r8$classId) {
                case 4:
                    StoryLinkPreviewDialog storyLinkPreviewDialog = (StoryLinkPreviewDialog) this.this$0;
                    if (storyLinkPreviewDialog.openProgress <= 0.0f || storyLinkPreviewDialog.blurBitmapPaint == null) {
                        canvas2 = canvas;
                    } else {
                        storyLinkPreviewDialog.blurMatrix.reset();
                        float width = getWidth() / storyLinkPreviewDialog.blurBitmap.getWidth();
                        storyLinkPreviewDialog.blurMatrix.postScale(width, width);
                        storyLinkPreviewDialog.blurBitmapShader.setLocalMatrix(storyLinkPreviewDialog.blurMatrix);
                        storyLinkPreviewDialog.blurBitmapPaint.setAlpha((int) (storyLinkPreviewDialog.openProgress * 255.0f));
                        canvas2 = canvas;
                        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), storyLinkPreviewDialog.blurBitmapPaint);
                    }
                    super.dispatchDraw(canvas2);
                    break;
                case 13:
                    PeerStoriesView peerStoriesView = (PeerStoriesView) this.this$0;
                    if (peerStoriesView.selfAvatarsContainer.getVisibility() == 0 && peerStoriesView.selfAvatarsContainer.getLayoutParams().width != (x = (int) (((peerStoriesView.selfStatusView.getX() + peerStoriesView.selfStatusView.getMeasuredWidth()) - peerStoriesView.selfAvatarsContainer.getX()) + AndroidUtilities.dp(10.0f)))) {
                        peerStoriesView.selfAvatarsContainer.getLayoutParams().width = x;
                        peerStoriesView.selfAvatarsContainer.invalidate();
                        peerStoriesView.selfAvatarsContainer.requestLayout();
                    }
                    super.dispatchDraw(canvas);
                    break;
                default:
                    super.dispatchDraw(canvas);
                    break;
            }
        }

        @Override
        public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
            switch (this.$r8$classId) {
                case 4:
                    if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                        return super.dispatchKeyEventPreIme(keyEvent);
                    }
                    ((StoryLinkPreviewDialog) this.this$0).onBackPressed();
                    return true;
                default:
                    return super.dispatchKeyEventPreIme(keyEvent);
            }
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 0:
                    if (((TONIntroActivity) this.this$0).twoButtons) {
                        return false;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                case 11:
                    if (((StarsIntroActivity) this.this$0).twoButtons) {
                        return false;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                default:
                    return super.dispatchTouchEvent(motionEvent);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 2:
                    PhotoView photoView = (PhotoView) this.this$0;
                    if (photoView.containerView != null) {
                        canvas.save();
                        float f = photoView.mirrorT.set(photoView.mirrored);
                        Size size = photoView.baseSize;
                        canvas.scale(1.0f - (f * 2.0f), 1.0f, size.width / 2.0f, 0.0f);
                        canvas.skew(0.0f, ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, f, 4.0f * f, 0.25f));
                        float f2 = photoView.segmentedT.set(photoView.segmented);
                        if (!photoView.segmented) {
                            canvas.save();
                            Paint paint = photoView.bitmapPaint;
                            paint.setAlpha((int) ((1.0f - f2) * 255.0f));
                            Bitmap bitmap = photoView.bitmap;
                            if (bitmap != null) {
                                AnonymousClass2 anonymousClass2 = photoView.containerView;
                                canvas.translate(anonymousClass2.getWidth() / 2.0f, anonymousClass2.getHeight() / 2.0f);
                                canvas.rotate(photoView.orientation);
                                float fMax = Math.max(size.width / bitmap.getWidth(), size.height / bitmap.getHeight());
                                canvas.scale(fMax, fMax);
                                if (photoView.crop != null) {
                                    canvas.rotate(-photoView.getOrientation());
                                    int contentWidth = photoView.getContentWidth();
                                    int contentHeight = photoView.getContentHeight();
                                    if (((photoView.getOrientation() + photoView.crop.transformRotation) / 90) % 2 == 1) {
                                        contentWidth = photoView.getContentHeight();
                                        contentHeight = photoView.getContentWidth();
                                    }
                                    MediaController.CropState cropState = photoView.crop;
                                    float f3 = cropState.cropPw;
                                    float f4 = cropState.cropPh;
                                    float f5 = contentWidth;
                                    float f6 = contentHeight;
                                    canvas.clipRect(((-contentWidth) * f3) / 2.0f, ((-contentHeight) * f4) / 2.0f, (f3 * f5) / 2.0f, (f4 * f6) / 2.0f);
                                    float f7 = photoView.crop.cropScale;
                                    canvas.scale(f7, f7);
                                    MediaController.CropState cropState2 = photoView.crop;
                                    canvas.translate(cropState2.cropPx * f5, cropState2.cropPy * f6);
                                    MediaController.CropState cropState3 = photoView.crop;
                                    canvas.rotate(cropState3.cropRotate + cropState3.transformRotation);
                                    if (photoView.crop.mirrored) {
                                        canvas.scale(-1.0f, 1.0f);
                                    }
                                    canvas.rotate(photoView.getOrientation());
                                }
                                canvas.translate((-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f);
                                int width = bitmap.getWidth();
                                int height = bitmap.getHeight();
                                Rect rect = photoView.bitmapSrc;
                                rect.set(0, 0, width, height);
                                int width2 = bitmap.getWidth();
                                int height2 = bitmap.getHeight();
                                Rect rect2 = photoView.bitmapDst;
                                rect2.set(0, 0, width2, height2);
                                canvas.drawBitmap(bitmap, rect, rect2, paint);
                            }
                            canvas.restore();
                        }
                        canvas.restore();
                        break;
                    }
                    break;
                case 3:
                    StickerView stickerView = (StickerView) this.this$0;
                    if (stickerView.containerView != null) {
                        canvas.save();
                        float f8 = stickerView.mirrorT.set(stickerView.mirrored);
                        Size size2 = stickerView.baseSize;
                        canvas.scale(1.0f - (f8 * 2.0f), 1.0f, size2.width / 2.0f, 0.0f);
                        canvas.skew(0.0f, ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, f8, 4.0f * f8, 0.25f));
                        ImageReceiver imageReceiver = stickerView.centerImage;
                        imageReceiver.setImageCoords(0.0f, 0.0f, (int) size2.width, (int) size2.height);
                        imageReceiver.draw(canvas);
                        canvas.restore();
                        break;
                    }
                    break;
                default:
                    super.onDraw(canvas);
                    break;
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            CheckBoxCell.AnonymousClass1 anonymousClass1;
            CheckBoxCell.AnonymousClass1 anonymousClass2;
            switch (this.$r8$classId) {
                case 5:
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    accessibilityNodeInfo.setClassName("android.widget.Button");
                    PremiumButtonView premiumButtonView = (PremiumButtonView) this.this$0;
                    CharSequence text = (!premiumButtonView.showOverlay || (anonymousClass2 = premiumButtonView.overlayTextView) == null) ? null : anonymousClass2.getText();
                    if (text == null && (anonymousClass1 = premiumButtonView.buttonTextView) != null) {
                        text = anonymousClass1.getText();
                    }
                    if (text != null) {
                        accessibilityNodeInfo.setText(text);
                        if (getContentDescription() == null) {
                            accessibilityNodeInfo.setContentDescription(text);
                        }
                    }
                    break;
                default:
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    break;
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int measuredHeight;
            int measuredWidth;
            int left;
            int measuredWidth2;
            switch (this.$r8$classId) {
                case 1:
                    int childCount = getChildCount();
                    int i5 = i3 - i;
                    int i6 = -1;
                    if (!((AlertDialog) this.this$0).buttonsInTwoRows) {
                        View view = null;
                        int i7 = 0;
                        while (i7 < childCount) {
                            View childAt = getChildAt(i7);
                            Integer num = (Integer) childAt.getTag();
                            if (num == null) {
                                int measuredWidth3 = childAt.getMeasuredWidth();
                                int measuredHeight2 = childAt.getMeasuredHeight();
                                if (view != null) {
                                    measuredWidth = ((view.getMeasuredWidth() - measuredWidth3) / 2) + view.getLeft();
                                    measuredHeight = ((view.getMeasuredHeight() - measuredHeight2) / 2) + view.getTop();
                                } else {
                                    measuredHeight = 0;
                                    measuredWidth = 0;
                                }
                                childAt.layout(measuredWidth, measuredHeight, measuredWidth3 + measuredWidth, measuredHeight2 + measuredHeight);
                            } else if (num.intValue() == i6) {
                                if (LocaleController.isRTL) {
                                    childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                                } else {
                                    childAt.layout((i5 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i5 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                                }
                                view = childAt;
                            } else if (num.intValue() == -2) {
                                if (LocaleController.isRTL) {
                                    int paddingLeft = getPaddingLeft();
                                    if (view != null) {
                                        paddingLeft = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(8.0f, view.getMeasuredWidth(), paddingLeft);
                                    }
                                    childAt.layout(paddingLeft, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + getPaddingTop());
                                } else {
                                    int paddingRight = (i5 - getPaddingRight()) - childAt.getMeasuredWidth();
                                    if (view != null) {
                                        paddingRight = OKLCH.m$1(8.0f, view.getMeasuredWidth(), paddingRight);
                                    }
                                    childAt.layout(paddingRight, getPaddingTop(), childAt.getMeasuredWidth() + paddingRight, childAt.getMeasuredHeight() + getPaddingTop());
                                }
                            } else if (num.intValue() == -4) {
                                View viewFindViewWithTag = findViewWithTag(-3);
                                if (LocaleController.isRTL) {
                                    if (viewFindViewWithTag == null) {
                                        left = i5 - getPaddingRight();
                                        measuredWidth2 = childAt.getMeasuredWidth();
                                    } else {
                                        left = viewFindViewWithTag.getLeft() - AndroidUtilities.dp(8.0f);
                                        measuredWidth2 = childAt.getMeasuredWidth();
                                    }
                                    int i8 = left - measuredWidth2;
                                    childAt.layout(i8, getPaddingTop(), childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + getPaddingTop());
                                } else {
                                    int paddingLeft2 = viewFindViewWithTag == null ? getPaddingLeft() : viewFindViewWithTag.getRight() + AndroidUtilities.dp(8.0f);
                                    childAt.layout(paddingLeft2, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft2, childAt.getMeasuredHeight() + getPaddingTop());
                                }
                            } else if (num.intValue() == -3) {
                                if (LocaleController.isRTL) {
                                    childAt.layout((i5 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i5 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                                } else {
                                    childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                                }
                            }
                            i7++;
                            i6 = -1;
                        }
                    } else {
                        View viewFindViewWithTag2 = findViewWithTag(-3);
                        View viewFindViewWithTag3 = findViewWithTag(-4);
                        View viewFindViewWithTag4 = findViewWithTag(-2);
                        View viewFindViewWithTag5 = findViewWithTag(-1);
                        int paddingLeft3 = getPaddingLeft();
                        int paddingRight2 = i5 - getPaddingRight();
                        int iMax = Math.max(0, ((paddingRight2 - paddingLeft3) - AndroidUtilities.dp(8.0f)) / 2);
                        boolean z2 = LocaleController.isRTL;
                        int i9 = z2 ? paddingRight2 - iMax : paddingLeft3;
                        if (!z2) {
                            paddingLeft3 = paddingRight2 - iMax;
                        }
                        int paddingTop = getPaddingTop();
                        int iDp = AndroidUtilities.dp(44.0f) + paddingTop;
                        if (viewFindViewWithTag2 != null) {
                            viewFindViewWithTag2.layout(i9, paddingTop, i9 + iMax, AndroidUtilities.dp(40.0f) + paddingTop);
                        }
                        if (viewFindViewWithTag3 != null) {
                            viewFindViewWithTag3.layout(paddingLeft3, paddingTop, paddingLeft3 + iMax, AndroidUtilities.dp(40.0f) + paddingTop);
                        }
                        if (viewFindViewWithTag4 != null) {
                            viewFindViewWithTag4.layout(i9, iDp, i9 + iMax, AndroidUtilities.dp(40.0f) + iDp);
                        }
                        if (viewFindViewWithTag5 != null) {
                            viewFindViewWithTag5.layout(paddingLeft3, iDp, iMax + paddingLeft3, AndroidUtilities.dp(40.0f) + iDp);
                        }
                    }
                    break;
                case 7:
                    super.onLayout(z, i, i2, i3, i4);
                    ChatCustomReactionsEditActivity chatCustomReactionsEditActivity = (ChatCustomReactionsEditActivity) this.this$0;
                    if (chatCustomReactionsEditActivity.emojiKeyboardVisible && z) {
                        chatCustomReactionsEditActivity.actionButtonContainer.setTranslationY(-chatCustomReactionsEditActivity.bottomDialogLayout.getMeasuredHeight());
                        int measuredHeight3 = chatCustomReactionsEditActivity.bottomDialogLayout.getMeasuredHeight();
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) chatCustomReactionsEditActivity.scrollView.getLayoutParams();
                        marginLayoutParams.bottomMargin = measuredHeight3;
                        chatCustomReactionsEditActivity.scrollView.setLayoutParams(marginLayoutParams);
                        break;
                    }
                    break;
                default:
                    super.onLayout(z, i, i2, i3, i4);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            float f;
            float top;
            int measuredHeight;
            switch (this.$r8$classId) {
                case 1:
                    super.onMeasure(i, i2);
                    int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                    int childCount = getChildCount();
                    int i3 = 0;
                    if (((AlertDialog) this.this$0).buttonsInTwoRows) {
                        int iMax = Math.max(0, (measuredWidth - AndroidUtilities.dp(8.0f)) / 2);
                        while (i3 < childCount) {
                            View childAt = getChildAt(i3);
                            if (childAt.getTag() != null) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(iMax, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
                            }
                            i3++;
                        }
                        break;
                    } else {
                        int measuredWidth2 = 0;
                        while (i3 < childCount) {
                            View childAt2 = getChildAt(i3);
                            if ((childAt2 instanceof TextView) && childAt2.getTag() != null) {
                                measuredWidth2 = childAt2.getMeasuredWidth() + measuredWidth2;
                            }
                            i3++;
                        }
                        if (measuredWidth2 > measuredWidth) {
                            View viewFindViewWithTag = findViewWithTag(-2);
                            View viewFindViewWithTag2 = findViewWithTag(-4);
                            View viewFindViewWithTag3 = findViewWithTag(-3);
                            if (viewFindViewWithTag != null && viewFindViewWithTag3 != null) {
                                if (viewFindViewWithTag.getMeasuredWidth() >= viewFindViewWithTag3.getMeasuredWidth()) {
                                    viewFindViewWithTag.measure(View.MeasureSpec.makeMeasureSpec(viewFindViewWithTag.getMeasuredWidth() - (measuredWidth2 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(viewFindViewWithTag.getMeasuredHeight(), 1073741824));
                                } else {
                                    viewFindViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(viewFindViewWithTag3.getMeasuredWidth() - (measuredWidth2 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(viewFindViewWithTag3.getMeasuredHeight(), 1073741824));
                                }
                                break;
                            } else if (viewFindViewWithTag2 != null && viewFindViewWithTag3 != null) {
                                if (viewFindViewWithTag2.getMeasuredWidth() >= viewFindViewWithTag3.getMeasuredWidth()) {
                                    viewFindViewWithTag2.measure(View.MeasureSpec.makeMeasureSpec(viewFindViewWithTag2.getMeasuredWidth() - (measuredWidth2 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(viewFindViewWithTag2.getMeasuredHeight(), 1073741824));
                                } else {
                                    viewFindViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(viewFindViewWithTag3.getMeasuredWidth() - (measuredWidth2 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(viewFindViewWithTag3.getMeasuredHeight(), 1073741824));
                                }
                                break;
                            }
                        }
                    }
                    break;
                case 6:
                    super.onMeasure(i, i2);
                    PremiumPreviewBottomSheet.Adapter adapter = (PremiumPreviewBottomSheet.Adapter) this.this$0;
                    PremiumPreviewBottomSheet premiumPreviewBottomSheet = PremiumPreviewBottomSheet.this;
                    StarsReactionsSheet.AnonymousClass6 anonymousClass6 = premiumPreviewBottomSheet.iconTextureView;
                    if (anonymousClass6 == null) {
                        View view = premiumPreviewBottomSheet.overrideTitleIcon;
                        if (view != null) {
                            top = view.getTop();
                            measuredHeight = PremiumPreviewBottomSheet.this.overrideTitleIcon.getMeasuredHeight();
                        } else {
                            f = 0.0f;
                        }
                        FeaturesPageView.HeaderView.AnonymousClass1 anonymousClass1 = PremiumPreviewBottomSheet.this.starParticlesView;
                        anonymousClass1.setTranslationY(f - (anonymousClass1.getMeasuredHeight() / 2.0f));
                    } else {
                        top = anonymousClass6.getTop();
                        measuredHeight = PremiumPreviewBottomSheet.this.iconTextureView.getMeasuredHeight();
                    }
                    f = (measuredHeight / 2.0f) + top;
                    FeaturesPageView.HeaderView.AnonymousClass1 anonymousClass2 = PremiumPreviewBottomSheet.this.starParticlesView;
                    anonymousClass2.setTranslationY(f - (anonymousClass2.getMeasuredHeight() / 2.0f));
                    break;
                case 10:
                    super.onMeasure(i, i2);
                    ((GiftSheet.GiftCell) this.this$0).priceBackground.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 9:
                    ((PrivateVideoPreviewDialogNew) this.this$0).scrollGestureDetector.onTouchEvent(motionEvent);
                    return super.onTouchEvent(motionEvent);
                default:
                    return super.onTouchEvent(motionEvent);
            }
        }

        public AnonymousClass2(Context context, String str, DarkThemeResourceProvider darkThemeResourceProvider) {
            super(context);
            this.$r8$classId = 12;
            int iDp = AndroidUtilities.dp(12.0f);
            int i = Theme.key_dialogTextBlack;
            setBackground(Theme.createRoundRectDrawable(iDp, Theme.multAlpha(0.06f, darkThemeResourceProvider.getColor(i))));
            LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
            addView(linearLayoutM, LayoutHelper.createFrame(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
            AnimatedTextView animatedTextView = new AnimatedTextView(context, false, true, true);
            this.this$0 = animatedTextView;
            animatedTextView.setAnimationProperties(0.6f, 0L, 450L, CubicBezierInterpolator.EASE_OUT_QUINT);
            animatedTextView.setTextSize(AndroidUtilities.dp(17.0f));
            animatedTextView.setTextColor(darkThemeResourceProvider.getColor(i));
            animatedTextView.setScaleProperty(0.7f);
            animatedTextView.setGravity(17);
            animatedTextView.setTypeface(AndroidUtilities.bold());
            animatedTextView.setAllowCancel(true);
            linearLayoutM.addView(animatedTextView, LayoutHelper.createLinear(-1, 20, 0.0f, 0.0f, 0.0f, 1.66f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 11.0f);
            textView.setTextColor(darkThemeResourceProvider.getColor(i));
            textView.setGravity(17);
            linearLayoutM.addView(textView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 0.0f));
            textView.setText(str);
        }

        public AnonymousClass2(PhotoView photoView, Context context) {
            super(context);
            this.$r8$classId = 2;
            this.this$0 = photoView;
            setWillNotDraw(false);
        }

        public AnonymousClass2(StickerView stickerView, Context context) {
            super(context);
            this.$r8$classId = 3;
            this.this$0 = stickerView;
            setWillNotDraw(false);
        }
    }

    public final class AnonymousClass4 extends StarParticlesView {
        public Paint[] paints;
        public final int val$particlesCount;
        public final int val$type;

        public AnonymousClass4(Context context, int i, int i2) {
            super(context);
            this.val$particlesCount = i;
            this.val$type = i2;
            setClipWithGradient();
        }

        @Override
        public final void configure() {
            StarParticlesView.Drawable drawable = new StarParticlesView.Drawable(this.val$particlesCount);
            this.drawable = drawable;
            drawable.type = 106;
            int i = 0;
            drawable.roundEffect = false;
            drawable.useRotate = false;
            drawable.useBlur = true;
            drawable.checkBounds = true;
            drawable.isCircle = false;
            drawable.useScale = true;
            drawable.startFromCenter = true;
            if (this.val$type == 1) {
                drawable.centerOffsetY = AndroidUtilities.dp(24.0f);
            }
            this.paints = new Paint[20];
            while (true) {
                Paint[] paintArr = this.paints;
                if (i >= paintArr.length) {
                    StarParticlesView.Drawable drawable2 = this.drawable;
                    drawable2.getPaint = new TONIntroActivity$4$$ExternalSyntheticLambda0(this, 0);
                    drawable2.size1 = 17;
                    drawable2.size2 = 18;
                    drawable2.size3 = 19;
                    drawable2.colorKey = Theme.key_windowBackgroundWhiteBlackText;
                    drawable2.init();
                    return;
                }
                paintArr[i] = new Paint(1);
                this.paints[i].setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(i / (this.paints.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i++;
            }
        }

        @Override
        public final int getStarsRectWidth() {
            return getMeasuredWidth();
        }
    }

    public final class NestedFrameLayout extends GradientHeaderActivity.ContentView {
        public final NestedScrollingParentHelper nestedScrollingParentHelper;

        public NestedFrameLayout(Context context) {
            super(context);
            this.nestedScrollingParentHelper = new NestedScrollingParentHelper();
        }

        @Override
        public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            TONIntroActivity tONIntroActivity = TONIntroActivity.this;
            if (view == ((GradientHeaderActivity) tONIntroActivity).listView && tONIntroActivity.transactionsLayout.isAttachedToWindow()) {
                boolean zIsSearchFieldVisible = ((BaseFragment) tONIntroActivity).actionBar.isSearchFieldVisible();
                int top = (((View) tONIntroActivity.transactionsLayout.getParent()).getTop() - AndroidUtilities.statusBarHeight) - ActionBar.getCurrentActionBarHeight();
                int bottom = ((View) tONIntroActivity.transactionsLayout.getParent()).getBottom();
                boolean z = false;
                if (i2 < 0) {
                    if (((GradientHeaderActivity) tONIntroActivity).listView.getHeight() - bottom >= 0) {
                        RecyclerListView currentListView = tONIntroActivity.transactionsLayout.getCurrentListView();
                        int iFindFirstVisibleItemPosition = ((LinearLayoutManager) currentListView.getLayoutManager()).findFirstVisibleItemPosition();
                        if (iFindFirstVisibleItemPosition != -1) {
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = currentListView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                            int top2 = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView.getTop() : -1;
                            int paddingTop = currentListView.getPaddingTop();
                            if (top2 != paddingTop || iFindFirstVisibleItemPosition != 0) {
                                iArr[1] = iFindFirstVisibleItemPosition != 0 ? i2 : Math.max(i2, top2 - paddingTop);
                                currentListView.scrollBy(0, i2);
                                z = true;
                            }
                        }
                    }
                    if (zIsSearchFieldVisible) {
                        if (z || top >= 0) {
                            iArr[1] = i2;
                            return;
                        } else {
                            iArr[1] = i2 - Math.max(top, i2);
                            return;
                        }
                    }
                    return;
                }
                if (zIsSearchFieldVisible) {
                    RecyclerListView currentListView2 = tONIntroActivity.transactionsLayout.getCurrentListView();
                    iArr[1] = i2;
                    if (top > 0) {
                        iArr[1] = 0;
                    }
                    if (currentListView2 == null || (i4 = iArr[1]) <= 0) {
                        return;
                    }
                    currentListView2.scrollBy(0, i4);
                    return;
                }
                if (i2 > 0) {
                    RecyclerListView currentListView3 = tONIntroActivity.transactionsLayout.getCurrentListView();
                    if (((GradientHeaderActivity) tONIntroActivity).listView.getHeight() - bottom < 0 || currentListView3 == null || currentListView3.canScrollVertically(1)) {
                        return;
                    }
                    iArr[1] = i2;
                    ((GradientHeaderActivity) tONIntroActivity).listView.stopScroll();
                }
            }
        }

        @Override
        public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        }

        @Override
        public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
            this.nestedScrollingParentHelper.mNestedScrollAxesTouch = i;
        }

        @Override
        public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
            return i == 2;
        }

        @Override
        public final void onStopNestedScroll(View view) {
        }

        @Override
        public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            TONIntroActivity tONIntroActivity = TONIntroActivity.this;
            try {
                if (view == ((GradientHeaderActivity) tONIntroActivity).listView && tONIntroActivity.transactionsLayout.isAttachedToWindow()) {
                    RecyclerListView currentListView = tONIntroActivity.transactionsLayout.getCurrentListView();
                    if (((GradientHeaderActivity) tONIntroActivity).listView.getHeight() - ((View) tONIntroActivity.transactionsLayout.getParent()).getBottom() >= 0) {
                        iArr[1] = i4;
                        currentListView.scrollBy(0, i4);
                    }
                }
            } catch (Throwable th) {
                FileLog.e(th);
                AndroidUtilities.runOnUIThread(new BotSensors$1$$ExternalSyntheticLambda0(this, 16));
            }
        }

        @Override
        public final void onStopNestedScroll(View view, int i) {
            this.nestedScrollingParentHelper.mNestedScrollAxesTouch = 0;
        }
    }

    public final class StarsNeededSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
        public UniversalAdapter adapter;
        public final FrameLayout footerView;
        public final LiveCommentsView.LiveCommentView.AnonymousClass1 headerView;
        public final AmountUtils$Amount requiredAmount;
        public Runnable whenPurchased;

        public StarsNeededSheet(Context context, Theme.ResourcesProvider resourcesProvider, AmountUtils$Amount amountUtils$Amount, boolean z, Runnable runnable) {
            super(context, null, false, false, false, resourcesProvider);
            this.topPadding = 0.2f;
            this.whenPurchased = runnable;
            fixNavigationBar();
            RecyclerListView recyclerListView = this.recyclerListView;
            int i = this.backgroundPaddingLeft;
            final int i2 = 0;
            recyclerListView.setPadding(i, 0, i, 0);
            this.recyclerListView.setOnItemClickListener(new TONIntroActivity$$ExternalSyntheticLambda3(this, 16));
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setSupportsChangeAnimations(false);
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setDurations(350L);
            this.recyclerListView.lambda$onCellEnter$52(defaultItemAnimator);
            setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
            this.requiredAmount = amountUtils$Amount;
            LiveCommentsView.LiveCommentView.AnonymousClass1 anonymousClass1 = new LiveCommentsView.LiveCommentView.AnonymousClass1(context, resourcesProvider);
            this.headerView = anonymousClass1;
            final int i3 = 1;
            ((TextView) anonymousClass1.clipPath).setText(LocaleController.formatString(R.string.TonNeededTitle, AmountUtils$Amount.fromNano(amountUtils$Amount.nanos - StarsController.getInstance(this.currentAccount, true).getBalanceAmount().nanos, AmountUtils$Currency.TON).asFormatString()));
            TextView textView = (TextView) anonymousClass1.this$0;
            FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(R.string.FragmentAddFunds, textView);
            textView.setMaxWidth(HintView2.cutInFancyHalf(textView.getText(), textView.getPaint()));
            this.actionBar.setTitle(getTitle());
            FrameLayout frameLayout = new FrameLayout(context);
            this.footerView = frameLayout;
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), true, getResourcesProvider());
            frameLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 17, 20, 10, 20, 20));
            if (z || ApplicationLoader.isStandaloneBuild() || BuildVars.isBetaApp() || BuildVars.isHuaweiStoreApp()) {
                buttonWithCounterView.setText(LocaleController.getString(R.string.TopUpViaFragment), false);
                buttonWithCounterView.setOnClickListener(new View.OnClickListener(this) {
                    public final TONIntroActivity.StarsNeededSheet f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i3) {
                            case 0:
                                this.f$0.lambda$new$2$6(view);
                                break;
                            default:
                                Browser.openUrlInSystemBrowser(this.f$0.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                                break;
                        }
                    }
                });
            } else {
                buttonWithCounterView.setText(LocaleController.getString(R.string.Close), false);
                buttonWithCounterView.setOnClickListener(new View.OnClickListener(this) {
                    public final TONIntroActivity.StarsNeededSheet f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i2) {
                            case 0:
                                this.f$0.lambda$new$2$6(view);
                                break;
                            default:
                                Browser.openUrlInSystemBrowser(this.f$0.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                                break;
                        }
                    }
                });
            }
            UniversalAdapter universalAdapter = this.adapter;
            if (universalAdapter != null) {
                universalAdapter.update(false);
            }
        }

        @Override
        public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
            UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new BotDownloads$$ExternalSyntheticLambda0(this, 7), this.resourcesProvider);
            this.adapter = universalAdapter;
            return universalAdapter;
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            Runnable runnable;
            if (i == NotificationCenter.starOptionsLoaded || i == NotificationCenter.starBalanceUpdated) {
                UniversalAdapter universalAdapter = this.adapter;
                if (universalAdapter != null) {
                    universalAdapter.update(true);
                }
                AmountUtils$Amount balanceAmount = StarsController.getInstance(this.currentAccount, true).getBalanceAmount();
                TextView textView = (TextView) this.headerView.clipPath;
                int i3 = R.string.TonNeededTitle;
                AmountUtils$Amount amountUtils$Amount = this.requiredAmount;
                textView.setText(LocaleController.formatString(i3, AmountUtils$Amount.fromNano(amountUtils$Amount.nanos - balanceAmount.nanos, AmountUtils$Currency.TON).asFormatString()));
                ActionBar actionBar = this.actionBar;
                if (actionBar != null) {
                    actionBar.setTitle(getTitle());
                }
                if (balanceAmount.nanos < amountUtils$Amount.nanos || (runnable = this.whenPurchased) == null) {
                    return;
                }
                runnable.run();
                this.whenPurchased = null;
                lambda$showGiftOfferSheet$15();
            }
        }

        @Override
        public final void lambda$showGiftOfferSheet$15() {
            super.lambda$showGiftOfferSheet$15();
            LiveCommentsView.LiveCommentView.AnonymousClass1 anonymousClass1 = this.headerView;
            if (anonymousClass1 != null) {
                ((GLIconTextureView) anonymousClass1.particles).setPaused(true);
            }
        }

        @Override
        public final void dismissInternal() {
            super.dismissInternal();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        }

        @Override
        public final CharSequence getTitle() {
            LiveCommentsView.LiveCommentView.AnonymousClass1 anonymousClass1 = this.headerView;
            if (anonymousClass1 == null) {
                return null;
            }
            return ((TextView) anonymousClass1.clipPath).getText();
        }

        @Override
        public final void show() {
            if (StarsController.getInstance(this.currentAccount, true).getBalanceAmount().nanos >= this.requiredAmount.nanos) {
                Runnable runnable = this.whenPurchased;
                if (runnable != null) {
                    runnable.run();
                    this.whenPurchased = null;
                    return;
                }
                return;
            }
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) lastFragment;
                if (chatActivity.isKeyboardVisible() && chatActivity.getChatActivityEnterView() != null) {
                    chatActivity.getChatActivityEnterView().closeKeyboard();
                }
            }
            super.show();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        }
    }

    public TONIntroActivity() {
        this.allowTopUp = ApplicationLoader.isStandaloneBuild() || BuildVars.isBetaApp() || BuildVars.isHuaweiStoreApp();
        setWhiteBackground(true);
    }

    @Override
    public final RecyclerView.Adapter createAdapter() {
        ?? r0 = new UniversalAdapter(this.listView, getContext(), this.currentAccount, this.classGuid, new BotDownloads$$ExternalSyntheticLambda0(this, 6), getResourceProvider()) {
            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                if (i != 42) {
                    return super.onCreateViewHolder(viewGroup, i);
                }
                TONIntroActivity tONIntroActivity = TONIntroActivity.this;
                HeaderCell headerCell = new HeaderCell(tONIntroActivity.getContext(), Theme.key_windowBackgroundWhiteBlueHeader, 21, 0, 0, false, false, ((BaseFragment) tONIntroActivity).resourceProvider);
                headerCell.setHeight(25);
                return new RecyclerListView.Holder(headerCell);
            }
        };
        this.adapter = r0;
        r0.setApplyBackground(false);
        return this.adapter;
    }

    @Override
    public final GradientHeaderActivity.ContentView createContentView() {
        return new NestedFrameLayout(getContext());
    }

    @Override
    public final StarParticlesView createParticlesView() {
        return new AnonymousClass4(getContext(), 75, 1);
    }

    @Override
    public final View createView(Context context) {
        this.useFillLastLayoutManager = false;
        this.particlesViewHeight = AndroidUtilities.dp(238.0f);
        this.transactionsLayout = new StarsIntroActivity.StarsTransactionsLayout(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider());
        this.emptyLayout = new View(context) {
            @Override
            public final void onMeasure(int i, int i2) {
                int iDp;
                TONIntroActivity tONIntroActivity = TONIntroActivity.this;
                if (tONIntroActivity.isLandscapeMode) {
                    iDp = (((BaseFragment) tONIntroActivity).actionBar.getMeasuredHeight() + tONIntroActivity.statusBarHeight) - AndroidUtilities.dp(16.0f);
                } else {
                    iDp = tONIntroActivity.statusBarHeight + AndroidUtilities.dp(140.0f);
                    if (AndroidUtilities.dp(24.0f) + tONIntroActivity.backgroundView.getMeasuredHeight() > iDp) {
                        iDp = AndroidUtilities.dp(24.0f) + tONIntroActivity.backgroundView.getMeasuredHeight();
                    }
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (iDp - (((GradientHeaderActivity) tONIntroActivity).yOffset * 2.5f)), 1073741824));
            }
        };
        super.createView(context);
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isRightLayout) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.aboveTitleView = frameLayout;
        frameLayout.setClickable(true);
        GLIconTextureView gLIconTextureView = new GLIconTextureView(context, 1, 4);
        this.iconTextureView = gLIconTextureView;
        GLIconRenderer gLIconRenderer = gLIconTextureView.mRenderer;
        gLIconRenderer.colorKey1 = Theme.key_starsGradient1;
        gLIconRenderer.colorKey2 = Theme.key_starsGradient2;
        gLIconRenderer.updateColors();
        this.iconTextureView.setStarParticlesView(this.particlesView);
        this.aboveTitleView.addView(this.iconTextureView, LayoutHelper.createFrame(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        configureHeader(LocaleController.getString(R.string.TONBalanceTitle), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TONBalanceText), new GiftSheet$$ExternalSyntheticLambda18(context, 11)), true), this.aboveTitleView, null);
        this.listView.setOverScrollMode(2);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        this.listView.lambda$onCellEnter$52(defaultItemAnimator);
        this.listView.setOnItemClickListener(new TONIntroActivity$$ExternalSyntheticLambda3(this, 0));
        this.contentView.addView(new FireworksOverlay(getContext()), LayoutHelper.createFrame(-1, -1.0f));
        StarsController.getInstance(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.balanceLayout = linearLayout;
        linearLayout.setOrientation(1);
        this.balanceLayout.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(10.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(getContext(), false, true, false);
        this.starBalanceTextView = animatedTextView;
        animatedTextView.setTypeface(AndroidUtilities.bold());
        this.starBalanceTextView.setTextSize(AndroidUtilities.dp(32.0f));
        this.starBalanceTextView.setGravity(17);
        this.starBalanceTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourceProvider));
        this.starBalanceIcon = new SpannableStringBuilder("S");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_gram_72);
        coloredImageSpan.setOverrideColor(-13397548);
        coloredImageSpan.setScale(0.5f, 0.5f);
        coloredImageSpan.translate(-AndroidUtilities.dp(3.0f), 0.0f);
        this.starBalanceIcon.setSpan(coloredImageSpan, 0, 1, 33);
        this.balanceLayout.addView(this.starBalanceTextView, LayoutHelper.createFrame(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        AnimatedTextView animatedTextView2 = new AnimatedTextView(getContext());
        this.starBalanceTitleView = animatedTextView2;
        animatedTextView2.setTextSize(AndroidUtilities.dp(14.0f));
        this.starBalanceTitleView.setGravity(17);
        this.starBalanceTitleView.setText(LocaleController.getString(R.string.YourTonBalance));
        this.starBalanceTitleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, this.resourceProvider));
        this.balanceLayout.addView(this.starBalanceTitleView, LayoutHelper.createFrame(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this, getContext(), 0);
        this.oneButtonsLayout = anonymousClass2;
        frameLayout2.addView(anonymousClass2);
        boolean z = this.allowTopUp;
        if (z) {
            ButtonWithCounterView round = new ButtonWithCounterView(getContext(), true, this.resourceProvider).setRound();
            this.buyButton = round;
            round.setRound();
            this.buyButton.setText(LocaleController.getString(R.string.TopUpViaFragment), false);
            final int i = 0;
            this.buyButton.setOnClickListener(new View.OnClickListener(this) {
                public final TONIntroActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            Browser.openUrlInSystemBrowser(this.f$0.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        case 1:
                            Browser.openUrlInSystemBrowser(this.f$0.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        default:
                            TONIntroActivity tONIntroActivity = this.f$0;
                            tONIntroActivity.presentFragment(new BotStarsActivity(1, tONIntroActivity.getUserConfig().getClientUserId()));
                            break;
                    }
                }
            });
            this.oneButtonsLayout.addView(this.buyButton, LayoutHelper.createFrame(-1, 48, 119));
        }
        RichEditor.AnonymousClass6 anonymousClass6 = new RichEditor.AnonymousClass6(this, getContext(), 7);
        this.twoButtonsLayout = anonymousClass6;
        frameLayout2.addView(anonymousClass6);
        this.topUpButton = new ButtonWithCounterView(getContext(), true, this.resourceProvider).setRound();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TonTopUp));
        this.topUpButton.setText(spannableStringBuilder, false);
        final int i2 = 1;
        this.topUpButton.setOnClickListener(new View.OnClickListener(this) {
            public final TONIntroActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        Browser.openUrlInSystemBrowser(this.f$0.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    case 1:
                        Browser.openUrlInSystemBrowser(this.f$0.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    default:
                        TONIntroActivity tONIntroActivity = this.f$0;
                        tONIntroActivity.presentFragment(new BotStarsActivity(1, tONIntroActivity.getUserConfig().getClientUserId()));
                        break;
                }
            }
        });
        if (z) {
            this.twoButtonsLayout.addView(this.topUpButton, LayoutHelper.createLinear(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        this.withdrawButton = new ButtonWithCounterView(getContext(), true, this.resourceProvider).setRound();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new ColoredImageSpan(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.TonStats));
        this.withdrawButton.setText(spannableStringBuilder2, false);
        final int i3 = 2;
        this.withdrawButton.setOnClickListener(new View.OnClickListener(this) {
            public final TONIntroActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        Browser.openUrlInSystemBrowser(this.f$0.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    case 1:
                        Browser.openUrlInSystemBrowser(this.f$0.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    default:
                        TONIntroActivity tONIntroActivity = this.f$0;
                        tONIntroActivity.presentFragment(new BotStarsActivity(1, tONIntroActivity.getUserConfig().getClientUserId()));
                        break;
                }
            }
        });
        this.twoButtonsLayout.addView(this.withdrawButton, LayoutHelper.createLinear(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.balanceLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.oneButtonsLayout.animate().cancel();
        this.twoButtonsLayout.animate().cancel();
        this.twoButtonsLayout.setAlpha(this.twoButtons ? 1.0f : 0.0f);
        this.oneButtonsLayout.setAlpha(this.twoButtons ? 0.0f : 1.0f);
        this.twoButtonsLayout.setVisibility(this.twoButtons ? 0 : 8);
        this.oneButtonsLayout.setVisibility(this.twoButtons ? 8 : 0);
        updateBalance$1$1();
        AnonymousClass5 anonymousClass5 = this.adapter;
        if (anonymousClass5 != null) {
            anonymousClass5.update(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.starOptionsLoaded) {
            saveScrollPosition();
            AnonymousClass5 anonymousClass5 = this.adapter;
            if (anonymousClass5 != null) {
                anonymousClass5.update(true);
            }
            if (this.savedScrollPosition == 0 && this.savedScrollOffset < 0) {
                this.savedScrollOffset = 0;
            }
            applyScrolledPosition();
            return;
        }
        if (i == NotificationCenter.starTransactionsLoaded) {
            StarsController starsController = StarsController.getInstance(this.currentAccount, true);
            if (this.hadTransactions != starsController.hasTransactions(0)) {
                this.hadTransactions = starsController.hasTransactions(0);
                saveScrollPosition();
                AnonymousClass5 anonymousClass6 = this.adapter;
                if (anonymousClass6 != null) {
                    anonymousClass6.update(true);
                }
                if (this.savedScrollPosition == 0 && this.savedScrollOffset < 0) {
                    this.savedScrollOffset = 0;
                }
                applyScrolledPosition();
                return;
            }
            return;
        }
        if (i == NotificationCenter.starSubscriptionsLoaded) {
            AnonymousClass5 anonymousClass7 = this.adapter;
            if (anonymousClass7 != null) {
                anonymousClass7.update(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.starBalanceUpdated) {
            updateBalance$1$1();
        } else if (i == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            updateBalance$1$1();
        }
    }

    @Override
    public final boolean drawActionBarShadow() {
        boolean z;
        StarsIntroActivity.StarsTransactionsLayout starsTransactionsLayout = this.transactionsLayout;
        if (starsTransactionsLayout == null || !(starsTransactionsLayout.getParent() instanceof View)) {
            z = false;
        } else {
            if (this.listView.getHeight() - ((View) this.transactionsLayout.getParent()).getBottom() >= 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return !z;
    }

    public final void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        if (getContext() == null) {
            return;
        }
        StarsController starsController = StarsController.getInstance(this.currentAccount, true);
        arrayList.add(UItem.asFullyCustom(super.getHeader(getContext())));
        arrayList.add(UItem.asCustom(this.balanceLayout));
        boolean z = this.allowTopUp;
        if (z) {
            zzkf.m(R.string.TopUpViaFragmentInfo, arrayList);
        }
        boolean zHasTransactions = starsController.hasTransactions(0);
        this.hadTransactions = zHasTransactions;
        if (!zHasTransactions) {
            arrayList.add(UItem.asCustomShadow(this.emptyLayout));
            return;
        }
        if (!z) {
            arrayList.add(UItem.asShadow(null));
        }
        arrayList.add(UItem.asFullscreenCustom(this.transactionsLayout, AndroidUtilities.dp(24.0f) + ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight));
    }

    @Override
    public final int getNavigationBarColor() {
        return Theme.getColor(null, Theme.key_dialogBackgroundGray, false);
    }

    public final void lambda$createView$1$1(int i) {
        UItem item;
        AnonymousClass5 anonymousClass5 = this.adapter;
        if (anonymousClass5 == null || (item = anonymousClass5.getItem(i)) == null) {
            return;
        }
        int i2 = item.id;
        if (i2 == -1) {
            update(true);
            return;
        }
        if (i2 == -2) {
            StarsController.getInstance(this.currentAccount, true).getGiftOptions();
            UserSelectorBottomSheet.open(1, BirthdayController.getInstance(this.currentAccount).getState());
        } else if (i2 == -3) {
            StarsController.getInstance(this.currentAccount, true).loadSubscriptions();
            update(true);
        } else if (i2 == -4) {
            if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
                AccountFrozenAlert.show(this.currentAccount);
            } else {
                presentFragment(new ChannelAffiliateProgramsFragment(getUserConfig().getClientUserId()));
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        StarsController.getInstance(this.currentAccount, true).invalidateTransactions(true);
        StarsController.getInstance(this.currentAccount, true).invalidateSubscriptions();
        StarsController.getInstance(this.currentAccount, true).getOptions();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onPause() {
        super.onPause();
        GLIconTextureView gLIconTextureView = this.iconTextureView;
        if (gLIconTextureView != null) {
            gLIconTextureView.setPaused(true);
            this.iconTextureView.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        GLIconTextureView gLIconTextureView = this.iconTextureView;
        if (gLIconTextureView != null) {
            gLIconTextureView.setPaused(false);
            this.iconTextureView.setDialogVisible(false);
        }
    }

    public final void updateBalance$1$1() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        StarsController starsController = StarsController.getInstance(this.currentAccount, true);
        double d = getMessagesController().config.tonUsdRate.get();
        TL_stars.StarsAmount balance = starsController.getBalance();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.starBalanceIcon);
        spannableStringBuilder.append((CharSequence) StarsIntroActivity.formatStarsAmount(balance, 0.66f, ' '));
        this.starBalanceTextView.setText(spannableStringBuilder);
        int i = (int) ((balance.amount / 1.0E9d) * d * 100.0d);
        if (i > 0) {
            this.starBalanceTitleView.setText("≈" + BillingController.getInstance().formatCurrency(i, "USD"));
        } else {
            this.starBalanceTitleView.setText(LocaleController.getString(R.string.YourTonBalance));
        }
        TLRPC.TL_payments_starsRevenueStats tONRevenueStats = BotStarsController.getInstance(this.currentAccount).getTONRevenueStats(getUserConfig().getClientUserId(), true);
        final boolean z = (tONRevenueStats == null || (tL_starsRevenueStatus = tONRevenueStats.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : true;
        if (this.twoButtons == z) {
            return;
        }
        this.twoButtons = z;
        this.oneButtonsLayout.setVisibility(0);
        this.twoButtonsLayout.setVisibility(0);
        final int i2 = 0;
        this.oneButtonsLayout.animate().alpha(z ? 0.0f : 1.0f).withEndAction(new Runnable(this) {
            public final TONIntroActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        TONIntroActivity tONIntroActivity = this.f$0;
                        if (!z) {
                            tONIntroActivity.getClass();
                        } else {
                            tONIntroActivity.oneButtonsLayout.setVisibility(8);
                        }
                        break;
                    default:
                        TONIntroActivity tONIntroActivity2 = this.f$0;
                        if (!z) {
                            tONIntroActivity2.twoButtonsLayout.setVisibility(8);
                        } else {
                            tONIntroActivity2.getClass();
                        }
                        break;
                }
            }
        }).start();
        final int i3 = 1;
        this.twoButtonsLayout.animate().alpha(z ? 1.0f : 0.0f).withEndAction(new Runnable(this) {
            public final TONIntroActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i3) {
                    case 0:
                        TONIntroActivity tONIntroActivity = this.f$0;
                        if (!z) {
                            tONIntroActivity.getClass();
                        } else {
                            tONIntroActivity.oneButtonsLayout.setVisibility(8);
                        }
                        break;
                    default:
                        TONIntroActivity tONIntroActivity2 = this.f$0;
                        if (!z) {
                            tONIntroActivity2.twoButtonsLayout.setVisibility(8);
                        } else {
                            tONIntroActivity2.getClass();
                        }
                        break;
                }
            }
        }).start();
    }
}
