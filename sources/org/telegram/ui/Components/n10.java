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
public final class n10 extends FrameLayout {
    public final boolean f27260a;
    public final CharSequence f27261b;
    public final m10 f27262c;
    public final a6 d;
    public final o10 e;

    public n10(o10 o10Var, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        CharSequence spannableStringBuilder;
        float f7;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var;
        this.e = o10Var;
        this.f27260a = z10;
        String string = LocaleController.getString(R.string.FolderLinkPreviewLeft);
        String string2 = LocaleController.getString(R.string.FolderLinkPreviewRight);
        if (charSequence == null) {
            spannableStringBuilder = "";
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f26874a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        Paint paint = new Paint(1);
        view.f26875b = paint;
        view.f26876c = new Path();
        float[] fArr = new float[8];
        view.d = fArr;
        Paint paint2 = new Paint(1);
        view.f26880s = paint2;
        Paint paint3 = new Paint(1);
        view.v = paint3;
        view.f26881w = new Matrix();
        view.f26882x = new Matrix();
        int i11 = org.telegram.ui.ActionBar.g6.Eh;
        textPaint.setColor(org.telegram.ui.ActionBar.g6.m1(0.8f, org.telegram.ui.ActionBar.g6.x0(null, i11, false)));
        textPaint.setTextSize(AndroidUtilities.dp(15.33f));
        textPaint.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.g6.f19804o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        textPaint2.setTextSize(AndroidUtilities.dp(17.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Th, false));
        r6 r6Var = new r6(false, true, true);
        view.f26883y = r6Var;
        r6Var.n(0.3f, 250L, es.h);
        r6Var.setCallback(view);
        r6Var.w(AndroidUtilities.dp(11.66f));
        r6Var.u(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
        r6Var.x(AndroidUtilities.bold());
        r6Var.f28435b = 1;
        int m12 = org.telegram.ui.ActionBar.g6.m1(0.8f, org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, i12, false);
        if (string != null) {
            f7 = 15.33f;
            i11 i11Var = new i11(m10.a(string), 15.33f, AndroidUtilities.bold());
            i11Var.s(view);
            i11Var.f25453a.setColor(m12);
            view.e = i11Var;
        } else {
            f7 = 15.33f;
        }
        CharSequence a2 = m10.a(spannableStringBuilder);
        i11 i11Var2 = new i11(a2, f7, AndroidUtilities.bold());
        i11Var2.s(view);
        TextPaint textPaint3 = i11Var2.f25453a;
        textPaint3.setColor(x02);
        view.f26877f = i11Var2;
        i11Var2.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(a2, textPaint3.getFontMetricsInt(), false), arrayList, textPaint3.getFontMetricsInt()));
        if (z11) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        i11Var2.p(i10);
        if (string2 != null) {
            i11 i11Var3 = new i11(m10.a(string2), 15.33f, AndroidUtilities.bold());
            i11Var3.s(view);
            i11Var3.f25453a.setColor(m12);
            view.h = i11Var3;
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
        view.f26878n = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        view.f26879r = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.f27262c = view;
        addView((View) view, w7.z5.a(44.0f, 0.0f, 17.33f, 0.0f, 0.0f, -1, 55));
        a6 a6Var = new a6(context);
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        a6Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
        a6Var.setTextSize(1, 20.0f);
        a6Var.setTypeface(AndroidUtilities.bold());
        a6Var.setGravity(17);
        a6Var.setLineSpacing(AndroidUtilities.dp(-1.0f), 1.0f);
        CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(charSequence), a6Var.getPaint().getFontMetricsInt(), false, 0.8f);
        this.f27261b = replaceEmoji;
        this.f27261b = MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, a6Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        a6Var.setText(o10Var.B());
        a6Var.setCacheType(z11 ? 26 : 0);
        int i14 = org.telegram.ui.ActionBar.g6.Oh;
        c6Var = ((org.telegram.ui.ActionBar.e3) o10Var).resourcesProvider;
        a6Var.setEmojiColor(org.telegram.ui.ActionBar.g6.w0(i14, c6Var));
        addView(a6Var, w7.z5.a(-2.0f, 32.0f, 78.3f, 32.0f, 0.0f, -1, 48));
        a6 a6Var2 = new a6(context);
        this.d = a6Var2;
        a6Var2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
        a6Var2.setTextSize(1, 14.0f);
        a6Var2.setLines(2);
        a6Var2.setGravity(17);
        a6Var2.setLineSpacing(0.0f, 1.15f);
        addView(a6Var2, w7.z5.a(-2.0f, 32.0f, 113.0f, 32.0f, 0.0f, -1, 48));
        a();
    }

    public final void a() {
        int i10;
        String str;
        int i11;
        o10 o10Var = this.e;
        ArrayList arrayList = o10Var.f27477g0;
        boolean z10 = o10Var.f27472b0;
        CharSequence charSequence = this.f27261b;
        a6 a6Var = this.d;
        if (z10) {
            a6Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleRemove, charSequence)));
        } else if (this.f27260a) {
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            m10 m10Var = this.f27262c;
            r6 r6Var = m10Var.f26883y;
            if (i10 > 0) {
                str = i2.d.j(i10, "+");
            } else {
                str = "";
            }
            r6Var.t(str, false, true);
            m10Var.invalidate();
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList != null) {
                    i11 = arrayList.size();
                } else {
                    i11 = 0;
                }
                a6Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FolderLinkSubtitleChats", i11, charSequence)));
                return;
            }
            a6Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        } else if (arrayList != null && !arrayList.isEmpty()) {
            a6Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitle, charSequence)));
        } else {
            a6Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172.0f), 1073741824));
    }
}
