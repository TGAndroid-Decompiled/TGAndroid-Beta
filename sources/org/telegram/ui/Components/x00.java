package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class x00 extends FrameLayout {
    public final boolean f34530a;
    public final CharSequence f34531b;
    public final w00 f34532c;
    public final x5 d;
    public final y00 f34533e;

    public x00(y00 y00Var, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        CharSequence spannableStringBuilder;
        float f9;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var;
        this.f34533e = y00Var;
        this.f34530a = z10;
        String string = LocaleController.getString(R.string.FolderLinkPreviewLeft);
        String string2 = LocaleController.getString(R.string.FolderLinkPreviewRight);
        if (charSequence == null) {
            spannableStringBuilder = "";
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f34252a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        Paint paint = new Paint(1);
        view.f34253b = paint;
        view.f34254c = new Path();
        float[] fArr = new float[8];
        view.d = fArr;
        Paint paint2 = new Paint(1);
        view.f34259s = paint2;
        Paint paint3 = new Paint(1);
        view.v = paint3;
        view.f34260w = new Matrix();
        view.f34261x = new Matrix();
        int i11 = org.telegram.ui.ActionBar.g6.Eh;
        textPaint.setColor(org.telegram.ui.ActionBar.g6.l1(0.8f, org.telegram.ui.ActionBar.g6.w0(null, i11, false)));
        textPaint.setTextSize(AndroidUtilities.dp(15.33f));
        textPaint.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.g6.f23260o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        textPaint2.setTextSize(AndroidUtilities.dp(17.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Th, false));
        n6 n6Var = new n6(false, true, true, false);
        view.f34262y = n6Var;
        n6Var.k(0.3f, 250L, jr.h);
        n6Var.setCallback(view);
        n6Var.t(AndroidUtilities.dp(11.66f));
        n6Var.r(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        n6Var.u(AndroidUtilities.bold());
        n6Var.f30862b = 1;
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.8f, org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        if (string != null) {
            f9 = 15.33f;
            zz0 zz0Var = new zz0(w00.a(string), 15.33f, AndroidUtilities.bold());
            zz0Var.s(view);
            zz0Var.f35460a.setColor(l1);
            view.f34255e = zz0Var;
        } else {
            f9 = 15.33f;
        }
        CharSequence a2 = w00.a(spannableStringBuilder);
        zz0 zz0Var2 = new zz0(a2, f9, AndroidUtilities.bold());
        zz0Var2.s(view);
        TextPaint textPaint3 = zz0Var2.f35460a;
        textPaint3.setColor(w02);
        view.f34256f = zz0Var2;
        zz0Var2.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(a2, textPaint3.getFontMetricsInt(), false), arrayList, textPaint3.getFontMetricsInt()));
        if (z11) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        zz0Var2.p(i10);
        if (string2 != null) {
            zz0 zz0Var3 = new zz0(w00.a(string2), 15.33f, AndroidUtilities.bold());
            zz0Var3.s(view);
            zz0Var3.f35460a.setColor(l1);
            view.h = zz0Var3;
        }
        float dp = AndroidUtilities.dp(3.0f);
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        float dp2 = AndroidUtilities.dp(1.0f);
        fArr[7] = dp2;
        fArr[6] = dp2;
        fArr[5] = dp2;
        fArr[4] = dp2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, tileMode);
        view.f34257n = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        view.f34258r = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.f34532c = view;
        addView((View) view, i7.f6.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        x5 x5Var = new x5(context);
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        x5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        x5Var.setTextSize(1, 20.0f);
        x5Var.setTypeface(AndroidUtilities.bold());
        x5Var.setGravity(17);
        x5Var.setLineSpacing(AndroidUtilities.dp(-1.0f), 1.0f);
        CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(charSequence), x5Var.getPaint().getFontMetricsInt(), false, 0.8f);
        this.f34531b = replaceEmoji;
        this.f34531b = MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, x5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        x5Var.setText(y00Var.y());
        x5Var.setCacheType(z11 ? 26 : 0);
        int i14 = org.telegram.ui.ActionBar.g6.Oh;
        c6Var = ((org.telegram.ui.ActionBar.f3) y00Var).resourcesProvider;
        x5Var.setEmojiColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
        addView(x5Var, i7.f6.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        x5 x5Var2 = new x5(context);
        this.d = x5Var2;
        x5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        x5Var2.setTextSize(1, 14.0f);
        x5Var2.setLines(2);
        x5Var2.setGravity(17);
        x5Var2.setLineSpacing(0.0f, 1.15f);
        addView(x5Var2, i7.f6.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        int i10;
        String str;
        int i11;
        y00 y00Var = this.f34533e;
        ArrayList arrayList = y00Var.f34866c0;
        boolean z10 = y00Var.X;
        CharSequence charSequence = this.f34531b;
        x5 x5Var = this.d;
        if (z10) {
            x5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleRemove, charSequence)));
        } else if (this.f34530a) {
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            w00 w00Var = this.f34532c;
            n6 n6Var = w00Var.f34262y;
            if (i10 > 0) {
                str = j7.l1.k(i10, "+");
            } else {
                str = "";
            }
            n6Var.q(str, false, true);
            w00Var.invalidate();
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList != null) {
                    i11 = arrayList.size();
                } else {
                    i11 = 0;
                }
                x5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FolderLinkSubtitleChats", i11, charSequence)));
                return;
            }
            x5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        } else if (arrayList != null && !arrayList.isEmpty()) {
            x5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitle, charSequence)));
        } else {
            x5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172.0f), 1073741824));
    }
}
