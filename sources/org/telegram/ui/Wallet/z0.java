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
    public final int f35469a;
    public final String f35470b;
    public final l0 f35471c;
    public boolean d;
    public boolean e;
    public String f35472f;
    public int f35473g;
    public int h;
    public int f35475j;
    public tc.u f35476k;
    public long f35477l;
    public int f35474i = -1;
    public final w0 f35478m = new Runnable(this) {
        public final z0 f35337b;

        {
            this.f35337b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f35337b.e();
                    return;
                case 1:
                    z0 z0Var = this.f35337b;
                    if (z0Var.d) {
                        z0Var.d("URL expired; renewing connection");
                        z0Var.b();
                        z0Var.e();
                        return;
                    }
                    return;
                default:
                    this.f35337b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final w0 f35479n = new Runnable(this) {
        public final z0 f35337b;

        {
            this.f35337b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f35337b.e();
                    return;
                case 1:
                    z0 z0Var = this.f35337b;
                    if (z0Var.d) {
                        z0Var.d("URL expired; renewing connection");
                        z0Var.b();
                        z0Var.e();
                        return;
                    }
                    return;
                default:
                    this.f35337b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final w0 f35480o = new Runnable(this) {
        public final z0 f35337b;

        {
            this.f35337b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f35337b.e();
                    return;
                case 1:
                    z0 z0Var = this.f35337b;
                    if (z0Var.d) {
                        z0Var.d("URL expired; renewing connection");
                        z0Var.b();
                        z0Var.e();
                        return;
                    }
                    return;
                default:
                    this.f35337b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final org.telegram.ui.Cells.u5 f35481p = new org.telegram.ui.Cells.u5(this, 29);

    public z0(int i10, String str, l0 l0Var) {
        this.f35469a = i10;
        this.f35470b = str;
        this.f35471c = l0Var;
    }

    public static String a(tc.v vVar) {
        String str;
        ba.a aVar;
        switch (vVar.f47430a) {
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
        if ((vVar instanceof tc.n) && (aVar = ((tc.n) vVar).f47394b) != null) {
            StringBuilder i10 = si.o0.i(str, ", HTTP ");
            i10.append(aVar.f4234c);
            return i10.toString();
        }
        return str;
    }

    public final void b() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("disconnecting; socket=");
        if (this.f35476k != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(", subscribed=");
        sb2.append(this.e);
        sb2.append(", URL request=");
        sb2.append(this.f35474i);
        d(sb2.toString());
        this.h++;
        this.e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f35478m);
        AndroidUtilities.cancelRunOnUIThread(this.f35479n);
        AndroidUtilities.cancelRunOnUIThread(this.f35480o);
        AndroidUtilities.cancelRunOnUIThread(this.f35481p);
        if (this.f35474i >= 0) {
            ConnectionsManager.getInstance(this.f35469a).cancelRequest(this.f35474i, true);
            this.f35474i = -1;
        }
        tc.u uVar = this.f35476k;
        this.f35476k = null;
        if (uVar != null) {
            uVar.c();
        }
    }

    public final boolean c(tc.u uVar, int i10) {
        if (this.d && this.f35476k == uVar && this.h == i10) {
            return true;
        }
        return false;
    }

    public final void d(String str) {
        FileLog.d("[gram-wallet-streaming] account=" + this.f35469a + " generation=" + this.h + " " + str);
    }

    public final void e() {
        if (!this.d) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f35478m);
        final int i10 = this.h + 1;
        this.h = i10;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        d("requesting streaming URL; retry=" + this.f35475j);
        AndroidUtilities.runOnUIThread(this.f35480o, 30000L);
        this.f35474i = ConnectionsManager.getInstance(this.f35469a).sendRequestTyped(new TL_toncenter.getStreamingUrl(), new Object(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                Object valueOf;
                z0 z0Var = z0.this;
                int i11 = i10;
                long j10 = elapsedRealtime;
                TL_toncenter.streamingUrl streamingurl = (TL_toncenter.streamingUrl) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (z0Var.d && z0Var.h == i11) {
                    StringBuilder sb2 = new StringBuilder("URL response after ");
                    sb2.append(SystemClock.elapsedRealtime() - j10);
                    sb2.append(" ms; errorCode=");
                    if (tL_error == null) {
                        valueOf = "none";
                    } else {
                        valueOf = Integer.valueOf(tL_error.code);
                    }
                    sb2.append(valueOf);
                    z0Var.d(sb2.toString());
                    z0Var.f35474i = -1;
                    AndroidUtilities.cancelRunOnUIThread(z0Var.f35480o);
                    if (streamingurl != null && !TextUtils.isEmpty(streamingurl.url)) {
                        long currentTime = (streamingurl.expires - ConnectionsManager.getInstance(z0Var.f35469a).getCurrentTime()) * 1000;
                        z0Var.d("URL expires=" + streamingurl.expires + ", remaining=" + currentTime + " ms");
                        if (currentTime <= 0) {
                            z0Var.f("received expired streaming URL");
                            return;
                        }
                        AndroidUtilities.runOnUIThread(z0Var.f35479n, currentTime);
                        String str = streamingurl.url;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        z0Var.d("opening websocket; attempt=" + i11);
                        try {
                            c5.c0 c0Var = new c5.c0(13, (short) 0);
                            c0Var.f4728b = 10000;
                            tc.u j11 = c0Var.j(str);
                            z0Var.f35476k = j11;
                            y0 y0Var = new y0(z0Var, i11, elapsedRealtime2);
                            c2.b bVar = j11.d;
                            synchronized (((ArrayList) bVar.f4495c)) {
                                ((ArrayList) bVar.f4495c).add(y0Var);
                                bVar.f4493a = true;
                            }
                            AndroidUtilities.runOnUIThread(z0Var.f35480o, 30000L);
                            tc.u uVar = z0Var.f35476k;
                            uVar.getClass();
                            tc.b bVar2 = new tc.b("ConnectThread", uVar, 3, 0);
                            c2.b bVar3 = uVar.d;
                            if (bVar3 != null) {
                                ArrayList arrayList = (ArrayList) bVar3.n();
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
                            bVar2.start();
                            return;
                        } catch (Exception e) {
                            z0Var.f("could not open websocket: ".concat(e.getClass().getSimpleName()));
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
        int i10 = this.f35475j;
        this.f35475j = i10 + 1;
        long min = Math.min(30000L, 1000 << Math.min(i10, 5)) + ((long) (Math.random() * 500.0d));
        d(str + "; retrying in " + min + " ms");
        AndroidUtilities.runOnUIThread(this.f35478m, min);
    }

    public final void g(String str) {
        d("send -> " + str);
        tc.u uVar = this.f35476k;
        uVar.getClass();
        ?? obj = new Object();
        obj.f47433a = true;
        obj.e = 1;
        if (str != null && str.length() != 0) {
            obj.c(tc.k.a(str));
        } else {
            obj.f47437g = null;
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
