package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

public final class y20 extends m2.a {

    public final z20 f34792c;

    public y20(z20 z20Var) {
        this.f34792c = z20Var;
    }

    @Override
    public final void a(m2.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f34792c.f35137e.length;
    }

    @Override
    public final Object e(m2.g gVar, int i10) {
        int i11;
        x20 x20Var = new x20(this, this.f34792c.getContext(), i10, 0);
        x20Var.setOnClickListener(new hh.z0(this, i10, 9));
        x20Var.setFocusable(true);
        x20Var.setTag(Integer.valueOf(i10));
        x20Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        x20Var.setScaleType(ImageView.ScaleType.FIT_XY);
        x20Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
        if (i10 == 0) {
            x20Var.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
        } else if (i10 == 1) {
            x20Var.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
        } else {
            x20Var.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
        }
        if (i10 == 0) {
            i11 = R.raw.record_audio;
        } else {
            i11 = i10 == 1 ? R.raw.record_video_p : R.raw.record_video_l;
        }
        SvgHelper.SvgDrawable drawable = SvgHelper.getDrawable(AndroidUtilities.readRes(i11));
        drawable.setAspectFill(false);
        x20Var.setImageDrawable(drawable);
        if (x20Var.getParent() != null) {
            ((ViewGroup) x20Var.getParent()).removeView(x20Var);
        }
        gVar.addView(x20Var, 0);
        return x20Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override
    public final void h(int i10) {
    }
}
