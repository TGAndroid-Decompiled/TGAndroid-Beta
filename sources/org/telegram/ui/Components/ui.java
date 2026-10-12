package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ui extends View {
    public final int f29689a = 0;
    public final int f29690b;
    public final Object f29691c;
    public final Object d;
    public final Object e;

    public ui(ViewGroup viewGroup, int i10) {
        super(viewGroup.getContext());
        this.f29691c = new ArrayList();
        this.e = new org.telegram.ui.zz(this, 28);
        this.d = viewGroup;
        this.f29690b = i10;
    }

    public void a() {
        org.telegram.ui.zz zzVar = (org.telegram.ui.zz) this.e;
        ArrayList arrayList = (ArrayList) this.f29691c;
        boolean isEmpty = arrayList.isEmpty();
        int i10 = this.f29690b;
        if (isEmpty && getVisibility() != 8) {
            NotificationCenter.getInstance(i10).removeDelayed(zzVar);
            NotificationCenter.getInstance(i10).doOnIdle(zzVar);
        } else if (!arrayList.isEmpty() && getVisibility() != 0) {
            NotificationCenter.getInstance(i10).removeDelayed(zzVar);
            setVisibility(0);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f29689a) {
            case 0:
                zf.z zVar = (zf.z) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f29691c;
                int i10 = this.f29690b;
                zVar.b(org.telegram.ui.ActionBar.g6.m1(0.5f, org.telegram.ui.ActionBar.g6.w0(i10, c6Var)));
                zVar.draw(canvas);
                zf.z zVar2 = (zf.z) this.e;
                zVar2.b(org.telegram.ui.ActionBar.g6.m1(0.95f, org.telegram.ui.ActionBar.g6.w0(i10, c6Var)));
                zVar2.draw(canvas);
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f29691c;
                if (!arrayList.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ((org.telegram.ui.hi0) arrayList.get(i11)).a(canvas);
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f29689a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                int i14 = AndroidUtilities.statusBarHeight;
                zf.z zVar = (zf.z) this.d;
                zVar.c(AndroidUtilities.dp(12.0f) + i14, 0);
                zVar.setBounds(0, 0, i10, AndroidUtilities.dp(52.0f) + i14);
                zf.z zVar2 = (zf.z) this.e;
                zVar2.c(i14 / 3, 0);
                zVar2.setBounds(0, 0, i10, i14);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    public ui(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.d = new zf.z(2);
        this.e = new zf.z(2);
        this.f29691c = c6Var;
        this.f29690b = i10;
    }
}
