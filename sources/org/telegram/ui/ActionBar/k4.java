package org.telegram.ui.ActionBar;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.jl;
import org.telegram.ui.Components.qs;
public final class k4 {
    public static final x3 f27736p = new Object();
    public static final List f27737q = Arrays.asList(2131296503, 2131296491, 2131296497, 2131296509, 2131296499, 2131296512, 2131296508, 2131296498, 2131296502, 2131296493);
    public static final List f27738r = Arrays.asList(2131296491, 2131296497, 2131296509, 2131296498, 2131296499, 2131296512, 2131296508, 2131296502);
    public final View f27739a;
    public final i4 f27740b;
    public Menu f27742e;
    public final int f27745i;
    public Runnable f27746j;
    public qs f27747k;
    public final f6 f27750n;
    public final dh.c f27751o;
    public final Rect f27741c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f27743f = new ArrayList();
    public MenuItem.OnMenuItemClickListener f27744g = f27736p;
    public boolean h = true;
    public final y3 f27748l = new y3(this);
    public final jl f27749m = new jl(23);

    public k4(Context context, View view, int i7, f6 f6Var, dh.c cVar) {
        this.f27739a = view;
        this.f27745i = i7;
        this.f27751o = cVar;
        this.f27750n = f6Var;
        this.f27740b = new i4(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i7, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i7);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    public static android.widget.LinearLayout b(org.telegram.ui.ActionBar.k4 r25, android.content.Context r26, android.view.MenuItem r27, boolean r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k4.b(org.telegram.ui.ActionBar.k4, android.content.Context, android.view.MenuItem, boolean, boolean, boolean):android.widget.LinearLayout");
    }

    public static void e(android.view.View r4, android.view.MenuItem r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k4.e(android.view.View, android.view.MenuItem, boolean):void");
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k4.c():void");
    }

    public final ArrayList d(Menu menu) {
        qs qsVar;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; menu != null && i7 < menu.size(); i7++) {
            MenuItem item = menu.getItem(i7);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != 2131296502 || (qsVar = this.f27747k) == null || ((Boolean) qsVar.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != 2131296503 || this.f27746j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
