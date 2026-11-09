package org.telegram.ui.Components;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public abstract class vf extends zs {
    public pc Y1;
    public final ChatActivityEnterView Z1;

    public vf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.Z1 = chatActivityEnterView;
    }

    @Override
    public final void D() {
        wf wfVar = this.Z1.Z2;
        if (wfVar != null) {
            wfVar.T1();
        }
    }

    @Override
    public final void E() {
        wf wfVar = this.Z1.Z2;
        if (wfVar != null) {
            wfVar.b();
        }
    }

    public final void I(Uri uri, String str) {
        boolean z9;
        org.telegram.ui.cn cnVar = this.Z1.P2;
        if (cnVar != null && cnVar.z()) {
            z9 = true;
        } else {
            z9 = false;
        }
        Utilities.f21336e.c(new l2.z0(this, uri, org.telegram.messenger.g0.q0(MimeTypeMap.getSingleton().getExtensionFromMimeType(str), z9), 28));
    }

    public final void J(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        org.telegram.ui.cn cnVar = chatActivityEnterView.P2;
        if (cnVar != null && cnVar.getParentActivity() != null) {
            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) arrayList.get(0);
            if (chatActivityEnterView.f31168z2) {
                org.telegram.messenger.g0.v1(this);
                org.telegram.messenger.g0.i3(new a9.h(this, arrayList, file, false, 9), 100L);
                return;
            }
            PhotoViewer.p1().H2(null, cnVar, chatActivityEnterView.W3);
            PhotoViewer.p1().e2(arrayList, 0, 2, false, new uf(this, gfVar, file), chatActivityEnterView.P2);
        }
    }

    public final void K(rt rtVar, boolean z9, int i7, int i10) {
        org.telegram.messenger.ij threadMessage;
        org.telegram.messenger.ij threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        org.telegram.ui.cn cnVar = chatActivityEnterView.P2;
        ue ueVar = chatActivityEnterView.L0;
        org.telegram.messenger.hw hwVar = null;
        if (ueVar != null) {
            ueVar.g(true);
            chatActivityEnterView.L0 = null;
        }
        org.telegram.ui.sm smVar = chatActivityEnterView.V2;
        if (smVar != null && cnVar != null && smVar.f49947f) {
            cnVar.xc();
            return;
        }
        t0.h hVar = (t0.h) rtVar.f37805b;
        if (hVar.getDescription().hasMimeType("image/gif")) {
            org.telegram.messenger.c cVar = chatActivityEnterView.R;
            Uri c10 = hVar.c();
            long j3 = chatActivityEnterView.Q2;
            org.telegram.messenger.ij ijVar = chatActivityEnterView.T2;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.sm smVar2 = chatActivityEnterView.V2;
            if (cnVar != null) {
                hwVar = cnVar.X8();
            }
            org.telegram.messenger.gz.T(cVar, null, null, c10, null, "image/gif", j3, ijVar, threadMessage2, null, smVar2, z9, rtVar, hwVar);
        } else {
            org.telegram.messenger.c cVar2 = chatActivityEnterView.R;
            Uri c11 = hVar.c();
            long j10 = chatActivityEnterView.Q2;
            org.telegram.messenger.ij ijVar2 = chatActivityEnterView.T2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            if (cnVar != null) {
                hwVar = cnVar.X8();
            }
            org.telegram.messenger.gz.Y(cVar2, c11, j10, ijVar2, threadMessage, rtVar, null, z9, 0, hwVar);
        }
        wf wfVar = chatActivityEnterView.Z2;
        if (wfVar != null) {
            wfVar.F(null, true, i7, i10, 0L);
        }
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vf.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourcesProvider() {
        return this.Z1.W3;
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        org.telegram.ui.cn cnVar = chatActivityEnterView.P2;
        if (cnVar != null) {
            cnVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.e0(menu);
        }
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        boolean z9;
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        try {
            int i7 = ChatActivityEnterView.s5;
            if (chatActivityEnterView.f31028b2 != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9 && !chatActivityEnterView.f31113p5) {
                t0.b.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.f.a(onCreateInputConnection, editorInfo, new u(this, 18));
            }
            t0.b.b(editorInfo, null);
            return t0.f.a(onCreateInputConnection, editorInfo, new u(this, 18));
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            return onCreateInputConnection;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        boolean z9;
        boolean z10;
        boolean z11 = true;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        chatActivityEnterView.S = z9;
        super.onMeasure(i7, i10);
        if (chatActivityEnterView.S) {
            chatActivityEnterView.T = getLineCount();
            if (chatActivityEnterView.T > 2 && !TextUtils.isEmpty(getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.p1(z10);
            if (chatActivityEnterView.T <= 2 || TextUtils.isEmpty(getText().toString().trim())) {
                z11 = false;
            }
            chatActivityEnterView.v1(z11);
        }
        chatActivityEnterView.S = false;
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        wf wfVar = this.Z1.Z2;
        if (wfVar != null) {
            wfVar.j0();
        }
    }

    @Override
    public final void onSelectionChanged(int i7, int i10) {
        boolean z9;
        l60 l60Var;
        xe xeVar;
        super.onSelectionChanged(i7, i10);
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        wf wfVar = chatActivityEnterView.Z2;
        if (wfVar != null) {
            wfVar.E();
        }
        wd wdVar = chatActivityEnterView.Q0;
        if (wdVar != null) {
            if (chatActivityEnterView.P2 != null && (xeVar = chatActivityEnterView.E0) != null && xeVar.getSelectionEnd() != chatActivityEnterView.E0.getSelectionStart()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (wdVar.f35009x != z9) {
                wdVar.f35009x = z9;
                wdVar.invalidate();
            }
            if (!z9 && (l60Var = chatActivityEnterView.Y4) != null) {
                l60Var.u();
                chatActivityEnterView.Y4 = null;
            }
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i7) {
        if (i7 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.Z1;
            chatActivityEnterView.X1 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.f31028b2 == null) {
                I(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i7);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        if (!chatActivityEnterView.E3 && chatActivityEnterView.B3 == null) {
            if (!chatActivityEnterView.f31166z0 && !chatActivityEnterView.q0()) {
                if (this.Y1 == null) {
                    pc pcVar = new pc(this);
                    this.Y1 = pcVar;
                    pcVar.h = new Runnable(this) {
                        public final vf f38394b;

                        {
                            this.f38394b = this;
                        }

                        @Override
                        public final void run() {
                            int i10 = r2;
                            vf vfVar = this.f38394b;
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = vfVar.Z1;
                                    int i11 = ChatActivityEnterView.s5;
                                    chatActivityEnterView2.u1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = vfVar.Z1;
                                    chatActivityEnterView3.f31089l3 = false;
                                    chatActivityEnterView3.I0();
                                    return;
                            }
                        }
                    };
                }
                pc pcVar2 = this.Y1;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                pcVar2.getClass();
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = 0;
                rectF.set(f10, f10, measuredWidth, measuredHeight);
                pcVar2.f36979i = false;
                pcVar2.f36975c = 0;
                pcVar2.a(rectF);
                return this.Y1.b(motionEvent);
            } else if (chatActivityEnterView.s0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.m1(0, false);
                    chatActivityEnterView.U0.t(false);
                    requestFocus();
                }
                if (org.telegram.messenger.g0.D) {
                    i7 = 0;
                } else {
                    i7 = 2;
                }
                chatActivityEnterView.t1(i7, 0, true, true);
                if (chatActivityEnterView.f31169z3) {
                    chatActivityEnterView.n1(false, true, false, true);
                    chatActivityEnterView.f31089l3 = true;
                    org.telegram.messenger.g0.i3(new Runnable(this) {
                        public final vf f38394b;

                        {
                            this.f38394b = this;
                        }

                        @Override
                        public final void run() {
                            int i10 = r2;
                            vf vfVar = this.f38394b;
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = vfVar.Z1;
                                    int i11 = ChatActivityEnterView.s5;
                                    chatActivityEnterView2.u1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = vfVar.Z1;
                                    chatActivityEnterView3.f31089l3 = false;
                                    chatActivityEnterView3.I0();
                                    return;
                            }
                        }
                    }, 200L);
                    return true;
                }
                chatActivityEnterView.I0();
                return true;
            } else {
                try {
                    return super.onTouchEvent(motionEvent);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean requestFocus(int i7, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        if (!chatActivityEnterView.f31166z0 && !chatActivityEnterView.q0()) {
            return false;
        }
        chatActivityEnterView.getClass();
        return super.requestFocus(i7, rect);
    }

    @Override
    public final boolean requestRectangleOnScreen(Rect rect) {
        rect.bottom = org.telegram.messenger.g0.L(1000.0f) + rect.bottom;
        return super.requestRectangleOnScreen(rect);
    }

    @Override
    public void setOffsetY(float f10) {
        super.setOffsetY(f10);
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        if (chatActivityEnterView.f31092m1.getForeground() != null) {
            tt0 tt0Var = chatActivityEnterView.f31092m1;
            tt0Var.invalidateDrawable(tt0Var.getForeground());
        }
    }
}
