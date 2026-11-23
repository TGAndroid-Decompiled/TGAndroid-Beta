package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class om extends View {
    public final ArrayList f50714a;
    public final ArrayList f50715b;
    public final bn f50716c;

    public om(bn bnVar, Context context) {
        super(context);
        this.f50716c = bnVar;
        this.f50714a = new ArrayList();
        this.f50715b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f50714a;
        arrayList.clear();
        bn bnVar = this.f50716c;
        arrayList.add(bnVar.Z1);
        arrayList.add(bnVar.A0);
        arrayList.add(bnVar.Z);
        arrayList.add(bnVar.Z3);
        arrayList.add(bnVar.X1);
        arrayList.add(bnVar.f46281m3);
        arrayList.add(bnVar.f46118a0);
        arrayList.add(bnVar.f46432y1);
        arrayList.add(bnVar.U);
        arrayList.add(bnVar.f46202g2);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bn bnVar = this.f50716c;
        bnVar.Zc = true;
        ArrayList arrayList = this.f50715b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        bnVar.Zc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        bn bnVar = this.f50716c;
        bnVar.Zc = true;
        ArrayList arrayList = this.f50714a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f50715b.add(view);
            }
        }
        bnVar.Zc = false;
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        a();
        ArrayList arrayList = this.f50714a;
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
