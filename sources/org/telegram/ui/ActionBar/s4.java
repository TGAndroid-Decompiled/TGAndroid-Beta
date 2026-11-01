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
import org.telegram.messenger.ck;
import org.telegram.ui.Components.ct;
public final class s4 {
    public static final e4 f20773p = new Object();
    public static final List f20774q = Arrays.asList(2131296503, 2131296491, 2131296497, 2131296509, 2131296499, 2131296512, 2131296508, 2131296498, 2131296502, 2131296493);
    public static final List f20775r = Arrays.asList(2131296491, 2131296497, 2131296509, 2131296498, 2131296499, 2131296512, 2131296508, 2131296502);
    public final View f20776a;
    public final q4 f20777b;
    public Menu e;
    public final int f20781i;
    public Runnable f20782j;
    public ct f20783k;
    public final p6 f20786n;
    public final tg.b f20787o;
    public final Rect f20778c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f20779f = new ArrayList();
    public MenuItem.OnMenuItemClickListener f20780g = f20773p;
    public boolean h = true;
    public final f4 f20784l = new f4(this);
    public final ck f20785m = new ck(25);

    public s4(Context context, View view, int i10, p6 p6Var, tg.b bVar) {
        this.f20776a = view;
        this.f20781i = i10;
        this.f20787o = bVar;
        this.f20786n = p6Var;
        this.f20777b = new q4(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i10, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i10);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    public static android.widget.LinearLayout b(org.telegram.ui.ActionBar.s4 r25, android.content.Context r26, android.view.MenuItem r27, boolean r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.s4.b(org.telegram.ui.ActionBar.s4, android.content.Context, android.view.MenuItem, boolean, boolean, boolean):android.widget.LinearLayout");
    }

    public static void e(android.view.View r4, android.view.MenuItem r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.s4.e(android.view.View, android.view.MenuItem, boolean):void");
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.s4.c():void");
    }

    public final ArrayList d(Menu menu) {
        ct ctVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; menu != null && i10 < menu.size(); i10++) {
            MenuItem item = menu.getItem(i10);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != 2131296502 || (ctVar = this.f20783k) == null || ((Boolean) ctVar.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != 2131296503 || this.f20782j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
