package org.telegram.ui.Components;

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
import android.widget.LinearLayout;
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
import org.telegram.ui.Cells.TextSelectionHelper;

public class TranslateAlert2 extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    private static HashMap<String, Locale> localesByCode;
    public static final String[] userAgents = {"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:94.0) Gecko/20100101 Firefox/94.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:95.0) Gecko/20100101 Firefox/95.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.55 Safari/537.36"};
    private PaddedAdapter adapter;
    private Boolean buttonShadowShown;
    private View buttonShadowView;
    private TextView buttonTextView;
    private FrameLayout buttonView;
    private boolean firstTranslation;
    private BaseFragment fragment;
    private String fromLanguage;
    private HeaderView headerView;
    private LinearLayoutManager layoutManager;
    private RecyclerListView listView;
    private LoadingTextView loadingTextView;
    private Utilities.CallbackReturn<URLSpan, Boolean> onLinkPress;
    private String prevToLanguage;
    private Integer reqId;
    private ArrayList<TLRPC.MessageEntity> reqMessageEntities;
    private int reqMessageId;
    private TLRPC.InputPeer reqPeer;
    private TL_iv.RichMessage reqRichMessage;
    private boolean reqSum;
    private CharSequence reqText;
    private RichMessageLayout.PreviewView richLoadingPreviewView;
    private RichMessageLayout.PreviewView richPreviewView;
    private AnimatedFloat sheetTopAnimated;
    private boolean sheetTopNotAnimate;
    private TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
    private TextSelectionHelper.TextSelectionOverlay textSelectionOverlay;
    private LinkSpanDrawable.LinksTextView textView;
    private FrameLayout textViewContainer;
    private String toLanguage;

    public class AnonymousClass5 extends Thread {
        final Utilities.Callback2 val$done;
        final String val$fromLng;
        final String val$text;
        final String val$toLng;

        public AnonymousClass5(String str, String str2, String str3, Utilities.Callback2 callback2) {
            this.val$fromLng = str;
            this.val$toLng = str2;
            this.val$text = str3;
            this.val$done = callback2;
        }

        public static void lambda$run$0(Utilities.Callback2 callback2, String str) {
            if (callback2 != null) {
                callback2.run(str, Boolean.FALSE);
            }
        }

        public static void lambda$run$1(Utilities.Callback2 callback2, boolean z) {
            callback2.run(null, Boolean.valueOf(z));
        }

        public static void lambda$run$2(Utilities.Callback2 callback2) {
            callback2.run(null, Boolean.FALSE);
        }

        @Override
        public void run() {
            HttpURLConnection httpURLConnection;
            String string;
            boolean z = true;
            try {
                httpURLConnection = (HttpURLConnection) new URI(("https://translate.googleapis.com/translate_a/single?client=gtx&sl=" + Uri.encode(this.val$fromLng) + "&tl=" + Uri.encode(this.val$toLng) + "&dt=t&ie=UTF-8&oe=UTF-8&otf=1&ssel=0&tsel=0&kc=7&dt=at&dt=bd&dt=ex&dt=ld&dt=md&dt=qca&dt=rw&dt=rm&dt=ss&q=") + this.val$text).toURL().openConnection();
                try {
                    httpURLConnection.setRequestMethod("GET");
                    String[] strArr = TranslateAlert2.userAgents;
                    httpURLConnection.setRequestProperty("User-Agent", strArr[(int) Math.round(Math.random() * ((double) (strArr.length - 1)))]);
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
                                if (httpURLConnection.getResponseCode() != 429) {
                                    z = false;
                                }
                            } catch (Exception unused) {
                                AndroidUtilities.runOnUIThread(new ShareAlert$23$$ExternalSyntheticLambda0(this.val$done, 9));
                                return;
                            }
                        } else {
                            z = false;
                        }
                        AndroidUtilities.runOnUIThread(new MediaActivity$$ExternalSyntheticLambda5(this.val$done, z, 4));
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
                    String str = "";
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        String string2 = jSONArray2.getJSONArray(i2).getString(0);
                        if (string2 != null && !string2.equals("null")) {
                            str = str + string2;
                        }
                    }
                    if (this.val$text.length() > 0 && this.val$text.charAt(0) == '\n') {
                        str = "\n" + str;
                    }
                    AndroidUtilities.runOnUIThread(new EmojiView$2$$ExternalSyntheticLambda0(22, this.val$done, str));
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                httpURLConnection = null;
            }
        }
    }

    public class ContainerView extends FrameLayout {
        private Paint bgPaint;
        private Path bgPath;
        private Boolean lightStatusBarFull;

        public ContainerView(Context context) {
            super(context);
            this.bgPath = new Path();
            Paint paint = new Paint(1);
            this.bgPaint = paint;
            paint.setColor(TranslateAlert2.this.getThemedColor(Theme.key_dialogBackground));
            this.bgPaint.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33f), Theme.default_shadow_color);
        }

        private void updateLightStatusBar(boolean z) {
            Boolean bool = this.lightStatusBarFull;
            if (bool == null || bool.booleanValue() != z) {
                this.lightStatusBarFull = Boolean.valueOf(z);
                AndroidUtilities.setLightStatusBar(TranslateAlert2.this.getWindow(), AndroidUtilities.computePerceivedBrightness(z ? TranslateAlert2.this.getThemedColor(Theme.key_dialogBackground) : Theme.blendOver(TranslateAlert2.this.getThemedColor(Theme.key_actionBarDefault), 855638016)) > 0.721f);
            }
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            float sheetTop = TranslateAlert2.this.getSheetTop();
            float fLerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(12.0f), MathUtils.clamp(sheetTop / AndroidUtilities.dpf2(24.0f), 0.0f, 1.0f));
            TranslateAlert2.this.headerView.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, sheetTop));
            updateLightStatusBar(sheetTop <= ((float) AndroidUtilities.statusBarHeight) / 2.0f);
            FrameLayout frameLayout = TranslateAlert2.this.topBulletinContainer;
            frameLayout.setTranslationY(Math.max(TranslateAlert2.this.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, sheetTop) + getTranslationY() + ((-frameLayout.getTop()) - TranslateAlert2.this.topBulletinContainer.getHeight()));
            this.bgPath.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, sheetTop, getWidth(), getHeight() + fLerp);
            this.bgPath.addRoundRect(rectF, fLerp, fLerp, Path.Direction.CW);
            canvas.drawPath(this.bgPath, this.bgPaint);
            super.dispatchDraw(canvas);
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (TranslateAlert2.this.textSelectionHelper != null && TranslateAlert2.this.textSelectionOverlay != null) {
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                    Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + TranslateAlert2.this.textSelectionHelper.isInSelectionMode());
                }
                if (TranslateAlert2.this.textSelectionHelper.isInSelectionMode() && TranslateAlert2.this.textSelectionOverlay.onTouchEvent(motionEvent)) {
                    Log.d("TA2", "overlay consumed (handle)");
                    return true;
                }
                boolean zCheckOnTap = TranslateAlert2.this.textSelectionOverlay.checkOnTap(motionEvent);
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
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
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
                public final boolean clipWithGradient(int i) {
                    return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
                }

                @Override
                public int getBottomOffset(int i) {
                    return AndroidUtilities.dp(80.0f);
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
                public final int getTopOffset(int i) {
                    return Bulletin.Delegate.CC.$default$getTopOffset(this, i);
                }

                @Override
                public final void onBottomOffsetChange(float f) {
                    Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
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
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            Bulletin.removeDelegate(this);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        }

        @Override
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            FrameLayout frameLayout = TranslateAlert2.this.topBulletinContainer;
            frameLayout.setTranslationY(Math.max(TranslateAlert2.this.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, TranslateAlert2.this.getSheetTop()) + ((-frameLayout.getTop()) - TranslateAlert2.this.topBulletinContainer.getHeight()) + f);
        }
    }

    public class HeaderView extends FrameLayout {
        private ImageView arrowView;
        private ImageView backButton;
        private View backgroundView;
        private TextView fromLanguageTextView;
        private View shadow;
        private LinearLayout subtitleView;
        private TextView titleTextView;
        private AnimatedTextView toLanguageTextView;

        public HeaderView(Context context) {
            super(context);
            View view = new View(context);
            this.backgroundView = view;
            view.setBackgroundColor(TranslateAlert2.this.getThemedColor(Theme.key_dialogBackground));
            addView(this.backgroundView, LayoutHelper.createFrame(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.backButton = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.backButton.setImageResource(R.drawable.ic_ab_back);
            ImageView imageView2 = this.backButton;
            int i = Theme.key_dialogTextBlack;
            int themedColor = TranslateAlert2.this.getThemedColor(i);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView2.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
            this.backButton.setBackground(Theme.createSelectorDrawable(TranslateAlert2.this.getThemedColor(Theme.key_listSelector), 1, -1));
            this.backButton.setAlpha(0.0f);
            final int i2 = 0;
            this.backButton.setOnClickListener(new View.OnClickListener(this) {
                public final TranslateAlert2.HeaderView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$new$0(view2);
                            break;
                        default:
                            this.f$0.lambda$new$1(view2);
                            break;
                    }
                }
            });
            addView(this.backButton, LayoutHelper.createFrame(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
            TextView textView = new TextView(context) {
                @Override
                public void onMeasure(int i3, int i4) {
                    super.onMeasure(i3, i4);
                    if (LocaleController.isRTL) {
                        HeaderView.this.titleTextView.setPivotX(getMeasuredWidth());
                    }
                }
            };
            this.titleTextView = textView;
            textView.setTextColor(TranslateAlert2.this.getThemedColor(i));
            this.titleTextView.setTextSize(1, 20.0f);
            this.titleTextView.setTypeface(AndroidUtilities.bold());
            this.titleTextView.setText(LocaleController.getString(R.string.AutomaticTranslation));
            this.titleTextView.setPivotX(0.0f);
            this.titleTextView.setPivotY(0.0f);
            addView(this.titleTextView, LayoutHelper.createFrame(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context) {
                @Override
                public void onMeasure(int i3, int i4) {
                    super.onMeasure(i3, i4);
                    if (LocaleController.isRTL) {
                        HeaderView.this.subtitleView.setPivotX(getMeasuredWidth());
                    }
                }
            };
            this.subtitleView = linearLayout;
            if (LocaleController.isRTL) {
                linearLayout.setGravity(5);
            }
            this.subtitleView.setPivotX(0.0f);
            this.subtitleView.setPivotY(0.0f);
            if (!TextUtils.isEmpty(TranslateAlert2.this.fromLanguage) && !"und".equals(TranslateAlert2.this.fromLanguage)) {
                TextView textView2 = new TextView(context);
                this.fromLanguageTextView = textView2;
                textView2.setLines(1);
                this.fromLanguageTextView.setTextColor(TranslateAlert2.this.getThemedColor(Theme.key_player_actionBarSubtitle));
                this.fromLanguageTextView.setTextSize(1, 14.0f);
                this.fromLanguageTextView.setText(TranslateAlert2.capitalFirst(TranslateAlert2.languageName(TranslateAlert2.this.fromLanguage)));
                this.fromLanguageTextView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
            }
            ImageView imageView3 = new ImageView(context);
            this.arrowView = imageView3;
            imageView3.setImageResource(R.drawable.search_arrow);
            ImageView imageView4 = this.arrowView;
            int i3 = Theme.key_player_actionBarSubtitle;
            imageView4.setColorFilter(new PorterDuffColorFilter(TranslateAlert2.this.getThemedColor(i3), mode));
            if (LocaleController.isRTL) {
                this.arrowView.setScaleX(-1.0f);
            }
            AnimatedTextView animatedTextView = new AnimatedTextView(context) {
                private Paint bgPaint = new Paint(1);
                private LinkSpanDrawable.LinkCollector links = new LinkSpanDrawable.LinkCollector();

                @Override
                public void onDraw(Canvas canvas) {
                    if (LocaleController.isRTL) {
                        AndroidUtilities.rectTmp.set(getWidth() - width(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
                    } else {
                        AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, width(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
                    }
                    this.bgPaint.setColor(Theme.multAlpha(0.1175f, TranslateAlert2.this.getThemedColor(Theme.key_player_actionBarSubtitle)));
                    canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.bgPaint);
                    if (this.links.draw(canvas)) {
                        invalidate();
                    }
                    super.onDraw(canvas);
                }

                @Override
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 0) {
                        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            if (motionEvent.getAction() == 1) {
                                performClick();
                            }
                            this.links.clear();
                            invalidate();
                        }
                        return super.onTouchEvent(motionEvent);
                    }
                    LinkSpanDrawable linkSpanDrawable = new LinkSpanDrawable(null, ((BottomSheet) TranslateAlert2.this).resourcesProvider, motionEvent.getX(), motionEvent.getY());
                    linkSpanDrawable.setColor(Theme.multAlpha(0.1175f, TranslateAlert2.this.getThemedColor(Theme.key_player_actionBarSubtitle)));
                    LinkPath linkPathObtainNewPath = linkSpanDrawable.obtainNewPath();
                    if (LocaleController.isRTL) {
                        AndroidUtilities.rectTmp.set(getWidth() - width(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
                    } else {
                        AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, width(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
                    }
                    linkPathObtainNewPath.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
                    this.links.addLink(linkSpanDrawable);
                    invalidate();
                    return true;
                }
            };
            this.toLanguageTextView = animatedTextView;
            if (LocaleController.isRTL) {
                animatedTextView.setGravity(5);
            }
            this.toLanguageTextView.setAnimationProperties(0.25f, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.toLanguageTextView.setTextColor(TranslateAlert2.this.getThemedColor(i3));
            this.toLanguageTextView.setTextSize(AndroidUtilities.dp(14.0f));
            this.toLanguageTextView.setText(TranslateAlert2.capitalFirst(TranslateAlert2.languageName(TranslateAlert2.this.toLanguage)));
            this.toLanguageTextView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            final int i4 = 1;
            this.toLanguageTextView.setOnClickListener(new View.OnClickListener(this) {
                public final TranslateAlert2.HeaderView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i4) {
                        case 0:
                            this.f$0.lambda$new$0(view2);
                            break;
                        default:
                            this.f$0.lambda$new$1(view2);
                            break;
                    }
                }
            });
            if (LocaleController.isRTL) {
                this.subtitleView.addView(this.toLanguageTextView, LayoutHelper.createLinear(-2, -2, 16, 0, 0, this.fromLanguageTextView != null ? 3 : 0, 0));
                if (this.fromLanguageTextView != null) {
                    this.subtitleView.addView(this.arrowView, LayoutHelper.createLinear(-2, -2, 16, 0, 1, 0, 0));
                    this.subtitleView.addView(this.fromLanguageTextView, LayoutHelper.createLinear(-2, -2, 16, 4, 0, 0, 0));
                }
            } else {
                TextView textView3 = this.fromLanguageTextView;
                if (textView3 != null) {
                    this.subtitleView.addView(textView3, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 4, 0));
                    this.subtitleView.addView(this.arrowView, LayoutHelper.createLinear(-2, -2, 16, 0, 1, 0, 0));
                }
                this.subtitleView.addView(this.toLanguageTextView, LayoutHelper.createLinear(-2, -2, 16, this.fromLanguageTextView != null ? 3 : 0, 0, 0, 0));
            }
            addView(this.subtitleView, LayoutHelper.createFrame(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
            View view2 = new View(context);
            this.shadow = view2;
            view2.setBackgroundColor(TranslateAlert2.this.getThemedColor(Theme.key_dialogShadowLine));
            this.shadow.setAlpha(0.0f);
            addView(this.shadow, LayoutHelper.createFrame(-1, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
        }

        public void lambda$new$0(View view) {
            TranslateAlert2.this.lambda$showGiftOfferSheet$15();
        }

        public void lambda$new$1(View view) {
            openLanguagesSelect();
        }

        public void lambda$openLanguagesSelect$2(Runnable[] runnableArr, LocaleController.LocaleInfo localeInfo, View view) {
            Runnable runnable = runnableArr[0];
            if (runnable != null) {
                runnable.run();
            }
            if (TextUtils.equals(TranslateAlert2.this.toLanguage, localeInfo.pluralLangCode)) {
                return;
            }
            if (TranslateAlert2.this.adapter.mMainView == TranslateAlert2.this.textViewContainer || TranslateAlert2.this.adapter.mMainView == TranslateAlert2.this.richPreviewView) {
                TranslateAlert2 translateAlert2 = TranslateAlert2.this;
                translateAlert2.prevToLanguage = translateAlert2.toLanguage;
            }
            this.toLanguageTextView.setText(TranslateAlert2.capitalFirst(TranslateAlert2.languageName(TranslateAlert2.this.toLanguage = localeInfo.pluralLangCode)));
            TranslateAlert2.this.adapter.updateMainView(TranslateAlert2.this.reqRichMessage != null ? TranslateAlert2.this.richLoadingPreviewView : TranslateAlert2.this.loadingTextView);
            TranslateAlert2.setToLanguage(TranslateAlert2.this.toLanguage);
            TranslateAlert2.this.translate();
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f), 1073741824));
        }

        public void openLanguagesSelect() {
            int measuredHeight;
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(getContext()) {
                @Override
                public void onMeasure(int i, int i2) {
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (AndroidUtilities.displaySize.y * 0.33f), View.MeasureSpec.getSize(i2)), 1073741824));
                }
            };
            Drawable drawableMutate = getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(TranslateAlert2.this.getThemedColor(Theme.key_actionBarDefaultSubmenuBackground), PorterDuff.Mode.MULTIPLY));
            actionBarPopupWindowLayout.setBackground(drawableMutate);
            Runnable[] runnableArr = new Runnable[1];
            ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
            int i = 0;
            boolean z = true;
            while (i < locales.size()) {
                LocaleController.LocaleInfo localeInfo = locales.get(i);
                if (!localeInfo.pluralLangCode.equals(TranslateAlert2.this.fromLanguage) && "remote".equals(localeInfo.pathToFile)) {
                    TextUtils.equals(TranslateAlert2.this.toLanguage, localeInfo.pluralLangCode);
                    ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(2, getContext(), ((BottomSheet) TranslateAlert2.this).resourcesProvider, z, i == locales.size() - 1);
                    actionBarMenuSubItem.setText(TranslateAlert2.capitalFirst(TranslateAlert2.languageName(localeInfo.pluralLangCode)));
                    actionBarMenuSubItem.setChecked(TextUtils.equals(TranslateAlert2.this.toLanguage, localeInfo.pluralLangCode));
                    actionBarMenuSubItem.setOnClickListener(new EditTextEmoji$$ExternalSyntheticLambda0(this, runnableArr, localeInfo, 3));
                    actionBarPopupWindowLayout.addView(actionBarMenuSubItem);
                    z = false;
                }
                i++;
            }
            ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout, -2, -2);
            runnableArr[0] = new ShareAlert$23$$ExternalSyntheticLambda0(actionBarPopupWindow, 10);
            actionBarPopupWindow.setPauseNotifications(true);
            actionBarPopupWindow.setDismissAnimationDuration(220);
            actionBarPopupWindow.setOutsideTouchable(true);
            actionBarPopupWindow.setClippingEnabled(true);
            actionBarPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
            actionBarPopupWindow.setFocusable(true);
            int[] iArr = new int[2];
            this.toLanguageTextView.getLocationInWindow(iArr);
            actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
            int measuredHeight2 = actionBarPopupWindowLayout.getMeasuredHeight();
            int i2 = iArr[1];
            if (i2 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                measuredHeight = AndroidUtilities.dp(8.0f) + (i2 - measuredHeight2);
            } else {
                measuredHeight = (this.toLanguageTextView.getMeasuredHeight() + i2) - AndroidUtilities.dp(8.0f);
            }
            actionBarPopupWindow.showAtLocation(((BottomSheet) TranslateAlert2.this).containerView, 51, iArr[0] - AndroidUtilities.dp(8.0f), measuredHeight);
        }

        @Override
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            float fClamp = MathUtils.clamp((f - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(64.0f), 0.0f, 1.0f);
            if (!TranslateAlert2.this.hasEnoughHeight()) {
                fClamp = 1.0f;
            }
            float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(fClamp);
            this.titleTextView.setScaleX(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
            this.titleTextView.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
            this.titleTextView.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
            if (!LocaleController.isRTL) {
                this.titleTextView.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
                this.subtitleView.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            }
            this.subtitleView.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
            this.backButton.setTranslationX(AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(-25.0f), interpolation));
            float f2 = 1.0f - interpolation;
            this.backButton.setAlpha(f2);
            this.shadow.setTranslationY(AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(22.0f), interpolation));
            this.shadow.setAlpha(f2);
        }
    }

    public class LoadingTextView extends TextView {
        private final LoadingDrawable loadingDrawable;
        private final LinkPath path;

        public LoadingTextView(Context context) {
            super(context);
            LinkPath linkPath = new LinkPath(true);
            this.path = linkPath;
            LoadingDrawable loadingDrawable = new LoadingDrawable();
            this.loadingDrawable = loadingDrawable;
            loadingDrawable.usePath(linkPath);
            loadingDrawable.setSpeed(0.65f);
            loadingDrawable.setRadiiDp(4.0f);
            setBackground(loadingDrawable);
        }

        private void updateDrawable() {
            LinkPath linkPath = this.path;
            if (linkPath == null || this.loadingDrawable == null) {
                return;
            }
            linkPath.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                this.path.setCurrentLayout(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), this.path);
            }
            this.loadingDrawable.updateBounds();
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.loadingDrawable.reset();
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            updateDrawable();
        }

        @Override
        public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
            super.setText(charSequence, bufferType);
            updateDrawable();
        }

        @Override
        public void setTextColor(int i) {
            super.setTextColor(Theme.multAlpha(0.2f, i));
            this.loadingDrawable.setColors(Theme.multAlpha(0.03f, i), Theme.multAlpha(0.175f, i), Theme.multAlpha(0.2f, i), Theme.multAlpha(0.45f, i));
        }
    }

    public static class PaddedAdapter extends RecyclerView.Adapter {
        private Context mContext;
        private View mMainView;
        private int mainViewType = 1;

        public PaddedAdapter(Context context, View view) {
            this.mContext = context;
            this.mMainView = view;
        }

        @Override
        public int getItemCount() {
            return 2;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == 0) {
                return 0;
            }
            return this.mainViewType;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return i == 0 ? new RecyclerListView.Holder(new View(this.mContext) {
                @Override
                public void onMeasure(int i2, int i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.displaySize.y * 0.4f), 1073741824));
                }
            }) : new RecyclerListView.Holder(this.mMainView);
        }

        public void updateMainView(View view) {
            if (this.mMainView == view) {
                return;
            }
            this.mainViewType++;
            this.mMainView = view;
            lambda$onBindViewHolder$31(1);
        }
    }

    public static void alternativeTranslate(String str, String str2, String str3, Utilities.Callback2<String, Boolean> callback2) {
        if (callback2 == null) {
            return;
        }
        if (str2 == null) {
            LanguageDetector.detectLanguage(str, new TranslateAlert2$$ExternalSyntheticLambda10(str, str3, callback2), new TranslateAlert2$$ExternalSyntheticLambda10(str, str3, callback2));
            return;
        }
        String strEncode = Uri.encode(str);
        if (strEncode.length() <= 5000) {
            alternativeTranslateInternal(strEncode, str2, str3, callback2);
            return;
        }
        ArrayList<String> arrayListCut = cut(strEncode, 5000);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < arrayListCut.size(); i++) {
            arrayList.add(null);
        }
        boolean[] zArr = new boolean[1];
        for (int i2 = 0; i2 < arrayListCut.size(); i2++) {
            alternativeTranslateInternal(arrayListCut.get(i2), str2, str3, new AIEditorAlert$$ExternalSyntheticLambda8(zArr, arrayList, i2, callback2, 2));
        }
    }

    private static void alternativeTranslateInternal(String str, String str2, String str3, Utilities.Callback2<String, Boolean> callback2) {
        if (callback2 == null) {
            return;
        }
        new AnonymousClass5(str2, str3, str, callback2).start();
    }

    public static String capitalFirst(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static ArrayList<String> cut(String str, int i) {
        ArrayList<String> arrayList = new ArrayList<>();
        int i2 = 0;
        while (i2 < str.length()) {
            int iMin = Math.min(i2 + i, str.length());
            int iLastIndexOfSafe = lastIndexOfSafe(str, "%0A", i2, iMin);
            if (iLastIndexOfSafe == -1) {
                iLastIndexOfSafe = lastIndexOfSafe(str, "%20", i2, iMin);
            }
            if (iLastIndexOfSafe != -1) {
                iMin = iLastIndexOfSafe + 3;
            }
            arrayList.add(str.substring(i2, iMin));
            i2 = iMin;
        }
        return arrayList;
    }

    public float getSheetTop() {
        return getSheetTop(true);
    }

    public static String getToLanguage() {
        return MessagesController.getGlobalMainSettings().getString("translate_to_language", LocaleController.getInstance().getCurrentLocale().getLanguage());
    }

    private static HashMap<String, ArrayList<Emoji.EmojiSpanRange>> groupEmojiRanges(CharSequence charSequence) {
        ArrayList<Emoji.EmojiSpanRange> emojis;
        HashMap<String, ArrayList<Emoji.EmojiSpanRange>> map = new HashMap<>();
        if (charSequence != null && (emojis = Emoji.parseEmojis(charSequence)) != null) {
            String string = charSequence.toString();
            for (int i = 0; i < emojis.size(); i++) {
                Emoji.EmojiSpanRange emojiSpanRange = emojis.get(i);
                if (emojiSpanRange != null && emojiSpanRange.code != null) {
                    String strSubstring = string.substring(emojiSpanRange.start, emojiSpanRange.end);
                    ArrayList<Emoji.EmojiSpanRange> arrayList = map.get(strSubstring);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        map.put(strSubstring, arrayList);
                    }
                    arrayList.add(emojiSpanRange);
                }
            }
        }
        return map;
    }

    public boolean hasEnoughHeight() {
        float height = 0.0f;
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            View childAt = this.listView.getChildAt(i);
            if (this.listView.getChildAdapterPosition(childAt) == 1) {
                height += childAt.getHeight();
            }
        }
        return height >= ((float) ((this.listView.getHeight() - this.listView.getPaddingTop()) - this.listView.getPaddingBottom()));
    }

    public static void lambda$alternativeTranslate$9(boolean[] zArr, ArrayList arrayList, int i, Utilities.Callback2 callback2, String str, Boolean bool) {
        if (zArr[0]) {
            return;
        }
        if (str == null) {
            zArr[0] = true;
            callback2.run(null, bool);
            return;
        }
        arrayList.set(i, str);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (arrayList.get(i2) == null) {
                return;
            }
        }
        zArr[0] = true;
        callback2.run(TextUtils.join("", arrayList), Boolean.FALSE);
    }

    public void lambda$new$0(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$translate$1(TLObject tLObject) {
        this.reqId = null;
        if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
            TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject;
            if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                this.firstTranslation = false;
                TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                RichMessageLayout.PreviewView previewView = this.richPreviewView;
                if (previewView != null) {
                    previewView.set(richMessage);
                    this.adapter.updateMainView(this.richPreviewView);
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
        UserNameResolver$$ExternalSyntheticOutline0.m(BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider), R.string.TranslationFailedAlert2);
        AnimatedTextView animatedTextView = this.headerView.toLanguageTextView;
        String str = this.prevToLanguage;
        this.toLanguage = str;
        animatedTextView.setText(languageName(str));
    }

    public void lambda$translate$2(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new UndoView$$ExternalSyntheticLambda3(22, this, tLObject));
    }

    public void lambda$translate$3(TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, TLRPC.TL_error tL_error) {
        this.reqId = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            translateAlt();
            return;
        }
        if (tL_textWithEntities2 != null) {
            this.firstTranslation = false;
            TLRPC.TL_textWithEntities tL_textWithEntitiesPreprocess = preprocess(tL_textWithEntities, tL_textWithEntities2);
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(tL_textWithEntitiesPreprocess.text);
            MessageObject.addEntitiesToText(spannableStringBuilderValueOf, tL_textWithEntitiesPreprocess.entities, false, true, false, false);
            this.textView.setText(preprocessText(spannableStringBuilderValueOf));
            this.adapter.updateMainView(this.textViewContainer);
            return;
        }
        if (this.firstTranslation) {
            lambda$showGiftOfferSheet$15();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        UserNameResolver$$ExternalSyntheticOutline0.m(BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider), R.string.TranslationFailedAlert2);
        AnimatedTextView animatedTextView = this.headerView.toLanguageTextView;
        String str = this.prevToLanguage;
        this.toLanguage = str;
        animatedTextView.setText(languageName(str));
        this.adapter.updateMainView(this.textViewContainer);
    }

    public void lambda$translate$4(TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.reqId = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            translateAlt();
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject;
            if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                this.firstTranslation = false;
                TLRPC.TL_textWithEntities tL_textWithEntitiesPreprocess = preprocess(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(tL_textWithEntitiesPreprocess.text);
                MessageObject.addEntitiesToText(spannableStringBuilderValueOf, tL_textWithEntitiesPreprocess.entities, false, true, false, false);
                this.textView.setText(preprocessText(spannableStringBuilderValueOf));
                this.adapter.updateMainView(this.textViewContainer);
                return;
            }
        }
        if (this.firstTranslation) {
            lambda$showGiftOfferSheet$15();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        UserNameResolver$$ExternalSyntheticOutline0.m(BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider), R.string.TranslationFailedAlert2);
        AnimatedTextView animatedTextView = this.headerView.toLanguageTextView;
        String str = this.prevToLanguage;
        this.toLanguage = str;
        animatedTextView.setText(languageName(str));
        this.adapter.updateMainView(this.textViewContainer);
    }

    public void lambda$translate$5(TLRPC.TL_textWithEntities tL_textWithEntities, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda1(20, this, tL_error, tLObject, tL_textWithEntities));
    }

    public void lambda$translateAlt$6(String str, Boolean bool) {
        if (str != null) {
            this.firstTranslation = false;
            this.textView.setText(preprocessText(str));
            this.adapter.updateMainView(this.textViewContainer);
        } else {
            if (isDismissed()) {
                return;
            }
            if (this.firstTranslation) {
                lambda$showGiftOfferSheet$15();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(bool.booleanValue() ? R.string.TranslationFailedAlert1 : R.string.TranslationFailedAlert2));
                return;
            }
            UserNameResolver$$ExternalSyntheticOutline0.m(BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider), bool.booleanValue() ? R.string.TranslationFailedAlert1 : R.string.TranslationFailedAlert2);
            AnimatedTextView animatedTextView = this.headerView.toLanguageTextView;
            String str2 = this.prevToLanguage;
            this.toLanguage = str2;
            animatedTextView.setText(languageName(str2));
            this.adapter.updateMainView(this.textViewContainer);
        }
    }

    public static String languageName(String str) {
        return languageName(str, null, null);
    }

    public static String languageNameCapital(String str) {
        String strLanguageName = languageName(str);
        if (strLanguageName == null) {
            return null;
        }
        return strLanguageName.substring(0, 1).toUpperCase() + strLanguageName.substring(1);
    }

    private static int lastIndexOfSafe(String str, String str2, int i, int i2) {
        int iLastIndexOf = str.lastIndexOf(str2, i2 - 1);
        if (iLastIndexOf >= i) {
            return iLastIndexOf;
        }
        return -1;
    }

    public static String lowerFirst(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str.substring(0, 1).toLowerCase() + str.substring(1);
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
            HashMap<String, ArrayList<Emoji.EmojiSpanRange>> mapGroupEmojiRanges = groupEmojiRanges(tL_textWithEntities.text);
            HashMap<String, ArrayList<Emoji.EmojiSpanRange>> mapGroupEmojiRanges2 = groupEmojiRanges(tL_textWithEntities2.text);
            for (int i3 = 0; i3 < tL_textWithEntities.entities.size(); i3++) {
                TLRPC.MessageEntity messageEntity2 = tL_textWithEntities.entities.get(i3);
                if (messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                    String str2 = tL_textWithEntities.text;
                    int i4 = messageEntity2.offset;
                    String strSubstring2 = str2.substring(i4, messageEntity2.length + i4);
                    if (!TextUtils.isEmpty(strSubstring2)) {
                        ArrayList<Emoji.EmojiSpanRange> arrayList2 = mapGroupEmojiRanges.get(strSubstring2);
                        ArrayList<Emoji.EmojiSpanRange> arrayList3 = mapGroupEmojiRanges2.get(strSubstring2);
                        if (arrayList2 != null && arrayList3 != null) {
                            int i5 = 0;
                            while (true) {
                                if (i5 >= arrayList2.size()) {
                                    i5 = -1;
                                    break;
                                }
                                Emoji.EmojiSpanRange emojiSpanRange2 = arrayList2.get(i5);
                                int i6 = emojiSpanRange2.start;
                                int i7 = messageEntity2.offset;
                                if (i6 == i7 && emojiSpanRange2.end == i7 + messageEntity2.length) {
                                    break;
                                }
                                i5++;
                            }
                            if (i5 >= 0 && i5 < arrayList3.size() && (emojiSpanRange = arrayList3.get(i5)) != null) {
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

    private CharSequence preprocessText(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (this.onLinkPress != null || this.fragment != null) {
            for (final URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                if (spanStart != -1 && spanEnd != -1) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new ClickableSpan() {
                        @Override
                        public void onClick(View view) {
                            if (TranslateAlert2.this.onLinkPress != null) {
                                if (((Boolean) TranslateAlert2.this.onLinkPress.run(uRLSpan)).booleanValue()) {
                                    TranslateAlert2.this.lambda$showGiftOfferSheet$15();
                                }
                            } else if (TranslateAlert2.this.fragment != null) {
                                AlertsCreator.showOpenUrlAlert(TranslateAlert2.this.fragment, uRLSpan.getURL(), false, false);
                            }
                        }

                        @Override
                        public void updateDrawState(TextPaint textPaint) {
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

    public static void resetToLanguage() {
        MessagesController.getGlobalMainSettings().edit().remove("translate_to_language").apply();
    }

    public static void setToLanguage(String str) {
        MessagesController.getGlobalMainSettings().edit().putString("translate_to_language", str).apply();
    }

    public static TranslateAlert2 showAlert(Context context, BaseFragment baseFragment, int i, TLRPC.InputPeer inputPeer, int i2, boolean z, String str, String str2, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, boolean z2, Utilities.CallbackReturn<URLSpan, Boolean> callbackReturn, final Runnable runnable) {
        TranslateAlert2 translateAlert2 = new TranslateAlert2(context, str, str2, charSequence, arrayList, inputPeer, i2, z, null, null) {
            @Override
            public void lambda$showGiftOfferSheet$15() {
                super.lambda$showGiftOfferSheet$15();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            @Override
            public void setLastVisible(boolean z3) {
            }
        };
        translateAlert2.setNoforwards(z2);
        translateAlert2.setFragment(baseFragment);
        translateAlert2.setOnLinkPress(callbackReturn);
        if (baseFragment == null) {
            translateAlert2.show();
            return translateAlert2;
        }
        if (baseFragment.getParentActivity() != null) {
            baseFragment.showDialog(translateAlert2);
        }
        return translateAlert2;
    }

    public static String systemLanguageName(String str) {
        return systemLanguageName(str, false);
    }

    private void translateAlt() {
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
        alternativeTranslate(string, str, "nb".equals(str2) ? "no" : str2, new EmojiView$$ExternalSyntheticLambda18(this, 20));
    }

    public void updateButtonShadow(boolean z) {
        Boolean bool = this.buttonShadowShown;
        if (bool == null || bool.booleanValue() != z) {
            this.buttonShadowShown = Boolean.valueOf(z);
            this.buttonShadowView.animate().cancel();
            OKLCH.m(this.buttonShadowView.animate().alpha(z ? 1.0f : 0.0f), CubicBezierInterpolator.EASE_OUT_QUINT, 320L);
        }
    }

    @Override
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
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
    public void dismissInternal() {
        if (this.reqId != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId.intValue(), true);
            this.reqId = null;
        }
        super.dismissInternal();
    }

    public void setFragment(BaseFragment baseFragment) {
        this.fragment = baseFragment;
    }

    @Override
    public void setLastVisible(boolean z) {
    }

    public void setNoforwards(boolean z) {
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

    public void setOnLinkPress(Utilities.CallbackReturn<URLSpan, Boolean> callbackReturn) {
        this.onLinkPress = callbackReturn;
    }

    @Override
    public void show() {
        super.show();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.translationModelDownloaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.translationModelDownloading);
    }

    public void translate() {
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
        if (this.reqRichMessage != null && this.reqPeer != null) {
            TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
            tL_messages_translateRichMessage.flags = 1 | tL_messages_translateRichMessage.flags;
            tL_messages_translateRichMessage.peer = this.reqPeer;
            tL_messages_translateRichMessage.id.add(Integer.valueOf(this.reqMessageId));
            tL_messages_translateRichMessage.to_lang = TranslateController.normalizeLanguage(str);
            this.reqId = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_translateRichMessage, new UndoView$$ExternalSyntheticLambda0(this, 18)));
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence charSequence = this.reqText;
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        ArrayList<TLRPC.MessageEntity> arrayList = this.reqMessageEntities;
        if (arrayList != null) {
            tL_textWithEntities.entities = arrayList;
        }
        if (this.reqSum && this.reqPeer != null) {
            TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
            tL_messages_summarizeText.flags = 1 | tL_messages_summarizeText.flags;
            tL_messages_summarizeText.peer = this.reqPeer;
            tL_messages_summarizeText.id = this.reqMessageId;
            tL_messages_summarizeText.to_lang = TranslateController.normalizeLanguage(str);
            this.reqId = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new AiTonesController$$ExternalSyntheticLambda0(), new ScrimOptions$$ExternalSyntheticLambda2(5, this, tL_textWithEntities)));
            return;
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        TLRPC.InputPeer inputPeer = this.reqPeer;
        if (inputPeer != null) {
            tL_messages_translateText.flags = 1 | tL_messages_translateText.flags;
            tL_messages_translateText.peer = inputPeer;
            tL_messages_translateText.id.add(Integer.valueOf(this.reqMessageId));
        } else {
            tL_messages_translateText.flags |= 2;
            tL_messages_translateText.text.add(tL_textWithEntities);
        }
        tL_messages_translateText.to_lang = TranslateController.normalizeLanguage(str);
        this.reqId = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_translateText, new ShareAlert$$ExternalSyntheticLambda13(14, this, tL_textWithEntities)));
    }

    public TranslateAlert2(Context context, String str, String str2, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, Theme.ResourcesProvider resourcesProvider) {
        this(context, str, str2, charSequence, arrayList, null, 0, false, null, resourcesProvider);
    }

    public float getSheetTop(boolean z) {
        AnimatedFloat animatedFloat;
        float top = this.listView.getTop();
        if (this.listView.getChildCount() >= 1) {
            RecyclerListView recyclerListView = this.listView;
            top += Math.max(0, recyclerListView.getChildAt(recyclerListView.getChildCount() - 1).getTop());
        }
        float fMax = Math.max(0.0f, top - AndroidUtilities.dp(78.0f));
        if (z && (animatedFloat = this.sheetTopAnimated) != null) {
            if (!this.listView.scrollingByUser && !this.sheetTopNotAnimate) {
                return animatedFloat.set(fMax);
            }
            animatedFloat.set(fMax, true);
        }
        return fMax;
    }

    public static String languageName(String str, boolean[] zArr) {
        return languageName(str, zArr, null);
    }

    public static String systemLanguageName(String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (localesByCode == null) {
            localesByCode = new HashMap<>();
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
            Locale locale = localesByCode.get(lowerCase);
            if (locale != null) {
                String displayLanguage = locale.getDisplayLanguage(z ? locale : Locale.getDefault());
                if (!lowerCase.contains("-")) {
                    return displayLanguage;
                }
                String displayCountry = locale.getDisplayCountry(z ? locale : Locale.getDefault());
                if (TextUtils.isEmpty(displayCountry)) {
                    return displayLanguage;
                }
                return displayLanguage + " (" + displayCountry + ")";
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    private TranslateAlert2(Context context, String str, String str2, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.InputPeer inputPeer, int i, boolean z, TL_iv.RichMessage richMessage, Theme.ResourcesProvider resourcesProvider) {
        super(context, false, false, resourcesProvider);
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
        this.sheetTopAnimated = new AnimatedFloat(containerView, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
        LoadingTextView loadingTextView = new LoadingTextView(context);
        this.loadingTextView = loadingTextView;
        loadingTextView.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        this.loadingTextView.setTextSize(1, SharedConfig.fontSize);
        LoadingTextView loadingTextView2 = this.loadingTextView;
        int i2 = Theme.key_dialogTextBlack;
        loadingTextView2.setTextColor(getThemedColor(i2));
        this.loadingTextView.setLinkTextColor(Theme.multAlpha(0.2f, getThemedColor(i2)));
        this.loadingTextView.setText(Emoji.replaceEmoji(charSequence == null ? "" : charSequence.toString(), this.loadingTextView.getPaint().getFontMetricsInt(), true));
        this.textViewContainer = new FrameLayout(context) {
            @Override
            public void onMeasure(int i3, int i4) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i4);
            }
        };
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        this.textView = linksTextView;
        linksTextView.setDisablePaddingsOffsetY(true);
        this.textView.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        this.textView.setTextSize(1, SharedConfig.fontSize);
        this.textView.setTextColor(getThemedColor(i2));
        this.textView.setLinkTextColor(getThemedColor(Theme.key_chat_messageLinkIn));
        this.textView.setTextIsSelectable(true);
        this.textView.setHighlightColor(getThemedColor(Theme.key_chat_inTextSelectionHighlight));
        int themedColor = getThemedColor(Theme.key_chat_TextSelectionCursor);
        try {
            if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
                Drawable textSelectHandleLeft = this.textView.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(themedColor, mode);
                this.textView.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandleRight = this.textView.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(themedColor, mode);
                this.textView.setTextSelectHandleRight(textSelectHandleRight);
            }
        } catch (Exception unused) {
        }
        this.textViewContainer.addView(this.textView, LayoutHelper.createFrame(-1, -1.0f));
        if (this.reqRichMessage != null) {
            RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, this.currentAccount, resourcesProvider);
            this.richLoadingPreviewView = previewView;
            previewView.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
            this.richLoadingPreviewView.set(this.reqRichMessage);
            this.richLoadingPreviewView.setTranslationLoading(true);
            RichMessageLayout.PreviewView previewView2 = new RichMessageLayout.PreviewView(context, this.currentAccount, resourcesProvider);
            this.richPreviewView = previewView2;
            previewView2.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        }
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= TranslateAlert2.this.getSheetTop() - getTop()) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                TranslateAlert2.this.lambda$showGiftOfferSheet$15();
                return true;
            }

            @Override
            public boolean onRequestFocusInDescendants(int i3, Rect rect) {
                return true;
            }

            @Override
            public void requestChildFocus(View view, View view2) {
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setOverScrollMode(1);
        this.listView.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.dp(80.0f));
        this.listView.setClipToPadding(true);
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        RecyclerListView recyclerListView3 = this.listView;
        PaddedAdapter paddedAdapter = new PaddedAdapter(context, this.reqRichMessage != null ? this.richLoadingPreviewView : this.loadingTextView);
        this.adapter = paddedAdapter;
        recyclerListView3.setAdapter(paddedAdapter);
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i3) {
                if (i3 == 0) {
                    TranslateAlert2.this.sheetTopNotAnimate = false;
                }
                if ((i3 == 0 || i3 == 2) && TranslateAlert2.this.getSheetTop(false) > 0.0f && TranslateAlert2.this.getSheetTop(false) < AndroidUtilities.dp(96.0f) && TranslateAlert2.this.listView.canScrollVertically(1) && TranslateAlert2.this.hasEnoughHeight()) {
                    TranslateAlert2.this.sheetTopNotAnimate = true;
                    TranslateAlert2.this.listView.smoothScrollBy(0, (int) TranslateAlert2.this.getSheetTop(false));
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                ((BottomSheet) TranslateAlert2.this).containerView.invalidate();
                TranslateAlert2 translateAlert2 = TranslateAlert2.this;
                translateAlert2.updateButtonShadow(translateAlert2.listView.canScrollVertically(1));
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            public void onChangeAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                ((BottomSheet) TranslateAlert2.this).containerView.invalidate();
            }

            @Override
            public void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                ((BottomSheet) TranslateAlert2.this).containerView.invalidate();
            }
        };
        defaultItemAnimator.setDurations(180L);
        defaultItemAnimator.setInterpolator(new LinearInterpolator());
        this.listView.lambda$onCellEnter$52(defaultItemAnimator);
        this.containerView.addView(this.listView, LayoutHelper.createFrame(-1, -2, 80));
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = new TextSelectionHelper.ArticleTextSelectionHelper();
        this.textSelectionHelper = articleTextSelectionHelper;
        articleTextSelectionHelper.setParentView(this.listView);
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper2 = this.textSelectionHelper;
        articleTextSelectionHelper2.layoutManager = this.layoutManager;
        TextSelectionHelper.TextSelectionOverlay overlayView = articleTextSelectionHelper2.getOverlayView(context);
        this.textSelectionOverlay = overlayView;
        AndroidUtilities.removeFromParent(overlayView);
        this.containerView.addView(this.textSelectionOverlay, LayoutHelper.createFrame(-1, -1, 119));
        RichMessageLayout.PreviewView previewView3 = this.richPreviewView;
        if (previewView3 != null) {
            previewView3.setTextSelectionHelper(this.textSelectionHelper);
        }
        HeaderView headerView = new HeaderView(context);
        this.headerView = headerView;
        this.containerView.addView(headerView, LayoutHelper.createFrame(-1, 78, 55));
        FrameLayout frameLayout = new FrameLayout(context);
        this.buttonView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
        View view = new View(context);
        this.buttonShadowView = view;
        view.setBackgroundColor(getThemedColor(Theme.key_dialogShadowLine));
        this.buttonShadowView.setAlpha(0.0f);
        this.buttonView.addView(this.buttonShadowView, LayoutHelper.createFrame(-1.0f, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55));
        TextView textView = new TextView(context);
        this.buttonTextView = textView;
        textView.setLines(1);
        this.buttonTextView.setSingleLine(true);
        this.buttonTextView.setGravity(1);
        this.buttonTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.buttonTextView.setGravity(17);
        this.buttonTextView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
        this.buttonTextView.setTypeface(AndroidUtilities.bold());
        this.buttonTextView.setTextSize(1, 14.0f);
        this.buttonTextView.setText(LocaleController.getString(R.string.CloseTranslation));
        TextView textView2 = this.buttonTextView;
        int color = Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
        textView2.setBackground(Theme.AdaptiveRipple.createRect(new float[]{24.0f}, color, Theme.AdaptiveRipple.calcRippleColor(color)));
        this.buttonTextView.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 18));
        this.buttonView.addView(this.buttonTextView, LayoutHelper.createFrame(-1, 48.0f, 87, 16.0f, 16.0f, 16.0f, 16.0f));
        this.containerView.addView(this.buttonView, LayoutHelper.createFrame(-1, -2, 87));
        translate();
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
        String strSystemLanguageName = systemLanguageName(str);
        if (strSystemLanguageName == null) {
            strSystemLanguageName = systemLanguageName(str2);
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
        if (currentLocaleInfo != null && "en".equals(currentLocaleInfo.pluralLangCode)) {
            return builtinLanguageByPlural.nameEnglish;
        }
        return builtinLanguageByPlural.name;
    }

    public static CharSequence capitalFirst(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() <= 0) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilderValueOf = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : SpannableStringBuilder.valueOf(charSequence);
        spannableStringBuilderValueOf.replace(0, 1, (CharSequence) spannableStringBuilderValueOf.toString().substring(0, 1).toUpperCase());
        return spannableStringBuilderValueOf;
    }

    public static CharSequence lowerFirst(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() <= 0) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilderValueOf = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : SpannableStringBuilder.valueOf(charSequence);
        spannableStringBuilderValueOf.replace(0, 1, (CharSequence) spannableStringBuilderValueOf.toString().substring(0, 1).toLowerCase());
        return spannableStringBuilderValueOf;
    }

    public static TranslateAlert2 showAlert(Context context, BaseFragment baseFragment, int i, TLRPC.InputPeer inputPeer, int i2, String str, String str2, TL_iv.RichMessage richMessage, boolean z, Utilities.CallbackReturn<URLSpan, Boolean> callbackReturn, final Runnable runnable) {
        if (context == null) {
            return null;
        }
        TranslateAlert2 translateAlert2 = new TranslateAlert2(context, str, str2, null, null, inputPeer, i2, false, richMessage, null) {
            @Override
            public void lambda$showGiftOfferSheet$15() {
                super.lambda$showGiftOfferSheet$15();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            @Override
            public void setLastVisible(boolean z2) {
            }
        };
        translateAlert2.setNoforwards(z);
        translateAlert2.setFragment(baseFragment);
        translateAlert2.setOnLinkPress(callbackReturn);
        if (baseFragment != null) {
            if (baseFragment.getParentActivity() != null) {
                baseFragment.showDialog(translateAlert2);
            }
            return translateAlert2;
        }
        translateAlert2.show();
        return translateAlert2;
    }

    public static TranslateAlert2 showAlert(Context context, BaseFragment baseFragment, int i, String str, String str2, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, boolean z, Utilities.CallbackReturn<URLSpan, Boolean> callbackReturn, final Runnable runnable) {
        if (context == null) {
            return null;
        }
        TranslateAlert2 translateAlert2 = new TranslateAlert2(context, str, str2, charSequence, arrayList, null) {
            @Override
            public void lambda$showGiftOfferSheet$15() {
                super.lambda$showGiftOfferSheet$15();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            @Override
            public void setLastVisible(boolean z2) {
            }
        };
        translateAlert2.setNoforwards(z);
        translateAlert2.setFragment(baseFragment);
        translateAlert2.setOnLinkPress(callbackReturn);
        if (baseFragment != null) {
            if (baseFragment.getParentActivity() != null) {
                baseFragment.showDialog(translateAlert2);
            }
            return translateAlert2;
        }
        translateAlert2.show();
        return translateAlert2;
    }

    public static ArrayList<TLRPC.TL_textWithEntities> preprocess(ArrayList<TLRPC.TL_textWithEntities> arrayList) {
        if (arrayList == null) {
            return null;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, preprocess(null, arrayList.get(i)));
        }
        return arrayList;
    }
}
