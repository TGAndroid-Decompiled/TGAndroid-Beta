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
public abstract class rf extends mt {
    public jc Y1;
    public final ChatActivityEnterView Z1;

    public rf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.Z1 = chatActivityEnterView;
    }

    @Override
    public final void D() {
        sf sfVar = this.Z1.Z2;
        if (sfVar != null) {
            sfVar.O1();
        }
    }

    @Override
    public final void E() {
        sf sfVar = this.Z1.Z2;
        if (sfVar != null) {
            sfVar.k();
        }
    }

    public final void I(Uri uri, String str) {
        boolean z10;
        org.telegram.ui.un unVar = this.Z1.P2;
        if (unVar != null && unVar.A()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Utilities.e.c(new li.s(this, uri, org.telegram.messenger.i0.q0(MimeTypeMap.getSingleton().getExtensionFromMimeType(str), z10), 28));
    }

    public final void J(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        if (unVar != null && unVar.getParentActivity() != null) {
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) arrayList.get(0);
            if (chatActivityEnterView.f23823z2) {
                org.telegram.messenger.i0.v1(this);
                org.telegram.messenger.i0.h3(new c5.w(this, arrayList, file, false, 7), 100L);
                return;
            }
            PhotoViewer.v1().N2(null, unVar, chatActivityEnterView.W3);
            PhotoViewer.v1().j2(arrayList, 0, 2, false, new qf(this, ffVar, file), chatActivityEnterView.P2);
        }
    }

    public final void K(m2.t tVar, boolean z10, int i10, int i11) {
        org.telegram.messenger.kj threadMessage;
        org.telegram.messenger.kj threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        pe peVar = chatActivityEnterView.L0;
        org.telegram.messenger.tw twVar = null;
        if (peVar != null) {
            peVar.g(true);
            chatActivityEnterView.L0 = null;
        }
        org.telegram.ui.kn knVar = chatActivityEnterView.V2;
        if (knVar != null && unVar != null && knVar.f38934f) {
            unVar.pc();
            return;
        }
        t0.h hVar = (t0.h) tVar.f12685b;
        if (hVar.getDescription().hasMimeType("image/gif")) {
            org.telegram.messenger.c cVar = chatActivityEnterView.R;
            Uri a2 = hVar.a();
            long j10 = chatActivityEnterView.Q2;
            org.telegram.messenger.kj kjVar = chatActivityEnterView.T2;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.kn knVar2 = chatActivityEnterView.V2;
            if (unVar != null) {
                twVar = unVar.T8();
            }
            org.telegram.messenger.rz.T(cVar, null, null, a2, null, "image/gif", j10, kjVar, threadMessage2, null, knVar2, z10, tVar, twVar);
        } else {
            org.telegram.messenger.c cVar2 = chatActivityEnterView.R;
            Uri a10 = hVar.a();
            long j11 = chatActivityEnterView.Q2;
            org.telegram.messenger.kj kjVar2 = chatActivityEnterView.T2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            if (unVar != null) {
                twVar = unVar.T8();
            }
            org.telegram.messenger.rz.Y(cVar2, a10, j11, kjVar2, threadMessage, tVar, null, z10, 0, twVar);
        }
        sf sfVar = chatActivityEnterView.Z2;
        if (sfVar != null) {
            sfVar.E(null, true, i10, i11, 0L);
        }
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rf.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final org.telegram.ui.ActionBar.p6 getResourcesProvider() {
        return this.Z1.W3;
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        if (unVar != null) {
            unVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.d0(menu);
        }
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        try {
            int i10 = ChatActivityEnterView.f23673s5;
            if (chatActivityEnterView.f23683b2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !chatActivityEnterView.p5) {
                t0.b.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.f.a(onCreateInputConnection, editorInfo, new t(this, 18));
            }
            t0.b.b(editorInfo, null);
            return t0.f.a(onCreateInputConnection, editorInfo, new t(this, 18));
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
            return onCreateInputConnection;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        chatActivityEnterView.S = z10;
        super.onMeasure(i10, i11);
        if (chatActivityEnterView.S) {
            chatActivityEnterView.T = getLineCount();
            if (chatActivityEnterView.T > 2 && !TextUtils.isEmpty(getText().toString().trim())) {
                z11 = true;
            } else {
                z11 = false;
            }
            chatActivityEnterView.n1(z11);
            if (chatActivityEnterView.T <= 2 || TextUtils.isEmpty(getText().toString().trim())) {
                z12 = false;
            }
            chatActivityEnterView.t1(z12);
        }
        chatActivityEnterView.S = false;
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        sf sfVar = this.Z1.Z2;
        if (sfVar != null) {
            sfVar.X();
        }
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        boolean z10;
        z60 z60Var;
        se seVar;
        super.onSelectionChanged(i10, i11);
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        sf sfVar = chatActivityEnterView.Z2;
        if (sfVar != null) {
            sfVar.D();
        }
        rd rdVar = chatActivityEnterView.Q0;
        if (rdVar != null) {
            if (chatActivityEnterView.P2 != null && (seVar = chatActivityEnterView.E0) != null && seVar.getSelectionEnd() != chatActivityEnterView.E0.getSelectionStart()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (rdVar.f26156x != z10) {
                rdVar.f26156x = z10;
                rdVar.invalidate();
            }
            if (!z10 && (z60Var = chatActivityEnterView.Y4) != null) {
                z60Var.u();
                chatActivityEnterView.Y4 = null;
            }
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.Z1;
            chatActivityEnterView.X1 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.f23683b2 == null) {
                I(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        if (!chatActivityEnterView.E3 && chatActivityEnterView.B3 == null) {
            if (!chatActivityEnterView.f23821z0 && !chatActivityEnterView.o0()) {
                if (this.Y1 == null) {
                    jc jcVar = new jc(this);
                    this.Y1 = jcVar;
                    jcVar.h = new Runnable(this) {
                        public final rf f29417b;

                        {
                            this.f29417b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r2;
                            rf rfVar = this.f29417b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = rfVar.Z1;
                                    int i12 = ChatActivityEnterView.f23673s5;
                                    chatActivityEnterView2.s1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = rfVar.Z1;
                                    chatActivityEnterView3.f23745l3 = false;
                                    chatActivityEnterView3.G0();
                                    return;
                            }
                        }
                    };
                }
                jc jcVar2 = this.Y1;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                jcVar2.getClass();
                RectF rectF = org.telegram.messenger.i0.P;
                float f7 = 0;
                rectF.set(f7, f7, measuredWidth, measuredHeight);
                jcVar2.f27363i = false;
                jcVar2.f27360c = 0;
                jcVar2.a(rectF);
                return this.Y1.b(motionEvent);
            } else if (chatActivityEnterView.q0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.k1(0, false);
                    chatActivityEnterView.U0.t(false);
                    requestFocus();
                }
                if (org.telegram.messenger.i0.D) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                chatActivityEnterView.r1(i10, 0, true, true);
                if (chatActivityEnterView.f23824z3) {
                    chatActivityEnterView.l1(false, true, false, true);
                    chatActivityEnterView.f23745l3 = true;
                    org.telegram.messenger.i0.h3(new Runnable(this) {
                        public final rf f29417b;

                        {
                            this.f29417b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r2;
                            rf rfVar = this.f29417b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = rfVar.Z1;
                                    int i12 = ChatActivityEnterView.f23673s5;
                                    chatActivityEnterView2.s1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = rfVar.Z1;
                                    chatActivityEnterView3.f23745l3 = false;
                                    chatActivityEnterView3.G0();
                                    return;
                            }
                        }
                    }, 200L);
                    return true;
                }
                chatActivityEnterView.G0();
                return true;
            } else {
                try {
                    return super.onTouchEvent(motionEvent);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean requestFocus(int i10, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        if (!chatActivityEnterView.f23821z0 && !chatActivityEnterView.o0()) {
            return false;
        }
        chatActivityEnterView.getClass();
        return super.requestFocus(i10, rect);
    }

    @Override
    public final boolean requestRectangleOnScreen(Rect rect) {
        rect.bottom = org.telegram.messenger.i0.L(1000.0f) + rect.bottom;
        return super.requestRectangleOnScreen(rect);
    }

    @Override
    public void setOffsetY(float f7) {
        super.setOffsetY(f7);
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        if (chatActivityEnterView.f23747m1.getForeground() != null) {
            vu0 vu0Var = chatActivityEnterView.f23747m1;
            vu0Var.invalidateDrawable(vu0Var.getForeground());
        }
    }
}
