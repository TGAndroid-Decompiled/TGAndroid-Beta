package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class b40 extends z4.a {
    public final org.telegram.ui.f50 f24890c;

    public b40(org.telegram.ui.f50 f50Var) {
        this.f24890c = f50Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f24890c.f25232e.length;
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        int i11;
        a40 a40Var = new a40(this, this.f24890c.getContext(), i10, 0);
        a40Var.setOnClickListener(new ci.m4(this, i10, 10));
        a40Var.setFocusable(true);
        a40Var.setTag(Integer.valueOf(i10));
        a40Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        a40Var.setScaleType(ImageView.ScaleType.FIT_XY);
        a40Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
        if (i10 == 0) {
            a40Var.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
        } else if (i10 == 1) {
            a40Var.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
        } else {
            a40Var.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
        }
        if (i10 == 0) {
            i11 = R.raw.record_audio;
        } else if (i10 == 1) {
            i11 = R.raw.record_video_p;
        } else {
            i11 = R.raw.record_video_l;
        }
        SvgHelper.SvgDrawable drawable = SvgHelper.getDrawable(AndroidUtilities.readRes(i11));
        drawable.setAspectFill(false);
        a40Var.setImageDrawable(drawable);
        if (a40Var.getParent() != null) {
            ((ViewGroup) a40Var.getParent()).removeView(a40Var);
        }
        gVar.addView(a40Var, 0);
        return a40Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override
    public final void h(int i10) {
    }
}
