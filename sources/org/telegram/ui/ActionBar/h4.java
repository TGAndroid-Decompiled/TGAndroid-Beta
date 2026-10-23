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
    public final Context f20911a;
    public final ActionMode.Callback2 f20912b;
    public final Menu f20913c;
    public final Rect d;
    public final Rect e;
    public final Rect f20914f;
    public final int[] f20915g;
    public final int[] h;
    public final int[] f20916i;
    public final Rect f20917j;
    public final Rect f20918k;
    public final Rect f20919l;
    public final View f20920m;
    public final Point f20921n;
    public final int f20922o;
    public final f4 f20923p = new f4(this, 0);
    public final f4 f20924q = new f4(this, 1);
    public final x4 f20925r;
    public final g4 f20926s;

    public h4(Context context, ActionMode.Callback2 callback2, View view, x4 x4Var) {
        this.f20911a = context;
        this.f20912b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f20913c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                h4 h4Var = h4.this;
                return h4Var.f20912b.onActionItemClicked(h4Var, menuItem);
            }
        });
        this.d = new Rect();
        this.e = new Rect();
        this.f20914f = new Rect();
        int[] iArr = new int[2];
        this.f20915g = iArr;
        this.h = new int[2];
        this.f20916i = new int[2];
        this.f20917j = new Rect();
        this.f20918k = new Rect();
        this.f20919l = new Rect();
        this.f20920m = view;
        view.getLocationOnScreen(iArr);
        this.f20922o = AndroidUtilities.dp(20.0f);
        this.f20921n = new Point();
        x4Var.e = menu;
        x4Var.f21886g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                h4 h4Var = h4.this;
                return h4Var.f20912b.onActionItemClicked(h4Var, menuItem);
            }
        };
        this.f20925r = x4Var;
        g4 g4Var = new g4(x4Var);
        this.f20926s = g4Var;
        g4Var.f20876b = false;
        g4Var.f20877c = false;
        g4Var.d = false;
        g4Var.e = true;
        g4Var.f20878f = true;
    }

    public static boolean a(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void b() {
        Rect rect = this.d;
        Rect rect2 = this.e;
        rect2.set(rect);
        View view = this.f20920m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f20916i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f20915g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f20911a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f20921n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f20919l;
        rect3.set(0, 0, i10, i11);
        boolean a2 = a(rect2, rect3);
        Rect rect4 = this.f20914f;
        if (a2) {
            Rect rect5 = this.f20917j;
            if (a(rect2, rect5)) {
                this.f20926s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f20922o));
                if (!rect2.equals(rect4)) {
                    f4 f4Var = this.f20923p;
                    view.removeCallbacks(f4Var);
                    g4 g4Var = this.f20926s;
                    g4Var.getClass();
                    if (System.currentTimeMillis() - g4Var.f20879g > 500) {
                        g4Var.f20877c = true;
                    }
                    view.postDelayed(f4Var, 50L);
                    this.f20925r.f21884c.set(rect2);
                    x4 x4Var = this.f20925r;
                    if (x4Var.f21883b.f()) {
                        x4Var.c();
                    }
                }
                this.f20926s.a();
                rect4.set(rect2);
            }
        }
        this.f20926s.d = true;
        rect2.setEmpty();
        this.f20926s.a();
        rect4.set(rect2);
    }

    public final void c() {
        View view = this.f20920m;
        int[] iArr = this.f20915g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f20916i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f20917j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f20918k;
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
        x4 x4Var = this.f20925r;
        x4Var.f21882a.removeOnLayoutChangeListener(x4Var.f21890l);
        v4 v4Var = x4Var.f21883b;
        if (!v4Var.F) {
            v4Var.G = false;
            v4Var.F = true;
            v4Var.f21824x.cancel();
            v4Var.f21823w.start();
            v4Var.D.setEmpty();
        }
        g4 g4Var = this.f20926s;
        g4Var.f20878f = false;
        x4 x4Var2 = g4Var.f20875a;
        x4Var2.f21882a.removeOnLayoutChangeListener(x4Var2.f21890l);
        v4 v4Var2 = x4Var2.f21883b;
        if (!v4Var2.F) {
            v4Var2.G = false;
            v4Var2.F = true;
            v4Var2.f21824x.cancel();
            v4Var2.f21823w.start();
            v4Var2.D.setEmpty();
        }
        f4 f4Var = this.f20923p;
        View view = this.f20920m;
        view.removeCallbacks(f4Var);
        view.removeCallbacks(this.f20924q);
        this.f20912b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f20913c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f20911a);
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
    public final void hide(long j10) {
        if (j10 == -1) {
            j10 = ViewConfiguration.getDefaultActionModeHideDuration();
        }
        long min = Math.min(3000L, j10);
        View view = this.f20920m;
        f4 f4Var = this.f20924q;
        view.removeCallbacks(f4Var);
        if (min <= 0) {
            f4Var.run();
            return;
        }
        g4 g4Var = this.f20926s;
        g4Var.f20876b = true;
        g4Var.a();
        view.postDelayed(f4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f20912b.onPrepareActionMode(this, this.f20913c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f20912b;
        View view = this.f20920m;
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
        g4 g4Var = this.f20926s;
        g4Var.e = z10;
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
