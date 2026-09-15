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
public final class i4 extends ActionMode {
    public final Context f18757a;
    public final ActionMode.Callback2 f18758b;
    public final Menu f18759c;
    public final Rect d;
    public final Rect e;
    public final Rect f18760f;
    public final int[] f18761g;
    public final int[] h;
    public final int[] f18762i;
    public final Rect f18763j;
    public final Rect f18764k;
    public final Rect f18765l;
    public final View f18766m;
    public final Point f18767n;
    public final int f18768o;
    public final g4 f18769p = new g4(this, 0);
    public final g4 f18770q = new g4(this, 1);
    public final x4 f18771r;
    public final h4 f18772s;

    public i4(Context context, ActionMode.Callback2 callback2, View view, x4 x4Var) {
        this.f18757a = context;
        this.f18758b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f18759c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f18758b.onActionItemClicked(i4.this, menuItem);
                return onActionItemClicked;
            }
        });
        this.d = new Rect();
        this.e = new Rect();
        this.f18760f = new Rect();
        int[] iArr = new int[2];
        this.f18761g = iArr;
        this.h = new int[2];
        this.f18762i = new int[2];
        this.f18763j = new Rect();
        this.f18764k = new Rect();
        this.f18765l = new Rect();
        this.f18766m = view;
        view.getLocationOnScreen(iArr);
        this.f18768o = AndroidUtilities.dp(20.0f);
        this.f18767n = new Point();
        x4Var.e = menu;
        x4Var.f19704g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f18758b.onActionItemClicked(i4.this, menuItem);
                return onActionItemClicked;
            }
        };
        this.f18771r = x4Var;
        h4 h4Var = new h4(x4Var);
        this.f18772s = h4Var;
        h4Var.f18723b = false;
        h4Var.f18724c = false;
        h4Var.d = false;
        h4Var.e = true;
        h4Var.f18725f = true;
    }

    public static boolean c(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void d() {
        Rect rect = this.d;
        Rect rect2 = this.e;
        rect2.set(rect);
        View view = this.f18766m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f18762i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f18761g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f18757a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f18767n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f18765l;
        rect3.set(0, 0, i10, i11);
        boolean c10 = c(rect2, rect3);
        Rect rect4 = this.f18760f;
        if (c10) {
            Rect rect5 = this.f18763j;
            if (c(rect2, rect5)) {
                this.f18772s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f18768o));
                if (!rect2.equals(rect4)) {
                    g4 g4Var = this.f18769p;
                    view.removeCallbacks(g4Var);
                    h4 h4Var = this.f18772s;
                    h4Var.getClass();
                    if (System.currentTimeMillis() - h4Var.f18726g > 500) {
                        h4Var.f18724c = true;
                    }
                    view.postDelayed(g4Var, 50L);
                    this.f18771r.f19702c.set(rect2);
                    x4 x4Var = this.f18771r;
                    if (x4Var.f19701b.f()) {
                        x4Var.c();
                    }
                }
                this.f18772s.a();
                rect4.set(rect2);
            }
        }
        this.f18772s.d = true;
        rect2.setEmpty();
        this.f18772s.a();
        rect4.set(rect2);
    }

    public final void e() {
        View view = this.f18766m;
        int[] iArr = this.f18761g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f18762i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f18763j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f18764k;
        if (equals && rect.equals(rect2)) {
            return;
        }
        d();
        iArr3[0] = iArr[0];
        iArr3[1] = iArr[1];
        rect2.set(rect);
    }

    @Override
    public final void finish() {
        x4 x4Var = this.f18771r;
        x4Var.f19700a.removeOnLayoutChangeListener(x4Var.f19708l);
        v4 v4Var = x4Var.f19701b;
        if (!v4Var.F) {
            v4Var.G = false;
            v4Var.F = true;
            v4Var.f19629x.cancel();
            v4Var.f19628w.start();
            v4Var.D.setEmpty();
        }
        h4 h4Var = this.f18772s;
        h4Var.f18725f = false;
        x4 x4Var2 = h4Var.f18722a;
        x4Var2.f19700a.removeOnLayoutChangeListener(x4Var2.f19708l);
        v4 v4Var2 = x4Var2.f19701b;
        if (!v4Var2.F) {
            v4Var2.G = false;
            v4Var2.F = true;
            v4Var2.f19629x.cancel();
            v4Var2.f19628w.start();
            v4Var2.D.setEmpty();
        }
        g4 g4Var = this.f18769p;
        View view = this.f18766m;
        view.removeCallbacks(g4Var);
        view.removeCallbacks(this.f18770q);
        this.f18758b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f18759c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f18757a);
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
        View view = this.f18766m;
        g4 g4Var = this.f18770q;
        view.removeCallbacks(g4Var);
        if (min <= 0) {
            g4Var.run();
            return;
        }
        h4 h4Var = this.f18772s;
        h4Var.f18723b = true;
        h4Var.a();
        view.postDelayed(g4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f18758b.onPrepareActionMode(this, this.f18759c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f18758b;
        View view = this.f18766m;
        Rect rect = this.d;
        callback2.onGetContentRect(this, view, rect);
        if (rect.left == 0 && rect.right == 0) {
            rect.left = 1;
            rect.right = 1;
        }
        d();
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        h4 h4Var = this.f18772s;
        h4Var.e = z10;
        h4Var.a();
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
