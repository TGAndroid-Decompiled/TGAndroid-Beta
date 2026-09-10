package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class u30 extends z4.a {
    public final v30 f27557c;

    public u30(v30 v30Var) {
        this.f27557c = v30Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f27557c.e.length;
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        int i11;
        t30 t30Var = new t30(this, this.f27557c.getContext(), i10, 0);
        t30Var.setOnClickListener(new bi.j5(this, i10, 10));
        t30Var.setFocusable(true);
        t30Var.setTag(Integer.valueOf(i10));
        t30Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        t30Var.setScaleType(ImageView.ScaleType.FIT_XY);
        t30Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
        if (i10 == 0) {
            t30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
        } else if (i10 == 1) {
            t30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
        } else {
            t30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
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
        t30Var.setImageDrawable(drawable);
        if (t30Var.getParent() != null) {
            ((ViewGroup) t30Var.getParent()).removeView(t30Var);
        }
        gVar.addView(t30Var, 0);
        return t30Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override
    public final void h(int i10) {
    }
}
