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
public final class m00 extends FrameLayout {
    public final boolean f30646a;
    public final CharSequence f30647b;
    public final l00 f30648c;
    public final s5 d;
    public final n00 f30649e;

    public m00(n00 n00Var, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        CharSequence spannableStringBuilder;
        float f10;
        int i9;
        org.telegram.ui.ActionBar.b6 b6Var;
        this.f30649e = n00Var;
        this.f30646a = z10;
        String string = LocaleController.getString(R.string.FolderLinkPreviewLeft);
        String string2 = LocaleController.getString(R.string.FolderLinkPreviewRight);
        if (charSequence == null) {
            spannableStringBuilder = "";
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f30286a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        Paint paint = new Paint(1);
        view.f30287b = paint;
        view.f30288c = new Path();
        float[] fArr = new float[8];
        view.d = fArr;
        Paint paint2 = new Paint(1);
        view.f30293s = paint2;
        Paint paint3 = new Paint(1);
        view.v = paint3;
        view.f30294w = new Matrix();
        view.f30295x = new Matrix();
        int i10 = org.telegram.ui.ActionBar.f6.Eh;
        textPaint.setColor(org.telegram.ui.ActionBar.f6.l1(0.8f, org.telegram.ui.ActionBar.f6.w0(null, i10, false)));
        textPaint.setTextSize(AndroidUtilities.dp(15.33f));
        textPaint.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.f6.o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        textPaint2.setTextSize(AndroidUtilities.dp(17.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Th, false));
        i6 i6Var = new i6(false, true, true, false);
        view.f30296y = i6Var;
        i6Var.k(0.3f, 250L, gr.h);
        i6Var.setCallback(view);
        i6Var.t(AndroidUtilities.dp(11.66f));
        i6Var.r(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        i6Var.u(AndroidUtilities.bold());
        i6Var.f29333b = 1;
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.8f, org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i11, false);
        if (string != null) {
            f10 = 15.33f;
            nz0 nz0Var = new nz0(l00.a(string), 15.33f, AndroidUtilities.bold());
            nz0Var.s(view);
            nz0Var.f31221a.setColor(l1);
            view.f30289e = nz0Var;
        } else {
            f10 = 15.33f;
        }
        CharSequence a2 = l00.a(spannableStringBuilder);
        nz0 nz0Var2 = new nz0(a2, f10, AndroidUtilities.bold());
        nz0Var2.s(view);
        TextPaint textPaint3 = nz0Var2.f31221a;
        textPaint3.setColor(w02);
        view.f30290f = nz0Var2;
        nz0Var2.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(a2, textPaint3.getFontMetricsInt(), false), arrayList, textPaint3.getFontMetricsInt()));
        if (z11) {
            i9 = 26;
        } else {
            i9 = 0;
        }
        nz0Var2.p(i9);
        if (string2 != null) {
            nz0 nz0Var3 = new nz0(l00.a(string2), 15.33f, AndroidUtilities.bold());
            nz0Var3.s(view);
            nz0Var3.f31221a.setColor(l1);
            view.h = nz0Var3;
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
        view.f30291n = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        view.f30292r = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.f30648c = view;
        addView((View) view, g7.e6.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        s5 s5Var = new s5(context);
        int i12 = org.telegram.ui.ActionBar.f6.G6;
        s5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        s5Var.setTextSize(1, 20.0f);
        s5Var.setTypeface(AndroidUtilities.bold());
        s5Var.setGravity(17);
        s5Var.setLineSpacing(AndroidUtilities.dp(-1.0f), 1.0f);
        CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(charSequence), s5Var.getPaint().getFontMetricsInt(), false, 0.8f);
        this.f30647b = replaceEmoji;
        this.f30647b = MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, s5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        s5Var.setText(n00Var.y());
        s5Var.setCacheType(z11 ? 26 : 0);
        int i13 = org.telegram.ui.ActionBar.f6.Oh;
        b6Var = ((org.telegram.ui.ActionBar.f3) n00Var).resourcesProvider;
        s5Var.setEmojiColor(org.telegram.ui.ActionBar.f6.v0(i13, b6Var));
        addView(s5Var, g7.e6.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        s5 s5Var2 = new s5(context);
        this.d = s5Var2;
        s5Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        s5Var2.setTextSize(1, 14.0f);
        s5Var2.setLines(2);
        s5Var2.setGravity(17);
        s5Var2.setLineSpacing(0.0f, 1.15f);
        addView(s5Var2, g7.e6.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        int i9;
        String str;
        int i10;
        n00 n00Var = this.f30649e;
        ArrayList arrayList = n00Var.f30960c0;
        boolean z10 = n00Var.X;
        CharSequence charSequence = this.f30647b;
        s5 s5Var = this.d;
        if (z10) {
            s5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleRemove, charSequence)));
        } else if (this.f30646a) {
            if (arrayList != null) {
                i9 = arrayList.size();
            } else {
                i9 = 0;
            }
            l00 l00Var = this.f30648c;
            i6 i6Var = l00Var.f30296y;
            if (i9 > 0) {
                str = j3.r0.l(i9, "+");
            } else {
                str = "";
            }
            i6Var.q(str, false, true);
            l00Var.invalidate();
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList != null) {
                    i10 = arrayList.size();
                } else {
                    i10 = 0;
                }
                s5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FolderLinkSubtitleChats", i10, charSequence)));
                return;
            }
            s5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        } else if (arrayList != null && !arrayList.isEmpty()) {
            s5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitle, charSequence)));
        } else {
            s5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172.0f), 1073741824));
    }
}
