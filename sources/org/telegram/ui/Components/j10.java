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
    public final boolean f27406a;
    public final CharSequence f27407b;
    public final i10 f27408c;
    public final z5 d;
    public final k10 e;

    public j10(k10 k10Var, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        CharSequence spannableStringBuilder;
        float f7;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        this.e = k10Var;
        this.f27406a = z10;
        String string = LocaleController.getString(R.string.FolderLinkPreviewLeft);
        String string2 = LocaleController.getString(R.string.FolderLinkPreviewRight);
        if (charSequence == null) {
            spannableStringBuilder = "";
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f27031a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        Paint paint = new Paint(1);
        view.f27032b = paint;
        view.f27033c = new Path();
        float[] fArr = new float[8];
        view.d = fArr;
        Paint paint2 = new Paint(1);
        view.f27037s = paint2;
        Paint paint3 = new Paint(1);
        view.v = paint3;
        view.f27038w = new Matrix();
        view.f27039x = new Matrix();
        int i11 = org.telegram.ui.ActionBar.h6.Eh;
        textPaint.setColor(org.telegram.ui.ActionBar.h6.m1(0.8f, org.telegram.ui.ActionBar.h6.x0(null, i11, false)));
        textPaint.setTextSize(AndroidUtilities.dp(15.33f));
        textPaint.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.h6.f21192o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        textPaint2.setTextSize(AndroidUtilities.dp(17.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Th, false));
        p6 p6Var = new p6(false, true, true);
        view.f27040y = p6Var;
        p6Var.n(0.3f, 250L, bs.h);
        p6Var.setCallback(view);
        p6Var.w(AndroidUtilities.dp(11.66f));
        p6Var.u(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20989d6, false));
        p6Var.x(AndroidUtilities.bold());
        p6Var.f29182b = 1;
        int m12 = org.telegram.ui.ActionBar.h6.m1(0.8f, org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i12, false);
        if (string != null) {
            f7 = 15.33f;
            e11 e11Var = new e11(i10.a(string), 15.33f, AndroidUtilities.bold());
            e11Var.s(view);
            e11Var.f25728a.setColor(m12);
            view.e = e11Var;
        } else {
            f7 = 15.33f;
        }
        CharSequence a2 = i10.a(spannableStringBuilder);
        e11 e11Var2 = new e11(a2, f7, AndroidUtilities.bold());
        e11Var2.s(view);
        TextPaint textPaint3 = e11Var2.f25728a;
        textPaint3.setColor(x02);
        view.f27034f = e11Var2;
        e11Var2.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(a2, textPaint3.getFontMetricsInt(), false), arrayList, textPaint3.getFontMetricsInt()));
        if (z11) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        e11Var2.p(i10);
        if (string2 != null) {
            e11 e11Var3 = new e11(i10.a(string2), 15.33f, AndroidUtilities.bold());
            e11Var3.s(view);
            e11Var3.f25728a.setColor(m12);
            view.h = e11Var3;
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
        view.f27035n = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        view.f27036r = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.f27408c = view;
        addView((View) view, w7.z5.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        z5 z5Var = new z5(context);
        int i13 = org.telegram.ui.ActionBar.h6.G6;
        z5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        z5Var.setTextSize(1, 20.0f);
        z5Var.setTypeface(AndroidUtilities.bold());
        z5Var.setGravity(17);
        z5Var.setLineSpacing(AndroidUtilities.dp(-1.0f), 1.0f);
        CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(charSequence), z5Var.getPaint().getFontMetricsInt(), false, 0.8f);
        this.f27407b = replaceEmoji;
        this.f27407b = MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, z5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        z5Var.setText(k10Var.A());
        z5Var.setCacheType(z11 ? 26 : 0);
        int i14 = org.telegram.ui.ActionBar.h6.Oh;
        d6Var = ((org.telegram.ui.ActionBar.f3) k10Var).resourcesProvider;
        z5Var.setEmojiColor(org.telegram.ui.ActionBar.h6.w0(i14, d6Var));
        addView(z5Var, w7.z5.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        z5 z5Var2 = new z5(context);
        this.d = z5Var2;
        z5Var2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        z5Var2.setTextSize(1, 14.0f);
        z5Var2.setLines(2);
        z5Var2.setGravity(17);
        z5Var2.setLineSpacing(0.0f, 1.15f);
        addView(z5Var2, w7.z5.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        int i10;
        String str;
        int i11;
        k10 k10Var = this.e;
        ArrayList arrayList = k10Var.f27661g0;
        boolean z10 = k10Var.f27656b0;
        CharSequence charSequence = this.f27407b;
        z5 z5Var = this.d;
        if (z10) {
            z5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleRemove, charSequence)));
        } else if (this.f27406a) {
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            i10 i10Var = this.f27408c;
            p6 p6Var = i10Var.f27040y;
            if (i10 > 0) {
                str = i2.e.j(i10, "+");
            } else {
                str = "";
            }
            p6Var.t(str, false, true);
            i10Var.invalidate();
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList != null) {
                    i11 = arrayList.size();
                } else {
                    i11 = 0;
                }
                z5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FolderLinkSubtitleChats", i11, charSequence)));
                return;
            }
            z5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        } else if (arrayList != null && !arrayList.isEmpty()) {
            z5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitle, charSequence)));
        } else {
            z5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172.0f), 1073741824));
    }
}
