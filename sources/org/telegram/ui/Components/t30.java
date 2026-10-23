package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class t30 extends z4.a {
    public final org.telegram.ui.p40 f30430c;

    public t30(org.telegram.ui.p40 p40Var) {
        this.f30430c = p40Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f30430c.e.length;
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        int i11;
        s30 s30Var = new s30(this, this.f30430c.getContext(), i10, 0);
        s30Var.setOnClickListener(new ai.n1(this, i10, 12));
        s30Var.setFocusable(true);
        s30Var.setTag(Integer.valueOf(i10));
        s30Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        s30Var.setScaleType(ImageView.ScaleType.FIT_XY);
        s30Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
        if (i10 == 0) {
            s30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
        } else if (i10 == 1) {
            s30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
        } else {
            s30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
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
        s30Var.setImageDrawable(drawable);
        if (s30Var.getParent() != null) {
            ((ViewGroup) s30Var.getParent()).removeView(s30Var);
        }
        gVar.addView(s30Var, 0);
        return s30Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override
    public final void h(int i10) {
    }
}
