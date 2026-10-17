package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class gn extends View {
    public final ArrayList f37272a;
    public final ArrayList f37273b;
    public final sn f37274c;

    public gn(sn snVar, Context context) {
        super(context);
        this.f37274c = snVar;
        this.f37272a = new ArrayList();
        this.f37273b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f37272a;
        arrayList.clear();
        sn snVar = this.f37274c;
        arrayList.add(snVar.K1);
        arrayList.add(snVar.f41433x0);
        arrayList.add(snVar.X);
        arrayList.add(snVar.K3);
        arrayList.add(snVar.I1);
        arrayList.add(snVar.X2);
        arrayList.add(snVar.Y);
        arrayList.add(snVar.f41257j1);
        arrayList.add(snVar.S);
        arrayList.add(snVar.R1);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        sn snVar = this.f37274c;
        snVar.f41366rc = true;
        ArrayList arrayList = this.f37273b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        snVar.f41366rc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        sn snVar = this.f37274c;
        snVar.f41366rc = true;
        ArrayList arrayList = this.f37272a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f37273b.add(view);
            }
        }
        snVar.f41366rc = false;
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        a();
        ArrayList arrayList = this.f37272a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view != null) {
                view.setTranslationX(f7);
            }
        }
    }
}
