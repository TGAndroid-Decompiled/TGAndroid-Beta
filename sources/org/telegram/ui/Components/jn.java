package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class jn extends yh {

    public final az f29738n;

    public final zk0 f29739r;

    public final int f29740s;
    public final org.telegram.ui.w7 v;

    public int f29741w;

    public jn(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, gi giVar) {
        super(context, c6Var, giVar);
        this.f29740s = i10;
        az azVar = new az(context, c6Var);
        this.f29738n = azVar;
        azVar.setText(LocaleController.getString(R.string.NoPhotos));
        azVar.setOnTouchListener(null);
        azVar.setTextSize(16);
        addView(azVar, h7.z5.c(-2.0f, -1));
        azVar.a(R.raw.media_forbidden, 150, 150);
        TLRPC.Chat chatK1 = this.f34900b.k1();
        if (i10 == 1) {
            azVar.setText(ChatObject.getRestrictedErrorText(chatK1, 7));
        } else if (i10 == 3) {
            azVar.setText(ChatObject.getRestrictedErrorText(chatK1, 18));
        } else if (i10 == 4) {
            azVar.setText(ChatObject.getRestrictedErrorText(chatK1, 19));
        } else {
            azVar.setText(ChatObject.getRestrictedErrorText(chatK1, 22));
        }
        azVar.c();
        zk0 zk0Var = new zk0(context, c6Var);
        this.f29739r = zk0Var;
        zk0Var.setSectionsType(2);
        zk0Var.setVerticalScrollBarEnabled(false);
        zk0Var.setLayoutManager(new f2.k0());
        zk0Var.setClipToPadding(false);
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, 4);
        this.v = w7Var;
        zk0Var.setAdapter(w7Var);
        zk0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        zk0Var.setOnScrollListener(new xm(this, 1));
        addView(zk0Var, h7.z5.c(-1.0f, -1));
    }

    @Override
    public int getCurrentItemTop() {
        zk0 zk0Var = this.f29739r;
        if (zk0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = zk0Var.getChildAt(0);
        lk0 lk0Var = (lk0) zk0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && lk0Var != null && lk0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || lk0Var == null || lk0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        az azVar = this.f29738n;
        azVar.setTranslationY(((measuredHeight - azVar.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f29739r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f34900b.getSheetContainer().invalidate();
    }

    @Override
    public final void z(int i10, int i11) {
        int i12;
        int iMax = Math.max(0, i11 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
        if (this.f29741w != iMax) {
            this.f29741w = iMax;
            this.v.l();
        }
        if (AndroidUtilities.isTablet()) {
            i12 = (i11 / 5) * 2;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i12 = (int) (i11 / 3.5f);
            } else {
                i12 = (i11 / 5) * 2;
            }
        }
        int iDp = i12 - AndroidUtilities.dp(52.0f);
        int i13 = iDp >= 0 ? iDp : 0;
        zk0 zk0Var = this.f29739r;
        if (zk0Var.getPaddingTop() != i13) {
            zk0Var.setPadding(AndroidUtilities.dp(6.0f), i13, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
        }
    }
}
