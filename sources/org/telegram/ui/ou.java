package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.SharedConfig;
public final class ou extends org.telegram.ui.Components.kl0 {
    public final Context f39312c;
    public final DataSettingsActivity d;

    public ou(DataSettingsActivity dataSettingsActivity, Context context) {
        this.d = dataSettingsActivity;
        this.f39312c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int b10 = c1Var.b();
        DataSettingsActivity dataSettingsActivity = this.d;
        if (b10 != dataSettingsActivity.f33387e && b10 != dataSettingsActivity.f33388f && b10 != dataSettingsActivity.h && b10 != dataSettingsActivity.f33391s) {
            i10 = dataSettingsActivity.useLessDataForCallsRow;
            if (b10 != i10 && b10 != dataSettingsActivity.v) {
                i11 = dataSettingsActivity.proxyRow;
                if (b10 != i11) {
                    i12 = dataSettingsActivity.clearDraftsRow;
                    if (b10 != i12 && b10 != dataSettingsActivity.E && b10 != dataSettingsActivity.f33394y && b10 != dataSettingsActivity.F && b10 != dataSettingsActivity.G && b10 != dataSettingsActivity.N && b10 != dataSettingsActivity.K && b10 != dataSettingsActivity.J && b10 != dataSettingsActivity.f33389n) {
                        i13 = dataSettingsActivity.saveToGalleryGroupsRow;
                        if (b10 != i13) {
                            i14 = dataSettingsActivity.saveToGalleryPeerRow;
                            if (b10 != i14) {
                                i15 = dataSettingsActivity.saveToGalleryChannelsRow;
                                if (b10 != i15) {
                                    i16 = dataSettingsActivity.resetDownloadRow;
                                    if (b10 != i16) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.U;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        DataSettingsActivity dataSettingsActivity = this.d;
        if (i10 != dataSettingsActivity.f33390r && i10 != dataSettingsActivity.f33392w && i10 != dataSettingsActivity.O && i10 != dataSettingsActivity.Q && i10 != dataSettingsActivity.L && i10 != dataSettingsActivity.R && i10 != dataSettingsActivity.T) {
            if (i10 != dataSettingsActivity.d && i10 != dataSettingsActivity.f33393x && i10 != dataSettingsActivity.M && i10 != 0 && i10 != dataSettingsActivity.P && i10 != dataSettingsActivity.I && i10 != dataSettingsActivity.S) {
                if (i10 != dataSettingsActivity.E && i10 != dataSettingsActivity.f33394y && i10 != dataSettingsActivity.F && i10 != dataSettingsActivity.G && i10 != dataSettingsActivity.J && i10 != dataSettingsActivity.K) {
                    if (i10 == dataSettingsActivity.H) {
                        return 4;
                    }
                    if (i10 != dataSettingsActivity.f33387e && i10 != dataSettingsActivity.h && i10 != dataSettingsActivity.f33388f) {
                        i11 = dataSettingsActivity.saveToGalleryGroupsRow;
                        if (i10 != i11) {
                            i12 = dataSettingsActivity.saveToGalleryPeerRow;
                            if (i10 != i12) {
                                i13 = dataSettingsActivity.saveToGalleryChannelsRow;
                                if (i10 != i13) {
                                    if (i10 != dataSettingsActivity.f33391s && i10 != dataSettingsActivity.v && i10 != dataSettingsActivity.f33389n) {
                                        return 1;
                                    }
                                    return 6;
                                }
                                return 5;
                            }
                            return 5;
                        }
                        return 5;
                    }
                    return 5;
                }
                return 3;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ou.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View a7Var;
        Context context = this.f39312c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                a7Var = new org.telegram.ui.Cells.r8(context);
                            } else {
                                a7Var = new org.telegram.ui.Cells.i5(context);
                            }
                        } else {
                            a7Var = new org.telegram.ui.Cells.e9(context);
                        }
                    } else {
                        a7Var = new org.telegram.ui.Cells.w8(context);
                    }
                } else {
                    a7Var = new org.telegram.ui.Cells.l4(context, 22);
                }
            } else {
                a7Var = new org.telegram.ui.Cells.ea(context);
            }
        } else {
            a7Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
        }
        return com.google.android.gms.internal.vision.e2.l(a7Var, a7Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        if (c1Var.f45742f == 3) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) c1Var.f45738a;
            int b10 = c1Var.b();
            DataSettingsActivity dataSettingsActivity = this.d;
            if (b10 == dataSettingsActivity.E) {
                w8Var.setChecked(SharedConfig.saveStreamMedia);
            } else if (b10 == dataSettingsActivity.f33394y) {
                w8Var.setChecked(SharedConfig.streamMedia);
            } else if (b10 == dataSettingsActivity.F) {
                w8Var.setChecked(SharedConfig.streamAllVideo);
            } else if (b10 == dataSettingsActivity.G) {
                w8Var.setChecked(SharedConfig.streamMkv);
            } else if (b10 == dataSettingsActivity.J) {
                w8Var.setChecked(SharedConfig.isAutoplayGifs());
            } else if (b10 == dataSettingsActivity.K) {
                w8Var.setChecked(SharedConfig.isAutoplayVideo());
            }
        }
    }
}
