package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class x30 extends z4.a {
    public final org.telegram.ui.m50 f31147c;

    public x30(org.telegram.ui.m50 m50Var) {
        this.f31147c = m50Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f31147c.e.length;
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        int i11;
        w30 w30Var = new w30(this, this.f31147c.getContext(), i10, 0);
        w30Var.setOnClickListener(new di.m4(this, i10, 10));
        w30Var.setFocusable(true);
        w30Var.setTag(Integer.valueOf(i10));
        w30Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        w30Var.setScaleType(ImageView.ScaleType.FIT_XY);
        w30Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
        if (i10 == 0) {
            w30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
        } else if (i10 == 1) {
            w30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
        } else {
            w30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
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
        w30Var.setImageDrawable(drawable);
        if (w30Var.getParent() != null) {
            ((ViewGroup) w30Var.getParent()).removeView(w30Var);
        }
        gVar.addView(w30Var, 0);
        return w30Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override
    public final void h(int i10) {
    }
}
