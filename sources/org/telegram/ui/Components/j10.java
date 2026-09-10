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
public final class j10 extends FrameLayout {
    public final boolean f24182a;
    public final CharSequence f24183b;
    public final i10 f24184c;
    public final x5 d;
    public final k10 e;

    public j10(k10 k10Var, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        CharSequence spannableStringBuilder;
        float f7;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        this.e = k10Var;
        this.f24182a = z10;
        String string = LocaleController.getString(R.string.FolderLinkPreviewLeft);
        String string2 = LocaleController.getString(R.string.FolderLinkPreviewRight);
        if (charSequence == null) {
            spannableStringBuilder = "";
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f23851a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        Paint paint = new Paint(1);
        view.f23852b = paint;
        view.f23853c = new Path();
        float[] fArr = new float[8];
        view.d = fArr;
        Paint paint2 = new Paint(1);
        view.f23857s = paint2;
        Paint paint3 = new Paint(1);
        view.v = paint3;
        view.f23858w = new Matrix();
        view.f23859x = new Matrix();
        int i11 = org.telegram.ui.ActionBar.j6.Eh;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.l1(0.8f, org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
        textPaint.setTextSize(AndroidUtilities.dp(15.33f));
        textPaint.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.j6.f18126o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        textPaint2.setTextSize(AndroidUtilities.dp(17.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Th, false));
        n6 n6Var = new n6(false, true, true, false);
        view.f23860y = n6Var;
        n6Var.k(0.3f, 250L, wr.h);
        n6Var.setCallback(view);
        n6Var.t(AndroidUtilities.dp(11.66f));
        n6Var.r(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
        n6Var.u(AndroidUtilities.bold());
        n6Var.f25425b = 1;
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.8f, org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        if (string != null) {
            f7 = 15.33f;
            t01 t01Var = new t01(i10.a(string), 15.33f, AndroidUtilities.bold());
            t01Var.s(view);
            t01Var.f27245a.setColor(l1);
            view.e = t01Var;
        } else {
            f7 = 15.33f;
        }
        CharSequence a2 = i10.a(spannableStringBuilder);
        t01 t01Var2 = new t01(a2, f7, AndroidUtilities.bold());
        t01Var2.s(view);
        TextPaint textPaint3 = t01Var2.f27245a;
        textPaint3.setColor(w02);
        view.f23854f = t01Var2;
        t01Var2.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(a2, textPaint3.getFontMetricsInt(), false), arrayList, textPaint3.getFontMetricsInt()));
        if (z11) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        t01Var2.p(i10);
        if (string2 != null) {
            t01 t01Var3 = new t01(i10.a(string2), 15.33f, AndroidUtilities.bold());
            t01Var3.s(view);
            t01Var3.f27245a.setColor(l1);
            view.h = t01Var3;
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
        view.f23855n = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        view.f23856r = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.f24184c = view;
        addView((View) view, w7.a6.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        x5 x5Var = new x5(context);
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        x5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        x5Var.setTextSize(1, 20.0f);
        x5Var.setTypeface(AndroidUtilities.bold());
        x5Var.setGravity(17);
        x5Var.setLineSpacing(AndroidUtilities.dp(-1.0f), 1.0f);
        CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(charSequence), x5Var.getPaint().getFontMetricsInt(), false, 0.8f);
        this.f24183b = replaceEmoji;
        this.f24183b = MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, x5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        x5Var.setText(k10Var.y());
        x5Var.setCacheType(z11 ? 26 : 0);
        int i14 = org.telegram.ui.ActionBar.j6.Oh;
        f6Var = ((org.telegram.ui.ActionBar.h3) k10Var).resourcesProvider;
        x5Var.setEmojiColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        addView(x5Var, w7.a6.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        x5 x5Var2 = new x5(context);
        this.d = x5Var2;
        x5Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        x5Var2.setTextSize(1, 14.0f);
        x5Var2.setLines(2);
        x5Var2.setGravity(17);
        x5Var2.setLineSpacing(0.0f, 1.15f);
        addView(x5Var2, w7.a6.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        int i10;
        String str;
        int i11;
        k10 k10Var = this.e;
        ArrayList arrayList = k10Var.f24542g0;
        boolean z10 = k10Var.f24537b0;
        CharSequence charSequence = this.f24183b;
        x5 x5Var = this.d;
        if (z10) {
            x5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleRemove, charSequence)));
        } else if (this.f24182a) {
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            i10 i10Var = this.f24184c;
            n6 n6Var = i10Var.f23860y;
            if (i10 > 0) {
                str = hc.b.j(i10, "+");
            } else {
                str = "";
            }
            n6Var.q(str, false, true);
            i10Var.invalidate();
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
