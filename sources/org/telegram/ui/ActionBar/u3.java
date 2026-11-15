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
public final class u3 extends ActionMode {
    public final Context f29726a;
    public final ActionMode.Callback2 f29727b;
    public final Menu f29728c;
    public final Rect d;
    public final Rect f29729e;
    public final Rect f29730f;
    public final int[] f29731g;
    public final int[] h;
    public final int[] f29732i;
    public final Rect f29733j;
    public final Rect f29734k;
    public final Rect f29735l;
    public final View f29736m;
    public final Point f29737n;
    public final int f29738o;
    public final s3 f29739p = new s3(this, 0);
    public final s3 f29740q = new s3(this, 1);
    public final i4 f29741r;
    public final t3 f29742s;

    public u3(Context context, ActionMode.Callback2 callback2, View view, i4 i4Var) {
        this.f29726a = context;
        this.f29727b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f29728c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                u3 u3Var = u3.this;
                return u3Var.f29727b.onActionItemClicked(u3Var, menuItem);
            }
        });
        this.d = new Rect();
        this.f29729e = new Rect();
        this.f29730f = new Rect();
        int[] iArr = new int[2];
        this.f29731g = iArr;
        this.h = new int[2];
        this.f29732i = new int[2];
        this.f29733j = new Rect();
        this.f29734k = new Rect();
        this.f29735l = new Rect();
        this.f29736m = view;
        view.getLocationOnScreen(iArr);
        this.f29738o = org.telegram.messenger.g0.L(20.0f);
        this.f29737n = new Point();
        i4Var.f28688e = menu;
        i4Var.f28690g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                u3 u3Var = u3.this;
                return u3Var.f29727b.onActionItemClicked(u3Var, menuItem);
            }
        };
        this.f29741r = i4Var;
        t3 t3Var = new t3(i4Var);
        this.f29742s = t3Var;
        t3Var.f29664b = false;
        t3Var.f29665c = false;
        t3Var.d = false;
        t3Var.f29666e = true;
        t3Var.f29667f = true;
    }

    public static boolean a(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void b() {
        Rect rect = this.d;
        Rect rect2 = this.f29729e;
        rect2.set(rect);
        View view = this.f29736m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f29732i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f29731g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f29726a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f29737n;
        defaultDisplay.getRealSize(point);
        int i7 = point.x;
        int i10 = point.y;
        Rect rect3 = this.f29735l;
        rect3.set(0, 0, i7, i10);
        boolean a10 = a(rect2, rect3);
        Rect rect4 = this.f29730f;
        if (a10) {
            Rect rect5 = this.f29733j;
            if (a(rect2, rect5)) {
                this.f29742s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f29738o));
                if (!rect2.equals(rect4)) {
                    s3 s3Var = this.f29739p;
                    view.removeCallbacks(s3Var);
                    t3 t3Var = this.f29742s;
                    t3Var.getClass();
                    if (System.currentTimeMillis() - t3Var.f29668g > 500) {
                        t3Var.f29665c = true;
                    }
                    view.postDelayed(s3Var, 50L);
                    this.f29741r.f28687c.set(rect2);
                    i4 i4Var = this.f29741r;
                    if (i4Var.f28686b.f()) {
                        i4Var.c();
                    }
                }
                this.f29742s.a();
                rect4.set(rect2);
            }
        }
        this.f29742s.d = true;
        rect2.setEmpty();
        this.f29742s.a();
        rect4.set(rect2);
    }

    public final void c() {
        View view = this.f29736m;
        int[] iArr = this.f29731g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f29732i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f29733j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f29734k;
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
        i4 i4Var = this.f29741r;
        i4Var.f28685a.removeOnLayoutChangeListener(i4Var.f28694l);
        g4 g4Var = i4Var.f28686b;
        if (!g4Var.F) {
            g4Var.G = false;
            g4Var.F = true;
            g4Var.f28582x.cancel();
            g4Var.f28581w.start();
            g4Var.D.setEmpty();
        }
        t3 t3Var = this.f29742s;
        t3Var.f29667f = false;
        i4 i4Var2 = t3Var.f29663a;
        i4Var2.f28685a.removeOnLayoutChangeListener(i4Var2.f28694l);
        g4 g4Var2 = i4Var2.f28686b;
        if (!g4Var2.F) {
            g4Var2.G = false;
            g4Var2.F = true;
            g4Var2.f28582x.cancel();
            g4Var2.f28581w.start();
            g4Var2.D.setEmpty();
        }
        s3 s3Var = this.f29739p;
        View view = this.f29736m;
        view.removeCallbacks(s3Var);
        view.removeCallbacks(this.f29740q);
        this.f29727b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f29728c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f29726a);
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
        View view = this.f29736m;
        s3 s3Var = this.f29740q;
        view.removeCallbacks(s3Var);
        if (min <= 0) {
            s3Var.run();
            return;
        }
        t3 t3Var = this.f29742s;
        t3Var.f29664b = true;
        t3Var.a();
        view.postDelayed(s3Var, min);
    }

    @Override
    public final void invalidate() {
        this.f29727b.onPrepareActionMode(this, this.f29728c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f29727b;
        View view = this.f29736m;
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
        t3 t3Var = this.f29742s;
        t3Var.f29666e = z10;
        t3Var.a();
    }

    @Override
    public final void setSubtitle(int i7) {
    }

    @Override
    public final void setTitle(int i7) {
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
