package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class u20 extends m2.a {
    public final v20 f32907c;

    public u20(v20 v20Var) {
        this.f32907c = v20Var;
    }

    @Override
    public final void a(m2.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f32907c.f33241e.length;
    }

    @Override
    public final Object e(m2.g gVar, int i9) {
        int i10;
        t20 t20Var = new t20(this, this.f32907c.getContext(), i9, 0);
        t20Var.setOnClickListener(new gh.z0(this, i9, 9));
        t20Var.setFocusable(true);
        t20Var.setTag(Integer.valueOf(i9));
        t20Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        t20Var.setScaleType(ImageView.ScaleType.FIT_XY);
        t20Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
        if (i9 == 0) {
            t20Var.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
        } else if (i9 == 1) {
            t20Var.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
        } else {
            t20Var.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
        }
        if (i9 == 0) {
            i10 = R.raw.record_audio;
        } else if (i9 == 1) {
            i10 = R.raw.record_video_p;
        } else {
            i10 = R.raw.record_video_l;
        }
        SvgHelper.SvgDrawable drawable = SvgHelper.getDrawable(AndroidUtilities.readRes(i10));
        drawable.setAspectFill(false);
        t20Var.setImageDrawable(drawable);
        if (t20Var.getParent() != null) {
            ((ViewGroup) t20Var.getParent()).removeView(t20Var);
        }
        gVar.addView(t20Var, 0);
        return t20Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override
    public final void h(int i9) {
    }
}
