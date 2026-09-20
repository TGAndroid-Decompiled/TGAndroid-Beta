package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class nn extends View {
    public final ArrayList f36060a;
    public final ArrayList f36061b;
    public final zn f36062c;

    public nn(zn znVar, Context context) {
        super(context);
        this.f36062c = znVar;
        this.f36060a = new ArrayList();
        this.f36061b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f36060a;
        arrayList.clear();
        zn znVar = this.f36062c;
        arrayList.add(znVar.K1);
        arrayList.add(znVar.f40530x0);
        arrayList.add(znVar.X);
        arrayList.add(znVar.K3);
        arrayList.add(znVar.I1);
        arrayList.add(znVar.X2);
        arrayList.add(znVar.Y);
        arrayList.add(znVar.f40356j1);
        arrayList.add(znVar.S);
        arrayList.add(znVar.R1);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zn znVar = this.f36062c;
        znVar.f40450qc = true;
        ArrayList arrayList = this.f36061b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        znVar.f40450qc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        zn znVar = this.f36062c;
        znVar.f40450qc = true;
        ArrayList arrayList = this.f36060a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f36061b.add(view);
            }
        }
        znVar.f40450qc = false;
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        a();
        ArrayList arrayList = this.f36060a;
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
