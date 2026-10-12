package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class e40 extends z4.a {
    public final org.telegram.ui.h50 f25593c;

    public e40(org.telegram.ui.h50 h50Var) {
        this.f25593c = h50Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f25593c.f25887e.length;
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        int i11;
        d40 d40Var = new d40(this, this.f25593c.getContext(), i10, 0);
        d40Var.setOnClickListener(new ci.m4(this, i10, 10));
        d40Var.setFocusable(true);
        d40Var.setTag(Integer.valueOf(i10));
        d40Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        d40Var.setScaleType(ImageView.ScaleType.FIT_XY);
        d40Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
        if (i10 == 0) {
            d40Var.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
        } else if (i10 == 1) {
            d40Var.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
        } else {
            d40Var.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
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
        d40Var.setImageDrawable(drawable);
        if (d40Var.getParent() != null) {
            ((ViewGroup) d40Var.getParent()).removeView(d40Var);
        }
        gVar.addView(d40Var, 0);
        return d40Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override
    public final void h(int i10) {
    }
}
