package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class pm extends View {
    public final ArrayList f48748a;
    public final ArrayList f48749b;
    public final cn f48750c;

    public pm(cn cnVar, Context context) {
        super(context);
        this.f48750c = cnVar;
        this.f48748a = new ArrayList();
        this.f48749b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f48748a;
        arrayList.clear();
        cn cnVar = this.f48750c;
        arrayList.add(cnVar.Y1);
        arrayList.add(cnVar.f44700z0);
        arrayList.add(cnVar.Y);
        arrayList.add(cnVar.Y3);
        arrayList.add(cnVar.W1);
        arrayList.add(cnVar.f44526l3);
        arrayList.add(cnVar.Z);
        arrayList.add(cnVar.f44676x1);
        arrayList.add(cnVar.T);
        arrayList.add(cnVar.f44449f2);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cn cnVar = this.f48750c;
        cnVar.Xc = true;
        ArrayList arrayList = this.f48749b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        cnVar.Xc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        cn cnVar = this.f48750c;
        cnVar.Xc = true;
        ArrayList arrayList = this.f48748a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f48749b.add(view);
            }
        }
        cnVar.Xc = false;
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        a();
        ArrayList arrayList = this.f48748a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            View view = (View) obj;
            if (view != null) {
                view.setTranslationX(f10);
            }
        }
    }
}
