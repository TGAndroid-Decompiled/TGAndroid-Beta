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
    public final Context f20524a;
    public final ActionMode.Callback2 f20525b;
    public final Menu f20526c;
    public final Rect d;
    public final Rect f20527e;
    public final Rect f20528f;
    public final int[] f20529g;
    public final int[] h;
    public final int[] f20530i;
    public final Rect f20531j;
    public final Rect f20532k;
    public final Rect f20533l;
    public final View f20534m;
    public final Point f20535n;
    public final int f20536o;
    public final g4 f20537p = new g4(this, 0);
    public final g4 f20538q = new g4(this, 1);
    public final x4 f20539r;
    public final h4 f20540s;

    public i4(Context context, ActionMode.Callback2 callback2, View view, x4 x4Var) {
        this.f20524a = context;
        this.f20525b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f20526c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f20525b.onActionItemClicked(i4.this, menuItem);
                return onActionItemClicked;
            }
        });
        this.d = new Rect();
        this.f20527e = new Rect();
        this.f20528f = new Rect();
        int[] iArr = new int[2];
        this.f20529g = iArr;
        this.h = new int[2];
        this.f20530i = new int[2];
        this.f20531j = new Rect();
        this.f20532k = new Rect();
        this.f20533l = new Rect();
        this.f20534m = view;
        view.getLocationOnScreen(iArr);
        this.f20536o = AndroidUtilities.dp(20.0f);
        this.f20535n = new Point();
        x4Var.f21511e = menu;
        x4Var.f21513g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f20525b.onActionItemClicked(i4.this, menuItem);
                return onActionItemClicked;
            }
        };
        this.f20539r = x4Var;
        h4 h4Var = new h4(x4Var);
        this.f20540s = h4Var;
        h4Var.f20484b = false;
        h4Var.f20485c = false;
        h4Var.d = false;
        h4Var.f20486e = true;
        h4Var.f20487f = true;
    }

    public static boolean c(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void d() {
        Rect rect = this.d;
        Rect rect2 = this.f20527e;
        rect2.set(rect);
        View view = this.f20534m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f20530i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f20529g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f20524a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f20535n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f20533l;
        rect3.set(0, 0, i10, i11);
        boolean c10 = c(rect2, rect3);
        Rect rect4 = this.f20528f;
        if (c10) {
            Rect rect5 = this.f20531j;
            if (c(rect2, rect5)) {
                this.f20540s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f20536o));
                if (!rect2.equals(rect4)) {
                    g4 g4Var = this.f20537p;
                    view.removeCallbacks(g4Var);
                    h4 h4Var = this.f20540s;
                    h4Var.getClass();
                    if (System.currentTimeMillis() - h4Var.f20488g > 500) {
                        h4Var.f20485c = true;
                    }
                    view.postDelayed(g4Var, 50L);
                    this.f20539r.f21510c.set(rect2);
                    x4 x4Var = this.f20539r;
                    if (x4Var.f21509b.f()) {
                        x4Var.c();
                    }
                }
                this.f20540s.a();
                rect4.set(rect2);
            }
        }
        this.f20540s.d = true;
        rect2.setEmpty();
        this.f20540s.a();
        rect4.set(rect2);
    }

    public final void e() {
        View view = this.f20534m;
        int[] iArr = this.f20529g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f20530i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f20531j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f20532k;
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
        x4 x4Var = this.f20539r;
        x4Var.f21508a.removeOnLayoutChangeListener(x4Var.f21517l);
        v4 v4Var = x4Var.f21509b;
        if (!v4Var.F) {
            v4Var.G = false;
            v4Var.F = true;
            v4Var.f21432x.cancel();
            v4Var.f21431w.start();
            v4Var.D.setEmpty();
        }
        h4 h4Var = this.f20540s;
        h4Var.f20487f = false;
        x4 x4Var2 = h4Var.f20483a;
        x4Var2.f21508a.removeOnLayoutChangeListener(x4Var2.f21517l);
        v4 v4Var2 = x4Var2.f21509b;
        if (!v4Var2.F) {
            v4Var2.G = false;
            v4Var2.F = true;
            v4Var2.f21432x.cancel();
            v4Var2.f21431w.start();
            v4Var2.D.setEmpty();
        }
        g4 g4Var = this.f20537p;
        View view = this.f20534m;
        view.removeCallbacks(g4Var);
        view.removeCallbacks(this.f20538q);
        this.f20525b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f20526c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f20524a);
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
        View view = this.f20534m;
        g4 g4Var = this.f20538q;
        view.removeCallbacks(g4Var);
        if (min <= 0) {
            g4Var.run();
            return;
        }
        h4 h4Var = this.f20540s;
        h4Var.f20484b = true;
        h4Var.a();
        view.postDelayed(g4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f20525b.onPrepareActionMode(this, this.f20526c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f20525b;
        View view = this.f20534m;
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
        h4 h4Var = this.f20540s;
        h4Var.f20486e = z10;
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
