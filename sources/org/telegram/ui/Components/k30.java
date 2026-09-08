package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class k30 extends z4.a {
    public final l30 f27708c;

    public k30(l30 l30Var) {
        this.f27708c = l30Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f27708c.f28065e.length;
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        int i11;
        j30 j30Var = new j30(this, this.f27708c.getContext(), i10, 0);
        j30Var.setOnClickListener(new di.o4(this, i10, 10));
        j30Var.setFocusable(true);
        j30Var.setTag(Integer.valueOf(i10));
        j30Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        j30Var.setScaleType(ImageView.ScaleType.FIT_XY);
        j30Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
        if (i10 == 0) {
            j30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
        } else if (i10 == 1) {
            j30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
        } else {
            j30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
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
        j30Var.setImageDrawable(drawable);
        if (j30Var.getParent() != null) {
            ((ViewGroup) j30Var.getParent()).removeView(j30Var);
        }
        gVar.addView(j30Var, 0);
        return j30Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override
    public final void h(int i10) {
    }
}
