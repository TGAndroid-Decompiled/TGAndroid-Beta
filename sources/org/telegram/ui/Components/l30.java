package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class l30 extends z4.a {
    public final m30 f26015c;

    public l30(m30 m30Var) {
        this.f26015c = m30Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f26015c.e.length;
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        int i11;
        k30 k30Var = new k30(this, this.f26015c.getContext(), i10, 0);
        k30Var.setOnClickListener(new ci.n4(this, i10, 10));
        k30Var.setFocusable(true);
        k30Var.setTag(Integer.valueOf(i10));
        k30Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        k30Var.setScaleType(ImageView.ScaleType.FIT_XY);
        k30Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
        if (i10 == 0) {
            k30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
        } else if (i10 == 1) {
            k30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
        } else {
            k30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
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
        k30Var.setImageDrawable(drawable);
        if (k30Var.getParent() != null) {
            ((ViewGroup) k30Var.getParent()).removeView(k30Var);
        }
        gVar.addView(k30Var, 0);
        return k30Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override
    public final void h(int i10) {
    }
}
