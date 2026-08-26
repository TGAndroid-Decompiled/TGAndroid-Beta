package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Charsets;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONTokener;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda57;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda174;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda230;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda484;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda62;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.GroupCallSheet$$ExternalSyntheticLambda5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda3;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda8;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda18;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda98;
import org.telegram.ui.VoIPFragment;
import org.telegram.ui.web.WebActionBar$$ExternalSyntheticLambda9;

public abstract class TranslateAlert2 extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    public static HashMap localesByCode;
    public static final String[] userAgents = {"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:94.0) Gecko/20100101 Firefox/94.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:95.0) Gecko/20100101 Firefox/95.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.55 Safari/537.36"};
    public final PaddedAdapter adapter;
    public Boolean buttonShadowShown;
    public final View buttonShadowView;
    public boolean firstTranslation;
    public BaseFragment fragment;
    public final String fromLanguage;
    public final HeaderView headerView;
    public final AnonymousClass2 listView;
    public final LoadingTextView loadingTextView;
    public Utilities.CallbackReturn onLinkPress;
    public String prevToLanguage;
    public Integer reqId;
    public final int reqMessageId;
    public final TLRPC.InputPeer reqPeer;
    public final TL_iv.RichMessage reqRichMessage;
    public final boolean reqSum;
    public final CharSequence reqText;
    public final RichMessageLayout.PreviewView richLoadingPreviewView;
    public final RichMessageLayout.PreviewView richPreviewView;
    public final AnimatedFloat sheetTopAnimated;
    public boolean sheetTopNotAnimate;
    public final TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
    public final TextSelectionHelper.TextSelectionOverlay textSelectionOverlay;
    public final LinkSpanDrawable.LinksTextView textView;
    public final AnonymousClass1 textViewContainer;
    public String toLanguage;

    public final class AnonymousClass1 extends FrameLayout {
        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }
    }

    public final class ContainerView extends FrameLayout {
        public final Paint bgPaint;
        public final Path bgPath;
        public Boolean lightStatusBarFull;

        public ContainerView(Context context) {
            super(context);
            this.bgPath = new Path();
            Paint paint = new Paint(1);
            this.bgPaint = paint;
            paint.setColor(TranslateAlert2.this.getThemedColor(Theme.key_dialogBackground));
            paint.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33f), Theme.default_shadow_color);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            TranslateAlert2 translateAlert2 = TranslateAlert2.this;
            float sheetTop = translateAlert2.getSheetTop(true);
            float fLerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(12.0f), MathUtils.clamp(sheetTop / AndroidUtilities.dpf2(24.0f), 0.0f, 1.0f));
            translateAlert2.headerView.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, sheetTop));
            boolean z = sheetTop <= ((float) AndroidUtilities.statusBarHeight) / 2.0f;
            Boolean bool = this.lightStatusBarFull;
            if (bool == null || bool.booleanValue() != z) {
                this.lightStatusBarFull = Boolean.valueOf(z);
                AndroidUtilities.setLightStatusBar(translateAlert2.getWindow(), AndroidUtilities.computePerceivedBrightness(z ? translateAlert2.getThemedColor(Theme.key_dialogBackground) : Theme.blendOver(translateAlert2.getThemedColor(Theme.key_actionBarDefault), 855638016)) > 0.721f);
            }
            FrameLayout frameLayout = translateAlert2.topBulletinContainer;
            frameLayout.setTranslationY(Math.max(translateAlert2.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, sheetTop) + getTranslationY() + ((-frameLayout.getTop()) - translateAlert2.topBulletinContainer.getHeight()));
            Path path = this.bgPath;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, sheetTop, getWidth(), getHeight() + fLerp);
            path.addRoundRect(rectF, fLerp, fLerp, Path.Direction.CW);
            canvas.drawPath(path, this.bgPaint);
            super.dispatchDraw(canvas);
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            TranslateAlert2 translateAlert2 = TranslateAlert2.this;
            if (translateAlert2.textSelectionHelper != null && translateAlert2.textSelectionOverlay != null) {
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                    Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + translateAlert2.textSelectionHelper.isInSelectionMode());
                }
                if (translateAlert2.textSelectionHelper.isInSelectionMode() && translateAlert2.textSelectionOverlay.onTouchEvent(motionEvent)) {
                    Log.d("TA2", "overlay consumed (handle)");
                    return true;
                }
                boolean zCheckOnTap = translateAlert2.textSelectionOverlay.checkOnTap(motionEvent);
                if (motionEvent.getAction() == 1) {
                    Log.d("TA2", "checkOnTap=" + zCheckOnTap);
                }
                if (zCheckOnTap) {
                    motionEvent.setAction(3);
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            Bulletin.addDelegate(this, new LaunchActivity.AnonymousClass7(8));
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            Bulletin.removeDelegate(this);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        }

        @Override
        public final void setTranslationY(float f) {
            super.setTranslationY(f);
            TranslateAlert2 translateAlert2 = TranslateAlert2.this;
            FrameLayout frameLayout = translateAlert2.topBulletinContainer;
            frameLayout.setTranslationY(Math.max(translateAlert2.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, translateAlert2.getSheetTop(true)) + ((-frameLayout.getTop()) - translateAlert2.topBulletinContainer.getHeight()) + f);
        }
    }

    public final class HeaderView extends FrameLayout {
        public final ImageView backButton;
        public final TextView fromLanguageTextView;
        public final View shadow;
        public final PhotoViewer.AnonymousClass35 subtitleView;
        public final VoIPFragment.AnonymousClass5 titleTextView;
        public final AnonymousClass3 toLanguageTextView;

        public final class AnonymousClass4 extends ActionBarPopupWindow.ActionBarPopupWindowLayout {
            @Override
            public final void onMeasure(int i, int i2) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (AndroidUtilities.displaySize.y * 0.33f), View.MeasureSpec.getSize(i2)), 1073741824));
            }
        }

        public HeaderView(Context context) {
            super(context);
            View view = new View(context);
            view.setBackgroundColor(TranslateAlert2.this.getThemedColor(Theme.key_dialogBackground));
            addView(view, LayoutHelper.createFrame(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.backButton = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.ic_ab_back);
            int i = Theme.key_dialogTextBlack;
            int themedColor = TranslateAlert2.this.getThemedColor(i);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
            imageView.setBackground(Theme.createSelectorDrawable(TranslateAlert2.this.getThemedColor(Theme.key_listSelector), 1, -1));
            imageView.setAlpha(0.0f);
            final int i2 = 0;
            imageView.setOnClickListener(new View.OnClickListener(this) {
                public final TranslateAlert2.HeaderView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    int measuredHeight;
                    switch (i2) {
                        case 0:
                            TranslateAlert2.this.lambda$showGiftOfferSheet$15();
                            break;
                        default:
                            TranslateAlert2.HeaderView headerView = this.f$0;
                            TranslateAlert2.HeaderView.AnonymousClass4 anonymousClass4 = new TranslateAlert2.HeaderView.AnonymousClass4(headerView.getContext());
                            Drawable drawableMutate = headerView.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                            int i3 = Theme.key_actionBarDefaultSubmenuBackground;
                            TranslateAlert2 translateAlert2 = TranslateAlert2.this;
                            drawableMutate.setColorFilter(new PorterDuffColorFilter(translateAlert2.getThemedColor(i3), PorterDuff.Mode.MULTIPLY));
                            anonymousClass4.setBackground(drawableMutate);
                            Runnable[] runnableArr = new Runnable[1];
                            ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                            int i4 = 0;
                            boolean z = true;
                            while (i4 < locales.size()) {
                                LocaleController.LocaleInfo localeInfo = locales.get(i4);
                                if (!localeInfo.pluralLangCode.equals(translateAlert2.fromLanguage) && "remote".equals(localeInfo.pathToFile)) {
                                    TextUtils.equals(translateAlert2.toLanguage, localeInfo.pluralLangCode);
                                    ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(2, headerView.getContext(), ((BottomSheet) translateAlert2).resourcesProvider, z, i4 == locales.size() - 1);
                                    actionBarMenuSubItem.setText(TranslateAlert2.capitalFirst(TranslateAlert2.languageName(localeInfo.pluralLangCode, null, null)));
                                    actionBarMenuSubItem.setChecked(TextUtils.equals(translateAlert2.toLanguage, localeInfo.pluralLangCode));
                                    actionBarMenuSubItem.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda62(headerView, runnableArr, localeInfo, 29));
                                    anonymousClass4.linearLayout.addView(actionBarMenuSubItem);
                                    z = false;
                                }
                                i4++;
                            }
                            ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(anonymousClass4);
                            runnableArr[0] = new ChatActivity$$ExternalSyntheticLambda484(actionBarPopupWindow, 1);
                            actionBarPopupWindow.pauseNotifications = true;
                            actionBarPopupWindow.dismissAnimationDuration = 220;
                            actionBarPopupWindow.setOutsideTouchable(true);
                            actionBarPopupWindow.setClippingEnabled(true);
                            actionBarPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                            actionBarPopupWindow.setFocusable(true);
                            int[] iArr = new int[2];
                            TranslateAlert2.HeaderView.AnonymousClass3 anonymousClass3 = headerView.toLanguageTextView;
                            anonymousClass3.getLocationInWindow(iArr);
                            anonymousClass4.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            int measuredHeight2 = anonymousClass4.getMeasuredHeight();
                            int i5 = iArr[1];
                            if (i5 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                                measuredHeight = AndroidUtilities.dp(8.0f) + (i5 - measuredHeight2);
                            } else {
                                measuredHeight = (anonymousClass3.getMeasuredHeight() + i5) - AndroidUtilities.dp(8.0f);
                            }
                            actionBarPopupWindow.showAtLocation(((BottomSheet) translateAlert2).containerView, 51, iArr[0] - AndroidUtilities.dp(8.0f), measuredHeight);
                            break;
                    }
                }
            });
            addView(imageView, LayoutHelper.createFrame(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
            VoIPFragment.AnonymousClass5 anonymousClass5 = new VoIPFragment.AnonymousClass5(this, context, 2);
            this.titleTextView = anonymousClass5;
            anonymousClass5.setTextColor(TranslateAlert2.this.getThemedColor(i));
            anonymousClass5.setTextSize(1, 20.0f);
            anonymousClass5.setTypeface(AndroidUtilities.bold());
            anonymousClass5.setText(LocaleController.getString(R.string.AutomaticTranslation));
            anonymousClass5.setPivotX(0.0f);
            anonymousClass5.setPivotY(0.0f);
            addView(anonymousClass5, LayoutHelper.createFrame(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
            PhotoViewer.AnonymousClass35 anonymousClass35 = new PhotoViewer.AnonymousClass35(this, context, 8);
            this.subtitleView = anonymousClass35;
            if (LocaleController.isRTL) {
                anonymousClass35.setGravity(5);
            }
            anonymousClass35.setPivotX(0.0f);
            anonymousClass35.setPivotY(0.0f);
            String str = TranslateAlert2.this.fromLanguage;
            if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
                TextView textView = new TextView(context);
                this.fromLanguageTextView = textView;
                textView.setLines(1);
                textView.setTextColor(TranslateAlert2.this.getThemedColor(Theme.key_player_actionBarSubtitle));
                textView.setTextSize(1, 14.0f);
                textView.setText(TranslateAlert2.capitalFirst(TranslateAlert2.languageName(str, null, null)));
                textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
            }
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.search_arrow);
            int i3 = Theme.key_player_actionBarSubtitle;
            imageView2.setColorFilter(new PorterDuffColorFilter(TranslateAlert2.this.getThemedColor(i3), mode));
            if (LocaleController.isRTL) {
                imageView2.setScaleX(-1.0f);
            }
            ?? r6 = new AnimatedTextView(context) {
                public final Paint bgPaint = new Paint(1);
                public final LinkSpanDrawable.LinkCollector links = new LinkSpanDrawable.LinkCollector();

                @Override
                public final void onDraw(Canvas canvas) {
                    boolean z = LocaleController.isRTL;
                    AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.drawable;
                    if (z) {
                        AndroidUtilities.rectTmp.set(getWidth() - (getPaddingRight() + (getPaddingLeft() + ((int) Math.ceil(animatedTextDrawable.getCurrentWidth())))), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
                    } else {
                        AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(animatedTextDrawable.getCurrentWidth())), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
                    }
                    Paint paint = this.bgPaint;
                    TranslateAlert2 translateAlert2 = TranslateAlert2.this;
                    int i4 = Theme.key_player_actionBarSubtitle;
                    String[] strArr = TranslateAlert2.userAgents;
                    paint.setColor(Theme.multAlpha(0.1175f, translateAlert2.getThemedColor(i4)));
                    canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                    if (this.links.draw(canvas)) {
                        invalidate();
                    }
                    super.onDraw(canvas);
                }

                @Override
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    LinkSpanDrawable.LinkCollector linkCollector = this.links;
                    if (action != 0) {
                        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            if (motionEvent.getAction() == 1) {
                                performClick();
                            }
                            linkCollector.clear(true);
                            invalidate();
                        }
                        return super.onTouchEvent(motionEvent);
                    }
                    HeaderView headerView = HeaderView.this;
                    LinkSpanDrawable linkSpanDrawable = new LinkSpanDrawable(null, ((BottomSheet) TranslateAlert2.this).resourcesProvider, motionEvent.getX(), motionEvent.getY());
                    linkSpanDrawable.setColor(Theme.multAlpha(0.1175f, TranslateAlert2.this.getThemedColor(Theme.key_player_actionBarSubtitle)));
                    LinkPath linkPathObtainNewPath = linkSpanDrawable.obtainNewPath();
                    boolean z = LocaleController.isRTL;
                    AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.drawable;
                    if (z) {
                        AndroidUtilities.rectTmp.set(getWidth() - (getPaddingRight() + (getPaddingLeft() + ((int) Math.ceil(animatedTextDrawable.getCurrentWidth())))), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
                    } else {
                        AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(animatedTextDrawable.getCurrentWidth())), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
                    }
                    linkPathObtainNewPath.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
                    linkCollector.addLink(linkSpanDrawable, null);
                    invalidate();
                    return true;
                }
            };
            this.toLanguageTextView = r6;
            if (LocaleController.isRTL) {
                r6.setGravity(5);
            }
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = r6.drawable;
            animatedTextDrawable.moveAmplitude = 0.25f;
            animatedTextDrawable.animateDuration = 350L;
            animatedTextDrawable.animateWave = 1.0f;
            animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
            r6.setTextColor(TranslateAlert2.this.getThemedColor(i3));
            r6.setTextSize(AndroidUtilities.dp(14.0f));
            r6.setText(TranslateAlert2.capitalFirst(TranslateAlert2.languageName(TranslateAlert2.this.toLanguage, null, null)));
            r6.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            final int i4 = 1;
            r6.setOnClickListener(new View.OnClickListener(this) {
                public final TranslateAlert2.HeaderView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    int measuredHeight;
                    switch (i4) {
                        case 0:
                            TranslateAlert2.this.lambda$showGiftOfferSheet$15();
                            break;
                        default:
                            TranslateAlert2.HeaderView headerView = this.f$0;
                            TranslateAlert2.HeaderView.AnonymousClass4 anonymousClass4 = new TranslateAlert2.HeaderView.AnonymousClass4(headerView.getContext());
                            Drawable drawableMutate = headerView.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                            int i5 = Theme.key_actionBarDefaultSubmenuBackground;
                            TranslateAlert2 translateAlert2 = TranslateAlert2.this;
                            drawableMutate.setColorFilter(new PorterDuffColorFilter(translateAlert2.getThemedColor(i5), PorterDuff.Mode.MULTIPLY));
                            anonymousClass4.setBackground(drawableMutate);
                            Runnable[] runnableArr = new Runnable[1];
                            ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                            int i6 = 0;
                            boolean z = true;
                            while (i6 < locales.size()) {
                                LocaleController.LocaleInfo localeInfo = locales.get(i6);
                                if (!localeInfo.pluralLangCode.equals(translateAlert2.fromLanguage) && "remote".equals(localeInfo.pathToFile)) {
                                    TextUtils.equals(translateAlert2.toLanguage, localeInfo.pluralLangCode);
                                    ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(2, headerView.getContext(), ((BottomSheet) translateAlert2).resourcesProvider, z, i6 == locales.size() - 1);
                                    actionBarMenuSubItem.setText(TranslateAlert2.capitalFirst(TranslateAlert2.languageName(localeInfo.pluralLangCode, null, null)));
                                    actionBarMenuSubItem.setChecked(TextUtils.equals(translateAlert2.toLanguage, localeInfo.pluralLangCode));
                                    actionBarMenuSubItem.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda62(headerView, runnableArr, localeInfo, 29));
                                    anonymousClass4.linearLayout.addView(actionBarMenuSubItem);
                                    z = false;
                                }
                                i6++;
                            }
                            ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(anonymousClass4);
                            runnableArr[0] = new ChatActivity$$ExternalSyntheticLambda484(actionBarPopupWindow, 1);
                            actionBarPopupWindow.pauseNotifications = true;
                            actionBarPopupWindow.dismissAnimationDuration = 220;
                            actionBarPopupWindow.setOutsideTouchable(true);
                            actionBarPopupWindow.setClippingEnabled(true);
                            actionBarPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                            actionBarPopupWindow.setFocusable(true);
                            int[] iArr = new int[2];
                            TranslateAlert2.HeaderView.AnonymousClass3 anonymousClass3 = headerView.toLanguageTextView;
                            anonymousClass3.getLocationInWindow(iArr);
                            anonymousClass4.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            int measuredHeight2 = anonymousClass4.getMeasuredHeight();
                            int i7 = iArr[1];
                            if (i7 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                                measuredHeight = AndroidUtilities.dp(8.0f) + (i7 - measuredHeight2);
                            } else {
                                measuredHeight = (anonymousClass3.getMeasuredHeight() + i7) - AndroidUtilities.dp(8.0f);
                            }
                            actionBarPopupWindow.showAtLocation(((BottomSheet) translateAlert2).containerView, 51, iArr[0] - AndroidUtilities.dp(8.0f), measuredHeight);
                            break;
                    }
                }
            });
            if (LocaleController.isRTL) {
                anonymousClass35.addView((View) r6, LayoutHelper.createLinear(-2, -2, 16, 0, 0, this.fromLanguageTextView != null ? 3 : 0, 0));
                if (this.fromLanguageTextView != null) {
                    anonymousClass35.addView(imageView2, LayoutHelper.createLinear(-2, -2, 16, 0, 1, 0, 0));
                    anonymousClass35.addView(this.fromLanguageTextView, LayoutHelper.createLinear(-2, -2, 16, 4, 0, 0, 0));
                }
            } else {
                TextView textView2 = this.fromLanguageTextView;
                if (textView2 != null) {
                    anonymousClass35.addView(textView2, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 4, 0));
                    anonymousClass35.addView(imageView2, LayoutHelper.createLinear(-2, -2, 16, 0, 1, 0, 0));
                }
                anonymousClass35.addView((View) r6, LayoutHelper.createLinear(-2, -2, 16, this.fromLanguageTextView != null ? 3 : 0, 0, 0, 0));
            }
            addView(anonymousClass35, LayoutHelper.createFrame(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
            View view2 = new View(context);
            this.shadow = view2;
            view2.setBackgroundColor(TranslateAlert2.this.getThemedColor(Theme.key_dialogShadowLine));
            view2.setAlpha(0.0f);
            addView(view2, LayoutHelper.createFrame(-1, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f), 1073741824));
        }

        @Override
        public final void setTranslationY(float f) {
            super.setTranslationY(f);
            float fClamp = MathUtils.clamp((f - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(64.0f), 0.0f, 1.0f);
            if (!TranslateAlert2.access$600(TranslateAlert2.this)) {
                fClamp = 1.0f;
            }
            float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(fClamp);
            float fLerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
            VoIPFragment.AnonymousClass5 anonymousClass5 = this.titleTextView;
            anonymousClass5.setScaleX(fLerp);
            anonymousClass5.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
            anonymousClass5.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
            boolean z = LocaleController.isRTL;
            PhotoViewer.AnonymousClass35 anonymousClass35 = this.subtitleView;
            if (!z) {
                anonymousClass5.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
                anonymousClass35.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            }
            anonymousClass35.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
            ImageView imageView = this.backButton;
            imageView.setTranslationX(AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(-25.0f), interpolation));
            float f2 = 1.0f - interpolation;
            imageView.setAlpha(f2);
            View view = this.shadow;
            view.setTranslationY(AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(22.0f), interpolation));
            view.setAlpha(f2);
        }
    }

    public final class LoadingTextView extends TextView {
        public final LoadingDrawable loadingDrawable;
        public final LinkPath path;

        public LoadingTextView(Context context) {
            super(context);
            LinkPath linkPath = new LinkPath(0);
            this.path = linkPath;
            LoadingDrawable loadingDrawable = new LoadingDrawable();
            this.loadingDrawable = loadingDrawable;
            loadingDrawable.usePath = linkPath;
            loadingDrawable.speed = 0.65f;
            loadingDrawable.setRadii(AndroidUtilities.dp(4.0f));
            setBackground(loadingDrawable);
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.loadingDrawable.start = -1L;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            updateDrawable();
        }

        @Override
        public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
            super.setText(charSequence, bufferType);
            updateDrawable();
        }

        @Override
        public final void setTextColor(int i) {
            super.setTextColor(Theme.multAlpha(0.2f, i));
            this.loadingDrawable.setColors(Theme.multAlpha(0.03f, i), Theme.multAlpha(0.175f, i), Theme.multAlpha(0.2f, i), Theme.multAlpha(0.45f, i));
        }

        public final void updateDrawable() {
            LoadingDrawable loadingDrawable;
            LinkPath linkPath = this.path;
            if (linkPath == null || (loadingDrawable = this.loadingDrawable) == null) {
                return;
            }
            linkPath.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                linkPath.setCurrentLayout(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), linkPath);
            }
            loadingDrawable.updateBounds();
        }
    }

    public final class PaddedAdapter extends RecyclerView.Adapter {
        public final Context mContext;
        public View mMainView;
        public int mainViewType = 1;

        public PaddedAdapter(Context context, View view) {
            this.mContext = context;
            this.mMainView = view;
        }

        @Override
        public final int getItemCount() {
            return 2;
        }

        @Override
        public final int getItemViewType(int i) {
            if (i == 0) {
                return 0;
            }
            return this.mainViewType;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return i == 0 ? new RecyclerListView.Holder(new PaymentFormActivity.AnonymousClass2(this.mContext, 13)) : new RecyclerListView.Holder(this.mMainView);
        }

        public final void updateMainView(View view) {
            if (this.mMainView == view) {
                return;
            }
            this.mainViewType++;
            this.mMainView = view;
            notifyItemChanged(1);
        }
    }

    public TranslateAlert2(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i, boolean z, TL_iv.RichMessage richMessage) {
        super(context, null, false, false);
        this.firstTranslation = true;
        this.backgroundPaddingLeft = 0;
        fixNavigationBar();
        this.reqText = charSequence;
        this.reqPeer = inputPeer;
        this.reqMessageId = i;
        this.reqSum = z;
        this.reqRichMessage = richMessage;
        this.fromLanguage = str;
        this.toLanguage = str2;
        ContainerView containerView = new ContainerView(context);
        this.containerView = containerView;
        this.sheetTopAnimated = new AnimatedFloat(320L, containerView, CubicBezierInterpolator.EASE_OUT_QUINT);
        LoadingTextView loadingTextView = new LoadingTextView(context);
        this.loadingTextView = loadingTextView;
        loadingTextView.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        loadingTextView.setTextSize(1, SharedConfig.fontSize);
        int i2 = Theme.key_dialogTextBlack;
        loadingTextView.setTextColor(getThemedColor(i2));
        loadingTextView.setLinkTextColor(Theme.multAlpha(0.2f, getThemedColor(i2)));
        loadingTextView.setText(Emoji.replaceEmoji(charSequence == null ? "" : charSequence.toString(), loadingTextView.getPaint().getFontMetricsInt(), true));
        this.textViewContainer = new AnonymousClass1(context);
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
        this.textView = linksTextView;
        linksTextView.setDisablePaddingsOffsetY(true);
        linksTextView.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        linksTextView.setTextSize(1, SharedConfig.fontSize);
        linksTextView.setTextColor(getThemedColor(i2));
        linksTextView.setLinkTextColor(getThemedColor(Theme.key_chat_messageLinkIn));
        linksTextView.setTextIsSelectable(true);
        linksTextView.setHighlightColor(getThemedColor(Theme.key_chat_inTextSelectionHighlight));
        int themedColor = getThemedColor(Theme.key_chat_TextSelectionCursor);
        try {
            if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
                Drawable textSelectHandleLeft = linksTextView.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(themedColor, mode);
                linksTextView.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandleRight = linksTextView.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(themedColor, mode);
                linksTextView.setTextSelectHandleRight(textSelectHandleRight);
            }
        } catch (Exception unused) {
        }
        this.textViewContainer.addView(this.textView, LayoutHelper.createFrame(-1.0f, -1));
        if (this.reqRichMessage != null) {
            RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, this.currentAccount, null);
            this.richLoadingPreviewView = previewView;
            previewView.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
            previewView.set(this.reqRichMessage);
            previewView.setTranslationLoading(true);
            RichMessageLayout.PreviewView previewView2 = new RichMessageLayout.PreviewView(context, this.currentAccount, null);
            this.richPreviewView = previewView2;
            previewView2.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        }
        ?? r9 = new RecyclerListView(context) {
            @Override
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    float y = motionEvent.getY();
                    TranslateAlert2 translateAlert2 = TranslateAlert2.this;
                    if (y < translateAlert2.getSheetTop(true) - getTop()) {
                        translateAlert2.lambda$showGiftOfferSheet$15();
                        return true;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
                return true;
            }

            @Override
            public final void requestChildFocus(View view, View view2) {
            }
        };
        this.listView = r9;
        r9.setOverScrollMode(1);
        r9.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.dp(80.0f));
        r9.setClipToPadding(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        r9.setLayoutManager(linearLayoutManager);
        PaddedAdapter paddedAdapter = new PaddedAdapter(context, this.reqRichMessage != null ? this.richLoadingPreviewView : this.loadingTextView);
        this.adapter = paddedAdapter;
        r9.setAdapter(paddedAdapter);
        r9.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrollStateChanged(RecyclerView recyclerView, int i3) {
                TranslateAlert2 translateAlert2 = TranslateAlert2.this;
                if (i3 == 0) {
                    translateAlert2.sheetTopNotAnimate = false;
                }
                if ((i3 == 0 || i3 == 2) && translateAlert2.getSheetTop(false) > 0.0f && translateAlert2.getSheetTop(false) < AndroidUtilities.dp(96.0f)) {
                    AnonymousClass2 anonymousClass2 = translateAlert2.listView;
                    if (anonymousClass2.canScrollVertically(1) && TranslateAlert2.access$600(translateAlert2)) {
                        translateAlert2.sheetTopNotAnimate = true;
                        anonymousClass2.smoothScrollBy(0, (int) translateAlert2.getSheetTop(false), null);
                    }
                }
            }

            @Override
            public final void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                TranslateAlert2 translateAlert2 = TranslateAlert2.this;
                ((BottomSheet) translateAlert2).containerView.invalidate();
                boolean zCanScrollVertically = translateAlert2.listView.canScrollVertically(1);
                Boolean bool = translateAlert2.buttonShadowShown;
                if (bool == null || bool.booleanValue() != zCanScrollVertically) {
                    translateAlert2.buttonShadowShown = Boolean.valueOf(zCanScrollVertically);
                    View view = translateAlert2.buttonShadowView;
                    view.animate().cancel();
                    OKLCH.m(view.animate().alpha(zCanScrollVertically ? 1.0f : 0.0f), CubicBezierInterpolator.EASE_OUT_QUINT, 320L);
                }
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            public final void onChangeAnimationUpdate() {
                ((BottomSheet) TranslateAlert2.this).containerView.invalidate();
            }

            @Override
            public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                ((BottomSheet) TranslateAlert2.this).containerView.invalidate();
            }
        };
        defaultItemAnimator.setDurations(180L);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        defaultItemAnimator.mAddInterpolator = linearInterpolator;
        defaultItemAnimator.mMoveInterpolator = linearInterpolator;
        defaultItemAnimator.mRemoveInterpolator = linearInterpolator;
        defaultItemAnimator.mChangeInterpolator = linearInterpolator;
        r9.setItemAnimator(defaultItemAnimator);
        this.containerView.addView((View) r9, LayoutHelper.createFrame(-1, -2, 80));
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = new TextSelectionHelper.ArticleTextSelectionHelper();
        this.textSelectionHelper = articleTextSelectionHelper;
        articleTextSelectionHelper.setParentView(r9);
        articleTextSelectionHelper.layoutManager = linearLayoutManager;
        TextSelectionHelper.TextSelectionOverlay overlayView = articleTextSelectionHelper.getOverlayView(context);
        this.textSelectionOverlay = overlayView;
        AndroidUtilities.removeFromParent(overlayView);
        this.containerView.addView(overlayView, LayoutHelper.createFrame(-1, -1, 119));
        RichMessageLayout.PreviewView previewView3 = this.richPreviewView;
        if (previewView3 != null) {
            previewView3.setTextSelectionHelper(articleTextSelectionHelper);
        }
        HeaderView headerView = new HeaderView(context);
        this.headerView = headerView;
        this.containerView.addView(headerView, LayoutHelper.createFrame(-1, 78, 55));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
        View view = new View(context);
        this.buttonShadowView = view;
        view.setBackgroundColor(getThemedColor(Theme.key_dialogShadowLine));
        view.setAlpha(0.0f);
        frameLayout.addView(view, new FrameLayout.LayoutParams(LayoutHelper.getSize(-1.0f), LayoutHelper.getSize(AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f)), 55));
        TextView textView = new TextView(context);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        textView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.CloseTranslation));
        int color = Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
        textView.setBackground(Theme.AdaptiveRipple.createRect(new float[]{24.0f}, color, Theme.AdaptiveRipple.calcRippleColor(color)));
        textView.setOnClickListener(new GroupCallSheet$$ExternalSyntheticLambda5(this, 7));
        frameLayout.addView(textView, LayoutHelper.createFrame(-1, 48.0f, 87, 16.0f, 16.0f, 16.0f, 16.0f));
        this.containerView.addView(frameLayout, LayoutHelper.createFrame(-1, -2, 87));
        translate();
    }

    public static boolean access$600(TranslateAlert2 translateAlert2) {
        AnonymousClass2 anonymousClass2;
        float height = 0.0f;
        int i = 0;
        while (true) {
            anonymousClass2 = translateAlert2.listView;
            if (i >= anonymousClass2.getChildCount()) {
                break;
            }
            View childAt = anonymousClass2.getChildAt(i);
            if (RecyclerView.getChildAdapterPosition(childAt) == 1) {
                height += childAt.getHeight();
            }
            i++;
        }
        return height >= ((float) ((anonymousClass2.getHeight() - anonymousClass2.getPaddingTop()) - anonymousClass2.getPaddingBottom()));
    }

    public static void alternativeTranslate(String str, final String str2, final Utilities.Callback2 callback2, final String str3) {
        if (str2 == null) {
            LanguageDetector.detectLanguage(str, new TranslateAlert2$$ExternalSyntheticLambda4(str, str3, callback2), new TranslateAlert2$$ExternalSyntheticLambda4(str, str3, callback2));
            return;
        }
        final String strEncode = Uri.encode(str);
        if (strEncode.length() <= 5000) {
            new Thread() {
                @Override
                public final void run() {
                    HttpURLConnection httpURLConnection;
                    String string;
                    Utilities.Callback2 callback3 = callback2;
                    String str4 = strEncode;
                    boolean z = false;
                    try {
                        httpURLConnection = (HttpURLConnection) new URI(("https://translate.googleapis.com/translate_a/single?client=gtx&sl=" + Uri.encode(str2) + "&tl=" + Uri.encode(str3) + "&dt=t&ie=UTF-8&oe=UTF-8&otf=1&ssel=0&tsel=0&kc=7&dt=at&dt=bd&dt=ex&dt=ld&dt=md&dt=qca&dt=rw&dt=rm&dt=ss&q=") + str4).toURL().openConnection();
                        try {
                            httpURLConnection.setRequestMethod("GET");
                            httpURLConnection.setRequestProperty("User-Agent", TranslateAlert2.userAgents[(int) Math.round(Math.random() * ((double) 5))]);
                            httpURLConnection.setRequestProperty("Content-Type", "application/json");
                            StringBuilder sb = new StringBuilder();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), Charsets.UTF_8));
                            while (true) {
                                try {
                                    int i = bufferedReader.read();
                                    if (i == -1) {
                                        break;
                                    } else {
                                        sb.append((char) i);
                                    }
                                } catch (Throwable th) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                                e = e;
                                try {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("failed to translate a text ");
                                    sb2.append(httpURLConnection != null ? Integer.valueOf(httpURLConnection.getResponseCode()) : null);
                                    sb2.append(" ");
                                    sb2.append(httpURLConnection != null ? httpURLConnection.getResponseMessage() : null);
                                    Log.e("translate", sb2.toString());
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                e.printStackTrace();
                                if (httpURLConnection != null) {
                                    try {
                                        if (httpURLConnection.getResponseCode() == 429) {
                                            z = true;
                                        }
                                    } catch (Exception unused) {
                                        AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda98(1, callback3));
                                        return;
                                    }
                                }
                                AndroidUtilities.runOnUIThread(new FileLoader$$ExternalSyntheticLambda1(27, callback3, z));
                                return;
                            }
                            bufferedReader.close();
                            JSONArray jSONArray = new JSONArray(new JSONTokener(sb.toString()));
                            JSONArray jSONArray2 = jSONArray.getJSONArray(0);
                            try {
                                string = jSONArray.getString(2);
                            } catch (Exception unused2) {
                                string = null;
                            }
                            if (string != null && string.contains("-")) {
                                string.substring(0, string.indexOf("-"));
                            }
                            String str5 = "";
                            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                                String string2 = jSONArray2.getJSONArray(i2).getString(0);
                                if (string2 != null && !string2.equals("null")) {
                                    str5 = str5 + string2;
                                }
                            }
                            if (str4.length() > 0 && str4.charAt(0) == '\n') {
                                str5 = "\n" + str5;
                            }
                            AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda29(29, callback3, str5));
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        httpURLConnection = null;
                    }
                }
            }.start();
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < strEncode.length()) {
            int iMin = Math.min(i + 5000, strEncode.length());
            int i2 = iMin - 1;
            int iLastIndexOf = strEncode.lastIndexOf("%0A", i2);
            if (iLastIndexOf < i) {
                iLastIndexOf = -1;
            }
            if (iLastIndexOf == -1 && (iLastIndexOf = strEncode.lastIndexOf("%20", i2)) < i) {
                iLastIndexOf = -1;
            }
            if (iLastIndexOf != -1) {
                iMin = iLastIndexOf + 3;
            }
            arrayList.add(strEncode.substring(i, iMin));
            i = iMin;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList2.add(null);
        }
        boolean[] zArr = new boolean[1];
        int i4 = 0;
        while (i4 < arrayList.size()) {
            final String str4 = (String) arrayList.get(i4);
            Utilities.Callback2 callback3 = callback2;
            final ArticleViewer$$ExternalSyntheticLambda57 articleViewer$$ExternalSyntheticLambda57 = new ArticleViewer$$ExternalSyntheticLambda57(zArr, arrayList2, i4, callback3, 3);
            new Thread() {
                @Override
                public final void run() {
                    HttpURLConnection httpURLConnection;
                    String string;
                    Utilities.Callback2 callback4 = articleViewer$$ExternalSyntheticLambda57;
                    String str5 = str4;
                    boolean z = false;
                    try {
                        httpURLConnection = (HttpURLConnection) new URI(("https://translate.googleapis.com/translate_a/single?client=gtx&sl=" + Uri.encode(str2) + "&tl=" + Uri.encode(str3) + "&dt=t&ie=UTF-8&oe=UTF-8&otf=1&ssel=0&tsel=0&kc=7&dt=at&dt=bd&dt=ex&dt=ld&dt=md&dt=qca&dt=rw&dt=rm&dt=ss&q=") + str5).toURL().openConnection();
                        try {
                            httpURLConnection.setRequestMethod("GET");
                            httpURLConnection.setRequestProperty("User-Agent", TranslateAlert2.userAgents[(int) Math.round(Math.random() * ((double) 5))]);
                            httpURLConnection.setRequestProperty("Content-Type", "application/json");
                            StringBuilder sb = new StringBuilder();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), Charsets.UTF_8));
                            while (true) {
                                try {
                                    int i5 = bufferedReader.read();
                                    if (i5 == -1) {
                                        break;
                                    } else {
                                        sb.append((char) i5);
                                    }
                                } catch (Throwable th) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                                e = e2;
                                try {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("failed to translate a text ");
                                    sb2.append(httpURLConnection != null ? Integer.valueOf(httpURLConnection.getResponseCode()) : null);
                                    sb2.append(" ");
                                    sb2.append(httpURLConnection != null ? httpURLConnection.getResponseMessage() : null);
                                    Log.e("translate", sb2.toString());
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                e.printStackTrace();
                                if (httpURLConnection != null) {
                                    try {
                                        if (httpURLConnection.getResponseCode() == 429) {
                                            z = true;
                                        }
                                    } catch (Exception unused) {
                                        AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda98(1, callback4));
                                        return;
                                    }
                                }
                                AndroidUtilities.runOnUIThread(new FileLoader$$ExternalSyntheticLambda1(27, callback4, z));
                                return;
                            }
                            bufferedReader.close();
                            JSONArray jSONArray = new JSONArray(new JSONTokener(sb.toString()));
                            JSONArray jSONArray2 = jSONArray.getJSONArray(0);
                            try {
                                string = jSONArray.getString(2);
                            } catch (Exception unused2) {
                                string = null;
                            }
                            if (string != null && string.contains("-")) {
                                string.substring(0, string.indexOf("-"));
                            }
                            String str6 = "";
                            for (int i6 = 0; i6 < jSONArray2.length(); i6++) {
                                String string2 = jSONArray2.getJSONArray(i6).getString(0);
                                if (string2 != null && !string2.equals("null")) {
                                    str6 = str6 + string2;
                                }
                            }
                            if (str5.length() > 0 && str5.charAt(0) == '\n') {
                                str6 = "\n" + str6;
                            }
                            AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda29(29, callback4, str6));
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        httpURLConnection = null;
                    }
                }
            }.start();
            i4++;
            callback2 = callback3;
        }
    }

    public static String capitalFirst(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static String getToLanguage() {
        return MessagesController.getGlobalMainSettings().getString("translate_to_language", LocaleController.getInstance().getCurrentLocale().getLanguage());
    }

    public static HashMap groupEmojiRanges(CharSequence charSequence) {
        ArrayList<Emoji.EmojiSpanRange> emojis;
        HashMap map = new HashMap();
        if (charSequence != null && (emojis = Emoji.parseEmojis(charSequence)) != null) {
            String string = charSequence.toString();
            for (int i = 0; i < emojis.size(); i++) {
                Emoji.EmojiSpanRange emojiSpanRange = emojis.get(i);
                if (emojiSpanRange != null && emojiSpanRange.code != null) {
                    String strSubstring = string.substring(emojiSpanRange.start, emojiSpanRange.end);
                    ArrayList arrayList = (ArrayList) map.get(strSubstring);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map.put(strSubstring, arrayList);
                    }
                    arrayList.add(emojiSpanRange);
                }
            }
        }
        return map;
    }

    public static String languageName(String str, boolean[] zArr, boolean[] zArr2) {
        if (str == null || str.equals("und") || str.equals("auto")) {
            return null;
        }
        String str2 = str.split("_")[0];
        if ("nb".equals(str2)) {
            str2 = "no";
        }
        if (zArr != null) {
            String string = LocaleController.getString("TranslateLanguage" + str2.toUpperCase());
            boolean z = (string == null || string.startsWith("LOC_ERR")) ? false : true;
            zArr[0] = z;
            if (z) {
                return string;
            }
        }
        if (zArr2 != null) {
            String string2 = LocaleController.getString("TranslateLanguageGenitive" + str2.toUpperCase());
            boolean z2 = (string2 == null || string2.startsWith("LOC_ERR")) ? false : true;
            zArr2[0] = z2;
            if (z2) {
                return string2;
            }
        }
        String strSystemLanguageName = systemLanguageName(str, false);
        if (strSystemLanguageName == null) {
            strSystemLanguageName = systemLanguageName(str2, false);
        }
        if (strSystemLanguageName != null) {
            return strSystemLanguageName;
        }
        if ("no".equals(str)) {
            str = "nb";
        }
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        LocaleController.LocaleInfo builtinLanguageByPlural = LocaleController.getInstance().getBuiltinLanguageByPlural(str);
        if (builtinLanguageByPlural == null) {
            return null;
        }
        return (currentLocaleInfo == null || !"en".equals(currentLocaleInfo.pluralLangCode)) ? builtinLanguageByPlural.name : builtinLanguageByPlural.nameEnglish;
    }

    public static TLRPC.TL_textWithEntities preprocess(TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2) {
        Emoji.EmojiSpanRange emojiSpanRange;
        ArrayList<TLRPC.MessageEntity> arrayList;
        if (tL_textWithEntities2 == null || tL_textWithEntities2.text == null) {
            return null;
        }
        for (int i = 0; i < tL_textWithEntities2.entities.size(); i++) {
            TLRPC.MessageEntity messageEntity = tL_textWithEntities2.entities.get(i);
            if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                if (messageEntity.url != null) {
                    String str = tL_textWithEntities2.text;
                    int i2 = messageEntity.offset;
                    String strSubstring = str.substring(i2, messageEntity.length + i2);
                    if (TextUtils.equals(strSubstring, messageEntity.url)) {
                        TLRPC.TL_messageEntityUrl tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                        tL_messageEntityUrl.offset = messageEntity.offset;
                        tL_messageEntityUrl.length = messageEntity.length;
                        tL_textWithEntities2.entities.set(i, tL_messageEntityUrl);
                    } else if (messageEntity.url.startsWith("https://t.me/") && strSubstring.startsWith("@") && TextUtils.equals(strSubstring.substring(1), messageEntity.url.substring(13))) {
                        TLRPC.TL_messageEntityMention tL_messageEntityMention = new TLRPC.TL_messageEntityMention();
                        tL_messageEntityMention.offset = messageEntity.offset;
                        tL_messageEntityMention.length = messageEntity.length;
                        tL_textWithEntities2.entities.set(i, tL_messageEntityMention);
                    }
                }
            } else if ((messageEntity instanceof TLRPC.TL_messageEntityPre) && tL_textWithEntities != null && (arrayList = tL_textWithEntities.entities) != null && i < arrayList.size() && (tL_textWithEntities.entities.get(i) instanceof TLRPC.TL_messageEntityPre)) {
                messageEntity.language = tL_textWithEntities.entities.get(i).language;
            }
        }
        if (tL_textWithEntities != null && tL_textWithEntities.text != null && !tL_textWithEntities.entities.isEmpty()) {
            HashMap mapGroupEmojiRanges = groupEmojiRanges(tL_textWithEntities.text);
            HashMap mapGroupEmojiRanges2 = groupEmojiRanges(tL_textWithEntities2.text);
            for (int i3 = 0; i3 < tL_textWithEntities.entities.size(); i3++) {
                TLRPC.MessageEntity messageEntity2 = tL_textWithEntities.entities.get(i3);
                if (messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                    String str2 = tL_textWithEntities.text;
                    int i4 = messageEntity2.offset;
                    String strSubstring2 = str2.substring(i4, messageEntity2.length + i4);
                    if (!TextUtils.isEmpty(strSubstring2)) {
                        ArrayList arrayList2 = (ArrayList) mapGroupEmojiRanges.get(strSubstring2);
                        ArrayList arrayList3 = (ArrayList) mapGroupEmojiRanges2.get(strSubstring2);
                        if (arrayList2 != null && arrayList3 != null) {
                            int i5 = 0;
                            while (true) {
                                if (i5 >= arrayList2.size()) {
                                    i5 = -1;
                                    break;
                                }
                                Emoji.EmojiSpanRange emojiSpanRange2 = (Emoji.EmojiSpanRange) arrayList2.get(i5);
                                int i6 = emojiSpanRange2.start;
                                int i7 = messageEntity2.offset;
                                if (i6 == i7 && emojiSpanRange2.end == i7 + messageEntity2.length) {
                                    break;
                                }
                                i5++;
                            }
                            if (i5 >= 0 && i5 < arrayList3.size() && (emojiSpanRange = (Emoji.EmojiSpanRange) arrayList3.get(i5)) != null) {
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= tL_textWithEntities2.entities.size()) {
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji2 = (TLRPC.TL_messageEntityCustomEmoji) messageEntity2;
                                        tL_messageEntityCustomEmoji.document_id = tL_messageEntityCustomEmoji2.document_id;
                                        tL_messageEntityCustomEmoji.document = tL_messageEntityCustomEmoji2.document;
                                        int i9 = emojiSpanRange.start;
                                        tL_messageEntityCustomEmoji.offset = i9;
                                        tL_messageEntityCustomEmoji.length = emojiSpanRange.end - i9;
                                        tL_textWithEntities2.entities.add(tL_messageEntityCustomEmoji);
                                        break;
                                    }
                                    TLRPC.MessageEntity messageEntity3 = tL_textWithEntities2.entities.get(i8);
                                    if (messageEntity3 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        int i10 = emojiSpanRange.start;
                                        int i11 = emojiSpanRange.end;
                                        int i12 = messageEntity3.offset;
                                        if (AndroidUtilities.intersect1d(i10, i11, i12, messageEntity3.length + i12)) {
                                            break;
                                        }
                                    }
                                    i8++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return tL_textWithEntities2;
    }

    public static void setToLanguage(String str) {
        MessagesController.getGlobalMainSettings().edit().putString("translate_to_language", str).apply();
    }

    public static AnonymousClass7 showAlert(Activity activity, ChatActivity chatActivity, TLRPC.InputPeer inputPeer, int i, boolean z, String str, String str2, CharSequence charSequence, boolean z2, ChatActivity$$ExternalSyntheticLambda230 chatActivity$$ExternalSyntheticLambda230, final Runnable runnable) {
        ?? r0 = new TranslateAlert2(activity, str, str2, charSequence, inputPeer, i, z) {
            @Override
            public final void lambda$showGiftOfferSheet$15() {
                super.lambda$showGiftOfferSheet$15();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        };
        r0.setNoforwards(z2);
        r0.fragment = chatActivity;
        r0.onLinkPress = chatActivity$$ExternalSyntheticLambda230;
        if (chatActivity.getParentActivity() != null) {
            chatActivity.showDialog(r0);
        }
        return r0;
    }

    public static String systemLanguageName(String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (localesByCode == null) {
            localesByCode = new HashMap();
            try {
                Locale[] availableLocales = Locale.getAvailableLocales();
                for (int i = 0; i < availableLocales.length; i++) {
                    localesByCode.put(availableLocales[i].getLanguage(), availableLocales[i]);
                    String country = availableLocales[i].getCountry();
                    if (country != null && country.length() > 0) {
                        localesByCode.put(availableLocales[i].getLanguage() + "-" + country.toLowerCase(), availableLocales[i]);
                    }
                }
            } catch (Exception unused) {
            }
        }
        String lowerCase = str.replace("_", "-").toLowerCase();
        try {
            Locale locale = (Locale) localesByCode.get(lowerCase);
            if (locale == null) {
                return null;
            }
            String displayLanguage = locale.getDisplayLanguage(z ? locale : Locale.getDefault());
            if (!lowerCase.contains("-")) {
                return displayLanguage;
            }
            String displayCountry = locale.getDisplayCountry(z ? locale : Locale.getDefault());
            if (TextUtils.isEmpty(displayCountry)) {
                return displayLanguage;
            }
            return displayLanguage + " (" + displayCountry + ")";
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            this.loadingTextView.invalidate();
            this.textView.invalidate();
        }
    }

    @Override
    public void lambda$showGiftOfferSheet$15() {
        super.lambda$showGiftOfferSheet$15();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.translationModelDownloaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.translationModelDownloading);
    }

    @Override
    public final void dismissInternal() {
        if (this.reqId != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId.intValue(), true);
            this.reqId = null;
        }
        super.dismissInternal();
    }

    public final float getSheetTop(boolean z) {
        AnimatedFloat animatedFloat;
        AnonymousClass2 anonymousClass2 = this.listView;
        float top = anonymousClass2.getTop();
        if (anonymousClass2.getChildCount() >= 1) {
            top += Math.max(0, anonymousClass2.getChildAt(anonymousClass2.getChildCount() - 1).getTop());
        }
        float fMax = Math.max(0.0f, top - AndroidUtilities.dp(78.0f));
        if (z && (animatedFloat = this.sheetTopAnimated) != null) {
            if (!anonymousClass2.scrollingByUser && !this.sheetTopNotAnimate) {
                return animatedFloat.set(fMax, false);
            }
            animatedFloat.set(fMax, true);
        }
        return fMax;
    }

    public final void lambda$translate$1(TLObject tLObject) {
        this.reqId = null;
        if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
            TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject;
            if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                this.firstTranslation = false;
                TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                RichMessageLayout.PreviewView previewView = this.richPreviewView;
                if (previewView != null) {
                    previewView.set(richMessage);
                    this.adapter.updateMainView(previewView);
                    return;
                }
                return;
            }
        }
        if (this.firstTranslation) {
            lambda$showGiftOfferSheet$15();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        UserNameResolver$$ExternalSyntheticOutline0.m(R.string.TranslationFailedAlert2, new BulletinFactory((FrameLayout) this.containerView, this.resourcesProvider), null);
        HeaderView.AnonymousClass3 anonymousClass3 = this.headerView.toLanguageTextView;
        String str = this.prevToLanguage;
        this.toLanguage = str;
        anonymousClass3.setText(languageName(str, null, null));
    }

    public final void lambda$translate$3(TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, TLRPC.TL_error tL_error) {
        this.reqId = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            translateAlt();
            return;
        }
        AnonymousClass1 anonymousClass1 = this.textViewContainer;
        PaddedAdapter paddedAdapter = this.adapter;
        if (tL_textWithEntities2 != null) {
            this.firstTranslation = false;
            TLRPC.TL_textWithEntities tL_textWithEntitiesPreprocess = preprocess(tL_textWithEntities, tL_textWithEntities2);
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(tL_textWithEntitiesPreprocess.text);
            MessageObject.addEntitiesToText(spannableStringBuilderValueOf, tL_textWithEntitiesPreprocess.entities, false, true, false, false);
            this.textView.setText(preprocessText(spannableStringBuilderValueOf));
            paddedAdapter.updateMainView(anonymousClass1);
            return;
        }
        if (this.firstTranslation) {
            lambda$showGiftOfferSheet$15();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        UserNameResolver$$ExternalSyntheticOutline0.m(R.string.TranslationFailedAlert2, new BulletinFactory((FrameLayout) this.containerView, this.resourcesProvider), null);
        HeaderView.AnonymousClass3 anonymousClass3 = this.headerView.toLanguageTextView;
        String str = this.prevToLanguage;
        this.toLanguage = str;
        anonymousClass3.setText(languageName(str, null, null));
        paddedAdapter.updateMainView(anonymousClass1);
    }

    public final void lambda$translate$4(TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.reqId = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            translateAlt();
            return;
        }
        boolean z = tLObject instanceof TLRPC.TL_messages_translateResult;
        AnonymousClass1 anonymousClass1 = this.textViewContainer;
        PaddedAdapter paddedAdapter = this.adapter;
        if (z) {
            TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject;
            if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                this.firstTranslation = false;
                TLRPC.TL_textWithEntities tL_textWithEntitiesPreprocess = preprocess(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(tL_textWithEntitiesPreprocess.text);
                MessageObject.addEntitiesToText(spannableStringBuilderValueOf, tL_textWithEntitiesPreprocess.entities, false, true, false, false);
                this.textView.setText(preprocessText(spannableStringBuilderValueOf));
                paddedAdapter.updateMainView(anonymousClass1);
                return;
            }
        }
        if (this.firstTranslation) {
            lambda$showGiftOfferSheet$15();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        UserNameResolver$$ExternalSyntheticOutline0.m(R.string.TranslationFailedAlert2, new BulletinFactory((FrameLayout) this.containerView, this.resourcesProvider), null);
        HeaderView.AnonymousClass3 anonymousClass3 = this.headerView.toLanguageTextView;
        String str = this.prevToLanguage;
        this.toLanguage = str;
        anonymousClass3.setText(languageName(str, null, null));
        paddedAdapter.updateMainView(anonymousClass1);
    }

    public final void lambda$translateAlt$6(String str, Boolean bool) {
        AnonymousClass1 anonymousClass1 = this.textViewContainer;
        PaddedAdapter paddedAdapter = this.adapter;
        if (str != null) {
            this.firstTranslation = false;
            this.textView.setText(preprocessText(str));
            paddedAdapter.updateMainView(anonymousClass1);
        } else {
            if (isDismissed()) {
                return;
            }
            if (this.firstTranslation) {
                lambda$showGiftOfferSheet$15();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(bool.booleanValue() ? R.string.TranslationFailedAlert1 : R.string.TranslationFailedAlert2));
                return;
            }
            UserNameResolver$$ExternalSyntheticOutline0.m(bool.booleanValue() ? R.string.TranslationFailedAlert1 : R.string.TranslationFailedAlert2, new BulletinFactory((FrameLayout) this.containerView, this.resourcesProvider), null);
            HeaderView.AnonymousClass3 anonymousClass3 = this.headerView.toLanguageTextView;
            String str2 = this.prevToLanguage;
            this.toLanguage = str2;
            anonymousClass3.setText(languageName(str2, null, null));
            paddedAdapter.updateMainView(anonymousClass1);
        }
    }

    public final CharSequence preprocessText(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (this.onLinkPress != null || this.fragment != null) {
            for (final URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                if (spanStart != -1 && spanEnd != -1) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new ClickableSpan() {
                        @Override
                        public final void onClick(View view) {
                            TranslateAlert2 translateAlert2 = TranslateAlert2.this;
                            Utilities.CallbackReturn callbackReturn = translateAlert2.onLinkPress;
                            URLSpan uRLSpan2 = uRLSpan;
                            if (callbackReturn != null) {
                                if (((Boolean) callbackReturn.run(uRLSpan2)).booleanValue()) {
                                    translateAlert2.lambda$showGiftOfferSheet$15();
                                }
                            } else {
                                BaseFragment baseFragment = translateAlert2.fragment;
                                if (baseFragment != null) {
                                    AlertsCreator.showOpenUrlAlert(baseFragment, uRLSpan2.getURL(), false, false);
                                }
                            }
                        }

                        @Override
                        public final void updateDrawState(TextPaint textPaint) {
                            int iMin = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
                            if (!(uRLSpan instanceof URLSpanNoUnderline)) {
                                textPaint.setUnderlineText(true);
                            }
                            textPaint.setColor(Theme.getColor(null, Theme.key_dialogTextLink, false));
                            textPaint.setAlpha(iMin);
                        }
                    }, spanStart, spanEnd, 33);
                }
            }
        }
        return Emoji.replaceEmoji(spannableStringBuilder, this.textView.getPaint().getFontMetricsInt(), true);
    }

    public final void setNoforwards(boolean z) {
        LinkSpanDrawable.LinksTextView linksTextView = this.textView;
        if (linksTextView != null) {
            linksTextView.setTextIsSelectable(!z);
        }
        if (z) {
            getWindow().addFlags(8192);
            AndroidUtilities.logFlagSecure();
        } else {
            getWindow().clearFlags(8192);
            AndroidUtilities.logFlagSecure();
        }
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.translationModelDownloaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.translationModelDownloading);
    }

    public final void translate() {
        if (this.reqId != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId.intValue(), true);
            this.reqId = null;
        }
        if ("alternative".equalsIgnoreCase(MessagesController.getInstance(this.currentAccount).translationsManualEnabled)) {
            translateAlt();
            return;
        }
        String str = this.toLanguage;
        if (str != null) {
            str = str.split("_")[0];
        }
        if ("nb".equals(str)) {
            str = "no";
        }
        TL_iv.RichMessage richMessage = this.reqRichMessage;
        int i = this.reqMessageId;
        TLRPC.InputPeer inputPeer = this.reqPeer;
        if (richMessage != null && inputPeer != null) {
            TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
            tL_messages_translateRichMessage.flags = 1 | tL_messages_translateRichMessage.flags;
            tL_messages_translateRichMessage.peer = inputPeer;
            tL_messages_translateRichMessage.id.add(Integer.valueOf(i));
            tL_messages_translateRichMessage.to_lang = TranslateController.normalizeLanguage(str);
            this.reqId = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_translateRichMessage, new LinkManager$$ExternalSyntheticLambda3(this, 5)));
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence charSequence = this.reqText;
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        if (this.reqSum && inputPeer != null) {
            TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
            tL_messages_summarizeText.flags = 1 | tL_messages_summarizeText.flags;
            tL_messages_summarizeText.peer = inputPeer;
            tL_messages_summarizeText.id = i;
            tL_messages_summarizeText.to_lang = TranslateController.normalizeLanguage(str);
            this.reqId = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new AiTonesController$$ExternalSyntheticLambda0(), new OAuthSheet$$ExternalSyntheticLambda18(12, this, tL_textWithEntities)));
            return;
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        if (inputPeer != null) {
            tL_messages_translateText.flags = 1 | tL_messages_translateText.flags;
            tL_messages_translateText.peer = inputPeer;
            tL_messages_translateText.id.add(Integer.valueOf(i));
        } else {
            tL_messages_translateText.flags |= 2;
            tL_messages_translateText.text.add(tL_textWithEntities);
        }
        tL_messages_translateText.to_lang = TranslateController.normalizeLanguage(str);
        this.reqId = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_translateText, new LinkManager$$ExternalSyntheticLambda8(11, this, tL_textWithEntities)));
    }

    public final void translateAlt() {
        CharSequence charSequence = this.reqText;
        String string = charSequence == null ? "" : charSequence.toString();
        String str = this.fromLanguage;
        if (str != null) {
            str = str.split("_")[0];
        }
        if ("nb".equals(str)) {
            str = "no";
        }
        String str2 = this.toLanguage;
        if (str2 != null) {
            str2 = str2.split("_")[0];
        }
        alternativeTranslate(string, str, new GiftSheet$$ExternalSyntheticLambda8(this, 10), "nb".equals(str2) ? "no" : str2);
    }

    public static void showAlert(Context context, BaseFragment baseFragment, String str, String str2, CharSequence charSequence, WebActionBar$$ExternalSyntheticLambda9 webActionBar$$ExternalSyntheticLambda9, final ChatActivity$$ExternalSyntheticLambda174 chatActivity$$ExternalSyntheticLambda174) {
        if (context == null) {
            return;
        }
        TranslateAlert2 translateAlert2 = new TranslateAlert2(context, str, str2, charSequence) {
            @Override
            public final void lambda$showGiftOfferSheet$15() {
                super.lambda$showGiftOfferSheet$15();
                ChatActivity$$ExternalSyntheticLambda174 chatActivity$$ExternalSyntheticLambda175 = chatActivity$$ExternalSyntheticLambda174;
                if (chatActivity$$ExternalSyntheticLambda175 != null) {
                    chatActivity$$ExternalSyntheticLambda175.run();
                }
            }
        };
        translateAlert2.setNoforwards(false);
        translateAlert2.fragment = baseFragment;
        translateAlert2.onLinkPress = webActionBar$$ExternalSyntheticLambda9;
        if (baseFragment != null) {
            if (baseFragment.getParentActivity() != null) {
                baseFragment.showDialog(translateAlert2);
                return;
            }
            return;
        }
        translateAlert2.show();
    }
}
