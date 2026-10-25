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
import org.telegram.messenger.R;
import org.telegram.ui.Components.au;
public final class c5 {
    public static final o4 f22500p = new Object();
    public static final List f22501q = Arrays.asList(Integer.valueOf(R.id.menu_regular), Integer.valueOf(R.id.menu_bold), Integer.valueOf(R.id.menu_italic), Integer.valueOf(R.id.menu_strike), Integer.valueOf(R.id.menu_mono), Integer.valueOf(R.id.menu_underline), Integer.valueOf(R.id.menu_spoiler), Integer.valueOf(R.id.menu_link), Integer.valueOf(R.id.menu_quote), Integer.valueOf(R.id.menu_date));
    public static final List f22502r = Arrays.asList(Integer.valueOf(R.id.menu_bold), Integer.valueOf(R.id.menu_italic), Integer.valueOf(R.id.menu_strike), Integer.valueOf(R.id.menu_link), Integer.valueOf(R.id.menu_mono), Integer.valueOf(R.id.menu_underline), Integer.valueOf(R.id.menu_spoiler), Integer.valueOf(R.id.menu_quote));
    public final View f22503a;
    public final a5 f22504b;
    public Menu e;
    public final int f22508i;
    public Runnable f22509j;
    public au f22510k;
    public final u6 f22513n;
    public final ch.b f22514o;
    public final Rect f22505c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f22506f = new ArrayList();
    public MenuItem.OnMenuItemClickListener f22507g = f22500p;
    public boolean h = true;
    public final p4 f22511l = new p4(this);
    public final n4 f22512m = new n4(0);

    public c5(Context context, View view, int i10, u6 u6Var, ch.b bVar) {
        this.f22503a = view;
        this.f22508i = i10;
        this.f22514o = bVar;
        this.f22513n = u6Var;
        this.f22504b = new a5(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i10, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i10);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    public static android.widget.LinearLayout b(org.telegram.ui.ActionBar.c5 r18, android.content.Context r19, android.view.MenuItem r20, boolean r21, boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.c5.b(org.telegram.ui.ActionBar.c5, android.content.Context, android.view.MenuItem, boolean, boolean, boolean):android.widget.LinearLayout");
    }

    public static void e(android.view.View r4, android.view.MenuItem r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.c5.e(android.view.View, android.view.MenuItem, boolean):void");
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.c5.c():void");
    }

    public final ArrayList d(Menu menu) {
        au auVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; menu != null && i10 < menu.size(); i10++) {
            MenuItem item = menu.getItem(i10);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != R.id.menu_quote || (auVar = this.f22510k) == null || ((Boolean) auVar.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != R.id.menu_regular || this.f22509j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
