package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.SharedConfig;
public final class lu extends org.telegram.ui.Components.rl0 {
    public final Context f36135c;
    public final DataSettingsActivity d;

    public lu(DataSettingsActivity dataSettingsActivity, Context context) {
        this.d = dataSettingsActivity;
        this.f36135c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int b10 = l1Var.b();
        DataSettingsActivity dataSettingsActivity = this.d;
        if (b10 != dataSettingsActivity.e && b10 != dataSettingsActivity.f31580f && b10 != dataSettingsActivity.h && b10 != dataSettingsActivity.f31583s) {
            i10 = dataSettingsActivity.useLessDataForCallsRow;
            if (b10 != i10 && b10 != dataSettingsActivity.v) {
                i11 = dataSettingsActivity.proxyRow;
                if (b10 != i11) {
                    i12 = dataSettingsActivity.clearDraftsRow;
                    if (b10 != i12 && b10 != dataSettingsActivity.B && b10 != dataSettingsActivity.f31586y && b10 != dataSettingsActivity.C && b10 != dataSettingsActivity.D && b10 != dataSettingsActivity.K && b10 != dataSettingsActivity.H && b10 != dataSettingsActivity.G && b10 != dataSettingsActivity.f31581n) {
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
        return this.d.R;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        DataSettingsActivity dataSettingsActivity = this.d;
        if (i10 != dataSettingsActivity.f31582r && i10 != dataSettingsActivity.f31584w && i10 != dataSettingsActivity.L && i10 != dataSettingsActivity.N && i10 != dataSettingsActivity.I && i10 != dataSettingsActivity.O && i10 != dataSettingsActivity.Q) {
            if (i10 != dataSettingsActivity.d && i10 != dataSettingsActivity.f31585x && i10 != dataSettingsActivity.J && i10 != 0 && i10 != dataSettingsActivity.M && i10 != dataSettingsActivity.F && i10 != dataSettingsActivity.P) {
                if (i10 != dataSettingsActivity.B && i10 != dataSettingsActivity.f31586y && i10 != dataSettingsActivity.C && i10 != dataSettingsActivity.D && i10 != dataSettingsActivity.G && i10 != dataSettingsActivity.H) {
                    if (i10 == dataSettingsActivity.E) {
                        return 4;
                    }
                    if (i10 != dataSettingsActivity.e && i10 != dataSettingsActivity.h && i10 != dataSettingsActivity.f31580f) {
                        i11 = dataSettingsActivity.saveToGalleryGroupsRow;
                        if (i10 != i11) {
                            i12 = dataSettingsActivity.saveToGalleryPeerRow;
                            if (i10 != i12) {
                                i13 = dataSettingsActivity.saveToGalleryChannelsRow;
                                if (i10 != i13) {
                                    if (i10 != dataSettingsActivity.f31583s && i10 != dataSettingsActivity.v && i10 != dataSettingsActivity.f31581n) {
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
    public final void v(f2.l1 r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lu.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View z6Var;
        Context context = this.f36135c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                z6Var = new org.telegram.ui.Cells.o8(context);
                            } else {
                                z6Var = new org.telegram.ui.Cells.j5(context);
                            }
                        } else {
                            z6Var = new org.telegram.ui.Cells.a9(context);
                        }
                    } else {
                        z6Var = new org.telegram.ui.Cells.s8(context);
                    }
                } else {
                    z6Var = new org.telegram.ui.Cells.m4(context, 22);
                }
            } else {
                z6Var = new org.telegram.ui.Cells.aa(context);
            }
        } else {
            z6Var = new org.telegram.ui.Cells.z6(context, (b) null);
        }
        return yh.o(z6Var, z6Var, -1, -2);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        if (l1Var.f5788f == 3) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) l1Var.f5785a;
            int b10 = l1Var.b();
            DataSettingsActivity dataSettingsActivity = this.d;
            if (b10 == dataSettingsActivity.B) {
                s8Var.setChecked(SharedConfig.saveStreamMedia);
            } else if (b10 == dataSettingsActivity.f31586y) {
                s8Var.setChecked(SharedConfig.streamMedia);
            } else if (b10 == dataSettingsActivity.C) {
                s8Var.setChecked(SharedConfig.streamAllVideo);
            } else if (b10 == dataSettingsActivity.D) {
                s8Var.setChecked(SharedConfig.streamMkv);
            } else if (b10 == dataSettingsActivity.G) {
                s8Var.setChecked(SharedConfig.isAutoplayGifs());
            } else if (b10 == dataSettingsActivity.H) {
                s8Var.setChecked(SharedConfig.isAutoplayVideo());
            }
        }
    }
}
