package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLContext;
import org.telegram.messenger.AndroidUtilities;
public final class ga {
    public int f28848a;
    public final View f28849b;
    public final ArrayList f28850c;
    public final ArrayList d;
    public final ArrayList f28851e;
    public final Object f28852f;
    public EGLContext f28853g;
    public final Object h;
    public int f28854i;
    public nh.ta f28855j;
    public Object f28856k;
    public Object f28857l;
    public ma f28858m;
    public final la f28859n;
    public Bitmap f28860o;
    public int f28861p;

    public ga(View view) {
        ArrayList arrayList = new ArrayList();
        this.f28850c = arrayList;
        this.d = new ArrayList();
        this.f28851e = new ArrayList();
        this.f28852f = new Object();
        this.h = new Object();
        this.f28859n = new la(0, new ig(this, 14));
        this.f28861p = 0;
        this.f28849b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new df.b(this, 9));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f28852f) {
            try {
                if (this.f28853g == null) {
                    this.f28853g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        ma maVar = this.f28858m;
        if (maVar == null) {
            return this.f28860o;
        }
        synchronized (maVar.f30620n) {
            try {
                if (!maVar.f30623q) {
                    bitmap = null;
                } else {
                    bitmap = maVar.f30622p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f28860o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f28857l != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((ka) obj).f29977b.invalidate();
        }
        ArrayList arrayList2 = this.f28851e;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        ma maVar = this.f28858m;
        if (maVar != null) {
            synchronized (maVar.f30620n) {
                maVar.f30623q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f28861p;
        this.f28861p = i10 + 1;
        sb2.append(i10);
        this.f28860o = this.f28859n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(nh.ta taVar, Object obj) {
        this.f28855j = taVar;
        this.f28856k = obj;
        this.f28854i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f28857l = renderNode2;
            return;
        }
        this.f28857l = null;
    }
}
