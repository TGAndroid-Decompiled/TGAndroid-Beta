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
public abstract class ng extends cu {
    public fd f26726c;
    public final ChatActivityEnterView d;

    public ng(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.d = chatActivityEnterView;
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ng.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
        if (wnVar != null) {
            wnVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.h0(menu);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourcesProvider() {
        return this.d.W3;
    }

    public final void m(Uri uri, String str) {
        boolean z10;
        org.telegram.ui.wn wnVar = this.d.P2;
        if (wnVar != null && wnVar.v()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Utilities.globalQueue.postRunnable(new org.telegram.messenger.video.o(this, uri, AndroidUtilities.generatePicturePath(z10, MimeTypeMap.getSingleton().getExtensionFromMimeType(str)), 12));
    }

    public final void n(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
        if (wnVar != null && wnVar.getParentActivity() != null) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(0);
            if (chatActivityEnterView.f22098z2) {
                AndroidUtilities.hideKeyboard(this);
                AndroidUtilities.runOnUIThread(new c5.v(this, arrayList, file, false, 9), 100L);
                return;
            }
            PhotoViewer.t1().J2(null, wnVar, chatActivityEnterView.W3);
            PhotoViewer.t1().f2(arrayList, 0, 2, false, new mg(this, photoEntry, file), chatActivityEnterView.P2);
        }
    }

    public final void o(t0.i iVar, boolean z10, int i10, int i11) {
        MessageObject threadMessage;
        int i12;
        MessageObject threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
        nf nfVar = chatActivityEnterView.L0;
        SendMessageChatArguments sendMessageChatArguments = null;
        if (nfVar != null) {
            nfVar.h(true);
            chatActivityEnterView.L0 = null;
        }
        org.telegram.ui.mn mnVar = chatActivityEnterView.V2;
        if (mnVar != null && wnVar != null && mnVar.f35628f) {
            wnVar.Rb();
            return;
        }
        t0.h hVar = iVar.f43289a;
        if (hVar.getDescription().hasMimeType("image/gif")) {
            AccountInstance accountInstance = chatActivityEnterView.R;
            Uri c10 = hVar.c();
            long j3 = chatActivityEnterView.Q2;
            MessageObject messageObject = chatActivityEnterView.T2;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.mn mnVar2 = chatActivityEnterView.V2;
            if (wnVar != null) {
                sendMessageChatArguments = wnVar.C8();
            }
            SendMessagesHelper.prepareSendingDocument(accountInstance, null, null, c10, null, "image/gif", j3, messageObject, threadMessage2, null, mnVar2, null, z10, 0, iVar, sendMessageChatArguments, false);
        } else {
            AccountInstance accountInstance2 = chatActivityEnterView.R;
            Uri c11 = hVar.c();
            long j10 = chatActivityEnterView.Q2;
            MessageObject messageObject2 = chatActivityEnterView.T2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.mn mnVar3 = chatActivityEnterView.V2;
            if (wnVar == null) {
                i12 = 0;
            } else {
                i12 = wnVar.R3;
            }
            if (wnVar != null) {
                sendMessageChatArguments = wnVar.C8();
            }
            SendMessagesHelper.prepareSendingPhoto(accountInstance2, null, c11, j10, messageObject2, threadMessage, mnVar3, null, null, null, iVar, 0, null, z10, 0, i12, sendMessageChatArguments);
        }
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.H(null, true, i10, i11, 0L);
        }
    }

    @Override
    public final void onContextMenuClose() {
        og ogVar = this.d.Z2;
        if (ogVar != null) {
            ogVar.d2();
        }
    }

    @Override
    public final void onContextMenuOpen() {
        og ogVar = this.d.Z2;
        if (ogVar != null) {
            ogVar.l();
        }
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.d;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        try {
            int i10 = ChatActivityEnterView.f21953n5;
            if (chatActivityEnterView.f21963b2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !chatActivityEnterView.f22025l5) {
                t0.b.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.f.a(onCreateInputConnection, editorInfo, new s(this, 18));
            }
            t0.b.b(editorInfo, null);
            return t0.f.a(onCreateInputConnection, editorInfo, new s(this, 18));
        } catch (Throwable th2) {
            FileLog.e(th2);
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
        ChatActivityEnterView chatActivityEnterView = this.d;
        chatActivityEnterView.S = z10;
        super.onMeasure(i10, i11);
        if (chatActivityEnterView.S) {
            chatActivityEnterView.T = getLineCount();
            if (chatActivityEnterView.T > 2 && !TextUtils.isEmpty(getText().toString().trim())) {
                z11 = true;
            } else {
                z11 = false;
            }
            chatActivityEnterView.p1(z11);
            chatActivityEnterView.v1((chatActivityEnterView.T <= 2 || TextUtils.isEmpty(getText().toString().trim())) ? false : false);
        }
        chatActivityEnterView.S = false;
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        og ogVar = this.d.Z2;
        if (ogVar != null) {
            ogVar.m0();
        }
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        og ogVar = this.d.Z2;
        if (ogVar != null) {
            ogVar.E0(i10, i11);
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.d;
            chatActivityEnterView.X1 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.f21963b2 == null) {
                m(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.E3 && chatActivityEnterView.B3 == null) {
            if (!chatActivityEnterView.f22096z0 && !chatActivityEnterView.r0()) {
                if (this.f26726c == null) {
                    fd fdVar = new fd(this);
                    this.f26726c = fdVar;
                    fdVar.h = new Runnable(this) {
                        public final ng f26091b;

                        {
                            this.f26091b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r2;
                            ng ngVar = this.f26091b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = ngVar.d;
                                    int i12 = ChatActivityEnterView.f21953n5;
                                    chatActivityEnterView2.u1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = ngVar.d;
                                    chatActivityEnterView3.f22024l3 = false;
                                    chatActivityEnterView3.I0();
                                    return;
                            }
                        }
                    };
                }
                fd fdVar2 = this.f26726c;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                fdVar2.getClass();
                RectF rectF = AndroidUtilities.rectTmp;
                float f7 = 0;
                rectF.set(f7, f7, measuredWidth, measuredHeight);
                fdVar2.f24156i = false;
                fdVar2.f24153c = 0;
                fdVar2.a(rectF);
                return this.f26726c.b(motionEvent);
            } else if (chatActivityEnterView.t0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.m1(0, false);
                    chatActivityEnterView.U0.t(false);
                    requestFocus();
                }
                if (AndroidUtilities.usingHardwareInput) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                chatActivityEnterView.t1(i10, 0, true, true);
                if (chatActivityEnterView.f22099z3) {
                    chatActivityEnterView.n1(false, true, false, true);
                    chatActivityEnterView.f22024l3 = true;
                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                        public final ng f26091b;

                        {
                            this.f26091b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r2;
                            ng ngVar = this.f26091b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = ngVar.d;
                                    int i12 = ChatActivityEnterView.f21953n5;
                                    chatActivityEnterView2.u1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = ngVar.d;
                                    chatActivityEnterView3.f22024l3 = false;
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
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean requestFocus(int i10, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f22096z0 && !chatActivityEnterView.r0()) {
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
    public void setOffsetY(float f7) {
        super.setOffsetY(f7);
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (chatActivityEnterView.f22026m1.getForeground() != null) {
            aw0 aw0Var = chatActivityEnterView.f22026m1;
            aw0Var.invalidateDrawable(aw0Var.getForeground());
        }
    }
}
