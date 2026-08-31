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
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public abstract class dg extends xt {
    public xc f26264c;
    public final ChatActivityEnterView d;

    public dg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.d = chatActivityEnterView;
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dg.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
        if (xnVar != null) {
            xnVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.h0(menu);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourcesProvider() {
        return this.d.S3;
    }

    public final void m(Uri uri, String str) {
        boolean z4;
        org.telegram.ui.xn xnVar = this.d.L2;
        if (xnVar != null && xnVar.w()) {
            z4 = true;
        } else {
            z4 = false;
        }
        Utilities.globalQueue.postRunnable(new mh.p6(this, uri, AndroidUtilities.generatePicturePath(z4, MimeTypeMap.getSingleton().getExtensionFromMimeType(str)), 26));
    }

    public final void n(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
        if (xnVar != null && xnVar.getParentActivity() != null) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(0);
            if (chatActivityEnterView.f24689v2) {
                AndroidUtilities.hideKeyboard(this);
                AndroidUtilities.runOnUIThread(new com.google.android.gms.common.api.internal.s1(this, arrayList, file, 8), 100L);
                return;
            }
            PhotoViewer.t1().K2(null, xnVar, chatActivityEnterView.S3);
            PhotoViewer.t1().f2(arrayList, 0, 2, false, new cg(this, photoEntry, file), chatActivityEnterView.L2);
        }
    }

    public final void o(t0.i iVar, boolean z4, int i10, int i11) {
        MessageObject threadMessage;
        int i12;
        MessageObject threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
        cf cfVar = chatActivityEnterView.I0;
        SendMessageChatArguments sendMessageChatArguments = null;
        if (cfVar != null) {
            cfVar.h(true);
            chatActivityEnterView.I0 = null;
        }
        org.telegram.ui.nn nnVar = chatActivityEnterView.R2;
        if (nnVar != null && xnVar != null && nnVar.f39488f) {
            xnVar.Rb();
            return;
        }
        t0.h hVar = iVar.f47829a;
        if (hVar.getDescription().hasMimeType("image/gif")) {
            AccountInstance accountInstance = chatActivityEnterView.O;
            Uri a2 = hVar.a();
            long j10 = chatActivityEnterView.M2;
            MessageObject messageObject = chatActivityEnterView.P2;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.nn nnVar2 = chatActivityEnterView.R2;
            if (xnVar != null) {
                sendMessageChatArguments = xnVar.C8();
            }
            SendMessagesHelper.prepareSendingDocument(accountInstance, null, null, a2, null, "image/gif", j10, messageObject, threadMessage2, null, nnVar2, null, z4, 0, iVar, sendMessageChatArguments, false);
        } else {
            AccountInstance accountInstance2 = chatActivityEnterView.O;
            Uri a10 = hVar.a();
            long j11 = chatActivityEnterView.M2;
            MessageObject messageObject2 = chatActivityEnterView.P2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.nn nnVar3 = chatActivityEnterView.R2;
            if (xnVar == null) {
                i12 = 0;
            } else {
                i12 = xnVar.O3;
            }
            if (xnVar != null) {
                sendMessageChatArguments = xnVar.C8();
            }
            SendMessagesHelper.prepareSendingPhoto(accountInstance2, null, a10, j11, messageObject2, threadMessage, nnVar3, null, null, null, iVar, 0, null, z4, 0, i12, sendMessageChatArguments);
        }
        eg egVar = chatActivityEnterView.V2;
        if (egVar != null) {
            egVar.C(null, true, i10, i11, 0L);
        }
    }

    @Override
    public final void onContextMenuClose() {
        eg egVar = this.d.V2;
        if (egVar != null) {
            egVar.n2();
        }
    }

    @Override
    public final void onContextMenuOpen() {
        eg egVar = this.d.V2;
        if (egVar != null) {
            egVar.h();
        }
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        boolean z4;
        ChatActivityEnterView chatActivityEnterView = this.d;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        try {
            int i10 = ChatActivityEnterView.f24568j5;
            if (chatActivityEnterView.X1 != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4 && !chatActivityEnterView.f24619h5) {
                t0.b.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.f.a(onCreateInputConnection, editorInfo, new t(this, 18));
            }
            t0.b.b(editorInfo, null);
            return t0.f.a(onCreateInputConnection, editorInfo, new t(this, 18));
        } catch (Throwable th2) {
            FileLog.e(th2);
            return onCreateInputConnection;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        boolean z4;
        boolean z10;
        boolean z11 = true;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        ChatActivityEnterView chatActivityEnterView = this.d;
        chatActivityEnterView.P = z4;
        super.onMeasure(i10, i11);
        if (chatActivityEnterView.P) {
            chatActivityEnterView.Q = getLineCount();
            if (chatActivityEnterView.Q > 2 && !TextUtils.isEmpty(getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.p1(z10);
            chatActivityEnterView.v1((chatActivityEnterView.Q <= 2 || TextUtils.isEmpty(getText().toString().trim())) ? false : false);
        }
        chatActivityEnterView.P = false;
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        eg egVar = this.d.V2;
        if (egVar != null) {
            egVar.o0();
        }
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        eg egVar = this.d.V2;
        if (egVar != null) {
            egVar.J0(i10, i11);
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.d;
            chatActivityEnterView.T1 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.X1 == null) {
                m(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.A3 && chatActivityEnterView.f24702x3 == null) {
            if (!chatActivityEnterView.f24693w0 && !chatActivityEnterView.r0()) {
                if (this.f26264c == null) {
                    xc xcVar = new xc(this);
                    this.f26264c = xcVar;
                    xcVar.h = new Runnable(this) {
                        public final dg f25589b;

                        {
                            this.f25589b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r2;
                            dg dgVar = this.f25589b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = dgVar.d;
                                    int i12 = ChatActivityEnterView.f24568j5;
                                    chatActivityEnterView2.u1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = dgVar.d;
                                    chatActivityEnterView3.f24617h3 = false;
                                    chatActivityEnterView3.I0();
                                    return;
                            }
                        }
                    };
                }
                xc xcVar2 = this.f26264c;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                xcVar2.getClass();
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = 0;
                rectF.set(f10, f10, measuredWidth, measuredHeight);
                xcVar2.f33029i = false;
                xcVar2.f33025c = 0;
                xcVar2.a(rectF);
                return this.f26264c.b(motionEvent);
            } else if (chatActivityEnterView.t0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.N1 != 0) {
                    chatActivityEnterView.m1(0, false);
                    chatActivityEnterView.R0.t(false);
                    requestFocus();
                }
                if (AndroidUtilities.usingHardwareInput) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                chatActivityEnterView.t1(i10, 0, true, true);
                if (chatActivityEnterView.f24690v3) {
                    chatActivityEnterView.n1(false, true, false, true);
                    chatActivityEnterView.f24617h3 = true;
                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                        public final dg f25589b;

                        {
                            this.f25589b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r2;
                            dg dgVar = this.f25589b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = dgVar.d;
                                    int i12 = ChatActivityEnterView.f24568j5;
                                    chatActivityEnterView2.u1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = dgVar.d;
                                    chatActivityEnterView3.f24617h3 = false;
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
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean requestFocus(int i10, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f24693w0 && !chatActivityEnterView.r0()) {
            return false;
        }
        chatActivityEnterView.getClass();
        return super.requestFocus(i10, rect);
    }

    @Override
    public final boolean requestRectangleOnScreen(Rect rect) {
        rect.bottom = AndroidUtilities.dp(1000.0f) + rect.bottom;
        return super.requestRectangleOnScreen(rect);
    }

    @Override
    public void setOffsetY(float f10) {
        super.setOffsetY(f10);
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (chatActivityEnterView.f24621i1.getForeground() != null) {
            qv0 qv0Var = chatActivityEnterView.f24621i1;
            qv0Var.invalidateDrawable(qv0Var.getForeground());
        }
    }
}
