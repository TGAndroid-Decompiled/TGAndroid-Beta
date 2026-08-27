package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.Utilities;

public final class ol0 extends Dialog {
    public static final int K = 0;
    public Drawable A;
    public lg.d B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public boolean H;
    public boolean I;
    public ValueAnimator J;

    public final Context f31348a;

    public final org.telegram.ui.ActionBar.c6 f31349b;

    public Bitmap f31350c;
    public BitmapShader d;

    public Paint f31351e;

    public Matrix f31352f;
    public final og.b h;

    public final jg.a f31353n;

    public float f31354r;

    public final ag.p1 f31355s;
    public final zu0 v;

    public b70 f31356w;

    public FrameLayout f31357x;

    public ViewGroup f31358y;

    public ol0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, R.style.TransparentDialog);
        this.F = 1.0f;
        this.G = 1.0f;
        this.I = false;
        this.f31348a = context;
        this.f31349b = c6Var;
        ag.p1 p1Var = new ag.p1(this, context, 23);
        this.f31355s = p1Var;
        p1Var.setOnClickListener(new l70(this, 10));
        zu0 zu0Var = new zu0(context, null);
        this.v = zu0Var;
        zu0Var.setClipToPadding(false);
        p1Var.addView(zu0Var, h7.z5.e(-1, -1, 119));
        og.b bVar = new og.b();
        this.h = bVar;
        jg.a aVar = new jg.a(bVar);
        this.f31353n = aVar;
        aVar.d = new qg.j(p1Var);
        aVar.f12943e = p1Var;
        o0.b bVar2 = new o0.b(this, 9);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.b0.j(p1Var, bVar2);
    }

    public static void d(Utilities.Callback2 callback2) {
        AndroidUtilities.makeGlobalBlurBitmap(new v2(callback2, 10), 15.0f);
    }

    public final void c(Runnable runnable, boolean z10) {
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f31354r, z10 ? 1.0f : 0.0f);
        this.J = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new v60(this, 11));
        this.J.addListener(new androidx.fragment.app.g(this, z10, runnable, 6));
        this.J.setInterpolator(er.h);
        this.J.setDuration(350L);
        this.J.start();
    }

    @Override
    public final void dismiss() {
        if (this.I) {
            return;
        }
        this.I = true;
        c(new ml0(this, 1), false);
        this.f31355s.invalidate();
    }

    public final void e(b70 b70Var) {
        int i10 = org.telegram.ui.ActionBar.g6.E8;
        org.telegram.ui.ActionBar.c6 c6Var = this.f31349b;
        b70Var.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
        b70Var.Q(this.f31353n, ng.c.j(c6Var), false);
        this.f31356w = b70Var;
        this.f31358y = b70Var.A;
        FrameLayout frameLayout = new FrameLayout(this.f31348a);
        this.f31357x = frameLayout;
        frameLayout.addView(this.f31358y, h7.z5.c(-2.0f, -2));
        this.v.addView(this.f31357x, h7.z5.c(-2.0f, -2));
    }

    public final void f(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, CharSequence charSequence, boolean z10) {
        float captionX;
        float captionY;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        float f10;
        boolean z11;
        float textX;
        float textY;
        int spanStart;
        int width;
        int spanEnd;
        ?? r14;
        float f11;
        RectF rectF;
        ?? r15;
        Bitmap bitmap;
        ?? r31;
        int i10;
        RichMessageLayout richMessageLayout;
        RichMessageLayout.FoundLink foundLinkFindLink;
        ArrayList<org.telegram.ui.Cells.q1> pollButtons;
        int i11;
        float f12;
        float f13;
        int i12;
        if (s1Var == null) {
            return;
        }
        s1Var.getCurrentMessagesGroup();
        MessageObject messageObject = s1Var.getMessageObject();
        int i13 = 0;
        boolean z12 = s1Var.getExplanationLayout() != null && messageObject.expandedExplanation;
        if (z12 && z10) {
            captionX = s1Var.getExplanationX();
            captionY = s1Var.getExplanationY();
            arrayList = s1Var.getExplanationLayout().textLayoutBlocks;
            f10 = s1Var.getExplanationLayout().textXOffset;
        } else if (s1Var.getCaptionLayout() != null) {
            captionX = s1Var.getCaptionX();
            captionY = s1Var.getCaptionY();
            arrayList = s1Var.getCaptionLayout().textLayoutBlocks;
            f10 = s1Var.getCaptionLayout().textXOffset;
        } else {
            captionX = 0.0f;
            captionY = 0.0f;
            arrayList = null;
            f10 = 0.0f;
        }
        if (arrayList == null) {
            captionX = s1Var.getTextX();
            captionY = s1Var.getTextY() + s1Var.f25424le;
            arrayList = messageObject.textLayoutBlocks;
            f10 = messageObject.textXOffset;
        }
        if (arrayList == null) {
            z11 = z12;
            textX = captionX;
            textY = captionY;
            spanStart = 0;
            width = 0;
            spanEnd = 0;
            r14 = 0;
            break;
        }
        int i14 = 0;
        loop0: while (true) {
            if (i14 >= arrayList.size()) {
                z11 = z12;
                textX = captionX;
                textY = captionY;
                spanStart = 0;
                width = 0;
                spanEnd = 0;
                r14 = 0;
                break;
            }
            MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i14);
            StaticLayout staticLayout = textLayoutBlock.textLayout;
            if (staticLayout != null && (staticLayout.getText() instanceof Spanned)) {
                z11 = z12;
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) staticLayout.getText()).getSpans(i13, staticLayout.getText().length(), CharacterStyle.class);
                if (characterStyleArr != null) {
                    for (CharacterStyle characterStyle2 : characterStyleArr) {
                        if (characterStyle2 == characterStyle) {
                            spanStart = ((Spanned) staticLayout.getText()).getSpanStart(characterStyle);
                            spanEnd = ((Spanned) staticLayout.getText()).getSpanEnd(characterStyle);
                            textX = (textLayoutBlock.isRtl() ? (int) Math.ceil(f10) : 0) + captionX;
                            textY = textLayoutBlock.textYOffset(arrayList, s1Var.Vc) + textLayoutBlock.padTop + captionY;
                            width = textLayoutBlock.originalWidth;
                            r14 = staticLayout;
                            break loop0;
                        }
                    }
                }
            } else {
                z11 = z12;
            }
            i14++;
            captionX = captionX;
            z12 = z11;
            captionY = captionY;
            i13 = 0;
        }
        if (r14 == 0 && s1Var.getDescriptionlayout() != null) {
            StaticLayout descriptionlayout = s1Var.getDescriptionlayout();
            int i15 = 0;
            while (i15 == 0) {
                if (descriptionlayout != null && (descriptionlayout.getText() instanceof Spanned)) {
                    i12 = spanStart;
                    CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) ((Spanned) descriptionlayout.getText()).getSpans(0, descriptionlayout.getText().length(), CharacterStyle.class);
                    if (characterStyleArr2 != null) {
                        int i16 = 0;
                        while (true) {
                            if (i16 < characterStyleArr2.length) {
                                if (characterStyleArr2[i16] == characterStyle) {
                                    spanStart = ((Spanned) descriptionlayout.getText()).getSpanStart(characterStyle);
                                    spanEnd = ((Spanned) descriptionlayout.getText()).getSpanEnd(characterStyle);
                                    textX = s1Var.getDescriptionLayoutX();
                                    textY = s1Var.getDescriptionLayoutY();
                                    width = descriptionlayout.getWidth();
                                    r14 = descriptionlayout;
                                    break;
                                }
                                i16++;
                            }
                        }
                    }
                    i15++;
                    r14 = r14;
                } else {
                    i12 = spanStart;
                }
                spanStart = i12;
                i15++;
                r14 = r14;
            }
            r14 = r14;
        }
        if (r14 == 0 && ((messageObject.isTodo() || messageObject.isPoll()) && (pollButtons = s1Var.getPollButtons()) != null)) {
            int i17 = 0;
            r14 = r14;
            while (i17 < pollButtons.size()) {
                org.telegram.ui.Cells.q1 q1Var = pollButtons.get(i17);
                StaticLayout staticLayout2 = q1Var.f25030p;
                if (staticLayout2 == null) {
                    i11 = spanStart;
                } else {
                    i11 = spanStart;
                    if (staticLayout2.getText() instanceof Spanned) {
                        f12 = textX;
                        f13 = textY;
                        CharacterStyle[] characterStyleArr3 = (CharacterStyle[]) ((Spanned) staticLayout2.getText()).getSpans(0, staticLayout2.getText().length(), CharacterStyle.class);
                        if (characterStyleArr3 != null) {
                            int i18 = 0;
                            while (true) {
                                if (i18 < characterStyleArr3.length) {
                                    if (characterStyleArr3[i18] == characterStyle) {
                                        spanStart = ((Spanned) staticLayout2.getText()).getSpanStart(characterStyle);
                                        spanEnd = ((Spanned) staticLayout2.getText()).getSpanEnd(characterStyle);
                                        textX = q1Var.f25027m;
                                        textY = q1Var.f25028n;
                                        width = staticLayout2.getWidth();
                                        r14 = staticLayout2;
                                        break;
                                    }
                                    i18++;
                                }
                            }
                        }
                        i17++;
                        r14 = r14;
                    }
                    spanStart = i11;
                    textY = f13;
                    textX = f12;
                    i17++;
                    r14 = r14;
                }
                f12 = textX;
                f13 = textY;
                spanStart = i11;
                textY = f13;
                textX = f12;
                i17++;
                r14 = r14;
            }
        }
        if (r14 == 0 && messageObject != null && (richMessageLayout = messageObject.richLayout) != null && (foundLinkFindLink = richMessageLayout.findLink(characterStyle)) != null) {
            r14 = foundLinkFindLink.layout;
            spanStart = foundLinkFindLink.start;
            spanEnd = foundLinkFindLink.end;
            width = foundLinkFindLink.originalWidth;
            textX = s1Var.getTextX() + foundLinkFindLink.f19628x;
            textY = s1Var.getTextY() + foundLinkFindLink.f19629y;
        }
        int i19 = width;
        int i20 = spanStart;
        float fMax = textX;
        int length = spanEnd;
        if (r14 == 0 && z11 && !z10) {
            f(s1Var, characterStyle, charSequence, true);
            return;
        }
        if (r14 == 0) {
            return;
        }
        if (charSequence != null) {
            int lineForOffset = r14.getLineForOffset(i20);
            float lineTop = textY + r14.getLineTop(lineForOffset);
            float primaryHorizontal = r14.getPrimaryHorizontal(i20);
            float lineWidth = r14.getLineWidth(lineForOffset);
            ?? j80Var = new j80(0);
            j80Var.d(r14, i20, 0.0f);
            r14.getSelectionPath(i20, length, j80Var);
            RectF rectF2 = new RectF();
            j80Var.computeBounds(rectF2, true);
            StaticLayout staticLayoutMakeStaticLayout = MessageObject.makeStaticLayout(charSequence, r14.getPaint(), r14.getWidth(), 1.0f, 0.0f, false);
            length = charSequence.length();
            float width2 = staticLayoutMakeStaticLayout.getWidth();
            float fMax2 = 0.0f;
            for (int i21 = 0; i21 < staticLayoutMakeStaticLayout.getLineCount(); i21++) {
                width2 = Math.min(width2, staticLayoutMakeStaticLayout.getLineLeft(i21));
                fMax2 = Math.max(fMax2, staticLayoutMakeStaticLayout.getLineRight(i21));
            }
            fMax += Math.max(0.0f, Math.min(primaryHorizontal, lineWidth - Math.max(0.0f, fMax2 - width2)));
            rectF = rectF2;
            i20 = 0;
            f11 = lineTop;
            r15 = staticLayoutMakeStaticLayout;
        } else {
            f11 = textY;
            rectF = null;
            r15 = r14;
        }
        ?? r10 = r15;
        float f14 = fMax;
        Paint paint = new Paint(1);
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(messageObject.isOutOwner() ? org.telegram.ui.ActionBar.g6.Aa : org.telegram.ui.ActionBar.g6.f23305ra, this.f31349b));
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(5.0f)));
        ?? j80Var2 = new j80(0);
        j80Var2.f29462c = true;
        j80Var2.d(r10, i20, 0.0f);
        r10.getSelectionPath(i20, length, j80Var2);
        j80Var2.a();
        RectF rectF3 = new RectF();
        j80Var2.computeBounds(rectF3, true);
        int iWidth = (int) (rectF3.width() + AndroidUtilities.dp(5.0f));
        if (!s1Var.B1() || iWidth <= 0 || rectF3.height() <= 0.0f) {
            bitmap = null;
            r31 = r10;
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth, (int) rectF3.height(), Bitmap.Config.ALPHA_8);
            ?? canvas = new Canvas(bitmapCreateBitmap);
            r31 = r10;
            paint = paint;
            Paint paint2 = new Paint(1);
            paint2.setColor(-1);
            canvas.drawRect(0.0f, 0.0f, iWidth, rectF3.height(), paint2);
            Paint paint3 = new Paint(1);
            paint3.setColor(-1);
            paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(5.0f)));
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas.translate(-rectF3.left, -rectF3.top);
            canvas.drawPath(j80Var2, paint3);
            bitmap = bitmapCreateBitmap;
        }
        Paint paint4 = new Paint(3);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        s1Var.b4();
        TextPaint textPaint = new TextPaint(r31.getPaint());
        textPaint.set(r31.getPaint());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(t5.cloneSpans(r31.getText(), -1, textPaint.getFontMetricsInt()));
        if (i20 > 0) {
            i10 = 0;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(0), 0, i20, 33);
        } else {
            i10 = 0;
        }
        if (length < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i10), length, spannableStringBuilder.length(), 33);
        }
        StaticLayout staticLayoutMakeStaticLayout2 = MessageObject.makeStaticLayout(spannableStringBuilder, textPaint, i19, 1.0f, messageObject.totalAnimatedEmojiCount >= 4 ? -1.0f : 0.0f, false);
        int[] iArr = new int[2];
        s1Var.getLocationOnScreen(iArr);
        this.A = new nl0(j80Var2, new int[]{iArr[0] + ((int) f14), iArr[1] + ((int) f11)}, s1Var, iArr, bitmap, rectF3, paint4, paint, staticLayoutMakeStaticLayout2);
        int iDp = (int) ((AndroidUtilities.dp(5.0f) / 2.0f) + iArr[0] + f14 + rectF3.left);
        int i22 = (int) (iArr[1] + f11 + rectF3.top);
        this.A.setBounds(iDp, i22, ((int) rectF3.width()) + iDp, ((int) rectF3.height()) + i22);
        if (charSequence != null) {
            float f15 = iDp;
            if (rectF3.width() + f15 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(8.0f)) {
                this.D -= (rectF3.width() + f15) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(8.0f));
            }
            float f16 = i22;
            if (rectF3.height() + f16 > ((AndroidUtilities.displaySize.y - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f)) {
                this.E -= (rectF3.height() + f16) - (((AndroidUtilities.displaySize.y - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f));
            }
            if (rectF != null) {
                this.F = rectF.width() / rectF3.width();
                this.G = rectF.height() / rectF3.height();
            }
        }
    }

    @Override
    public final boolean isShowing() {
        return !this.I;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ag.p1 p1Var = this.f31355s;
        setContentView(p1Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i10 | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        p1Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(p1Var, !org.telegram.ui.ActionBar.g6.I.q());
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            d(new d(this, 19));
            c(null, true);
        }
    }
}
