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
    public final boolean f22561a;
    public final CharSequence f22562b;
    public final a10 f22563c;
    public final w5 d;
    public final c10 e;

    public b10(c10 c10Var, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        CharSequence spannableStringBuilder;
        float f7;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        this.e = c10Var;
        this.f22561a = z10;
        String string = LocaleController.getString(R.string.FolderLinkPreviewLeft);
        String string2 = LocaleController.getString(R.string.FolderLinkPreviewRight);
        if (charSequence == null) {
            spannableStringBuilder = "";
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f22270a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        Paint paint = new Paint(1);
        view.f22271b = paint;
        view.f22272c = new Path();
        float[] fArr = new float[8];
        view.d = fArr;
        Paint paint2 = new Paint(1);
        view.f22276s = paint2;
        Paint paint3 = new Paint(1);
        view.v = paint3;
        view.f22277w = new Matrix();
        view.f22278x = new Matrix();
        int i11 = org.telegram.ui.ActionBar.i6.Eh;
        textPaint.setColor(org.telegram.ui.ActionBar.i6.l1(0.8f, org.telegram.ui.ActionBar.i6.w0(null, i11, false)));
        textPaint.setTextSize(AndroidUtilities.dp(15.33f));
        textPaint.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.i6.f19038o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        textPaint2.setTextSize(AndroidUtilities.dp(17.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Th, false));
        m6 m6Var = new m6(false, true, true, false);
        view.f22279y = m6Var;
        m6Var.k(0.3f, 250L, qr.h);
        m6Var.setCallback(view);
        m6Var.t(AndroidUtilities.dp(11.66f));
        m6Var.r(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, false));
        m6Var.u(AndroidUtilities.bold());
        m6Var.f26086b = 1;
        int l1 = org.telegram.ui.ActionBar.i6.l1(0.8f, org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i12, false);
        if (string != null) {
            f7 = 15.33f;
            g01 g01Var = new g01(a10.a(string), 15.33f, AndroidUtilities.bold());
            g01Var.s(view);
            g01Var.f24147a.setColor(l1);
            view.e = g01Var;
        } else {
            f7 = 15.33f;
        }
        CharSequence a2 = a10.a(spannableStringBuilder);
        g01 g01Var2 = new g01(a2, f7, AndroidUtilities.bold());
        g01Var2.s(view);
        TextPaint textPaint3 = g01Var2.f24147a;
        textPaint3.setColor(w02);
        view.f22273f = g01Var2;
        g01Var2.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(a2, textPaint3.getFontMetricsInt(), false), arrayList, textPaint3.getFontMetricsInt()));
        if (z11) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        g01Var2.p(i10);
        if (string2 != null) {
            g01 g01Var3 = new g01(a10.a(string2), 15.33f, AndroidUtilities.bold());
            g01Var3.s(view);
            g01Var3.f24147a.setColor(l1);
            view.h = g01Var3;
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
        view.f22274n = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        view.f22275r = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.f22563c = view;
        addView((View) view, w7.x5.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        w5 w5Var = new w5(context);
        int i13 = org.telegram.ui.ActionBar.i6.G6;
        w5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
        w5Var.setTextSize(1, 20.0f);
        w5Var.setTypeface(AndroidUtilities.bold());
        w5Var.setGravity(17);
        w5Var.setLineSpacing(AndroidUtilities.dp(-1.0f), 1.0f);
        CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(charSequence), w5Var.getPaint().getFontMetricsInt(), false, 0.8f);
        this.f22562b = replaceEmoji;
        this.f22562b = MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, w5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        w5Var.setText(c10Var.y());
        w5Var.setCacheType(z11 ? 26 : 0);
        int i14 = org.telegram.ui.ActionBar.i6.Oh;
        e6Var = ((org.telegram.ui.ActionBar.f3) c10Var).resourcesProvider;
        w5Var.setEmojiColor(org.telegram.ui.ActionBar.i6.v0(i14, e6Var));
        addView(w5Var, w7.x5.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        w5 w5Var2 = new w5(context);
        this.d = w5Var2;
        w5Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
        w5Var2.setTextSize(1, 14.0f);
        w5Var2.setLines(2);
        w5Var2.setGravity(17);
        w5Var2.setLineSpacing(0.0f, 1.15f);
        addView(w5Var2, w7.x5.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        int i10;
        String str;
        int i11;
        c10 c10Var = this.e;
        ArrayList arrayList = c10Var.f22913g0;
        boolean z10 = c10Var.f22908b0;
        CharSequence charSequence = this.f22562b;
        w5 w5Var = this.d;
        if (z10) {
            w5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleRemove, charSequence)));
        } else if (this.f22561a) {
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            a10 a10Var = this.f22563c;
            m6 m6Var = a10Var.f22279y;
            if (i10 > 0) {
                str = hg.k0.i(i10, "+");
            } else {
                str = "";
            }
            m6Var.q(str, false, true);
            a10Var.invalidate();
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList != null) {
                    i11 = arrayList.size();
                } else {
                    i11 = 0;
                }
                w5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FolderLinkSubtitleChats", i11, charSequence)));
                return;
            }
            w5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        } else if (arrayList != null && !arrayList.isEmpty()) {
            w5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitle, charSequence)));
        } else {
            w5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172.0f), 1073741824));
    }
}
