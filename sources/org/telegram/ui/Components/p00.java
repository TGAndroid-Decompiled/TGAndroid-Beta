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

public final class p00 extends FrameLayout {

    public final boolean f31455a;

    public final CharSequence f31456b;

    public final o00 f31457c;
    public final s5 d;

    public final q00 f31458e;

    public p00(q00 q00Var, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        float f10;
        super(context);
        this.f31458e = q00Var;
        this.f31455a = z10;
        String string = LocaleController.getString(R.string.FolderLinkPreviewLeft);
        String string2 = LocaleController.getString(R.string.FolderLinkPreviewRight);
        CharSequence spannableStringBuilder = charSequence == null ? "" : new SpannableStringBuilder(charSequence);
        o00 o00Var = new o00(context);
        TextPaint textPaint = new TextPaint(1);
        o00Var.f31125a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        Paint paint = new Paint(1);
        o00Var.f31126b = paint;
        o00Var.f31127c = new Path();
        float[] fArr = new float[8];
        o00Var.d = fArr;
        Paint paint2 = new Paint(1);
        o00Var.f31132s = paint2;
        Paint paint3 = new Paint(1);
        o00Var.v = paint3;
        o00Var.f31133w = new Matrix();
        o00Var.f31134x = new Matrix();
        int i10 = org.telegram.ui.ActionBar.g6.Eh;
        textPaint.setColor(org.telegram.ui.ActionBar.g6.l1(0.8f, org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
        textPaint.setTextSize(AndroidUtilities.dp(15.33f));
        textPaint.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.f23251o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textPaint2.setTextSize(AndroidUtilities.dp(17.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Th, false));
        i6 i6Var = new i6(false, true, true, false);
        o00Var.f31135y = i6Var;
        i6Var.k(0.3f, 250L, er.h);
        i6Var.setCallback(o00Var);
        i6Var.t(AndroidUtilities.dp(11.66f));
        i6Var.r(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        i6Var.u(AndroidUtilities.bold());
        i6Var.f29239b = 1;
        int iL1 = org.telegram.ui.ActionBar.g6.l1(0.8f, org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        if (string != null) {
            f10 = 15.33f;
            pz0 pz0Var = new pz0(o00.a(string), 15.33f, AndroidUtilities.bold());
            pz0Var.s(o00Var);
            pz0Var.f31695a.setColor(iL1);
            o00Var.f31128e = pz0Var;
        } else {
            f10 = 15.33f;
        }
        CharSequence charSequenceA = o00.a(spannableStringBuilder);
        pz0 pz0Var2 = new pz0(charSequenceA, f10, AndroidUtilities.bold());
        pz0Var2.s(o00Var);
        TextPaint textPaint3 = pz0Var2.f31695a;
        textPaint3.setColor(iW0);
        o00Var.f31129f = pz0Var2;
        pz0Var2.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(charSequenceA, textPaint3.getFontMetricsInt(), false), arrayList, textPaint3.getFontMetricsInt()));
        pz0Var2.p(z11 ? 26 : 0);
        if (string2 != null) {
            pz0 pz0Var3 = new pz0(o00.a(string2), 15.33f, AndroidUtilities.bold());
            pz0Var3.s(o00Var);
            pz0Var3.f31695a.setColor(iL1);
            o00Var.h = pz0Var3;
        }
        float fDp = AndroidUtilities.dp(3.0f);
        fArr[3] = fDp;
        fArr[2] = fDp;
        fArr[1] = fDp;
        fArr[0] = fDp;
        float fDp2 = AndroidUtilities.dp(1.0f);
        fArr[7] = fDp2;
        fArr[6] = fDp2;
        fArr[5] = fDp2;
        fArr[4] = fDp2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, tileMode);
        o00Var.f31130n = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        o00Var.f31131r = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.f31457c = o00Var;
        addView(o00Var, h7.z5.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        s5 s5Var = new s5(context);
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        s5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        s5Var.setTextSize(1, 20.0f);
        s5Var.setTypeface(AndroidUtilities.bold());
        s5Var.setGravity(17);
        s5Var.setLineSpacing(AndroidUtilities.dp(-1.0f), 1.0f);
        CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(charSequence), s5Var.getPaint().getFontMetricsInt(), false, 0.8f);
        this.f31456b = charSequenceReplaceEmoji;
        this.f31456b = MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, arrayList, s5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        s5Var.setText(q00Var.z());
        s5Var.setCacheType(z11 ? 26 : 0);
        s5Var.setEmojiColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, ((org.telegram.ui.ActionBar.e3) q00Var).resourcesProvider));
        addView(s5Var, h7.z5.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        s5 s5Var2 = new s5(context);
        this.d = s5Var2;
        s5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        s5Var2.setTextSize(1, 14.0f);
        s5Var2.setLines(2);
        s5Var2.setGravity(17);
        s5Var2.setLineSpacing(0.0f, 1.15f);
        addView(s5Var2, h7.z5.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        q00 q00Var = this.f31458e;
        ArrayList arrayList = q00Var.f31724c0;
        boolean z10 = q00Var.X;
        CharSequence charSequence = this.f31456b;
        s5 s5Var = this.d;
        if (z10) {
            s5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleRemove, charSequence)));
            return;
        }
        if (!this.f31455a) {
            if (arrayList == null || arrayList.isEmpty()) {
                s5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
                return;
            } else {
                s5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitle, charSequence)));
                return;
            }
        }
        int size = arrayList != null ? arrayList.size() : 0;
        o00 o00Var = this.f31457c;
        o00Var.f31135y.q(size > 0 ? i0.a.k(size, "+") : "", false, true);
        o00Var.invalidate();
        if (arrayList == null || arrayList.isEmpty()) {
            s5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        } else {
            s5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FolderLinkSubtitleChats", arrayList != null ? arrayList.size() : 0, charSequence)));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172.0f), 1073741824));
    }
}
