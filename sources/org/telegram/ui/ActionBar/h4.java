package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.PopupMenu;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class h4 extends ActionMode {
    public final Context f20688a;
    public final ActionMode.Callback2 f20689b;
    public final Menu f20690c;
    public final Rect d;
    public final Rect f20691e;
    public final Rect f20692f;
    public final int[] f20693g;
    public final int[] h;
    public final int[] f20694i;
    public final Rect f20695j;
    public final Rect f20696k;
    public final Rect f20697l;
    public final View f20698m;
    public final Point f20699n;
    public final int f20700o;
    public final f4 f20701p = new f4(this, 0);
    public final f4 f20702q = new f4(this, 1);
    public final w4 f20703r;
    public final g4 f20704s;

    public h4(Context context, ActionMode.Callback2 callback2, View view, w4 w4Var) {
        this.f20688a = context;
        this.f20689b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f20690c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                h4 h4Var = h4.this;
                return h4Var.f20689b.onActionItemClicked(h4Var, menuItem);
            }
        });
        this.d = new Rect();
        this.f20691e = new Rect();
        this.f20692f = new Rect();
        int[] iArr = new int[2];
        this.f20693g = iArr;
        this.h = new int[2];
        this.f20694i = new int[2];
        this.f20695j = new Rect();
        this.f20696k = new Rect();
        this.f20697l = new Rect();
        this.f20698m = view;
        view.getLocationOnScreen(iArr);
        this.f20700o = AndroidUtilities.dp(20.0f);
        this.f20699n = new Point();
        w4Var.f21678e = menu;
        w4Var.f21680g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                h4 h4Var = h4.this;
                return h4Var.f20689b.onActionItemClicked(h4Var, menuItem);
            }
        };
        this.f20703r = w4Var;
        g4 g4Var = new g4(w4Var);
        this.f20704s = g4Var;
        g4Var.f20648b = false;
        g4Var.f20649c = false;
        g4Var.d = false;
        g4Var.f20650e = true;
        g4Var.f20651f = true;
    }

    public static boolean a(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void b() {
        Rect rect = this.d;
        Rect rect2 = this.f20691e;
        rect2.set(rect);
        View view = this.f20698m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f20694i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f20693g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f20688a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f20699n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f20697l;
        rect3.set(0, 0, i10, i11);
        boolean a2 = a(rect2, rect3);
        Rect rect4 = this.f20692f;
        if (a2) {
            Rect rect5 = this.f20695j;
            if (a(rect2, rect5)) {
                this.f20704s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f20700o));
                if (!rect2.equals(rect4)) {
                    f4 f4Var = this.f20701p;
                    view.removeCallbacks(f4Var);
                    g4 g4Var = this.f20704s;
                    g4Var.getClass();
                    if (System.currentTimeMillis() - g4Var.f20652g > 500) {
                        g4Var.f20649c = true;
                    }
                    view.postDelayed(f4Var, 50L);
                    this.f20703r.f21677c.set(rect2);
                    w4 w4Var = this.f20703r;
                    if (w4Var.f21676b.f()) {
                        w4Var.c();
                    }
                }
                this.f20704s.a();
                rect4.set(rect2);
            }
        }
        this.f20704s.d = true;
        rect2.setEmpty();
        this.f20704s.a();
        rect4.set(rect2);
    }

    public final void c() {
        View view = this.f20698m;
        int[] iArr = this.f20693g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f20694i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f20695j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f20696k;
        if (equals && rect.equals(rect2)) {
            return;
        }
        b();
        iArr3[0] = iArr[0];
        iArr3[1] = iArr[1];
        rect2.set(rect);
    }

    @Override
    public final void finish() {
        w4 w4Var = this.f20703r;
        w4Var.f21675a.removeOnLayoutChangeListener(w4Var.f21684l);
        u4 u4Var = w4Var.f21676b;
        if (!u4Var.F) {
            u4Var.G = false;
            u4Var.F = true;
            u4Var.f21574x.cancel();
            u4Var.f21573w.start();
            u4Var.D.setEmpty();
        }
        g4 g4Var = this.f20704s;
        g4Var.f20651f = false;
        w4 w4Var2 = g4Var.f20647a;
        w4Var2.f21675a.removeOnLayoutChangeListener(w4Var2.f21684l);
        u4 u4Var2 = w4Var2.f21676b;
        if (!u4Var2.F) {
            u4Var2.G = false;
            u4Var2.F = true;
            u4Var2.f21574x.cancel();
            u4Var2.f21573w.start();
            u4Var2.D.setEmpty();
        }
        f4 f4Var = this.f20701p;
        View view = this.f20698m;
        view.removeCallbacks(f4Var);
        view.removeCallbacks(this.f20702q);
        this.f20689b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f20690c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f20688a);
    }

    @Override
    public final CharSequence getSubtitle() {
        return null;
    }

    @Override
    public final CharSequence getTitle() {
        return null;
    }

    @Override
    public final void hide(long j3) {
        if (j3 == -1) {
            j3 = ViewConfiguration.getDefaultActionModeHideDuration();
        }
        long min = Math.min(3000L, j3);
        View view = this.f20698m;
        f4 f4Var = this.f20702q;
        view.removeCallbacks(f4Var);
        if (min <= 0) {
            f4Var.run();
            return;
        }
        g4 g4Var = this.f20704s;
        g4Var.f20648b = true;
        g4Var.a();
        view.postDelayed(f4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f20689b.onPrepareActionMode(this, this.f20690c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f20689b;
        View view = this.f20698m;
        Rect rect = this.d;
        callback2.onGetContentRect(this, view, rect);
        if (rect.left == 0 && rect.right == 0) {
            rect.left = 1;
            rect.right = 1;
        }
        b();
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        g4 g4Var = this.f20704s;
        g4Var.f20650e = z10;
        g4Var.a();
    }

    @Override
    public final void setSubtitle(int i10) {
    }

    @Override
    public final void setTitle(int i10) {
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
    }

    @Override
    public final void setCustomView(View view) {
    }
}
