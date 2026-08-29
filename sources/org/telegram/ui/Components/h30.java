package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class h30 extends m2.a {
    public final i30 f29049c;

    public h30(i30 i30Var) {
        this.f29049c = i30Var;
    }

    @Override
    public final void a(m2.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f29049c.f29308e.length;
    }

    @Override
    public final Object e(m2.g gVar, int i10) {
        int i11;
        g30 g30Var = new g30(this, this.f29049c.getContext(), i10, 0);
        g30Var.setOnClickListener(new jh.y0(this, i10, 9));
        g30Var.setFocusable(true);
        g30Var.setTag(Integer.valueOf(i10));
        g30Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g30Var.setScaleType(ImageView.ScaleType.FIT_XY);
        g30Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
        if (i10 == 0) {
            g30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
        } else if (i10 == 1) {
            g30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
        } else {
            g30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
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
        g30Var.setImageDrawable(drawable);
        if (g30Var.getParent() != null) {
            ((ViewGroup) g30Var.getParent()).removeView(g30Var);
        }
        gVar.addView(g30Var, 0);
        return g30Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override
    public final void h(int i10) {
    }
}
