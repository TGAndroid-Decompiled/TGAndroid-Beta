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
public final class c10 extends FrameLayout {
    public final boolean f25731a;
    public final CharSequence f25732b;
    public final b10 f25733c;
    public final t5 d;
    public final d10 f25734e;

    public c10(d10 d10Var, Context context, boolean z4, CharSequence charSequence, ArrayList arrayList, boolean z10) {
        super(context);
        CharSequence spannableStringBuilder;
        float f10;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var;
        this.f25734e = d10Var;
        this.f25731a = z4;
        String string = LocaleController.getString(R.string.FolderLinkPreviewLeft);
        String string2 = LocaleController.getString(R.string.FolderLinkPreviewRight);
        if (charSequence == null) {
            spannableStringBuilder = "";
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f25456a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        Paint paint = new Paint(1);
        view.f25457b = paint;
        view.f25458c = new Path();
        float[] fArr = new float[8];
        view.d = fArr;
        Paint paint2 = new Paint(1);
        view.f25463s = paint2;
        Paint paint3 = new Paint(1);
        view.v = paint3;
        view.f25464w = new Matrix();
        view.f25465x = new Matrix();
        int i11 = org.telegram.ui.ActionBar.k6.Eh;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.l1(0.8f, org.telegram.ui.ActionBar.k6.w0(null, i11, false)));
        textPaint.setTextSize(AndroidUtilities.dp(15.33f));
        textPaint.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.k6.f21859o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        textPaint2.setTextSize(AndroidUtilities.dp(17.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Th, false));
        j6 j6Var = new j6(false, true, true, false);
        view.f25466y = j6Var;
        j6Var.k(0.3f, 250L, pr.h);
        j6Var.setCallback(view);
        j6Var.t(AndroidUtilities.dp(11.66f));
        j6Var.r(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
        j6Var.u(AndroidUtilities.bold());
        j6Var.f27999b = 1;
        int l1 = org.telegram.ui.ActionBar.k6.l1(0.8f, org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i12, false);
        if (string != null) {
            f10 = 15.33f;
            k01 k01Var = new k01(b10.a(string), 15.33f, AndroidUtilities.bold());
            k01Var.s(view);
            k01Var.f28225a.setColor(l1);
            view.f25459e = k01Var;
        } else {
            f10 = 15.33f;
        }
        CharSequence a2 = b10.a(spannableStringBuilder);
        k01 k01Var2 = new k01(a2, f10, AndroidUtilities.bold());
        k01Var2.s(view);
        TextPaint textPaint3 = k01Var2.f28225a;
        textPaint3.setColor(w02);
        view.f25460f = k01Var2;
        k01Var2.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(a2, textPaint3.getFontMetricsInt(), false), arrayList, textPaint3.getFontMetricsInt()));
        if (z10) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        k01Var2.p(i10);
        if (string2 != null) {
            k01 k01Var3 = new k01(b10.a(string2), 15.33f, AndroidUtilities.bold());
            k01Var3.s(view);
            k01Var3.f28225a.setColor(l1);
            view.h = k01Var3;
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
        view.f25461n = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        view.f25462r = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.f25733c = view;
        addView((View) view, k7.c6.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        t5 t5Var = new t5(context);
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        t5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        t5Var.setTextSize(1, 20.0f);
        t5Var.setTypeface(AndroidUtilities.bold());
        t5Var.setGravity(17);
        t5Var.setLineSpacing(AndroidUtilities.dp(-1.0f), 1.0f);
        CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(charSequence), t5Var.getPaint().getFontMetricsInt(), false, 0.8f);
        this.f25732b = replaceEmoji;
        this.f25732b = MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, t5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        t5Var.setText(d10Var.y());
        t5Var.setCacheType(z10 ? 26 : 0);
        int i14 = org.telegram.ui.ActionBar.k6.Oh;
        g6Var = ((org.telegram.ui.ActionBar.h3) d10Var).resourcesProvider;
        t5Var.setEmojiColor(org.telegram.ui.ActionBar.k6.v0(i14, g6Var));
        addView(t5Var, k7.c6.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        t5 t5Var2 = new t5(context);
        this.d = t5Var2;
        t5Var2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        t5Var2.setTextSize(1, 14.0f);
        t5Var2.setLines(2);
        t5Var2.setGravity(17);
        t5Var2.setLineSpacing(0.0f, 1.15f);
        addView(t5Var2, k7.c6.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        int i10;
        String str;
        int i11;
        d10 d10Var = this.f25734e;
        ArrayList arrayList = d10Var.f26096d0;
        boolean z4 = d10Var.Y;
        CharSequence charSequence = this.f25732b;
        t5 t5Var = this.d;
        if (z4) {
            t5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleRemove, charSequence)));
        } else if (this.f25731a) {
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            b10 b10Var = this.f25733c;
            j6 j6Var = b10Var.f25466y;
            if (i10 > 0) {
                str = l.d.j(i10, "+");
            } else {
                str = "";
            }
            j6Var.q(str, false, true);
            b10Var.invalidate();
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList != null) {
                    i11 = arrayList.size();
                } else {
                    i11 = 0;
                }
                t5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FolderLinkSubtitleChats", i11, charSequence)));
                return;
            }
            t5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        } else if (arrayList != null && !arrayList.isEmpty()) {
            t5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitle, charSequence)));
        } else {
            t5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172.0f), 1073741824));
    }
}
