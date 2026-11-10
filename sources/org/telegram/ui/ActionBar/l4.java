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
import org.telegram.ui.Components.ps;
public final class l4 {
    public static final y3 f27749p = new Object();
    public static final List f27750q = Arrays.asList(2131296503, 2131296491, 2131296497, 2131296509, 2131296499, 2131296512, 2131296508, 2131296498, 2131296502, 2131296493);
    public static final List f27751r = Arrays.asList(2131296491, 2131296497, 2131296509, 2131296498, 2131296499, 2131296512, 2131296508, 2131296502);
    public final View f27752a;
    public final j4 f27753b;
    public Menu f27755e;
    public final int f27758i;
    public Runnable f27759j;
    public ps f27760k;
    public final h6 f27763n;
    public final dh.c f27764o;
    public final Rect f27754c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f27756f = new ArrayList();
    public MenuItem.OnMenuItemClickListener f27757g = f27749p;
    public boolean h = true;
    public final z3 f27761l = new z3(this);
    public final jl f27762m = new jl(23);

    public l4(Context context, View view, int i7, h6 h6Var, dh.c cVar) {
        this.f27752a = view;
        this.f27758i = i7;
        this.f27764o = cVar;
        this.f27763n = h6Var;
        this.f27753b = new j4(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i7, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i7);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    public static android.widget.LinearLayout b(org.telegram.ui.ActionBar.l4 r25, android.content.Context r26, android.view.MenuItem r27, boolean r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.l4.b(org.telegram.ui.ActionBar.l4, android.content.Context, android.view.MenuItem, boolean, boolean, boolean):android.widget.LinearLayout");
    }

    public static void e(android.view.View r4, android.view.MenuItem r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.l4.e(android.view.View, android.view.MenuItem, boolean):void");
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.l4.c():void");
    }

    public final ArrayList d(Menu menu) {
        ps psVar;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; menu != null && i7 < menu.size(); i7++) {
            MenuItem item = menu.getItem(i7);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != 2131296502 || (psVar = this.f27760k) == null || ((Boolean) psVar.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != 2131296503 || this.f27759j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
