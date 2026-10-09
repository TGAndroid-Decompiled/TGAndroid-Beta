package org.telegram.ui.Wallet;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
public final class z0 {
    public final int f35679a;
    public final String f35680b;
    public final k0 f35681c;
    public boolean d;
    public boolean f35682e;
    public String f35683f;
    public int f35684g;
    public int h;
    public int f35686j;
    public sc.u f35687k;
    public long f35688l;
    public int f35685i = -1;
    public final w0 f35689m = new Runnable(this) {
        public final z0 f35587b;

        {
            this.f35587b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f35587b.e();
                    return;
                case 1:
                    z0 z0Var = this.f35587b;
                    if (z0Var.d) {
                        z0Var.d("URL expired; renewing connection");
                        z0Var.b();
                        z0Var.e();
                        return;
                    }
                    return;
                default:
                    this.f35587b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final w0 f35690n = new Runnable(this) {
        public final z0 f35587b;

        {
            this.f35587b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f35587b.e();
                    return;
                case 1:
                    z0 z0Var = this.f35587b;
                    if (z0Var.d) {
                        z0Var.d("URL expired; renewing connection");
                        z0Var.b();
                        z0Var.e();
                        return;
                    }
                    return;
                default:
                    this.f35587b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final w0 f35691o = new Runnable(this) {
        public final z0 f35587b;

        {
            this.f35587b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f35587b.e();
                    return;
                case 1:
                    z0 z0Var = this.f35587b;
                    if (z0Var.d) {
                        z0Var.d("URL expired; renewing connection");
                        z0Var.b();
                        z0Var.e();
                        return;
                    }
                    return;
                default:
                    this.f35587b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final org.telegram.ui.Cells.t6 f35692p = new org.telegram.ui.Cells.t6(this, 27);

    public z0(int i10, String str, k0 k0Var) {
        this.f35679a = i10;
        this.f35680b = str;
        this.f35681c = k0Var;
    }

    public static String a(sc.w wVar) {
        String str;
        aa.b bVar;
        switch (wVar.f47956a) {
            case 1:
                str = "NOT_IN_CREATED_STATE";
                break;
            case 2:
                str = "SOCKET_INPUT_STREAM_FAILURE";
                break;
            case 3:
                str = "SOCKET_OUTPUT_STREAM_FAILURE";
                break;
            case 4:
                str = "OPENING_HAHDSHAKE_REQUEST_FAILURE";
                break;
            case 5:
                str = "OPENING_HANDSHAKE_RESPONSE_FAILURE";
                break;
            case 6:
                str = "STATUS_LINE_EMPTY";
                break;
            case 7:
                str = "STATUS_LINE_BAD_FORMAT";
                break;
            case 8:
                str = "NOT_SWITCHING_PROTOCOLS";
                break;
            case 9:
                str = "HTTP_HEADER_FAILURE";
                break;
            case 10:
                str = "NO_UPGRADE_HEADER";
                break;
            case 11:
                str = "NO_WEBSOCKET_IN_UPGRADE_HEADER";
                break;
            case 12:
                str = "NO_CONNECTION_HEADER";
                break;
            case 13:
                str = "NO_UPGRADE_IN_CONNECTION_HEADER";
                break;
            case 14:
                str = "NO_SEC_WEBSOCKET_ACCEPT_HEADER";
                break;
            case 15:
                str = "UNEXPECTED_SEC_WEBSOCKET_ACCEPT_HEADER";
                break;
            case 16:
                str = "EXTENSION_PARSE_ERROR";
                break;
            case 17:
                str = "UNSUPPORTED_EXTENSION";
                break;
            case 18:
                str = "EXTENSIONS_CONFLICT";
                break;
            case 19:
                str = "UNSUPPORTED_PROTOCOL";
                break;
            case 20:
                str = "INSUFFICENT_DATA";
                break;
            case 21:
                str = "INVALID_PAYLOAD_LENGTH";
                break;
            case 22:
                str = "TOO_LONG_PAYLOAD";
                break;
            case 23:
                str = "INSUFFICIENT_MEMORY_FOR_PAYLOAD";
                break;
            case 24:
                str = "INTERRUPTED_IN_READING";
                break;
            case 25:
                str = "IO_ERROR_IN_READING";
                break;
            case 26:
                str = "IO_ERROR_IN_WRITING";
                break;
            case 27:
                str = "FLUSH_ERROR";
                break;
            case 28:
                str = "NON_ZERO_RESERVED_BITS";
                break;
            case 29:
                str = "UNEXPECTED_RESERVED_BIT";
                break;
            case 30:
                str = "FRAME_MASKED";
                break;
            case 31:
                str = "UNKNOWN_OPCODE";
                break;
            case 32:
                str = "FRAGMENTED_CONTROL_FRAME";
                break;
            case 33:
                str = "UNEXPECTED_CONTINUATION_FRAME";
                break;
            case 34:
                str = "CONTINUATION_NOT_CLOSED";
                break;
            case 35:
                str = "TOO_LONG_CONTROL_FRAME_PAYLOAD";
                break;
            case 36:
                str = "MESSAGE_CONSTRUCTION_ERROR";
                break;
            case 37:
                str = "TEXT_MESSAGE_CONSTRUCTION_ERROR";
                break;
            case 38:
                str = "UNEXPECTED_ERROR_IN_READING_THREAD";
                break;
            case 39:
                str = "UNEXPECTED_ERROR_IN_WRITING_THREAD";
                break;
            case 40:
                str = "PERMESSAGE_DEFLATE_UNSUPPORTED_PARAMETER";
                break;
            case 41:
                str = "PERMESSAGE_DEFLATE_INVALID_MAX_WINDOW_BITS";
                break;
            case 42:
                str = "COMPRESSION_ERROR";
                break;
            case 43:
                str = "DECOMPRESSION_ERROR";
                break;
            case 44:
                str = "SOCKET_CONNECT_ERROR";
                break;
            case 45:
                str = "PROXY_HANDSHAKE_ERROR";
                break;
            case 46:
                str = "SOCKET_OVERLAY_ERROR";
                break;
            case 47:
                str = "SSL_HANDSHAKE_ERROR";
                break;
            case 48:
                str = "NO_MORE_FRAME";
                break;
            case 49:
                str = "HOSTNAME_UNVERIFIED";
                break;
            default:
                str = "null";
                break;
        }
        if ((wVar instanceof sc.n) && (bVar = ((sc.n) wVar).f47915b) != null) {
            StringBuilder j3 = sc.v.j(str, ", HTTP ");
            j3.append(bVar.f388c);
            return j3.toString();
        }
        return str;
    }

    public final void b() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("disconnecting; socket=");
        if (this.f35687k != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(", subscribed=");
        sb2.append(this.f35682e);
        sb2.append(", URL request=");
        sb2.append(this.f35685i);
        d(sb2.toString());
        this.h++;
        this.f35682e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f35689m);
        AndroidUtilities.cancelRunOnUIThread(this.f35690n);
        AndroidUtilities.cancelRunOnUIThread(this.f35691o);
        AndroidUtilities.cancelRunOnUIThread(this.f35692p);
        if (this.f35685i >= 0) {
            ConnectionsManager.getInstance(this.f35679a).cancelRequest(this.f35685i, true);
            this.f35685i = -1;
        }
        sc.u uVar = this.f35687k;
        this.f35687k = null;
        if (uVar != null) {
            uVar.c();
        }
    }

    public final boolean c(sc.u uVar, int i10) {
        if (this.d && this.f35687k == uVar && this.h == i10) {
            return true;
        }
        return false;
    }

    public final void d(String str) {
        FileLog.d("[gram-wallet-streaming] account=" + this.f35679a + " generation=" + this.h + " " + str);
    }

    public final void e() {
        if (!this.d) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f35689m);
        final int i10 = this.h + 1;
        this.h = i10;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        d("requesting streaming URL; retry=" + this.f35686j);
        AndroidUtilities.runOnUIThread(this.f35691o, 30000L);
        this.f35685i = ConnectionsManager.getInstance(this.f35679a).sendRequestTyped(new TL_toncenter.getStreamingUrl(), new Object(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                Object valueOf;
                z0 z0Var = z0.this;
                int i11 = i10;
                long j3 = elapsedRealtime;
                TL_toncenter.streamingUrl streamingurl = (TL_toncenter.streamingUrl) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (z0Var.d && z0Var.h == i11) {
                    StringBuilder sb2 = new StringBuilder("URL response after ");
                    sb2.append(SystemClock.elapsedRealtime() - j3);
                    sb2.append(" ms; errorCode=");
                    if (tL_error == null) {
                        valueOf = "none";
                    } else {
                        valueOf = Integer.valueOf(tL_error.code);
                    }
                    sb2.append(valueOf);
                    z0Var.d(sb2.toString());
                    z0Var.f35685i = -1;
                    AndroidUtilities.cancelRunOnUIThread(z0Var.f35691o);
                    if (streamingurl != null && !TextUtils.isEmpty(streamingurl.url)) {
                        long currentTime = (streamingurl.expires - ConnectionsManager.getInstance(z0Var.f35679a).getCurrentTime()) * 1000;
                        z0Var.d("URL expires=" + streamingurl.expires + ", remaining=" + currentTime + " ms");
                        if (currentTime <= 0) {
                            z0Var.f("received expired streaming URL");
                            return;
                        }
                        AndroidUtilities.runOnUIThread(z0Var.f35690n, currentTime);
                        String str = streamingurl.url;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        z0Var.d("opening websocket; attempt=" + i11);
                        try {
                            c5.b0 b0Var = new c5.b0(11, (short) 0);
                            b0Var.f4203b = 10000;
                            sc.u f7 = b0Var.f(str);
                            z0Var.f35687k = f7;
                            y0 y0Var = new y0(z0Var, i11, elapsedRealtime2);
                            com.google.firebase.messaging.m mVar = f7.d;
                            synchronized (((ArrayList) mVar.f7953c)) {
                                ((ArrayList) mVar.f7953c).add(y0Var);
                                mVar.f7951a = true;
                            }
                            AndroidUtilities.runOnUIThread(z0Var.f35691o, 30000L);
                            sc.u uVar = z0Var.f35687k;
                            uVar.getClass();
                            sc.b bVar = new sc.b("ConnectThread", uVar, 3, 0);
                            com.google.firebase.messaging.m mVar2 = uVar.d;
                            if (mVar2 != null) {
                                ArrayList arrayList = (ArrayList) mVar2.n();
                                int size = arrayList.size();
                                int i12 = 0;
                                while (i12 < size) {
                                    Object obj3 = arrayList.get(i12);
                                    i12++;
                                    y0 y0Var2 = (y0) obj3;
                                    try {
                                        try {
                                            y0Var2.getClass();
                                        } catch (Throwable unused) {
                                            y0Var2.getClass();
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }
                            bVar.start();
                            return;
                        } catch (Exception e7) {
                            z0Var.f("could not open websocket: ".concat(e7.getClass().getSimpleName()));
                            return;
                        }
                    }
                    z0Var.f("could not obtain streaming URL");
                    return;
                }
                z0Var.d("ignoring stale URL response; attempt=" + i11);
            }
        });
    }

    public final void f(String str) {
        if (!this.d) {
            return;
        }
        b();
        int i10 = this.f35686j;
        this.f35686j = i10 + 1;
        long min = Math.min(30000L, 1000 << Math.min(i10, 5)) + ((long) (Math.random() * 500.0d));
        d(str + "; retrying in " + min + " ms");
        AndroidUtilities.runOnUIThread(this.f35689m, min);
    }

    public final void g(String str) {
        d("send -> " + str);
        sc.u uVar = this.f35687k;
        uVar.getClass();
        ?? obj = new Object();
        obj.f47959a = true;
        obj.f47962e = 1;
        if (str != null && str.length() != 0) {
            obj.c(sc.k.a(str));
        } else {
            obj.f47964g = null;
        }
        uVar.g(obj);
    }

    public final void h() {
        if (!this.d) {
            return;
        }
        d("stopping");
        this.d = false;
        b();
    }
}
