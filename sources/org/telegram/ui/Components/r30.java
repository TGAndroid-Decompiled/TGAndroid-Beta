package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class r30 extends z4.a {
    public final org.telegram.ui.s40 f30055c;

    public r30(org.telegram.ui.s40 s40Var) {
        this.f30055c = s40Var;
    }

    @Override
    public final void a(z4.h hVar, Object obj) {
        hVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f30055c.e.length;
    }

    @Override
    public final Object e(z4.h hVar, int i10) {
        int i11;
        q30 q30Var = new q30(this, this.f30055c.getContext(), i10, 0);
        q30Var.setOnClickListener(new ai.n1(this, i10, 12));
        q30Var.setFocusable(true);
        q30Var.setTag(Integer.valueOf(i10));
        q30Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        q30Var.setScaleType(ImageView.ScaleType.FIT_XY);
        q30Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
        if (i10 == 0) {
            q30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
        } else if (i10 == 1) {
            q30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
        } else {
            q30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
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
        q30Var.setImageDrawable(drawable);
        if (q30Var.getParent() != null) {
            ((ViewGroup) q30Var.getParent()).removeView(q30Var);
        }
        hVar.addView(q30Var, 0);
        return q30Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override
    public final void h(int i10) {
    }
}
