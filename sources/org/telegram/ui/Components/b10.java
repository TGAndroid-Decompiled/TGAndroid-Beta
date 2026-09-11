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
public final class b10 extends FrameLayout {
    public final boolean f24506a;
    public final CharSequence f24507b;
    public final a10 f24508c;
    public final y5 d;
    public final c10 f24509e;

    public b10(c10 c10Var, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        CharSequence spannableStringBuilder;
        float f7;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        this.f24509e = c10Var;
        this.f24506a = z10;
        String string = LocaleController.getString(R.string.FolderLinkPreviewLeft);
        String string2 = LocaleController.getString(R.string.FolderLinkPreviewRight);
        if (charSequence == null) {
            spannableStringBuilder = "";
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f24214a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        Paint paint = new Paint(1);
        view.f24215b = paint;
        view.f24216c = new Path();
        float[] fArr = new float[8];
        view.d = fArr;
        Paint paint2 = new Paint(1);
        view.f24221s = paint2;
        Paint paint3 = new Paint(1);
        view.v = paint3;
        view.f24222w = new Matrix();
        view.f24223x = new Matrix();
        int i11 = org.telegram.ui.ActionBar.j6.Eh;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.l1(0.8f, org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
        textPaint.setTextSize(AndroidUtilities.dp(15.33f));
        textPaint.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.j6.f20862o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        textPaint2.setTextSize(AndroidUtilities.dp(17.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Th, false));
        p6 p6Var = new p6(false, true, true, false);
        view.f24224y = p6Var;
        p6Var.k(0.3f, 250L, pr.h);
        p6Var.setCallback(view);
        p6Var.t(AndroidUtilities.dp(11.66f));
        p6Var.r(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, false));
        p6Var.u(AndroidUtilities.bold());
        p6Var.f29285b = 1;
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.8f, org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        if (string != null) {
            f7 = 15.33f;
            f01 f01Var = new f01(a10.a(string), 15.33f, AndroidUtilities.bold());
            f01Var.s(view);
            f01Var.f25845a.setColor(l1);
            view.f24217e = f01Var;
        } else {
            f7 = 15.33f;
        }
        CharSequence a2 = a10.a(spannableStringBuilder);
        f01 f01Var2 = new f01(a2, f7, AndroidUtilities.bold());
        f01Var2.s(view);
        TextPaint textPaint3 = f01Var2.f25845a;
        textPaint3.setColor(w02);
        view.f24218f = f01Var2;
        f01Var2.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(a2, textPaint3.getFontMetricsInt(), false), arrayList, textPaint3.getFontMetricsInt()));
        if (z11) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        f01Var2.p(i10);
        if (string2 != null) {
            f01 f01Var3 = new f01(a10.a(string2), 15.33f, AndroidUtilities.bold());
            f01Var3.s(view);
            f01Var3.f25845a.setColor(l1);
            view.h = f01Var3;
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
        view.f24219n = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        view.f24220r = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.f24508c = view;
        addView((View) view, w7.x5.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        y5 y5Var = new y5(context);
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        y5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        y5Var.setTextSize(1, 20.0f);
        y5Var.setTypeface(AndroidUtilities.bold());
        y5Var.setGravity(17);
        y5Var.setLineSpacing(AndroidUtilities.dp(-1.0f), 1.0f);
        CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(charSequence), y5Var.getPaint().getFontMetricsInt(), false, 0.8f);
        this.f24507b = replaceEmoji;
        this.f24507b = MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, y5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        y5Var.setText(c10Var.y());
        y5Var.setCacheType(z11 ? 26 : 0);
        int i14 = org.telegram.ui.ActionBar.j6.Oh;
        f6Var = ((org.telegram.ui.ActionBar.f3) c10Var).resourcesProvider;
        y5Var.setEmojiColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        addView(y5Var, w7.x5.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        y5 y5Var2 = new y5(context);
        this.d = y5Var2;
        y5Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        y5Var2.setTextSize(1, 14.0f);
        y5Var2.setLines(2);
        y5Var2.setGravity(17);
        y5Var2.setLineSpacing(0.0f, 1.15f);
        addView(y5Var2, w7.x5.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        int i10;
        String str;
        int i11;
        c10 c10Var = this.f24509e;
        ArrayList arrayList = c10Var.f24847g0;
        boolean z10 = c10Var.f24842b0;
        CharSequence charSequence = this.f24507b;
        y5 y5Var = this.d;
        if (z10) {
            y5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleRemove, charSequence)));
        } else if (this.f24506a) {
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            a10 a10Var = this.f24508c;
            p6 p6Var = a10Var.f24224y;
            if (i10 > 0) {
                str = i2.g.i(i10, "+");
            } else {
                str = "";
            }
            p6Var.q(str, false, true);
            a10Var.invalidate();
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList != null) {
                    i11 = arrayList.size();
                } else {
                    i11 = 0;
                }
                y5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FolderLinkSubtitleChats", i11, charSequence)));
                return;
            }
            y5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        } else if (arrayList != null && !arrayList.isEmpty()) {
            y5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitle, charSequence)));
        } else {
            y5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172.0f), 1073741824));
    }
}
