package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class p4 extends org.telegram.ui.ActionBar.r2 {
    public org.telegram.ui.Components.nm0 f42296a;
    public o4 f42297b;

    public static void V(p4 p4Var, int i10) {
        if (i10 == 1) {
            wi.a aVar = wi.e.f51335b;
            boolean z10 = !MediaController.shouldUseAudioRecorderV2(p4Var.currentAccount);
            synchronized (aVar) {
                aVar.d = z10;
                aVar.f51327c = true;
                aVar.f51326b = true;
                wi.d.f51333a.edit().putBoolean("audio_recorder_v2_enabled", z10).apply();
            }
            p4Var.f42297b.l();
        } else if (MediaController.shouldUseAudioRecorderV2(p4Var.currentAccount) && i10 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p4Var.getParentActivity());
            alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.AudioRecorderNoiseSuppression);
            alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.AudioRecorderNoiseSuppressionOff), LocaleController.getString(R.string.AudioRecorderNoiseSuppressionRNNoise)}, new n4(p4Var, 0));
            p4Var.showDialog(alertDialog$Builder.f22369a);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.AudioRecorderSettings));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 22));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.f42296a = nm0Var;
        nm0Var.setSectionsDrawBackground(true);
        this.f42296a.u1();
        this.f42296a.setLayoutManager(new s4.c0());
        this.f42296a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.nm0 nm0Var2 = this.f42296a;
        o4 o4Var = new o4(this, context);
        this.f42297b = o4Var;
        nm0Var2.setAdapter(o4Var);
        this.f42296a.setOnItemClickListener(new h(this, 2));
        frameLayout.addView(this.f42296a, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.f42296a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
