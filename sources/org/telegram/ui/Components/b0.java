package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.oa1;
import org.telegram.ui.pa1;
public final class b0 implements View.OnLongClickListener {
    public final int f21666a;
    public final Object f21667b;
    public final Object f21668c;

    public b0(int i10, Object obj, Object obj2) {
        this.f21666a = i10;
        this.f21667b = obj;
        this.f21668c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f21666a) {
            case 0:
                e0 e0Var = (e0) this.f21668c;
                bi.n6 n6Var = ((f0) this.f21667b).f22796n;
                if (n6Var != null) {
                    return ((Boolean) n6Var.run(e0Var)).booleanValue();
                }
                return false;
            case 1:
                j8 j8Var = (j8) this.f21667b;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.c1 c1Var = j8Var.X;
                c1Var.d(playbackSpeed, false);
                c1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, (org.telegram.ui.ActionBar.f6) this.f21668c));
                j8Var.F0(false);
                org.telegram.ui.ActionBar.w0 w0Var = j8Var.V;
                w0Var.setDimMenu(0.15f);
                w0Var.M(c1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 2:
                w70 w70Var = (w70) this.f21667b;
                ((org.telegram.ui.uv) this.f21668c).run();
                if (w70Var.J) {
                    w70Var.u();
                    return true;
                }
                return true;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.f21667b;
                zh.b bVar = (zh.b) this.f21668c;
                MessageObject messageObject = photoViewer.T4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new wc(kb.a(photoViewer.E), bVar).k(false).j();
                }
                return true;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) this.f21667b;
                ImageView imageView = (ImageView) this.f21668c;
                org.telegram.ui.ActionBar.p1 b10 = o9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f30396g1, profileActivity.f30524z0);
                if (b10 != null) {
                    b10.setOnDismissListener(new org.telegram.ui.f0(profileActivity, 3));
                    profileActivity.f30505w0 = imageView;
                    profileActivity.H3(0.3f);
                    UndoView undoView = profileActivity.M;
                    if (undoView == null) {
                        return true;
                    }
                    undoView.e(1, true);
                    return true;
                }
                return false;
            case 5:
                oa1 oa1Var = (oa1) this.f21667b;
                jg.f fVar = (jg.f) this.f21668c;
                pa1 pa1Var = oa1Var.d;
                z00 z00Var = oa1Var.f35448a;
                boolean z10 = false;
                if (z00Var.f29553c) {
                    pa1Var.f();
                    ArrayList arrayList = pa1Var.f35756n;
                    hg.g gVar = pa1Var.f35754c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((oa1) arrayList.get(i10)).f35448a.setChecked(false);
                        ((oa1) arrayList.get(i10)).f35449b.f11924n = false;
                        if (pa1Var.f35757r.f36314c > 0 && i10 < gVar.d.size()) {
                            ((jg.f) gVar.d.get(i10)).f11924n = false;
                        }
                    }
                    z10 = true;
                    z00Var.setChecked(true);
                    fVar.f11924n = true;
                    pa1Var.f35753b.z();
                    if (pa1Var.f35757r.f36314c > 0) {
                        ((jg.f) gVar.d.get(oa1Var.f35450c)).f11924n = true;
                        gVar.z();
                    }
                }
                return z10;
            default:
                zh.a3 a3Var = (zh.a3) this.f21667b;
                zh.u7 u7Var = (zh.u7) this.f21668c;
                zh.j1 j1Var = a3Var.f48234z3;
                if (j1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(j1Var);
                    a3Var.f48234z3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                bi.x4 x4Var = a3Var.H0;
                if (x4Var != null) {
                    x4Var.e(true);
                }
                pk0 pk0Var = a3Var.f48207r3;
                if (pk0Var == null) {
                    org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                    pk0 pk0Var2 = new pk0(2, a3Var.C2, a3Var.getContext(), R, new bi.n1(9, a3Var.B0));
                    a3Var.f48207r3 = pk0Var2;
                    pk0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    a3Var.addView(a3Var.f48207r3, a3Var.getChildCount() - 1, w7.a6.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    a3Var.f48207r3.setVisibility(8);
                    a3Var.f48207r3.setDelegate(new zh.g2(a3Var));
                    a3Var.f48207r3.p(null, null, true);
                } else {
                    a3Var.bringChildToFront(pk0Var);
                    a3Var.f48207r3.n();
                }
                a3Var.f48207r3.setFragment(LaunchActivity.R());
                u7Var.f48958s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                a3Var.b1(true);
                return true;
        }
    }
}
